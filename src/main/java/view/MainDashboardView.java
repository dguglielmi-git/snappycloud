package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainDashboardView extends JFrame {

	private JButton btnNewButton;
	private JTextField txtPrueba;
	
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	
	public JTextField getTxtPrueba() {
		return txtPrueba;
	}
	
	
	
	public MainDashboardView() {
		initialize();
	}

	
	private void initialize() {
		setBounds(100, 100, 1096, 459);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(412, 182, 100, 27);
		getContentPane().add(btnNewButton);
		
		txtPrueba = new JTextField();
		txtPrueba.setBounds(226, 29, 339, 27);
		getContentPane().add(txtPrueba);
		txtPrueba.setColumns(10);
	}

}
