package cartest.ui;

import java.awt.*;  
import javax.swing.*;  
import javax.swing.table.*;  
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import cartest.control.*;
import cartest.model.*;
import cartest.util.BaseException;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JToolBar;
import java.awt.Rectangle;

public class Main extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JPanel toolBar = new JPanel();
	
	private Button btnlogin = new Button("µÇÂ¼");
	private Button btnreg = new Button("×¢²á");
	private Button btnstart = new Button("¿ªÊ¼¿¼ÊÔ");
	private Button btnsearch = new Button("¿¼ÊÔ²éÑ¯");
	
	
	public Main() throws BaseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		setTitle("»ú¶¯³µ¿¼ÊÔÏµÍ³");	
		
		setFont(new Font("Helvetica", Font.PLAIN, 50));
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		this.getContentPane().add(contentPane);
		contentPane.setLayout(null);
		    	    
	    JScrollPane scrollPane = new JScrollPane(contentPane);
	    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scrollPane.setViewportBorder(UIManager.getBorder("Table.scrollPaneBorder"));
	    
		scrollPane.setBounds(0, 0, 1900, 950);
		scrollPane.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    getContentPane().add(scrollPane);
	    getContentPane().add(toolBar, BorderLayout.NORTH);
	    toolBar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 25));
	    toolBar.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
	    
	    toolBar.add(btnlogin);
	    this.btnlogin.addActionListener(this);
	    
	    toolBar.add(btnreg);
	    this.btnreg.addActionListener(this);
	    
	    toolBar.add(btnstart);
	    this.btnstart.addActionListener(this);
	    
	    toolBar.add(btnsearch);
	    this.btnsearch.addActionListener(this);
		
	    this.addWindowListener(new WindowAdapter(){   
	    	public void windowClosing(WindowEvent e){ 
	    		System.exit(0);
             }
        });
	    
	    this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.btnlogin){
			Login dlg=new Login(this,"µÇÂ¼",true);
			dlg.setVisible(true);
		}
		
		
		else if(e.getSource()==this.btnreg)
		{
			Reg dlg=new Reg(this,"×¢²á",true);
			dlg.setVisible(true);	
		}
		
		else if(e.getSource()==this.btnstart)
		{
			GetQuestion get = new GetQuestion();
			ExamManager em = new ExamManager();
			try {
				List<Question> result = new ArrayList<Question>(get.loadAll());
				int paper_id = em.startExam(result);
				Testpaper dlg = new Testpaper(this,"test",true,paper_id,result);
				dlg.setVisible(true);
			} catch (BaseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		else if(e.getSource()==this.btnsearch)
		{
			//System.out.println(User.currentLoginUser.getUsername());
			Showpaper dlg = new Showpaper(this,"¿¼ÊÔ²éÑ¯",true);
			dlg.setVisible(true);
		}
		
       }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}