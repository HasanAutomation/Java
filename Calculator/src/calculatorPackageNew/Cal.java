package calculatorPackageNew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;

public class Cal {

	private JFrame frmRainasCalculator;
	private JTextField txt_Display;
	double numb,answer;
	int calculation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frmRainasCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}
	public void arithmeticOperation()
	{
		switch(calculation)
		{
		
		
		case 1:
			answer=numb+Double.parseDouble(txt_Display.getText());
			
		
			txt_Display.setText(Double.toString(answer));
			break;
			
		case 2:
			answer=numb-Double.parseDouble(txt_Display.getText());
			txt_Display.setText(Double.toString(answer));
			break;
			
		case 3:
			answer=numb*Double.parseDouble(txt_Display.getText());
			txt_Display.setText(Double.toString(answer));
			break;
		
		case 4:
			answer=numb/Double.parseDouble(txt_Display.getText());
			txt_Display.setText(Double.toString(answer));
			break;
		
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRainasCalculator = new JFrame();
		frmRainasCalculator.setResizable(false);
		frmRainasCalculator.setTitle("Calculator");
		frmRainasCalculator.setBounds(100, 100, 404, 532);
		frmRainasCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRainasCalculator.getContentPane().setLayout(null);
		
		txt_Display = new JTextField();
		txt_Display.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt_Display.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_Display.setBounds(12, 10, 358, 74);
		frmRainasCalculator.getContentPane().add(txt_Display);
		txt_Display.setColumns(10);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numb=Double.parseDouble(txt_Display.getText());
				txt_Display.setText("");
				calculation=1;
				
				
			
                
				
				
				
			}
		});
		btn_add.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_add.setBounds(297, 94, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_add);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText("");
			}
		});
		btn_C.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_C.setBounds(196, 94, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_C);
		
		JButton btn_Backspace = new JButton("Backspace");
		btn_Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length=txt_Display.getText().length();
				int number=txt_Display.getText().length()-1;
				String store;
				
				if(length>0)
				{
					StringBuilder back=new StringBuilder(txt_Display.getText());
					back.deleteCharAt(number);
					store=back.toString();
					txt_Display.setText(store);
				}
			}
		});
		btn_Backspace.setFont(new Font("Arial", Font.BOLD, 16));
		btn_Backspace.setBounds(10, 94, 166, 44);
		frmRainasCalculator.getContentPane().add(btn_Backspace);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"7");
			}
		});
		btn_7.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_7.setBounds(10, 176, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"8");
			}
		});
		btn_8.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_8.setBounds(103, 176, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"9");
			}
		});
		btn_9.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_9.setBounds(196, 176, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_9);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numb=Double.parseDouble(txt_Display.getText());
				txt_Display.setText("");
				calculation=2;
				
				
				
			}
		});
		btn_sub.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_sub.setBounds(297, 176, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_sub);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"4");
			}
		});
		btn_4.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_4.setBounds(10, 256, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"5");
			}
		});
		btn_5.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_5.setBounds(104, 256, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"6");
			}
		});
		btn_6.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_6.setBounds(196, 256, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_6);
		
		JButton btn_mul = new JButton("*");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numb=Double.parseDouble(txt_Display.getText());
				txt_Display.setText("");
				calculation=3;
				
			}
		});
		btn_mul.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_mul.setBounds(297, 256, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_mul);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"1");
				
			}
		});
		btn_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_1.setBounds(10, 342, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"2");
			}
		});
		btn_2.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_2.setBounds(104, 342, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"3");
			}
		});
		btn_3.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_3.setBounds(196, 342, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_3);
		
		JButton btn_div = new JButton("/");
		btn_div.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				numb=Double.parseDouble(txt_Display.getText());
				txt_Display.setText("");
				calculation=4;
				
			}
		});
		btn_div.setBounds(297, 342, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_div);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+"0");
			}
		});
		btn_0.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_0.setBounds(10, 421, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Display.setText(txt_Display.getText()+".");
			}
		});
		btn_dot.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_dot.setBounds(104, 421, 73, 44);
		frmRainasCalculator.getContentPane().add(btn_dot);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arithmeticOperation();
			
			}
		});
		btn_equal.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_equal.setBounds(196, 421, 174, 44);
		frmRainasCalculator.getContentPane().add(btn_equal);
		
		
	}
}
