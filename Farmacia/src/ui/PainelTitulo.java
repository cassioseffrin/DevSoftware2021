package ui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PainelTitulo extends JPanel{

	PainelTitulo(){
		TitledBorder title = BorderFactory.createTitledBorder("Titulo");
		this.setBorder(title);
	}

}
