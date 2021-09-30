package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
	
	public JanelaPrincipal(){
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new PainelTitulo(), BorderLayout.SOUTH);
		
		

	}
	
	public static void main(String a[]) {
		
		JanelaPrincipal j = new JanelaPrincipal();
		j.setVisible(true);
		j.setSize(800, 600);
		
		
	}
	

}
