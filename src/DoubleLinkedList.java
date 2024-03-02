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

public class DoubleLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField textField;
	
	class node{
		node nextlink;
		int data;
		node prelink;

	}
	private node first;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoubleLinkedList frame = new DoubleLinkedList();
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
	public DoubleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLE LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 35));
		lblNewLabel.setBounds(175, 10, 697, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterElement = new JLabel("ENTER ELEMENT");
		lblEnterElement.setForeground(Color.GREEN);
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 35));
		lblEnterElement.setBounds(10, 106, 317, 44);
		contentPane.add(lblEnterElement);
		
		JLabel lblEnterElement_1 = new JLabel("ENTER ELEMENT");
		lblEnterElement_1.setForeground(Color.GREEN);
		lblEnterElement_1.setFont(new Font("Constantia", Font.BOLD, 35));
		lblEnterElement_1.setBounds(10, 202, 317, 44);
		contentPane.add(lblEnterElement_1);
		
		element1 = new JTextField();
		element1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		element1.setBounds(316, 107, 259, 38);
		contentPane.add(element1);
		element1.setColumns(10);
		
		element2 = new JTextField();
		element2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		element2.setColumns(10);
		element2.setBounds(316, 192, 259, 38);
		contentPane.add(element2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(175, 570, 556, 56);
		contentPane.add(textField);
		
		JLabel lblEnterElement_1_1 = new JLabel("LIST");
		lblEnterElement_1_1.setForeground(Color.GREEN);
		lblEnterElement_1_1.setFont(new Font("Constantia", Font.BOLD, 35));
		lblEnterElement_1_1.setBounds(58, 574, 111, 44);
		contentPane.add(lblEnterElement_1_1);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//logic for deletion front
				if(first==null){
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				else if(first.nextlink==null){
					String message ="Deleted element is:"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);

					first=null;
				}
				else{
					first =first.nextlink;
					first=null;
				}

			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 25));
		deletefront.setBounds(290, 346, 375, 39);
		contentPane.add(deletefront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR ");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				node temp;
				if(first==null){
					JOptionPane.showMessageDialog(contentPane, "delete not possible");
				}
				else if(first.nextlink==null){
					String message ="Deleted element is:"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				//if listlink is allready present then delete the data 
				else{
					temp=first;
					while(temp.nextlink.nextlink!=null){
						temp=	temp.nextlink;
					}
					String message ="Deleted element is:"+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=null;
				}

			
			}
		});
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 25));
		btnDeleteRear.setBounds(290, 276, 375, 39);
		contentPane.add(btnDeleteRear);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//logic to insert rear
				node temp;
				int elem=Integer.valueOf(element1.getText());
				JOptionPane.showMessageDialog(contentPane, "Element inserted @ rear is" +elem);
				element1.setText("");
				node newnode=new node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;

				if(first==null){
					first=newnode;	
				}
				else{
					temp=first;
					while(temp.nextlink!=null){
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;

				}

			}
		});
		btnInsertRear.setFont(new Font("Constantia", Font.BOLD, 25));
		btnInsertRear.setBounds(625, 106, 375, 39);
		contentPane.add(btnInsertRear);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//logic for insertion front
				node temp;
				int elem=Integer.valueOf(element2.getText());
				JOptionPane.showMessageDialog(contentPane, "Element inserted @ front is" +elem);
				element2.setText("");
				//System.out.println("Enter the element");
				//	int elem=scan.nextInt();
				node newnode=new node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;

				if(first==null){
					first=newnode;
				}
				else{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;  
				}


			}
		});
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 25));
		btnInsertFront.setBounds(625, 191, 375, 39);
		contentPane.add(btnInsertFront);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//logic for display forward
				node temp;
				String msg="";
				if(first==null){
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else if(first.nextlink==null) 
				{
					msg=msg+" "+first.data;
					textField.setText(msg);
				}
				else{
					temp=first;
					while(temp!=null){
						msg=msg+""+temp.data+" ";
						temp=temp.nextlink;
					}
				}
				textField.setText(msg);
			}

			
		});
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 25));
		btnDisplayForward.setBounds(122, 459, 375, 39);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayRear = new JButton("DISPLAY REVERSE");
		btnDisplayRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for display reverse
				node temp;
				String msg="";
				if(first==null){
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null){
					msg=msg+""+first.data;
					textField.setText(msg);
				}
				else{
					temp=first;
					while(temp.nextlink!=null){
						temp=temp.nextlink;
					}
					while(temp!=null){
						msg =msg+" "+temp.data+"  ";
						temp=temp.prelink;
					}
				}
				textField.setText(msg);
			}
		});
		btnDisplayRear.setFont(new Font("Constantia", Font.BOLD, 25));
		btnDisplayRear.setBounds(572, 459, 375, 39);
		contentPane.add(btnDisplayRear);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			DataStructures ds=new DataStructures();
			ds.show();
			dispose();
			}
		});
		btnHome.setFont(new Font("Constantia", Font.BOLD, 25));
		btnHome.setBounds(868, 570, 165, 39);
		contentPane.add(btnHome);
	}

}
