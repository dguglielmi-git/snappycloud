package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.MainDashboardModel;
import view.MainDashboardView;

@SpringBootApplication
public class MainDashboardController implements ActionListener {
	
	MainDashboardView view = null;
	MainDashboardModel model = null;
	
	public MainDashboardController(MainDashboardModel modelDashboard, MainDashboardView viewDashboard ) {
		this.view = viewDashboard;
		this.model = modelDashboard;
	}
	
	public void openView() {
		view.getTxtPrueba().addActionListener(this);
		view.getBtnNewButton().addActionListener(this);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (view.getBtnNewButton() == ev.getSource()) {
			JTextField tt = view.getTxtPrueba();
			tt.setText("probando nueva asignacion");	
		}		
		
	}

}
