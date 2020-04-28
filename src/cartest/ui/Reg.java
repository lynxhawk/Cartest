package cartest.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cartest.model.User;
//import cartest.model.Manager;
import cartest.util.BaseException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Dimension;

import cartest.control.*;

public class Reg extends JDialog  implements ActionListener  {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user =null;
	
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();  
	private Button btnOk = new Button("OK");
	private Button btnCancel = new Button("Cancel");
	private JLabel labelusername = new JLabel("用户姓名：");
	private JLabel labelloginname = new JLabel("用户登录名：");
	private JLabel labeluserpwd = new JLabel("用户密码：");
	
	private JTextField txtusername = new JTextField(20);
	private JTextField txtloginname = new JTextField(20);
	private JTextField txtuserpwd = new JTextField(20);
	
	public Reg(Frame f, String s, boolean b) {
		super(f, s, b);
		setTitle("注册");
		toolBar.setFont(new Font("宋体", Font.PLAIN, 25));
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(btnOk);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.setFont(new Font("宋体", Font.PLAIN, 25));
		workPane.setLayout(null);
		
		labelusername.setFont(new Font("宋体", Font.PLAIN, 25));
		labelusername.setBounds(95, 50, 150, 40);
		workPane.add(labelusername);
		labelloginname.setFont(new Font("宋体", Font.PLAIN, 25));
		labelloginname.setBounds(95, 100, 150, 40);
		workPane.add(labelloginname);
		labeluserpwd.setFont(new Font("宋体", Font.PLAIN, 25));
		labeluserpwd.setBounds(95, 150, 150, 40);
		workPane.add(labeluserpwd);
		
		txtusername.setFont(new Font("宋体", Font.PLAIN, 25));
		txtusername.setBounds(220, 50, 260, 32);
		workPane.add(txtusername);
		txtloginname.setFont(new Font("宋体", Font.PLAIN, 25));
		txtloginname.setBounds(220, 100, 260, 32);
		workPane.add(txtloginname);
		txtuserpwd .setFont(new Font("宋体", Font.PLAIN, 25));
		txtuserpwd .setBounds(220, 150, 260, 32);
		workPane.add(txtuserpwd);
		
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		this.setSize(650, 450);
		// 屏幕居中显示
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();
		this.btnOk.addActionListener(this);
		this.btnCancel.addActionListener(this);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.btnCancel) {
			this.setVisible(false);
			return;
		}
		else if(e.getSource()==this.btnOk){
			String code=this.txtusername.getText();
			String name=this.txtloginname.getText();
			String pwd = this.txtuserpwd.getText();
			
			UserManager um = new UserManager();
			try {
				User us = new User();
				us = um.createUser(code, name, pwd); 
				this.setVisible(false);
				Addstudent dlg = new Addstudent(this,"增加考生信息",true,us,code);
				dlg.setVisible(true);
			} catch (BaseException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(),"错误",JOptionPane.ERROR_MESSAGE);
				e1.printStackTrace();
			}
       }
}
}