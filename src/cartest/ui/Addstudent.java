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
import java.awt.Dimension;

import cartest.control.*;

public class Addstudent extends JDialog  implements ActionListener  {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();  
	private Button btnOk = new Button("OK");
	private Button btnCancel = new Button("Cancel");
	private JLabel labelpin = new JLabel("身份证：");
	private JLabel labelphone = new JLabel("电话：");
	
	private JTextField labelid = new JTextField();
	private JTextField labelname = new JTextField();
	
	private JTextField txtpin = new JTextField(20);
	private JTextField txtphone = new JTextField(20);
	
	public Addstudent(JDialog f, String s, boolean b,User um,String username) {
		super(f, s, b);
		setTitle("增加考生信息");
		toolBar.setFont(new Font("宋体", Font.PLAIN, 25));
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(btnOk);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.setFont(new Font("宋体", Font.PLAIN, 25));
		workPane.setLayout(null);
		
		labelpin.setFont(new Font("宋体", Font.PLAIN, 25));
		labelpin.setBounds(95, 50, 150, 40);
		workPane.add(labelpin);
		labelphone.setFont(new Font("宋体", Font.PLAIN, 25));
		labelphone.setBounds(95, 100, 150, 40);
		workPane.add(labelphone);
		
		txtpin.setFont(new Font("宋体", Font.PLAIN, 25));
		txtpin.setBounds(220, 50, 260, 32);
		workPane.add(txtpin);
		txtphone.setFont(new Font("宋体", Font.PLAIN, 25));
		txtphone.setBounds(220, 100, 260, 32);
		workPane.add(txtphone);
		
		labelid.setText(String.valueOf(um.getUserid()));
		labelid.setVisible(false);
		
		labelname.setText(um.getUsername());
		labelname.setVisible(false);
		
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
			int id = Integer.parseInt(this.labelid.getText());
			String name = this.labelname.getText();
			String pin=this.txtpin.getText();
			String phone=this.txtphone.getText();
			
			UserManager um = new UserManager();
			
			try {
				um.createStudent(id,name,pin, phone); 
				this.setVisible(false);
			} catch (BaseException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(),"错误",JOptionPane.ERROR_MESSAGE);
				e1.printStackTrace();
			}
       }
}
}