package cartest.model;

public class Question implements Comparable<Question>{
	public static final String[] questiontitle={"问题id","问题内容","问题格式","选项A","选项B","选项C","答案"};
	/**
	 * 请自行根据javabean的设计修改本函数代码，col表示界面表格中的列序号，0开始
	 */
	public String getCell(int col){
		if(col==0) return this.getQuestionid()+"";
		else if(col==2) return this.getQuestionbody()+"";
		else if(col==3) return this.getQuestionform()+"";
		else if(col==4) return this.getBrancha()+"";
		else if(col==5) return this.getBranchb()+"";
		else if(col==6) return this.getBranchc()+"";
		else if(col==7) return this.getQuestionkey()+"";
		//else if(col==8) return this.getQuestionsts()+"";
		else return "";
	} 
	
	public static Question currentQuestion=null;
	
	private int questionid;
	private String questionbody;
	private String questionform;
	private String brancha;
	private String branchb;
	private String branchc;
	private String questionkey;
	//private char questionsts;
	
	
	
//	public char getQuestionsts() {
//		return questionsts;
//	}
//
//
//
//	public void setQuestionsts(char questionsts) {
//		this.questionsts = questionsts;
//	}



	public int getQuestionid() {
		return questionid;
	}



	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}



	public String getQuestionbody() {
		return questionbody;
	}



	public void setQuestionbody(String questionbody) {
		this.questionbody = questionbody;
	}



	public String getQuestionform() {
		return questionform;
	}



	public void setQuestionform(String questionform) {
		this.questionform = questionform;
	}



	public String getBrancha() {
		return brancha;
	}



	public void setBrancha(String brancha) {
		this.brancha = brancha;
	}



	public String getBranchb() {
		return branchb;
	}



	public void setBranchb(String branchb) {
		this.branchb = branchb;
	}



	public String getBranchc() {
		return branchc;
	}



	public void setBranchc(String branchc) {
		this.branchc = branchc;
	}



	public String getQuestionkey() {
		return questionkey;
	}



	public void setQuestionkey(String questionkey) {
		this.questionkey = questionkey;
	}



	@Override
	public int compareTo(Question o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

