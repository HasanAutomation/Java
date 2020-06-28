package com.connection;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInfo frame = new EmployeeInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection conn;
	private JTextField id;
	private JTextField name;
	private JTextField age;
	
	public void refreshTable()
	{
		try {
			String query="select id,name,age from records";
			PreparedStatement pst=conn.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}
		catch(Exception e1) {
			
		}
	}
	
	
	
	public EmployeeInfo() {
		conn=SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1088, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnData = new JButton("Load Data");
		btnData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				try {
//					String query="select id,name,age from records";
//					PreparedStatement pst=conn.prepareStatement(query);
//					ResultSet rs=pst.executeQuery();
//					table.setModel(DbUtils.resultSetToTableModel(rs));
//					
//					
//				}
//				catch(Exception e1) {
//					
//				}
				refreshTable();
				
			}
		});
		btnData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnData.setBounds(711, 50, 138, 44);
		contentPane.add(btnData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(508, 145, 539, 304);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblid = new JLabel("ID");
		lblid.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblid.setBounds(70, 158, 64, 24);
		contentPane.add(lblid);
		
		JLabel lblname = new JLabel("Name");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblname.setBounds(70, 224, 64, 24);
		contentPane.add(lblname);
		
		JLabel lblage = new JLabel("Age");
		lblage.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblage.setBounds(70, 287, 64, 24);
		contentPane.add(lblage);
		
		id = new JTextField();
		id.setBounds(161, 159, 151, 34);
		contentPane.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(161, 225, 151, 34);
		contentPane.add(name);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(161, 277, 151, 34);
		contentPane.add(age);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="insert into records(id,name,age) values(?,?,?)";
					PreparedStatement pst1=conn.prepareStatement(query);
					pst1.setString(1, id.getText());
					pst1.setString(2, name.getText());
					pst1.setString(3, age.getText());
					pst1.executeUpdate();
					id.setText("");
					name.setText("");
					age.setText("");
					pst1.close();
					JOptionPane.showMessageDialog(null, "Records Added");
					refreshTable();
				
					
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
				
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSave.setBounds(53, 362, 99, 34);
		contentPane.add(btnSave);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="Delete from records where id='"+id.getText()+"'";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Record deleted");
					id.setText("");
					refreshTable();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
				
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDelete.setBounds(174, 362, 116, 34);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String query="Update records Set id='"+id.getText()+"' , name='"+name.getText()+"' , age='"+age.getText()+"' Where id='"+id.getText()+"' ";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data updated");
					id.setText("");
					name.setText("");
					age.setText("");
					refreshTable();
					pst.close();
				}
				catch(Exception e3) {
					JOptionPane.showMessageDialog(null, e3);
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnUpdate.setBounds(316, 362, 116, 34);
		contentPane.add(btnUpdate);
		
//		refreshTable();
		
	}
}
