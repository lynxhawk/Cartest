package cartest.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cartest.control.ExamManager;
import cartest.control.GetQuestion;
import cartest.model.Examine;
import cartest.model.Question;
import cartest.util.BaseException;

public class Showpaper extends JDialog implements ActionListener {
	
	private JPanel toolBar = new JPanel();
	
	private Button btnshowdetail = new Button("Showdetail");
	
	private Object papertitle[]={"¿¼ÊÔid","×¼¿¼Ö¤ºÅ","¿¼ÉúID","·ÖÊý","¿¼¾íID"};
	private Object paperdata[][];
	List<Examine> exam =null;
	DefaultTableModel exammodel =new DefaultTableModel();
	private JTable examtable=new JTable(exammodel);
	private JLabel showcusnum = new JLabel();
	private JLabel showcusname = new JLabel();

	
	private void reloadexamtable(){
		try {
			ExamManager em = new ExamManager();
			exam = em.searchbystudent();
			paperdata =new Object[exam.size()][5];
			for(int i=0;i<exam.size();i++){
			   paperdata[i][0]=exam.get(i).getExamid();
			   paperdata[i][1]=exam.get(i).getEmin();
			   paperdata[i][2]=exam.get(i).getStudent();
			   paperdata[i][3]=exam.get(i).getScore();
			   paperdata[i][4]=exam.get(i).getPaperid();
			}
			exammodel.setDataVector(paperdata,papertitle);
			this.examtable.validate();
			this.examtable.repaint();
			this.examtable.setVisible(true);
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Showpaper (Frame f, String s, boolean b) {
		//super(f, s, b);
		setFont(new Font("Dialog", Font.PLAIN, 25));
		setTitle("¿¼ÊÔ²éÑ¯");
		toolBar.setBounds(0, 0, 1200, 55);
		toolBar.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
		toolBar.setLayout(null);

		btnshowdetail.setLocation(10, 10);
		btnshowdetail.setSize(200, 40);
		toolBar.add(btnshowdetail);
		
	    this.btnshowdetail.addActionListener(this);

		getContentPane().setLayout(null);
				
		this.getContentPane().add(toolBar);
		
	    examtable.setRowHeight(28);
	    examtable.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
	    examtable.setBackground(Color.WHITE);
		
		JScrollPane scrollPane1 = new JScrollPane(this.examtable);
		scrollPane1.setBounds(0, 60, 1200, 740);
		this.getContentPane().add(scrollPane1);
		scrollPane1.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
		scrollPane1.add(examtable);
		scrollPane1.setViewportView(examtable);
		
		// ÆÁÄ»¾ÓÖÐÏÔÊ¾
		this.setSize(1200, 800);
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//System.exit(0);
			}
		});
		reloadexamtable();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource()==this.btnshowdetail)
		 {
			 int i = examtable.getSelectedRow();
			 String a = exam.get(i).getAnswer();
			 int paper_id = exam.get(i).getPaperid();
			 GetQuestion q = new GetQuestion();
			 ExamManager em = new ExamManager();
			 List<Question> result=new ArrayList<Question>();
			 
			 try {
				String seq = em.Getquestionseq(paper_id);
				result = q.Loadquestion(seq);
				Showtest dlg = new Showtest(this,"¿¼ÊÔ¾í",true,exam.get(i).getScore(),a,result);
				dlg.setVisible(true);
			} catch (BaseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 reloadexamtable();
		 }
	}
}