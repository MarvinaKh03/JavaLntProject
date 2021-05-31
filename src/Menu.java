import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener {
	JButton insertBtn = new JButton("Insert");
	JButton viewBtn = new JButton("View");
	JButton updateBtn = new JButton("Update");
	JButton deleteBtn = new JButton("Delete");
	
	public Menu() {
		initFrame();
		
	}
	
	private void initFrame() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		initHeader();
		initBody();
		initFooter();
		
		setVisible(true);
		setLocation(250, 250);
		setResizable(true);
	}
	
	private void initHeader() {
		JLabel title = new JLabel("Boba Cool");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font(null, Font.BOLD, 20));
		add(title, BorderLayout.NORTH);
	}

	
	private void initBody() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		
		insertBtn.addActionListener(this);
		viewBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		insertBtn.setBackground(Color.BLACK);
		insertBtn.setForeground(Color.WHITE);
		insertBtn.setFont(new Font(null, Font.BOLD, 36));
		
		viewBtn.setBackground(Color.WHITE);
		viewBtn.setForeground(Color.BLACK);
		viewBtn.setFont(new Font(null, Font.BOLD, 36));

		updateBtn.setBackground(Color.WHITE);
		updateBtn.setForeground(Color.BLACK);
		updateBtn.setFont(new Font(null, Font.BOLD, 36));
		
		deleteBtn.setBackground(Color.BLACK);
		deleteBtn.setForeground(Color.WHITE);
		deleteBtn.setFont(new Font(null, Font.BOLD, 36));
		
		panel.add(insertBtn);
		panel.add(viewBtn);
		panel.add(updateBtn);
		panel.add(deleteBtn);
		
		add(panel);
	}
	
	private void initFooter() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton exit = new JButton("exit");
		exit.setBackground(Color.RED);
		exit.setForeground(Color.WHITE);
		panel.add(exit);
		
		add(panel, BorderLayout.SOUTH);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(insertBtn)) {
			new InsertMenu();
		}
		else if(e.getSource().equals(viewBtn)) {
			
		}
		else if(e.getSource().equals(updateBtn)) {
			
		}
	}
	
	
	
}


