import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataStructures extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataStructures frame = new DataStructures();
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
	public DataStructures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseAData = new JLabel("CHOOSE A DATA STRUCTURE");
		lblChooseAData.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChooseAData.setForeground(new Color(255, 0, 0));
		lblChooseAData.setBackground(new Color(255, 255, 255));
		lblChooseAData.setBounds(79, 113, 389, 31);
		contentPane.add(lblChooseAData);
		
		JButton btnArrays = new JButton("ARRAY");
		btnArrays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				new Array().setVisible(true);
				dispose();
				
			}
		});
		btnArrays.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnArrays.setForeground(new Color(0, 0, 0));
		btnArrays.setBackground(new Color(255, 255, 255));
		btnArrays.setBounds(369, 172, 242, 45);
		contentPane.add(btnArrays);
		
		JButton btnStack = new JButton("STACK");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//place stack opening code
				new Stack().setVisible(true);	
				dispose();//to close the current page
				}
		});
		btnStack.setForeground(Color.BLACK);
		btnStack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStack.setBackground(new Color(255, 255, 255));
		btnStack.setBounds(103, 242, 242, 45);
		contentPane.add(btnStack);
		
		JButton btnQueue = new JButton("QUEUE");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place queue opening code here
				new Queue().setVisible(true);
				dispose();//to close the current page
			}
		});
		btnQueue.setForeground(Color.BLACK);
		btnQueue.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnQueue.setBackground(new Color(255, 255, 255));
		btnQueue.setBounds(694, 242, 257, 45);
		contentPane.add(btnQueue);
		
		JButton btnSingleLinkedList = new JButton("SINGLE LINKED LIST");
		btnSingleLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//place single linked list code here
				new SingleLinkedList().setVisible(true);
				dispose();//to close the current page
			}
		});
		btnSingleLinkedList.setForeground(Color.BLACK);
		btnSingleLinkedList.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSingleLinkedList.setBackground(new Color(255, 255, 255));
		btnSingleLinkedList.setBounds(665, 355, 330, 45);
		contentPane.add(btnSingleLinkedList);
		
		JButton btnDoubleLinkedList = new JButton("DOUBLE LINKED LIST");
		btnDoubleLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place double linked list code here
				new DoubleLinkedList().setVisible(true);
				dispose();//to close the current page
			}
		});
		btnDoubleLinkedList.setForeground(Color.BLACK);
		btnDoubleLinkedList.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDoubleLinkedList.setBackground(new Color(255, 255, 255));
		btnDoubleLinkedList.setBounds(311, 462, 330, 52);
		contentPane.add(btnDoubleLinkedList);
		
		JButton btnCircularLinkedList = new JButton("CIRCULAR QUEUE");
		btnCircularLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//place circular queue code here
				new CircularQueue().setVisible(true);
				dispose();//to close the current page
			}
		});
		btnCircularLinkedList.setForeground(Color.BLACK);
		btnCircularLinkedList.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCircularLinkedList.setBackground(new Color(255, 255, 255));
		btnCircularLinkedList.setBounds(57, 355, 324, 45);
		contentPane.add(btnCircularLinkedList);
		
		JLabel lblDataStructures = new JLabel("DATA STRUCTURES");
		lblDataStructures.setForeground(new Color(0, 0, 255));
		lblDataStructures.setFont(new Font("Constantia", Font.BOLD, 40));
		lblDataStructures.setBackground(Color.WHITE);
		lblDataStructures.setBounds(295, 22, 557, 49);
		contentPane.add(lblDataStructures);
	}
}
