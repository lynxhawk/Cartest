package cartest.model;

public class User implements Comparable<User>{
		public static final String[] usertitle={"�û�id","�û�����","�û���","�û�����"};
		/**
		 * �����и���javabean������޸ı��������룬col��ʾ�������е�����ţ�0��ʼ
		 */
		public String getCell(int col){
			if(col==0) return this.getUserid()+"";
			else if(col==2) return this.getUsername()+"";
			else if(col==3) return this.getLoginname()+"";
			else if(col==4) return this.getPassword()+"";
			else return "";
		} 
		
		public static User currentLoginUser=null;
		
		private int userid;
		private String username;
		private String loginname;
		private String password;
		//private char usertype;

		public int getUserid() {
			return userid;
		}




		public void setUserid(int userid) {
			this.userid = userid;
		}




		public String getUsername() {
			return username;
		}




		public void setUsername(String username) {
			this.username = username;
		}




		public String getLoginname() {
			return loginname;
		}




		public void setLoginname(String loginname) {
			this.loginname = loginname;
		}




		public String getPassword() {
			return password;
		}




		public void setPassword(String password) {
			this.password = password;
		}

//		public char getUsertype() {
//			return usertype;
//		}
//
//		public void setUsertype(char usertype) {
//			this.usertype = usertype;
//		}

		@Override
		public int compareTo(User o) {
			// TODO Auto-generated method stub
			return 0;
		}

}
