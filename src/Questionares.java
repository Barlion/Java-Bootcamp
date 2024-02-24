
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questionares {

	private JFrame frame;
	private JTextField TextField1;
	private JTextField Question;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionares window = new Questionares();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Questionares() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(150, 233, 198));
		frame.setBounds(100, 100, 1044, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField1 = new JTextField();
		TextField1.setBackground(new Color(108, 34, 216));
		TextField1.setForeground(new Color(150, 233, 198));
		TextField1.setFont(new Font("Tahoma", Font.BOLD, 22));
		TextField1.setHorizontalAlignment(SwingConstants.LEFT);
		TextField1.setText("Question:");
		TextField1.setBounds(239, 21, 387, 41);
		frame.getContentPane().add(TextField1);
		TextField1.setColumns(10);
		
		Question = new JTextField();
		Question.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Question.setBackground(new Color(131, 192, 193));
		Question.setBounds(36, 82, 970, 154);
		frame.getContentPane().add(Question);
		Question.setColumns(10);
		
		JButton Submit = new JButton("SUBMIT");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Submit.setForeground(new Color(150, 233, 198));
		Submit.setBorderPainted(false);
		Submit.setBackground(new Color(108, 34, 216));
		Submit.setFont(new Font("Tahoma", Font.BOLD, 22));
		Submit.setBounds(488, 635, 215, 41);
		frame.getContentPane().add(Submit);
		
		JCheckBox option1 = new JCheckBox("New check box");
		option1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		option1.setBackground(new Color(131, 192, 193));
		option1.setHorizontalAlignment(SwingConstants.LEFT);
		option1.setBounds(36, 256, 970, 73);
		frame.getContentPane().add(option1);
		
		JButton Next = new JButton("NEXT");
		Next.setForeground(new Color(150, 233, 198));
		Next.setFont(new Font("Tahoma", Font.BOLD, 22));
		Next.setBorderPainted(false);
		Next.setBackground(new Color(108, 34, 216));
		Next.setBounds(738, 635, 215, 41);
		frame.getContentPane().add(Next);
		
		JCheckBox option2 = new JCheckBox("New check box");
		option2.setHorizontalAlignment(SwingConstants.LEFT);
		option2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		option2.setBackground(new Color(131, 192, 193));
		option2.setBounds(36, 348, 970, 73);
		frame.getContentPane().add(option2);
		
		JCheckBox option3 = new JCheckBox("New check box");
		option3.setHorizontalAlignment(SwingConstants.LEFT);
		option3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		option3.setBackground(new Color(131, 192, 193));
		option3.setBounds(36, 444, 970, 73);
		frame.getContentPane().add(option3);
		
		JCheckBox option4 = new JCheckBox("New check box");
		option4.setHorizontalAlignment(SwingConstants.LEFT);
		option4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		option4.setBackground(new Color(131, 192, 193));
		option4.setBounds(36, 539, 970, 73);
		frame.getContentPane().add(option4);
	}
}
