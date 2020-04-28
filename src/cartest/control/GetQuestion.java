package cartest.control;
import java.sql.*;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import cartest.model.Examine;
import cartest.model.Question;
import cartest.model.User;
import cartest.util.BaseException;
import cartest.util.DBUtil;
import cartest.util.DbException;
import oracle.jdbc.driver.*;
 
 
public class GetQuestion {

 public List<Question> loadAll() throws BaseException{
	 
	List<Question> result = new ArrayList<Question>();
	java.sql.PreparedStatement pst = null;
	java.sql.ResultSet rs = null;
    Connection conn = null;
 
    try {
      conn = DBUtil.getConnection();
 
      CallableStatement proc = null;
      proc = conn.prepareCall("call PKG_PUB_UTILS.random_question(?)"); //�洢���� XXX���µ�
      proc.registerOutParameter(1,oracle.jdbc.OracleTypes.CURSOR);//�������������һ���α�.��һ������,�α�����
      //proc.registerOutParameter(index, rop[0]);// ע���������,ͬ�������ѭ������ע��
//		for (int i = 0; i < 10; i++) {
//			proc.setObject(i + 1, obj[i]);
//		}// ���ò���
      proc.execute();//ִ��
      rs = (ResultSet) proc.getObject(1); //��õ�һ��������һ���α�,ת����ResultSet����
 
      while(rs.next()) //�������
      {
    	  Question que = new Question();
    	  que.setQuestionid(rs.getInt("question_id"));
    	  que.setQuestionbody(rs.getString("question_body"));
    	  que.setQuestionform(rs.getString("question_form"));
    	  que.setBrancha(rs.getString("branch_a"));
    	  que.setBranchb(rs.getString("branch_b"));
    	  que.setBranchc(rs.getString("branch_c"));
    	  que.setQuestionkey(rs.getString("question_key"));
    	  result.add(que);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }

    finally{
      try {
        if(rs != null){
          rs.close();
          if(pst!=null){
            pst.close();
          }
          if(conn!=null){
            conn.close();
          }
        }
      }
      catch (SQLException e) {
    	 e.printStackTrace();
      }
    }
    
//    for(int i = 0 ; i<result.size();i++){
//		System.out.println(result.get(i).getQuestionkey());
//	}
//    String qid="";
//	for(int i=0;i<result.size();i++)
//	{
//		qid = qid+result.get(i).getQuestionid();
//	}
//	System.out.println(qid);
//	String qkey="";
//	for(int i=0;i<result.size();i++)
//	{
//		qkey = qkey+result.get(i).getQuestionkey();
//	}
//	System.out.println(qkey);
    return result;
    
 	}
 	public List<Question> Loadquestion(String seq) throws BaseException{
 	List<Question> result=new ArrayList<Question>();
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			String[] s=seq.split(",");
			//int id = User.currentLoginUser.getUserid();
			String sql=" select * from question where question_id = ?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			for(int i=0;i<10;i++) {
				pst.setInt(1, Integer.parseInt(s[i]));
				java.sql.ResultSet rs=pst.executeQuery();
				while(rs.next()){
				Question que = new Question();
				que.setQuestionid(rs.getInt("question_id"));
			    que.setQuestionbody(rs.getString("question_body"));
			    que.setQuestionform(rs.getString("question_form"));
			    que.setBrancha(rs.getString("branch_a"));
			    que.setBranchb(rs.getString("branch_b"));
			    que.setBranchc(rs.getString("branch_c"));
			    que.setQuestionkey(rs.getString("question_key"));
			    result.add(que);
				}
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
//		for(int i=0;i<result.size();i++)
//			{
//				System.out.println(result.get(i).getQuestionid());
//			}
		return result;
		
 }
 
 	
}