package cartest.model;

import java.util.Date;

public class Examine implements Comparable<Examine>{
	public static final String[] examinetitle={"考试id","准考证号","考生ID","分数","考卷ID"};
	/**
	 * 请自行根据javabean的设计修改本函数代码，col表示界面表格中的列序号，0开始
	 */
	public String getCell(int col){
		if(col==0) return this.getExamid()+"";
		else if(col==1) return this.getEmin()+"";
		else if(col==2) return this.getStudent()+"";
		else if(col==3) return this.getScore()+"";
		else if(col==4) return this.getPaperid()+"";
		else return "";
	} 
	
	public static Examine currentExamine=null;
	
	private int examid;
	private String emin;
	private String empwd;
	private int student;
	private String answer;
	private int score;
	private int paperid;
	
	
	public int getExamid() {
		return examid;
	}



	public void setExamid(int examid) {
		this.examid = examid;
	}



	public String getEmin() {
		return emin;
	}



	public void setEmin(String emin) {
		this.emin = emin;
	}



	public String getEmpwd() {
		return empwd;
	}



	public void setEmpwd(String empwd) {
		this.empwd = empwd;
	}



	public int getStudent() {
		return student;
	}



	public void setStudent(int student) {
		this.student = student;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public int getPaperid() {
		return paperid;
	}



	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}



	@Override
	public int compareTo(Examine o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

