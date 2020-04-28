package cartest.model;

public class Paper implements Comparable<Paper>{
	public static final String[] papertitle={"试卷id","问题id序列","答案序列"};
	/**
	 * 请自行根据javabean的设计修改本函数代码，col表示界面表格中的列序号，0开始
	 */
	public String getCell(int col){
		if(col==0) return this.getPaperid()+"";
		else if(col==2) return this.getQuestionidseq()+"";
		else if(col==3) return this.getKeyseq()+"";
		else return "";
	} 
	
	public static Paper currentPaper=null;
	
	private int paperid;
	private String questionidseq;
	private String keyseq;
	
	
	public int getPaperid() {
		return paperid;
	}


	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}


	public String getQuestionidseq() {
		return questionidseq;
	}


	public void setQuestionidseq(String questionidseq) {
		this.questionidseq = questionidseq;
	}


	public String getKeyseq() {
		return keyseq;
	}


	public void setKeyseq(String keyseq) {
		this.keyseq = keyseq;
	}


	@Override
	public int compareTo(Paper o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

