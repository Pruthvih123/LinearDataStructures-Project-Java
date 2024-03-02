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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField circularqueue;
	private int cq[];
	private int sizee;
	private int r=-1;
	private int f=0;
	private int count=0;	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(133, 10, 650, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblCircularQueueData = new JLabel("ENTER QUEUE SIZE");
		lblCircularQueueData.setForeground(new Color(128, 64, 0));
		lblCircularQueueData.setFont(new Font("Constantia", Font.BOLD, 25));
		lblCircularQueueData.setBounds(10, 92, 261, 43);
		contentPane.add(lblCircularQueueData);
		
		JLabel lblEnterElement = new JLabel("ENTER ELEMENT");
		lblEnterElement.setForeground(new Color(128, 64, 0));
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterElement.setBounds(10, 213, 229, 43);
		contentPane.add(lblEnterElement);
		
		JLabel lblCircularQueue = new JLabel("CIRCULAR QUEUE");
		lblCircularQueue.setForeground(new Color(128, 64, 0));
		lblCircularQueue.setFont(new Font("Constantia", Font.BOLD, 25));
		lblCircularQueue.setBounds(23, 503, 261, 43);
		contentPane.add(lblCircularQueue);
		
		size = new JTextField();
		size.setFont(new Font("Tahoma", Font.PLAIN, 20));
		size.setBounds(257, 92, 250, 43);
		contentPane.add(size);
		size.setColumns(10);
		
		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.PLAIN, 20));
		element.setColumns(10);
		element.setBounds(229, 202, 287, 51);
		contentPane.add(element);
		
		circularqueue = new JTextField();
		circularqueue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		circularqueue.setColumns(10);
		circularqueue.setBounds(274, 503, 457, 43);
		contentPane.add(circularqueue);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for creation
			sizee=Integer.valueOf(size.getText());
			cq=new int[sizee];
			String message="CQ of length"+sizee+"is cerated";
			JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setFont(new Font("Constantia", Font.BOLD, 25));
		createqueue.setBackground(new Color(255, 0, 255));
		createqueue.setBounds(284, 145, 287, 39);
		contentPane.add(createqueue);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for deletion
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted at "+cq[f]);
					f=(f+1)%sizee;
					count--;
				}
			
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 25));
		delete.setBackground(Color.MAGENTA);
		delete.setBounds(284, 293, 223, 39);
		contentPane.add(delete);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for insertion
				int elem;
				if(count==sizee)
				{
					JOptionPane.showMessageDialog(contentPane,"Insertion is not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					r=(r+1)%sizee;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane,"Insertion is sucessful");
					element.setText("");
				}
				
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 25));
		insert.setBackground(Color.MAGENTA);
		insert.setBounds(605, 213, 223, 39);
		contentPane.add(insert);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for display
			String msg="";
			int f1=f;
			if(count==0)
			{
				JOptionPane.showConfirmDialog(contentPane, "Display not possible");
			}
			else
			{
				for(int i=1;i<=count;i++)
				{
					msg=msg+" "+cq[f1];
					f1=(f1+1)%sizee;
					circularqueue.setText(msg);
				}
			}
			
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 25));
		display.setBackground(Color.MAGENTA);
		display.setBounds(284, 393, 232, 39);
		contentPane.add(display);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			 DataStructures ds=new DataStructures();
			 ds.show();
			 dispose();
				
			}
		});
		btnHome.setFont(new Font("Constantia", Font.BOLD, 25));
		btnHome.setBackground(Color.MAGENTA);
		btnHome.setBounds(840, 503, 136, 39);
		contentPane.add(btnHome);
	}

}
