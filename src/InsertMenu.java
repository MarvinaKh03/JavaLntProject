import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class InsertMenu extends JFrame implements ActionListener {
	JMenuItem insertBtn = new JMenuItem("Insert");
	
	public InsertMenu() {
		initInsert();
		initFrame();
	}
	
	private void initInsert() {
		insertBtn.addActionListener(this);
		
	}
	
	
	private void initFrame() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 2));
		
		initComponent();
		
		setVisible(true);
		setLocation(250, 250);
		setResizable(true);
	}

	private void initComponent() {
		JLabel name = new JLabel("Nama Menu : ");
		JTextField nameTxt =new JTextField();
		
		JLabel harga = new JLabel("Harga Menu : ");
		JTextField hargaTxt =new JTextField();
		
		JLabel stok = new JLabel("Stok Menu : ");
		JTextField stokTxt =new JTextField();
		
		add(name);
		add(nameTxt);
		add(harga);
		add(hargaTxt);
		add(stok);
		add(stokTxt);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
