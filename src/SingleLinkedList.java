import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.OptionPaneUI;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleLinkedList extends JFrame {

	public class Node
	{
		private int data;
		private Node link;
	}
	private Node first;
	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
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
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 624);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLE LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 36));
		lblNewLabel.setBounds(146, 10, 697, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterElement = new JLabel("ENTER THE  ELEMENT");
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterElement.setBounds(10, 86, 294, 44);
		contentPane.add(lblEnterElement);
		
		JLabel lblEnterElement_1 = new JLabel("ENTER THE  ELEMENT");
		lblEnterElement_1.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterElement_1.setBounds(10, 165, 294, 44);
		contentPane.add(lblEnterElement_1);
		
		element1 = new JTextField();
		element1.setFont(new Font("Tahoma", Font.BOLD, 25));
		element1.setBounds(295, 81, 251, 44);
		contentPane.add(element1);
		element1.setColumns(10);
		
		element2 = new JTextField();
		element2.setFont(new Font("Tahoma", Font.BOLD, 25));
		element2.setColumns(10);
		element2.setBounds(295, 165, 251, 44);
		contentPane.add(element2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBounds(228, 511, 464, 44);
		contentPane.add(textField);
		
		JLabel lblEnterElement_1_1 = new JLabel("LIST");
		lblEnterElement_1_1.setFont(new Font("Constantia", Font.BOLD, 25));
		lblEnterElement_1_1.setBounds(125, 516, 93, 44);
		contentPane.add(lblEnterElement_1_1);
		
		JButton deleteFront = new JButton("DELETE REAR");
		deleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for deletion rear
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane,"element deleted is"+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
						
					}
					JOptionPane.showMessageDialog(contentPane, "element is"+temp.link.data);
					temp.link=null;
				}
			}
		});
		deleteFront.setBackground(new Color(0, 255, 0));
		deleteFront.setFont(new Font("Constantia", Font.BOLD, 25));
		deleteFront.setBounds(321, 247, 288, 39);
		contentPane.add(deleteFront);
		
		JButton insertRear = new JButton("INSERT REAR");
		insertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Insertion rear code
				Node temp;
				int elem;
				elem=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "element inserted at"+first.data);
					element1.setText("");
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
					temp=temp.link;
					}
					temp.link=newnode;
					String message="Element insert is "+elem;
					JOptionPane.showMessageDialog(contentPane, message);
					element1.setText("");
					
				}
				
			
			}
		});
		insertRear.setFont(new Font("Constantia", Font.BOLD, 25));
		insertRear.setBackground(Color.GREEN);
		insertRear.setBounds(654, 86, 288, 39);
		contentPane.add(insertRear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//insertion at front
				int elem1;
				elem1=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem1;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "element inserted is"+first.data);
					element2.setText("");
				}
				else
				{
					newnode.link=first;
					first=newnode;
					String message="element insert is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element2.setText("");
				}
			
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 25));
		insertfront.setBackground(Color.GREEN);
		insertfront.setBounds(654, 177, 288, 39);
		contentPane.add(insertfront);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for deletion at front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					first=null;
				}
				else
				{
					
					JOptionPane.showMessageDialog(contentPane, "element deleted"+first.data);
					first=first.link;
				}
			}
			
		});
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 25));
		btnDeleteFront.setBackground(Color.GREEN);
		btnDeleteFront.setBounds(321, 322, 288, 39);
		contentPane.add(btnDeleteFront);
		
		JButton dispaly = new JButton("DISPLAY");
		dispaly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for dispaly
				Node temp;
			if(first==null)
			{
				JOptionPane.showMessageDialog(contentPane, "Dispaly not possible");
				textField.setText("");
			}
			else if(first.link==null)
			{
				JOptionPane.showMessageDialog(contentPane,first.data);
				textField.setText("");
			}
			else
			{
				String msg="";
				temp=first;
				while(temp!=null)
				{
					msg=msg+" "+temp.data;
					temp=temp.link;
					textField.setText(msg);
				}
			}
			
			
			
			}
		});
		dispaly.setFont(new Font("Constantia", Font.BOLD, 25));
		dispaly.setBackground(Color.GREEN);
		dispaly.setBounds(346, 421, 251, 39);
		contentPane.add(dispaly);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			DataStructures ds=new DataStructures();
			ds.show();
			dispose();
			}
		});
		btnHome.setFont(new Font("Constantia", Font.BOLD, 25));
		btnHome.setBackground(Color.GREEN);
		btnHome.setBounds(836, 511, 142, 39);
		contentPane.add(btnHome);
	}
}
