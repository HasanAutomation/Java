package com.connection;
import java.sql.*;
import javax.swing.*;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;
	static Connection conn=null;
	private JTextField username;
	private JPasswordField password;
	PreparedStatement insert;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		conn=SqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 692, 437);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel user = new JLabel("Username");
		user.setFont(new Font("Tahoma", Font.BOLD, 18));
		user.setBounds(284, 90, 105, 25);
		frmLogin.getContentPane().add(user);
		
		JLabel pass = new JLabel("Password");
		pass.setFont(new Font("Tahoma", Font.BOLD, 18));
		pass.setBounds(284, 157, 105, 25);
		frmLogin.getContentPane().add(pass);
		
		username = new JTextField();
		username.setBounds(399, 90, 198, 27);
		frmLogin.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(399, 157, 198, 27);
		frmLogin.getContentPane().add(password);
		
		JButton btnLogin = new JButton("Login");
		Image imgOk=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnLogin.setIcon(new ImageIcon(imgOk));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//For insertion
//					insert=conn.prepareStatement("insert into records(username,password) values(?,?)");
//					insert.setString(1, username.getText());
//					insert.setString(2, password.getText());
//					
//					insert.executeUpdate();
//					
//					JOptionPane.showMessageDialog(null, "Record added");
					
					//searching data
					String query="select * from records where username=? and password=?";
					insert=conn.prepareStatement(query);
					insert.setString(1, username.getText());
					insert.setString(2, password.getText());
					rs=insert.executeQuery();
					int count=0;
					while(rs.next()) {
						count++;
					}
					
					if(count==1) {
//						JOptionPane.showMessageDialog(null, "Username and password are correct");
						frmLogin.dispose();
						new EmployeeInfo().setVisible(true);
					}
					else if(count>1) {
						JOptionPane.showMessageDialog(null, "Duplicate records");
					}
					else {
						JOptionPane.showMessageDialog(null, "No records found");
					}
					insert.close();
					
					
					
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e);					
				}
			}
		});
		btnLogin.setFont(new Font("Lucida Console", Font.BOLD, 20));
		btnLogin.setBounds(368, 222, 132, 38);
		frmLogin.getContentPane().add(btnLogin);
		
		JLabel imgLbl = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		imgLbl.setIcon(new ImageIcon(img));
		imgLbl.setBounds(75, 90, 140, 170);
		frmLogin.getContentPane().add(imgLbl);
	}
}
