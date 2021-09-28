package br.edu.cassio.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.edu.cassio.database.MysqlSingleton;
import br.edu.cassio.models.Cliente;

public class ClienteDao {
	private Connection connection;
	public ClienteDao(){
		this.connection = MysqlSingleton.getConnection();
		
	}
	public boolean inserir(Cliente cliente) {
		String sql = "INSERT INTO farmacia.cliente (nome, cpf, rg, endereco, telefone) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getRg());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getTelefone());
			stmt.execute();
			return true;
		} catch (Exception e) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, e);
			return false;
		}
	}
	
	public List<Cliente> listar() {
		String sql = "SELECT * FROM  cliente";
		List<Cliente> listaClientes = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(resultado.getString("nome"));
				cliente.setRg(resultado.getString("rg"));
				cliente.setCpf(resultado.getString("cpf"));
				cliente.setEndereco(resultado.getString("endereco"));
				cliente.setTelefone(resultado.getString("telefone"));
				listaClientes.add(cliente);
			}
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return listaClientes;
	}

//	public boolean alterar(Cliente cliente) {
//		String sql = "UPDATE cliente SET id=?, nome=?, rg=?, cpf=?, telefone=?  WHERE id=?";
//		try {
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			stmt.setInt(1, cliente.getId());
//			stmt.setString(2, cliente.getNome());
//			stmt.setInt(3, cliente.getRg());
//			stmt.setInt(7, cliente.getTelefone());

//			stmt.execute();
//			return true;
//		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
//			return false;
//		}
//	}
//

//
//	public boolean remover(Cliente cliente) {
//		String sql = "DELETE FROM cliente WHERE id_cliente=?";
//		try {
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			stmt.setInt(1, cliente.getId());
//			stmt.execute();
//			return true;
//		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
//			return false;
//		}
//	}
//
//	public Cliente buscar(Cliente cliente) {
//		String sql = "SELECT * FROM cliente WHERE id_cliente=?";
//		Cliente retorno = new Cliente(sql, 0, 0, sql, LocalDate.MIN, 0, sql);
//		try {
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			stmt.setInt(1, cliente.getId());
//			ResultSet resultado = stmt.executeQuery();
//			if (resultado.next()) {
//				cliente.setId(resultado.getInt("id_cliente"));
//				cliente.setNome(resultado.getString("nome_cliente"));
//				cliente.setRg(resultado.getInt("rg_cliente"));
//				cliente.setCpf(resultado.getInt("cpf_cliente"));
	// cliente.setTelefone(resultado.getInt("telefone_cliente"));
//
//				retorno = cliente;
//			}
//		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
//		}
//		return retorno;
//	}

}