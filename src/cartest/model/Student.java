package cartest.model;

public class Student implements Comparable<Student>{
	public static final String[] studenttitle={"����id","��������","pin","�ֻ���"};
	/**
	 * �����и���javabean������޸ı��������룬col��ʾ�������е�����ţ�0��ʼ
	 */
	public String getCell(int col){
		if(col==0) return this.getId()+"";
		else if(col==2) return this.getName()+"";
		else if(col==3) return this.getPin()+"";
		else if(col==4) return this.getPhone()+"";
		else return "";
	} 
	
	public static Student currentStudent=null;
	
	private int id;
	private String name;
	private String pin;
	private String phone;

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPin() {
		return pin;
	}



	public void setPin(String pin) {
		this.pin = pin;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

