package cartest.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cartest.control.UserManager;
import cartest.model.User;
import cartest.util.BaseException;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Login extends JDialog  implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();
	private JButton btnLogin = new JButton("登陆");
	private JButton btnCancel = new JButton("退出");
	
	private JLabel labelCode = new JLabel("用户登录名：");
	private JTextField edtCode = new JTextField(20);
	private JPasswordField edtPwd = new JPasswordField(20);
	private final JLabel label = new JLabel("密码：      ");

	public Login(Frame f, String s, boolean b) {
		super(f, s, b);
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setTitle("登录窗口");
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnLogin.setFont(new Font("宋体", Font.PLAIN, 25));

		toolBar.add(btnLogin);
		btnCancel.setFont(new Font("宋体", Font.PLAIN, 25));
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		labelCode.setFont(new Font("宋体", Font.PLAIN, 25));
		workPane.add(labelCode);
		edtCode.setFont(new Font("宋体", Font.PLAIN, 25));
		workPane.add(edtCode);
		label.setFont(new Font("宋体", Font.PLAIN, 25));
		
		workPane.add(label);
		edtPwd.setFont(new Font("宋体", Font.PLAIN, 25));
		workPane.add(edtPwd);
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		this.setSize(500, 300);
		// 屏幕居中显示
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();

		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnLogin) {
			String usercode=this.edtCode.getText();
			String pwd=new String(this.edtPwd.getPassword());
			UserManager um= new UserManager();
			try {
 				User.currentLoginUser= um.login(usercode, pwd);
 				//System.out.println(Manager.currentLoginUser.getLevel());
				if(User.currentLoginUser!=null) {
					this.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null,  "密码或者账号错误","错误提示",JOptionPane.ERROR_MESSAGE);
				}
			} catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "错误",JOptionPane.ERROR_MESSAGE);
				return;
			}
		} else if (e.getSource() == this.btnCancel) {
			//System.exit(0);
			this.setVisible(false);
		}
	}


}
