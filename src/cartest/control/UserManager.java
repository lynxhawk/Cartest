package cartest.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

//import cartest.model.Customer;
//import cartest.model.Manager;
import cartest.util.DBUtil;
import cartest.util.DbException;
import cartest.model.User;
import cartest.util.BaseException;
import cartest.util.BusinessException;

public class UserManager  {

//	public List<Manager> loadAll1() throws BaseException{
//		List<Manager>  result = new ArrayList<Manager>();
//		Connection conn = null;
//		java.sql.PreparedStatement pst = null;
//		java.sql.ResultSet rs = null;
//		Manager m = new Manager();
//		try {
//			conn = DBUtil.getConnection();
//			String sql = "select * from ... where ...";//insert into ...() values()//update .... set ...=?,...=?,//delete from ... where ...
//			pst = conn.prepareStatement(sql);
//			rs=pst.executeQuery();
//			while(rs.next())
//			{
//				m.setUsername(rs.getString(1));
//				m.setLevel(rs.getString(2));
//				result.add(m);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
	
	public List<User> loadAll() throws BaseException{
		List<User> result = new ArrayList<User>();
		Connection conn = null;
		java.sql.PreparedStatement pst = null;
		java.sql.ResultSet rs = null;
		try {
			conn=DBUtil.getConnection();
			String sql = "select * from users";
			pst = conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
			{
				User m = new User();
			    m.setUserid(rs.getInt(1));
			    m.setUsername(rs.getString(2));
			    m.setLoginname(rs.getString(3));
			    m.setPassword(rs.getString(4));
				result.add(m);
			}
//			rs.close();
//			pst.close();
		}
			catch(SQLException e){
            e.printStackTrace();				
			}
		return result; 
	}
	
