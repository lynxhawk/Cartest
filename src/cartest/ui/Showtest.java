package cartest.ui;

import java.awt.BorderLayout;
import java.awt.Dialog;
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

public class Showtest extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JScrollPane scrollPane = new JScrollPane(panel);
	
	//private JButton button = new JButton("提交");
	private JLabel label = new JLabel();
	
	private  JLabel q1 = new JLabel("第一题内容");
	private  JLabel q2 = new JLabel("第二题内容");
	private  JLabel q3 = new JLabel("第三题内容");
	private  JLabel q4 = new JLabel("第四题内容");
	private  JLabel q5 = new JLabel("第五题内容");
	private  JLabel q6 = new JLabel("第六题内容");
	private  JLabel q7 = new JLabel("第七题内容");
	private  JLabel q8 = new JLabel("第八题内容");
	private  JLabel q9 = new JLabel("第九题内容");
	private  JLabel q10 = new JLabel("第十题内容");
	
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
	
	
	
	
	
	public Showtest(Dialog f, String s, boolean b,int grade,String answer,List<Question> result) {
		super(f, s, b);
		setBounds(0, 0, 1920, 1080);
		setTitle("考试试卷");
		
		panel.setLayout(null);
		panel.setBounds(0, 0, 1900, 1300);
		panel.setPreferredSize(new Dimension(1900, 1600));

	    scrollPane.setBounds(0, 0, 1850, 1000); 
	    scrollPane.setSize(1900, 1000);
	    scrollPane.setPreferredSize(new Dimension(1850, 1000));
	    scrollPane.setViewportView(panel);
	    getContentPane().add(scrollPane);
	    
//	    button.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
//	    button.setBounds(1727, 15, 123, 40);
//	    panel.add(button);
	  
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
	    
	    
	    JLabel no1 = new JLabel("第一题");
	    panel.add(no1);
	    no1.setBounds(30, 30, 80, 25);
	    no1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no2 = new JLabel("第二题");
	    panel.add(no2);
	    no2.setBounds(30, 180, 80, 25);
	    no2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no3 = new JLabel("第三题");
	    panel.add(no3);
	    no3.setBounds(30, 330, 80, 25);
	    no3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no4 = new JLabel("第四题");
	    panel.add(no4);
	    no4.setBounds(30, 480, 80, 25);
	    no4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no5 = new JLabel("第五题");
	    panel.add(no5);
	    no5.setBounds(30, 630, 80, 25);
	    no5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no6 = new JLabel("第六题");
	    panel.add(no6);
	    no6.setBounds(30, 780, 80, 25);
	    no6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no7 = new JLabel("第七题");
	    panel.add(no7);
	    no7.setBounds(30, 930, 80, 25);
	    no7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no8 = new JLabel("第八题");
	    panel.add(no8);
	    no8.setBounds(30, 1080, 80, 25);
	    no8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no9 = new JLabel("第九题");
	    panel.add(no9);
	    no9.setBounds(30, 1230, 80, 25);
	    no9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    
	    JLabel no10 = new JLabel("第十题");
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
	    
	    //label.setText(String.valueOf(paper_id));
	    label.setBounds(1603, 15, 96, 40);
	    panel.add(label);
	    label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    //label.setVisible(false);
	    
	    if(result.get(0).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q1a.setText("对");
	    	q1b.setText("错");
	    	q1c.setVisible(false);
	    }else {
	    	q1a.setText(result.get(0).getBrancha());
	    	q1b.setText(result.get(0).getBranchb());
	    	q1c.setText(result.get(0).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(1).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q2a.setText("对");
	    	q2b.setText("错");
	    	q2c.setVisible(false);
	    }else {
	    	q2a.setText(result.get(1).getBrancha());
	    	q2b.setText(result.get(1).getBranchb());
	    	q2c.setText(result.get(1).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(2).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q3a.setText("对");
	    	q3b.setText("错");
	    	q3c.setVisible(false);
	    }else {
	    	q3a.setText(result.get(2).getBrancha());
	    	q3b.setText(result.get(2).getBranchb());
	    	q3c.setText(result.get(2).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(3).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q4a.setText("对");
	    	q4b.setText("错");
	    	q4c.setVisible(false);
	    }else {
	    	q4a.setText(result.get(3).getBrancha());
	    	q4b.setText(result.get(3).getBranchb());
	    	q4c.setText(result.get(3).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(4).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q5a.setText("对");
	    	q5b.setText("错");
	    	q5c.setVisible(false);
	    }else {
	    	q5a.setText(result.get(4).getBrancha());
	    	q5b.setText(result.get(4).getBranchb());
	    	q5c.setText(result.get(4).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(5).getQuestionform().equals("J")) {
	    	//System.out.println("!!!!!!!!!!");
	    	q6a.setText("对");
	    	q6b.setText("错");
	    	q6c.setVisible(false);
	    }else {
	    	q6a.setText(result.get(5).getBrancha());
	    	q6b.setText(result.get(5).getBranchb());
	    	q6c.setText(result.get(5).getBranchc());
	    	//System.out.println("11111111111111");
	    }
	    
	    if(result.get(6).getQuestionform().equals("J")) {
	    	q7a.setText("对");
	    	q7b.setText("错");
	    	q7c.setVisible(false);
	    }else {
	    	q7a.setText(result.get(6).getBrancha());
	    	q7b.setText(result.get(6).getBranchb());
	    	q7c.setText(result.get(6).getBranchc());
	    }
	    
	    if(result.get(7).getQuestionform().equals("J")) {
	    	q8a.setText("对");
	    	q8b.setText("错");
	    	q8c.setVisible(false);
	    }else {
	    	q8a.setText(result.get(7).getBrancha());
	    	q8b.setText(result.get(7).getBranchb());
	    	q8c.setText(result.get(7).getBranchc());
	    }
	    
	    if(result.get(8).getQuestionform().equals("J")) {
	    	q9a.setText("对");
	    	q9b.setText("错");
	    	q9c.setVisible(false);
	    }else {
	    	q9a.setText(result.get(8).getBrancha());
	    	q9b.setText(result.get(8).getBranchb());
	    	q9c.setText(result.get(8).getBranchc());
	    }
	    
	    if(result.get(9).getQuestionform().equals("J")) {
	    	q10a.setText("对");
	    	q10b.setText("错");
	    	q10c.setVisible(false);
	    }else {
	    	q10a.setText(result.get(9).getBrancha());
	    	q10b.setText(result.get(9).getBranchb());
	    	q10c.setText(result.get(9).getBranchc());
	    }
	    
	    label.setText(String.valueOf(grade));
		label.setVisible(true);
	    
		//button.addActionListener(this);
		
		char a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		a1 = answer.charAt(0);
		a2 = answer.charAt(1);
		a3 = answer.charAt(2);
		a4 = answer.charAt(3);
		a5 = answer.charAt(4);
		a6 = answer.charAt(5);
		a7 = answer.charAt(6);
		a8 = answer.charAt(7);
		a9 = answer.charAt(8);
		a10 = answer.charAt(9);
		
		if(a1=='A') { q1a.setSelected(true);}
		else if(a1=='B') {q1b.setSelected(true);}
		else if(a1=='C') {q1c.setSelected(true);}
		else {}
		
		if(a2=='A') { q2a.setSelected(true);}
		else if(a2=='B') {q2b.setSelected(true);}
		else if(a2=='C') {q2c.setSelected(true);}
		else {}
		
		if(a3=='A') { q3a.setSelected(true);}
		else if(a3=='B') {q3b.setSelected(true);}
		else if(a3=='C') {q3c.setSelected(true);}
		else {}
		
		if(a4=='A') { q4a.setSelected(true);}
		else if(a4=='B') {q4b.setSelected(true);}
		else if(a4=='C') {q4c.setSelected(true);}
		else {}
		
		if(a5=='A') { q5a.setSelected(true);}
		else if(a5=='B') {q5b.setSelected(true);}
		else if(a5=='C') {q5c.setSelected(true);}
		else {}
		
		if(a6=='A') { q6a.setSelected(true);}
		else if(a6=='B') {q6b.setSelected(true);}
		else if(a6=='C') {q6c.setSelected(true);}
		else {}
		
		if(a7=='A') { q7a.setSelected(true);}
		else if(a7=='B') {q7b.setSelected(true);}
		else if(a7=='C') {q7c.setSelected(true);}
		else {}
		
		if(a8=='A') { q8a.setSelected(true);}
		else if(a8=='B') {q8b.setSelected(true);}
		else if(a8=='C') {q8c.setSelected(true);}
		else {}
		
		if(a9=='A') { q9a.setSelected(true);}
		else if(a9=='B') {q9b.setSelected(true);}
		else if(a9=='C') {q9c.setSelected(true);}
		else {}
		
		if(a10=='A') { q10a.setSelected(true);}
		else if(a10=='B') {q10b.setSelected(true);}
		else if(a10=='C') {q10c.setSelected(true);}
		else {}
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
			
		

}
