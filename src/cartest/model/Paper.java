package cartest.model;

public class Paper implements Comparable<Paper>{
	public static final String[] papertitle={"�Ծ�id","����id����","������"};
	/**
	 * �����и���javabean������޸ı��������룬col��ʾ�������е�����ţ�0��ʼ
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