	public User createUser(String username,String loginname,String password) throws BaseException{
	
		if(username==null || "".equals(username) || username.length()>20){
			throw new BusinessException("用户姓名1-20个字符");
		}
		if(loginname==null || "".equals(loginname) || loginname.length()>20){
			throw new BusinessException("用户名1-20个字符");
		}
		if(password==null || "".equals(password) || password.length()>20){
			throw new BusinessException("用户密码1-20个字符");
		}
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
//			String sql="select * from users where usercode=?";
//			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			//pst.setString(1,usercode);
			//java.sql.ResultSet rs=pst.executeQuery();
			//if(rs.next()) throw new BusinessException("员锟斤拷锟斤拷锟斤拷锟窖撅拷锟斤拷占锟斤拷");
			//rs.close();
			//pst.close();
//			String sql="select * from manager where username=?";
//			pst=conn.prepareStatement(sql);
//			pst.setString(1,username);
//			rs=pst.executeQuery();
//			if(rs.next()) throw new BusinessException("员锟斤拷锟斤拷锟斤拷锟窖撅拷锟斤拷锟斤拷");
//			rs.close();
//			pst.close();
			String sql="insert into users(user_name,login_name,password) values(?,?,?)";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst=conn.prepareStatement(sql);
			pst.setString(1,username);
			pst.setString(2,loginname);
			pst.setString(3,password);
			pst.execute();
			pst.close(); 
			sql="select user_id,user_name,login_name,password from users where user_name=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			//pst.execute();
			java.sql.ResultSet rs=pst.executeQuery();
			User us = new User();
			if(rs.next()) {
			us.setUserid(rs.getInt(1));
			us.setUsername(rs.getString(2));
			us.setLoginname(rs.getString(3));
			us.setPassword(rs.getString(4));
			}
			pst.close();
			rs.close();
			return us;
			
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
	
	public static boolean isCardId(String cardid){
        return Pattern.matches("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([\\d|x|X]{1})$", cardid);
   }
	
	public void createStudent(int id,String name,String pin,String phone) throws BaseException{
		
		if(pin==null || "".equals(pin) || pin.length()>20 || isCardId(pin) == false){
			throw new BusinessException("身份证格式不正确");
		}
		if(phone==null || "".equals(phone) || phone.length()>11){
			throw new BusinessException("电话号码格式不正确");
		}
		
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
//			String sql="select * from users where usercode=?";
//			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			//pst.setString(1,usercode);
			//java.sql.ResultSet rs=pst.executeQuery();
			//if(rs.next()) throw new BusinessException("员锟斤拷锟斤拷锟斤拷锟窖撅拷锟斤拷占锟斤拷");
			//rs.close();
			//pst.close();
//			String sql="select * from manager where username=?";
//			pst=conn.prepareStatement(sql);
//			pst.setString(1,username);
//			rs=pst.executeQuery();
//			if(rs.next()) throw new BusinessException("员锟斤拷锟斤拷锟斤拷锟窖撅拷锟斤拷锟斤拷");
//			rs.close();
//			pst.close();
			String sql="insert into student(id,name,pin,phone) values(?,?,?,?)";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst=conn.prepareStatement(sql);
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3, pin);
			pst.setString(4,phone);
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
	
	public User login(String loginname, String password) throws BaseException {
		// TODO Auto-generated method stub
		if("".equals(loginname)) {
			throw new BaseException("用户名为空");
		}
		if("".equals(password)) {
			throw new BaseException("密码为空");
		}
		User ma = null;
		Connection conn = null;
		java.sql.ResultSet rs = null;
		java.sql.PreparedStatement pst = null;
		try {
			conn =  DBUtil.getConnection();
			String sql = "select user_id,user_name,login_name,password from users where login_name = ? and password = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, loginname);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(!rs.next()) {
				throw new BaseException("不存在该用户!");
			}
			int userid=rs.getInt(1);
			String user_name=rs.getString(2);
			String login_name = rs.getString(3);
			String pwd = rs.getString(4);
			ma = new User();
			ma.setUserid(userid);
			ma.setUsername(user_name);
			ma.setLoginname(login_name);
			ma.setPassword(pwd);
		}
		catch(BaseException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {  
		    if (rs != null) {  
		        try {  
		            rs.close();  
		        } catch (SQLException e) { 
		        	throw new BaseException("");
		        }  
		    }  
		    if (pst != null) {  
		        try {  
		            pst.close();  
		        } catch (SQLException e) { 
		        	throw new BaseException("");
		        }  
		    }  
		    if (conn != null) {  
		        try {  
		            conn.close();  
		        }catch (SQLException e) { 
		        	throw new BaseException("");
		        }   
		    }  
		}  
		return ma;
	}
	
	public void changePwd(User ma, String oldPwd, String newPwd, String newPwd2) throws BaseException {
			// TODO Auto-generated method stub
			if(!ma.getPassword().equals(oldPwd)) {
				throw new BaseException("原密码不正确");
			}
			else if("".equals(newPwd)) {
				throw new BaseException("新密码为空");
			}
			else if(oldPwd.equals(newPwd)) {
				throw new BaseException("旧密码和新密码相等");
			}
			else if(!newPwd.equals(newPwd2)) {
				throw new BaseException("两次输入密码不一致");
			}
			Connection conn = null;
			java.sql.PreparedStatement pst = null;
			try {
				conn =  DBUtil.getConnection();
				String sql = "update users set password = ? where user_id = ?";
				pst = conn.prepareStatement(sql);
				pst.setString(1, newPwd);
				pst.setInt(2, ma.getUserid());
				pst.execute();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}finally {
			    if (pst != null) {  
			        try {  
			            pst.close();  
			        } catch (SQLException e) { 
			        	throw new BaseException("");
			        }  
			    }  
			    if (conn != null) {  
			        try {  
			            conn.close();  
			        }catch (SQLException e) { 
			        	throw new BaseException("");
			        }   
			    }  
			}  
			
		}// TODO Auto-generated method stub
		
//	public void deleteUser(Manager ma)throws BaseException{
//		Connection conn=null;
//		try {
//			conn=DBUtil.getConnection();
//			String sql="delete from manager where usercode =?";
//			PreparedStatement pst=conn.prepareStatement(sql);
//			pst.setString(1, ma.getUsercode());
//			pst.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new DbException(e);
//		}
//		finally{
//			if(conn!=null)
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//    }
	
//	public void changeuserpwd(String usercode,String newPwd) throws BaseException, SQLException {
//		// TODO Auto-generated method stub
//	    if("".equals(newPwd)) {
//			throw new BaseException("锟斤拷锟斤拷锟诫不锟斤拷为锟斤拷");
//		}
//		Connection conn = null;
//		java.sql.PreparedStatement pst = null;
//		Savepoint sp = null;
//		try {
//			conn =  DBUtil.getConnection();
//			conn.setAutoCommit(false);
//			String sql = "update manager set userpwd = ? where usercode = ?";
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, newPwd);
//			pst.setString(2, usercode);
//			//pst.execute();
//			pst.executeUpdate(sql);
//			sp= conn.setSavepoint();
//	//		conn.commit();
//		}
//		catch(SQLException e) {
//			if(conn!=null&&sp!=null)
//				conn.rollback(sp);
//			    conn.commit();
//			e.printStackTrace();
//		}finally {
//		    if (pst != null) {  
//		        try {  
//		            pst.close();  
//		        } catch (SQLException e) { 
//		        	throw new BaseException("");
//		        }  
//		    }  
//		    if (conn != null) {  
//		        try {  
//		            conn.close();  
//		        }catch (SQLException e) { 
//		        	throw new BaseException("");
//		        }   
//		    }  
//		}  
//		
//	}// TODO Auto-generated method stub

//	public Map<String,Integer> loadTypeProductsCount() throws BaseException{
//				Connection conn=null;
//				try {
//					conn=(Connection) DBUtil.getConnection();
//					String sql="select sum(UnitsInStock) from BeanProduct where ProductType=?";
//					java.sql.PreparedStatement pst=conn.prepareStatement(sql);
//					pst.setInt(1,getProductType());	
//					pst.execute();
//					pst.close();
//				    java.sql.ResultSet rs=pst.executeQuery();
//		            Map<String,Integer> m=new HashMap<String,Integer>();
//				    if(rs.next())    
//				  //  	m.put(key, value);
//		            m.put(((BeanProduct) pst).getProductType(),rs.getInt(1));
//		            rs.close();
//					} catch (SQLException e) {
//					e.printStackTrace();
//					throw new DbException(e);
//				}
//				finally {
//					if(conn!=null)
//						try {
//							conn.close();
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//				}
//				return null;
//				}
//			private int getProductType() {
//				// TODO Auto-generated method stub
//				return 0;
//			}


}