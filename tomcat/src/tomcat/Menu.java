package tomcat;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame {
	Tomcat t = new Tomcat();
	/*StartTomcat st= new StartTomcat();
	StopTomcat sp= new StopTomcat();
	EstadoTomcat es = new EstadoTomcat();*/
	private JButton StartTomcat,EstadoTomcat,StopTomcat;

	
	public Menu() {
		 FlowLayout DISTRIBUCION = new FlowLayout();
	        this.setLayout(DISTRIBUCION);

	        setBounds(200,200,200,200);
	        
	        this.StartTomcat = new JButton();
	        this.StartTomcat.setText("Conectarse a Tomcat");
	        this.add(this.StartTomcat);
	        StartTomcat.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//st.start();
					t.start();
				}
			});
	        this.StopTomcat = new JButton();
	        this.StopTomcat.setText("Desconectarse de Tomcat");
	        this.add(this.StopTomcat);
	        StopTomcat.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//sp.stop();
					t.stop();
				}
			});
	        this.EstadoTomcat = new JButton();
	        this.EstadoTomcat.setText("Estado de Tomcat");
	        this.add(this.EstadoTomcat);
	        EstadoTomcat.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				 try {
					//es.estado();
					t.estado();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			});
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
