package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class BarraStatus extends JPanel {
	public BarraStatus() {
		TitledBorder title = BorderFactory.createTitledBorder("Barra status:");
		this.setBorder(title);
	}
}
