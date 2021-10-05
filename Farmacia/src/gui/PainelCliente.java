package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.cassio.dao.ClienteDao;
import br.edu.cassio.models.Cliente;

public class PainelCliente extends JPanel implements ActionListener {
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldRG;
	private JTextField textFieldEndereco;
	private JTextField textFieldTelefone;
	private JLabel labelNome;
	private JLabel labelCPF;
	private JLabel labelRG;
	private JLabel labelEndereco;
	private JLabel labelTelefone;
	private ClienteDao clienteDao ;
	private JButton btnSalvar;
	private JButton btnCancelar;
	public PainelCliente() {
		GridLayout gd = new GridLayout(0, 2);
		setLayout(gd);
		clienteDao = new ClienteDao();
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		textFieldNome = new JTextField(40);
		labelNome = new JLabel("Nome do Cliente:");
		textFieldCPF = new JTextField(40);
		labelCPF = new JLabel("CPF:");
		textFieldRG = new JTextField(40);
		labelRG = new JLabel("RG:");
		textFieldEndereco = new JTextField(40);
		labelEndereco = new JLabel("Endereco:");
		textFieldTelefone = new JTextField(40);
		labelTelefone = new JLabel("Telefone:");
		add(labelNome);
		add(textFieldNome);
		add(labelCPF);
		add(textFieldCPF);
		add(labelRG);
		add(textFieldRG);
		add(labelEndereco);
		add(textFieldEndereco);
		add(labelTelefone);
		add(textFieldTelefone);
		add(btnCancelar);
		add(btnSalvar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalvar) {
			Cliente c = new Cliente(textFieldNome.getText(), textFieldCPF.getText(), textFieldRG.getText(), textFieldEndereco.getText(), textFieldTelefone.getText());
			try {
				clienteDao.inserir(c);
				JOptionPane.showMessageDialog(this,"O cliente foi salvo!", TOOL_TIP_TEXT_KEY, JOptionPane.OK_OPTION);
				limparFormulario();
				this.setVisible(false);
			}catch (Exception err) {
				JOptionPane.showMessageDialog(this,"Erro ao salvar o cliente!", TOOL_TIP_TEXT_KEY, JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (e.getSource() == btnCancelar) {
			this.setVisible(false);
		}
	}

	private void limparFormulario() {
		textFieldNome.setText(null);
		textFieldCPF.setText(null);
		textFieldRG.setText(null);
		textFieldTelefone.setText(null);
		textFieldEndereco.setText(null);
	}
}
