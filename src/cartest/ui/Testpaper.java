package cartest.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cartest.control.ExamManager;
import cartest.control.UserManager;
import cartest.model.User;
import cartest.model.*;
import cartest.util.BaseException;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Testpaper extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JScrollPane scrollPane = new JScrollPane(panel);
	
	private JButton button = new JButton("�ύ");
	private JLabel label = new JLabel("�Ծ��");
	
	private  JLabel q1 = new JLabel("��һ������");
	private  JLabel q2 = new JLabel("�ڶ�������");
	private  JLabel q3 = new JLabel("����������");
	private  JLabel q4 = new JLabel("����������");
	private  JLabel q5 = new JLabel("����������");
	private  JLabel q6 = new JLabel("����������");
	private  JLabel q7 = new JLabel("����������");
	private  JLabel q8 = new JLabel("�ڰ�������");
	private  JLabel q9 = new JLabel("�ھ�������");
	private  JLabel q10 = new JLabel("��ʮ������");
	
	private JRadioButton q1a = new JRadioButton();
	private JRadioButton q1b = new JRadioButton();
	private JRadioButton q1c = new JRadioButton();
	
	private JRadioButton q2a = new JRadioButton();
	private JRadioButton q2b = new JRadioButton();
	private JRadioButton q2c = new JRadioButton();
	
	private JRadioButton q3a = new JRadioButton();
	private JRadioButton q3b = new JRadioButton();
	private JRadioButton q3c = new JRadioButton();
	
	private JRadioButton q4a = new JRadioButton();
	private JRadioButton q4b = new JRadioButton();
	private JRadioButton q4c = new JRadioButton();
	
	private JRadioButton q5a = new JRadioButton();
	private JRadioButton q5b = new JRadioButton();
	private JRadioButton q5c = new JRadioButton();
	
	private JRadioButton q6a = new JRadioButton();
	private JRadioButton q6b = new JRadioButton();
	private JRadioButton q6c = new JRadioButton();
	
	private JRadioButton q7a = new JRadioButton();
	private JRadioButton q7b = new JRadioButton();
	private JRadioButton q7c = new JRadioButton();
	
	private JRadioButton q8a = new JRadioButton();
	private JRadioButton q8b = new JRadioButton();
	private JRadioButton q8c = new JRadioButton();
	
	private JRadioButton q9a = new JRadioButton();
	private JRadioButton q9b = new JRadioButton();
	private JRadioButton q9c = new JRadioButton();
	
	private JRadioButton q10a = new JRadioButton();
	private JRadioButton q10b = new JRadioButton();
	private JRadioButton q10c = new JRadioButton();
	
	
	
	
	
	public Testpaper(Frame f, String s, boolean b,int paper_id,List<Question> result) {
		
		super(f, s, b);
		setBounds(0, 0, 1920, 1080);
		setTitle("�����Ծ�");
		
		panel.setLayout(null);
		panel.setBounds(0, 0, 1900, 1300);
		panel.setPreferredSize(new Dimension(1900, 1600));

	    scrollPane.setBounds(0, 0, 1850, 1000); 
	    scrollPane.setSize(1900, 1000);
	    scrollPane.setPreferredSize(new Dimension(1850, 1000));
	    scrollPane.setViewportView(panel);
	    getContentPane().add(scrollPane);
	    
	    button.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    button.setBounds(1727, 15, 123, 40);
	    panel.add(button);
	  
	    q1.setBounds(150, 30, 1700, 25);
	    panel.add(q1);
	    q1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q2.setBounds(150, 180, 1700, 25);
	    panel.add(q2);
	    q2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q3.setBounds(150, 330, 1700, 25);
	    panel.add(q3);
	    q3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q4.setBounds(150, 480, 1700, 25);
	    panel.add(q4);
	    q4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q5.setBounds(150, 630, 1700, 25);
	    panel.add(q5);
	    q5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q6.setBounds(150, 780, 1700, 25);
	    panel.add(q6);
	    q6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q7.setBounds(150, 930, 1700, 25);
	    panel.add(q7);
	    q7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q8.setBounds(150, 1080, 1700, 25);
	    panel.add(q8);
	    q8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q9.setBounds(150, 1230, 1700, 25);
	    panel.add(q9);
	    q9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    q10.setBounds(150, 1380, 1700, 25);
	    panel.add(q10);
	    q10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    
	    JLabel no1 = new JLabel("��һ��");
	    panel.add(no1);
	    no1.setBounds(30, 30, 80, 25);
	    no1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no2 = new JLabel("�ڶ���");
	    panel.add(no2);
	    no2.setBounds(30, 180, 80, 25);
	    no2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no3 = new JLabel("������");
	    panel.add(no3);
	    no3.setBounds(30, 330, 80, 25);
	    no3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no4 = new JLabel("������");
	    panel.add(no4);
	    no4.setBounds(30, 480, 80, 25);
	    no4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no5 = new JLabel("������");
	    panel.add(no5);
	    no5.setBounds(30, 630, 80, 25);
	    no5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no6 = new JLabel("������");
	    panel.add(no6);
	    no6.setBounds(30, 780, 80, 25);
	    no6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no7 = new JLabel("������");
	    panel.add(no7);
	    no7.setBounds(30, 930, 80, 25);
	    no7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no8 = new JLabel("�ڰ���");
	    panel.add(no8);
	    no8.setBounds(30, 1080, 80, 25);
	    no8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no9 = new JLabel("�ھ���");
	    panel.add(no9);
	    no9.setBounds(30, 1230, 80, 25);
	    no9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no10 = new JLabel("��ʮ��");
	    panel.add(no10);
	    no10.setBounds(30, 1380, 80, 25);
	    no10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    ButtonGroup g1 = new ButtonGroup();
	    ButtonGroup g2 = new ButtonGroup();
	    ButtonGroup g3 = new ButtonGroup();
	    ButtonGroup g4 = new ButtonGroup();
	    ButtonGroup g5 = new ButtonGroup();
	    ButtonGroup g6 = new ButtonGroup();
	    ButtonGroup g7 = new ButtonGroup();
	    ButtonGroup g8 = new ButtonGroup();
	    ButtonGroup g9 = new ButtonGroup();
	    ButtonGroup g10 = new ButtonGroup();
	    
	    q1a.setBounds(150, 60, 800, 30);
	    q1a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g1.add(q1a);
	    panel.add(q1a);	  
	    q1b.setBounds(150, 100, 800, 30);
	    q1b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g1.add(q1b);
	    panel.add(q1b);	    
	    q1c.setBounds(150, 140, 800, 30);
	    q1c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g1.add(q1c);
	    panel.add(q1c);
	    
	    q2a.setBounds(150, 210, 800, 30);
	    q2a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g2.add(q2a);
	    panel.add(q2a);	  
	    q2b.setBounds(150, 250, 800, 30);
	    q2b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g2.add(q2b);
	    panel.add(q2b);	    
	    q2c.setBounds(150, 290, 800, 30);
	    q2c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g2.add(q2c);
	    panel.add(q2c);
	    
	    q3a.setBounds(150, 360, 800, 30);
	    q3a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g3.add(q3a);
	    panel.add(q3a);	  
	    q3b.setBounds(150, 400, 800, 30);
	    q3b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g3.add(q3b);
	    panel.add(q3b);	    
	    q3c.setBounds(150, 440, 800, 30);
	    q3c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g3.add(q3c);
	    panel.add(q3c);
	    
	    q4a.setBounds(150, 510, 800, 30);
	    q4a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g4.add(q4a);
	    panel.add(q4a);	  
	    q4b.setBounds(150, 550, 800, 30);
	    q4b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g4.add(q4b);
	    panel.add(q4b);	    
	    q4c.setBounds(150, 590,800, 30);
	    q4c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g4.add(q4c);
	    panel.add(q4c);
	    
	    q5a.setBounds(150, 660, 800, 30);
	    q5a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g5.add(q5a);
	    panel.add(q5a);	  
	    q5b.setBounds(150, 700, 800, 30);
	    q5b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g5.add(q5b);
	    panel.add(q5b);	    
	    q5c.setBounds(150, 740, 800, 30);
	    q5c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g5.add(q5c);
	    panel.add(q5c);
	    
	    q6a.setBounds(150, 810, 800, 30);
	    q6a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g6.add(q6a);
	    panel.add(q6a);	  
	    q6b.setBounds(150, 850, 800, 30);
	    q6b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g6.add(q6b);
	    panel.add(q6b);	    
	    q6c.setBounds(150, 890, 800, 30);
	    q6c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g6.add(q6c);
	    panel.add(q6c);
	    
	    q7a.setBounds(150, 960, 800, 30);
	    q7a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g7.add(q7a);
	    panel.add(q7a);	  
	    q7b.setBounds(150, 1000, 800, 30);
	    q7b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g7.add(q7b);
	    panel.add(q7b);	    
	    q7c.setBounds(150, 1040, 800, 30);
	    q7c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g7.add(q7c);
	    panel.add(q7c);
	    
	    q8a.setBounds(150, 1110, 800, 30);
	    q8a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g8.add(q8a);
	    panel.add(q8a);	  
	    q8b.setBounds(150, 1150, 800, 30);
	    q8b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g8.add(q8b);
	    panel.add(q8b);	    
	    q8c.setBounds(150, 1190, 800, 30);
	    q8c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g8.add(q8c);
	    panel.add(q8c);
	    
	    q9a.setBounds(150, 1260, 800, 30);
	    q9a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g9.add(q9a);
	    panel.add(q9a);	  
	    q9b.setBounds(150, 1300, 800, 30);
	    q9b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g9.add(q9b);
	    panel.add(q9b);	    
	    q9c.setBounds(150, 1340, 800, 30);
	    q9c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g9.add(q9c);
	    panel.add(q9c);
	    
	    q10a.setBounds(150, 1410, 800, 30);
	    q10a.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g10.add(q10a);
	    panel.add(q10a);	  
	    q10b.setBounds(150, 1450, 800, 30);
	    q10b.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g10.add(q10b);
	    panel.add(q10b);	    
	    q10c.setBounds(150, 1490, 800, 30);
	    q10c.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    g10.add(q10c);
	    panel.add(q10c);
	    
	    q1.setText(result.get(0).getQuestionbody());
	    q2.setText(result.get(1).getQuestionbody());
	    q3.setText(result.get(2).getQuestionbody());
	    q4.setText(result.get(3).getQuestionbody());
	    q5.setText(result.get(4).getQuestionbody());
	    q6.setText(result.get(5).getQuestionbody());
	    q7.setText(result.get(6).getQuestionbody());
	    q8.setText(result.get(7).getQuestionbody());
	    q9.setText(result.get(8).getQuestionbody());
	    q10.setText(result.get(9).getQuestionbody());
	    
	    label.setText(String.valueOf(paper_id));
	    label.setBounds(1603, 15, 96, 40);
	    panel.add(label);
	    label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    label.setVisible(false);
	    
	    if(result.get(0).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q1a.setText("��");
	    	q1b.setText("��");
	    	q1c.setVisible(false);
	    }else {
	    	q1a.setText(result.get(0).getBrancha());
	    	q1b.setText(result.get(0).getBranchb());
	    	q1c.setText(result.get(0).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(1).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q2a.setText("��");
	    	q2b.setText("��");
	    	q2c.setVisible(false);
	    }else {
	    	q2a.setText(result.get(1).getBrancha());
	    	q2b.setText(result.get(1).getBranchb());
	    	q2c.setText(result.get(1).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(2).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q3a.setText("��");
	    	q3b.setText("��");
	    	q3c.setVisible(false);
	    }else {
	    	q3a.setText(result.get(2).getBrancha());
	    	q3b.setText(result.get(2).getBranchb());
	    	q3c.setText(result.get(2).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(3).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q4a.setText("��");
	    	q4b.setText("��");
	    	q4c.setVisible(false);
	    }else {
	    	q4a.setText(result.get(3).getBrancha());
	    	q4b.setText(result.get(3).getBranchb());
	    	q4c.setText(result.get(3).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(4).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q5a.setText("��");
	    	q5b.setText("��");
	    	q5c.setVisible(false);
	    }else {
	    	q5a.setText(result.get(4).getBrancha());
	    	q5b.setText(result.get(4).getBranchb());
	    	q5c.setText(result.get(4).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(5).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q6a.setText("��");
	    	q6b.setText("��");
	    	q6c.setVisible(false);
	    }else {
	    	q6a.setText(result.get(5).getBrancha());
	    	q6b.setText(result.get(5).getBranchb());
	    	q6c.setText(result.get(5).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(6).getQuestionform().equals("J")) {
	    	q7a.setText("��");
	    	q7b.setText("��");
	    	q7c.setVisible(false);
	    }else {
	    	q7a.setText(result.get(6).getBrancha());
	    	q7b.setText(result.get(6).getBranchb());
	    	q7c.setText(result.get(6).getBranchc());
	    }
	    
	    if(result.get(7).getQuestionform().equals("J")) {
	    	q8a.setText("��");
	    	q8b.setText("��");
	    	q8c.setVisible(false);
	    }else {
	    	q8a.setText(result.get(7).getBrancha());
	    	q8b.setText(result.get(7).getBranchb());
	    	q8c.setText(result.get(7).getBranchc());
	    }
	    
	    if(result.get(8).getQuestionform().equals("J")) {
	    	q9a.setText("��");
	    	q9b.setText("��");
	    	q9c.setVisible(false);
	    }else {
	    	q9a.setText(result.get(8).getBrancha());
	    	q9b.setText(result.get(8).getBranchb());
	    	q9c.setText(result.get(8).getBranchc());
	    }
	    
	    if(result.get(9).getQuestionform().equals("J")) {
	    	q10a.setText("��");
	    	q10b.setText("��");
	    	q10c.setVisible(false);
	    }else {
	    	q10a.setText(result.get(9).getBrancha());
	    	q10b.setText(result.get(9).getBranchb());
	    	q10c.setText(result.get(9).getBranchc());
	    }
	 
	    
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.button) {
		String a1="N",a2 = "N",a3="N",a4="N",a5="N",a6="N",a7="N",a8="N",a9="N",a10="N";
		String answer = null;
		int score = 0;
		int paper_id = Integer.parseInt(label.getText());
		ExamManager em = new ExamManager();
		
		if(q1a.isSelected()) { a1="A";}
		else if(q1b.isSelected()) { a1="B";}
		else if(q1c.isSelected()) { a1="C";}
		
		if(q2a.isSelected()) { a2="A";}
		else if(q2b.isSelected()) { a2="B";}
		else if(q2c.isSelected()) { a2="C";}
		
		if(q3a.isSelected()) { a3="A";}
		else if(q3b.isSelected()) { a3="B";}
		else if(q3c.isSelected()) { a3="C";}
		
		if(q4a.isSelected()) { a4="A";}
		else if(q4b.isSelected()) { a4="B";}
		else if(q4c.isSelected()) { a4="C";}
		
		if(q5a.isSelected()) { a5="A";}
		else if(q5b.isSelected()) { a5="B";}
		else if(q5c.isSelected()) { a5="C";}
		
		if(q6a.isSelected()) { a6="A";}
		else if(q6b.isSelected()) { a6="B";}
		else if(q6c.isSelected()) { a6="C";}
		
		if(q7a.isSelected()) { a7="A";}
		else if(q7b.isSelected()) { a7="B";}
		else if(q7c.isSelected()) { a7="C";}
		
		if(q8a.isSelected()) { a8="A";}
		else if(q8b.isSelected()) { a8="B";}
		else if(q8c.isSelected()) { a8="C";}
		
		if(q9a.isSelected()) { a9="A";}
		else if(q9b.isSelected()) { a9="B";}
		else if(q9c.isSelected()) { a9="C";}
		
		if(q10a.isSelected()) { a10="A";}
		else if(q10b.isSelected()) { a10="B";}
		else if(q10c.isSelected()) { a10="C";}
		
		answer = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
		
		try {
			em.createExam(paper_id, answer);
			score = em.Examgrade(paper_id, answer);
			label.setText(String.valueOf(score));
			label.setVisible(true);
			
		} catch (BaseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		
		
	}
}
