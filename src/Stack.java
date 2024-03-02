import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField fullstack;
	//stack array creation
	private int s[];
	private int sizee;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCURE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 35));
		lblNewLabel.setBounds(274, 21, 429, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterStackSize = new JLabel("ENTER STACK SIZE");
		lblEnterStackSize.setForeground(Color.WHITE);
		lblEnterStackSize.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterStackSize.setBounds(121, 97, 238, 45);
		contentPane.add(lblEnterStackSize);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(Color.WHITE);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterAnElement.setBounds(101, 239, 272, 31);
		contentPane.add(lblEnterAnElement);
		
		size = new JTextField();
		size.setFont(new Font("Tahoma", Font.PLAIN, 20));
		size.setBounds(383, 97, 202, 45);
		contentPane.add(size);
		size.setColumns(10);
		
		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.PLAIN, 20));
		element.setColumns(10);
		element.setBounds(383, 232, 202, 45);
		contentPane.add(element);
		
		fullstack = new JTextField();
		fullstack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fullstack.setColumns(10);
		fullstack.setBounds(312, 508, 407, 45);
		contentPane.add(fullstack);
		
		JLabel lblStack = new JLabel("STACK");
		lblStack.setForeground(Color.WHITE);
		lblStack.setFont(new Font("Constantia", Font.BOLD, 25));
		lblStack.setBounds(209, 522, 100, 31);
		contentPane.add(lblStack);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for push operation
				int elem;
				if(top==sizee-1)
				{
					JOptionPane.showMessageDialog(contentPane,"push not possible");
				}
				else
				{
				elem=Integer.valueOf(element.getText());
				++top;
				s[top]=elem;
				JOptionPane.showMessageDialog(contentPane, "push sucessful");
				element.setText("");
				}
			}
		});
		push.setForeground(new Color(64, 128, 128));
		push.setFont(new Font("Cooper Black", Font.BOLD, 25));
		push.setBounds(664, 229, 179, 41);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"pop not possible");
				}
				else
				{
					String message="element deleted is"+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			
			}
		});
		pop.setForeground(new Color(64, 128, 128));
		pop.setFont(new Font("Cooper Black", Font.BOLD, 25));
		pop.setBounds(406, 334, 179, 41);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for display
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+s[i];
					}
					fullstack.setText(msg);
				}
			
			
			}
		});
		display.setForeground(new Color(64, 128, 128));
		display.setFont(new Font("Cooper Black", Font.BOLD, 25));
		display.setBounds(406, 426, 179, 41);
		contentPane.add(display);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//code for stack creation
				sizee=Integer.valueOf(size.getText());
				s=new int[sizee];
				String message="Stack of size"+sizee+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createstack.setForeground(new Color(64, 128, 128));
		createstack.setFont(new Font("Cooper Black", Font.BOLD, 25));
		createstack.setBounds(360, 163, 249, 37);
		contentPane.add(createstack);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DataStructures ds=new DataStructures();
				ds.show();
				dispose();//to close current page
			}
		});
		btnHome.setForeground(new Color(64, 128, 128));
		btnHome.setFont(new Font("Cooper Black", Font.BOLD, 25));
		btnHome.setBounds(821, 512, 144, 41);
		contentPane.add(btnHome);
	}
}
