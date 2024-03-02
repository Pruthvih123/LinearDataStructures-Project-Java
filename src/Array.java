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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField deleteposition;
	private JTextField displayArrayElements;
	//create array
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setForeground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setBounds(387, 10, 321, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setBounds(139, 75, 227, 25);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 20));
		length.setBounds(376, 68, 220, 37);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATAE ARRAY");
		create.setBounds(237, 143, 197, 33);
		create.setBackground(new Color(128, 128, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 20));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String len=length.getText();
				//int l=Integer.valueOf(len);
				//CODE FOR CREATING ARRAY
		//collect the string input and convert into integer
		int len=Integer.valueOf(length.getText());
		//create array of given length
		arr=new int[len];
		//dialog box
		String message="Array of length"+len+"Created";
		JOptionPane.showMessageDialog(contentPane, message);
			
			}
		});
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT INTEGER ELEMENT");
		lblNewLabel_2.setBounds(9, 203, 266, 25);
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 20));
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(285, 186, 149, 36);
		element.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//CODE FOR INSERTION
				//collect input string convert into string
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(position.getText());
				//check weather array is full or not
				if(arr[pos]>arr.length)
				{
					String Message="Array is full insertion not possible";
					JOptionPane.showMessageDialog(contentPane, Message);
				}
			
				//if array in not full insert element
				else {
				arr[pos]=elem;
				String message="Element"+elem+"inserted @ position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				position.setText("");}
				/*if(arr[pos]>arr.length)
				{
					String Message="Array is full insertion not possible";
					JOptionPane.showMessageDialog(contentPane, Message);
				}*/
			}
		});
		btnNewButton.setBounds(880, 186, 112, 42);
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(64, 128, 128));
		contentPane.add(btnNewButton);
		
		position = new JTextField();
		position.setBounds(642, 186, 117, 38);
		position.setFont(new Font("Tahoma", Font.PLAIN, 20));
		position.setColumns(10);
		contentPane.add(position);
		
		JLabel lblNewLabel_2_2 = new JLabel("DELETE POSITION");
		lblNewLabel_2_2.setBounds(55, 261, 193, 45);
		lblNewLabel_2_2.setFont(new Font("Constantia", Font.BOLD, 20));
		contentPane.add(lblNewLabel_2_2);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(258, 267, 128, 31);
		deleteposition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		deleteposition.setColumns(10);
		contentPane.add(deleteposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CODE FOR DELETION
			//collect the position you want to delete  
			int pos=Integer.valueOf(deleteposition.getText());
			arr[pos]=0;
			String message="Element deleted at positon"+pos;
			JOptionPane.showConfirmDialog(contentPane, message);
			}
		});
		delete.setBounds(396, 268, 127, 31);
		delete.setFont(new Font("Constantia", Font.BOLD, 20));
		delete.setBackground(new Color(64, 128, 128));
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CODE FOR DISPLAY
			String msg="";
			for(int i=0;i<=arr.length-1;i++)
			{
				msg=msg+" "+arr[i];
			}
			displayArrayElements.setText(msg);
			}
		});
		display.setBounds(432, 364, 117, 33);
		display.setFont(new Font("Constantia", Font.BOLD, 20));
		display.setBackground(new Color(0, 0, 0));
		contentPane.add(display);
		
		displayArrayElements = new JTextField();
		displayArrayElements.setFont(new Font("Tahoma", Font.PLAIN, 20));
		displayArrayElements.setBounds(302, 426, 387, 45);
		displayArrayElements.setColumns(10);
		contentPane.add(displayArrayElements);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ARRAY");
		lblNewLabel_1_1_1.setForeground(Color.MAGENTA);
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(173, 433, 119, 45);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("POSITION");
		lblNewLabel_2_2_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(515, 195, 117, 41);
		contentPane.add(lblNewLabel_2_2_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				DataStructures ds=new DataStructures();
				ds.show();
				dispose();//to close current page
			}
		});
		btnHome.setFont(new Font("Constantia", Font.BOLD, 20));
		btnHome.setBackground(new Color(64, 128, 128));
		btnHome.setBounds(850, 404, 127, 31);
		contentPane.add(btnHome);
	}
}
