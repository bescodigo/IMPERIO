package program;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Window extends JFrame{

	public JLabel lblForce;
	public JPanel panelForce;
	public JLabel lblTerritory;
	public JPanel panelTerritory;
	public JLabel lblPoblation;
	public JPanel panelPoblation;
	
	JButton btnYes;
	JButton btnNot;
	Success success;
	
	public JPanel panelStates = new JPanel();
	public JPanel panelbtns = new JPanel();
	
	Toolkit t = Toolkit.getDefaultToolkit();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Container contenedor = this.getContentPane();
	Border border = BorderFactory.createLineBorder(Color.yellow);
	
	public Window() {
		
		panelStates.setBorder(border);
		panelStates.setBackground(Color.white);
		panelStates.setLayout(new BoxLayout(panelStates, BoxLayout.PAGE_AXIS));
		
		this.setBounds(0, 0, screenSize.width, screenSize.height);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lblTerritory = new JLabel("territory");
		panelTerritory = new JPanel();
		panelTerritory.add(lblTerritory);
		panelTerritory.setBackground(Color.green);
		panelTerritory.setBorder(border);
	
		lblForce = new JLabel("Force");
		panelForce = new JPanel();
		panelForce.add(lblForce);
		panelForce.setBackground(Color.red);
		panelForce.setBorder(border);
		
		lblPoblation = new JLabel("Poblation");
		panelPoblation = new JPanel();
		panelPoblation.add(lblPoblation);
		panelPoblation.setBackground(Color.orange);
		panelPoblation.setBorder(border);
		
		
		
		panelStates.add(panelTerritory);
		panelStates.add(panelForce);
		panelStates.add(panelPoblation);
		
		
		
		contenedor.add(panelStates, BorderLayout.NORTH);
		contenedor.add(panelbtns, BorderLayout.CENTER);
		
	}

	public void setCard(String Event, int indexEventoAleatorio, State state, Event event2) {
		
		CardEvent nombreEvento = new CardEvent(Event);
		
		panelbtns.add(nombreEvento);
		
		btnYes = new JButton("Yes");
		btnNot = new JButton("Not");
		
		btnYes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("event: "+Event);
				
				success = new Success(state);
				success.ejecuteConsecuense(indexEventoAleatorio, 0);
				
				//TODO: method to update statusBar.
				lblForce.setText("Force:      "+state.getForce()+" soldiers ");
				   
				lblTerritory.setText("Territory:   "+state.getTerritory()+ " mt2 ");
				
				lblPoblation.setText("Poblation: "+state.getPoblation()+ " peoples ");
			
				panelbtns.remove(nombreEvento);
				panelbtns.remove(btnNot);
				panelbtns.remove(btnYes);
				
				setCard(event2.listaEventos[event2.generateEvent()], event2.indexEventoAleatorio, state, event2);
			
				panelbtns.repaint();
				
			}
		});
		
		btnNot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("event: "+Event);
				
				success = new Success(state);
				success.ejecuteConsecuense(indexEventoAleatorio, 1);
				
				lblForce.setText("Force:      "+state.getForce()+" soldiers ");
				   
				lblTerritory.setText("Territory:   "+state.getTerritory()+ " mt2 ");
				
				lblPoblation.setText("Poblation: "+state.getPoblation()+ " peoples ");

				panelbtns.remove(nombreEvento);
				panelbtns.remove(btnNot);
				panelbtns.remove(btnYes);
				
				setCard(event2.listaEventos[event2.generateEvent()], event2.indexEventoAleatorio, state, event2);
				panelbtns.repaint();
				
			}
		});
		
		panelbtns.add(btnNot);
		panelbtns.add(btnYes);
		
	}

	
	
	
}


