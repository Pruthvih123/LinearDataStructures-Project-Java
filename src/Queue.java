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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField textField;
	private JTextField queue;
	private int q[];
	private int sizee;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 35));
		lblNewLabel.setBounds(249, 10, 495, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterStackLength = new JLabel("ENTER QUEUE LENGTH");
		lblEnterStackLength.setForeground(Color.WHITE);
		lblEnterStackLength.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterStackLength.setBackground(Color.BLUE);
		lblEnterStackLength.setBounds(38, 109, 293, 72);
		contentPane.add(lblEnterStackLength);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 20));
		length.setBounds(341, 109, 237, 49);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel element = new JLabel("ENTER ELEMENT");
		element.setForeground(Color.WHITE);
		element.setFont(new Font("Constantia", Font.BOLD, 25));
		element.setBackground(Color.BLUE);
		element.setBounds(38, 243, 237, 72);
		contentPane.add(element);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(257, 255, 196, 38);
		contentPane.add(textField);
		
		JLabel lblQueue = new JLabel("QUEUE");
		lblQueue.setForeground(Color.WHITE);
		lblQueue.setFont(new Font("Constantia", Font.BOLD, 25));
		lblQueue.setBackground(Color.BLUE);
		lblQueue.setBounds(68, 493, 106, 72);
		contentPane.add(lblQueue);
		
		queue = new JTextField();
		queue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		queue.setColumns(10);
		queue.setBounds(204, 511, 437, 38);
		contentPane.add(queue);
		
		JButton CreateQueue = new JButton("CREATE QUEUE");
		CreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for creation of queue
				sizee=Integer.valueOf(length.getText());
				q=new int[sizee];
				String message="Queue of length"+sizee+"is created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		CreateQueue.setFont(new Font("Tahoma", Font.BOLD, 20));
		CreateQueue.setBackground(new Color(255, 0, 255));
		CreateQueue.setBounds(271, 191, 269, 33);
		contentPane.add(CreateQueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for insertion
				int elem;
				if(sizee==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");
				}
				else
				{
					elem=Integer.valueOf(textField.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Insertion sucessful");
					textField.setText("");
					
				}
			
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 20));
		insert.setBackground(Color.MAGENTA);
		insert.setBounds(566, 263, 220, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
			if(r==-2 || f>r)
			{
				JOptionPane.showConfirmDialog(contentPane, "deletion not possible");
			}
			else
			{
				JOptionPane.showConfirmDialog(contentPane,"element deleted at"+q[f]);
				++f;
			}
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		delete.setBackground(Color.MAGENTA);
		delete.setBounds(341, 338, 220, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//code for deletion
				String msg="";
				if(r==-1 ||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "dispaly not possible");
				}
				else
				{
					for(int i=f;i<r;i++)
					{
						msg=msg+" "+q[i];
						queue.setText(msg);
					}
				}
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 20));
		display.setBackground(Color.MAGENTA);
		display.setBounds(341, 416, 220, 33);
		contentPane.add(display);
		
		JButton btnHome = new JButton("HOME ");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			DataStructures ds=new DataStructures();
			ds.show();
			dispose();
			
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHome.setBackground(Color.MAGENTA);
		btnHome.setBounds(790, 488, 174, 33);
		contentPane.add(btnHome);
	}

}
