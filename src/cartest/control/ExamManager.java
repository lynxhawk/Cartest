package cartest.control;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cartest.model.Examine;
import cartest.model.Question;
import cartest.model.User;
import cartest.util.BaseException;
import cartest.util.BusinessException;
import cartest.util.DBUtil;
import cartest.util.DbException;

public class ExamManager {

	public void createExam(int id,String answer) throws BaseException{
		
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			String sql=" insert into examine (id,em_in,em_pwd,student,answer,paper_id) values(?,?,?,?,?,?)";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,id);
			pst.setString(2,String.valueOf(id));
			pst.setString(3, User.currentLoginUser.getPassword());
			pst.setInt(4, User.currentLoginUser.getUserid());
			pst.setString(5, answer);
			pst.setInt(6, id);
			pst.execute();
			pst.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	public int calscore(String key,String answer) {
		int score = 0;
		for(int i=0;i<10;i++) {
			if(key.charAt(i)==(answer.charAt(i))) {
				score = score+10;
			}
		}
		return score;
	}
	
	public int startExam(List<Question> result) throws BaseException{
	Connection conn=null;
	int paper_id=0;
	try {
		conn=DBUtil.getConnection();
		String qid="";
		for(int i=0;i<result.size();i++)
		{
			qid = qid+result.get(i).getQuestionid()+",";
		}
		String qkey="";
		for(int i=0;i<result.size();i++) {
			qkey = qkey + result.get(i).getQuestionkey();
		}
		//System.out.println(qid);
		String sql="insert into paper(QUESTION_ID_SEQ,KEY_SEQ)  values(?,?)";
		java.sql.PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,qid);
		pst.setString(2, qkey);
		pst.execute();
		pst.close();
		sql = "select paper_id from paper where question_id_seq=?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, qid);
		java.sql.ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			paper_id=rs.getInt(1);
		}
		
		rs.close();
		pst.close();

	} catch (SQLException e) {
		e.printStackTrace();
		throw new DbException(e);
	}
	finally{
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	return paper_id;
	}
	
	public int Examgrade(int paper_id,String answer) throws BaseException{
		Connection conn=null;
		int score;
		try {
			conn=DBUtil.getConnection();
			String key=null;
			String sql="select KEY_SEQ from paper where paper_id = ?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,paper_id);
			java.sql.ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				key = rs.getString(1);
			}
			rs.close();
			pst.close();
			
			score = calscore(key,answer);
			sql = "update examine set score = ? where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, score);
			pst.setInt(2, paper_id);
			pst.execute();
			pst.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return score;
		}
	
	public List<Examine> searchbystudent() throws BaseException{
    	List<Examine> result=new ArrayList<Examine>();
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			int id = User.currentLoginUser.getUserid();
			String sql=" select * from examine where student = ?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			java.sql.ResultSet rs=pst.executeQuery();
			while(rs.next()){
				Examine p = new Examine();
			   p.setExamid(rs.getInt(1));
			   p.setEmin(rs.getString(2));
			   p.setEmpwd(rs.getString(3));
			   p.setStudent(rs.getInt(4));
			   p.setAnswer(rs.getString(5));
			   p.setScore(rs.getInt(6));
			   p.setPaperid(rs.getInt(7));
			   result.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return result;
		
    }
	
	public String Getanswer(int paper_id) throws BaseException{
		Connection conn=null;
		String a = null;
		try {
			conn=DBUtil.getConnection();
			String sql="select answer from examine where paper_id = ?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,paper_id);
			java.sql.ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				a = rs.getString(1);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return a;
		}
	
	public String Getquestionseq(int paper_id) throws BaseException{
		Connection conn=null;
		String a = null;
		try {
			conn=DBUtil.getConnection();
			String sql="select QUESTION_ID_SEQ from paper where paper_id = ?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,paper_id);
			java.sql.ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				a = rs.getString(1);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return a;
	}
	
}
