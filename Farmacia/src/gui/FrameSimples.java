package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FrameSimples extends JFrame implements ActionListener {
 
	private PainelCliente painelCliente;
	
	private JMenuBar barraMenu;
	private JMenu cadastros;
	private JMenu relatoriosM;
	private JMenu ajudaM;
	private JMenu sairM;

	private JMenuItem clienteMI;
	private JMenuItem funcionarioMI;
	private JMenuItem relatorioMI;
	private JMenuItem fecharMI;

	
	public FrameSimples() {
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new BarraStatus(), BorderLayout.SOUTH);
		painelCliente = new PainelCliente();
		barraMenu = new JMenuBar();
		cadastros = new JMenu("Cadastros");
		clienteMI = new JMenuItem("Cadastro de Cliente");
		funcionarioMI = new JMenuItem("Cadastro de Funcionário");
		clienteMI.addActionListener(this);
		cadastros.add(clienteMI);
		cadastros.add(funcionarioMI);
		relatoriosM = new JMenu("Relatórios");
		relatorioMI = new JMenuItem("Relatório de Cliente");
		relatorioMI.addActionListener(this);
		relatoriosM.add(relatorioMI);
		ajudaM = new JMenu("Ajuda");
		sairM = new JMenu("Sair");
		fecharMI = new JMenuItem("Fechar");
		fecharMI.addActionListener(this);
//		fecharMI.addActionListener(new ActionListener() {
//		    public void actionPerformed(ActionEvent ev) {
//		            System.exit(0);
//		    }
//		});
		sairM.add(fecharMI);
		
		barraMenu.add(cadastros);
		barraMenu.add(relatoriosM);
		barraMenu.add(ajudaM);
		barraMenu.add(sairM);
		
		JPanel painelMenu = new JPanel();
		painelMenu.add(barraMenu);
		getContentPane().add(painelMenu, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		FrameSimples f = new FrameSimples();
		f.setSize(new Dimension(800, 600));
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clienteMI) {
			System.out.println("pediu para inserir um cliente");
			getContentPane().add(painelCliente, BorderLayout.CENTER);
			painelCliente.setVisible(true);
			revalidate();
			repaint();
		}else if (e.getSource() == fecharMI) {
			 System.exit(0);
		}
 
	}
}