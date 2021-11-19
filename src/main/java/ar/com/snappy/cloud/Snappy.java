package ar.com.snappy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.sun.jdi.event.EventQueue;

import controller.MainDashboardController;
import model.MainDashboardModel;
import view.MainDashboardView;

@SpringBootApplication
public class Snappy {
	
	public static void main(String[] args) {		
		//openMainDashboard();
		//SpringApplication.run(Snappy.class, args);
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Snappy.class)
	            .headless(false).run(args);

	   openMainDashboard();
	}

	
	public static void openMainDashboard() {	
		MainDashboardView view = new MainDashboardView();
		MainDashboardModel model = new MainDashboardModel();
		MainDashboardController controller = new MainDashboardController(model, view);
		controller.openView();
	}

}
