package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.UsuarioLoguin;


	public class UsuarioDaoLoguin implements IDAO<UsuarioLoguin> {

	    public void inserir(UsuarioLoguin loguin) throws Exception {
	        Conexao c = new Conexao();
	        String sql = "INSERT INTO TBUSUARIOLOGUIN (NOME, SENHA, MATRICULA) VALUES (?, ?, ?)";
	        PreparedStatement ps = c.getConexao().prepareStatement(sql);
	        ps.setString(1, loguin.getNome());
	        ps.setString(2, loguin.getSenha());
	       
	        ps.execute();
	        c.confirmar();
	    }

	    public void alterar(UsuarioLoguin loguin) throws Exception {
	        Conexao c = new Conexao();
	        String sql = "UPDATE TBUSUARIOLOGUIN SET NOME=?, SENHA=?, MATRICULA=? WHERE MATRICULA=?";
	        PreparedStatement ps = c.getConexao().prepareStatement(sql);
	        ps.setString(1, loguin.getNome());
	        ps.setString(2, loguin.getSenha());
	        ps.setInt(3, loguin.getMatricula());
	        
	        
	        ps.execute();
	        c.confirmar();
	    }

	   
	    public void excluir(UsuarioLoguin loguin) throws Exception {
	        Conexao c = new Conexao();
	        String sql = "DELETE FROM TBUSUARIOLOGUIN WHERE MATRICULA=?";
	        PreparedStatement ps = c.getConexao().prepareStatement(sql);
	        ps.setInt(1, loguin.getMatricula());
	        ps.execute();
	        c.confirmar();
	    }

	   
	    @SuppressWarnings("unchecked")
		public ArrayList<UsuarioLoguin> listarTodos() throws Exception {
	        Conexao c = new Conexao();
	        String sql = "SELECT * FROM TBUSUARIOLOGUIN ORDER BY NOME";
	        PreparedStatement ps = c.getConexao().prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

	        @SuppressWarnings("rawtypes")
			ArrayList ListaUsuario = new ArrayList();
	        while (rs.next()) {
	            UsuarioLoguin loguin = new UsuarioLoguin(sql, sql, 0);
	            loguin.setNome(rs.getString("Nome"));
	            loguin.setSenha(rs.getString("Senha"));
	            loguin.setMatricula(rs.getInt(0));
	            
	            ListaUsuario.add(loguin);
	        }

	        return ListaUsuario;
	    }

	   
	    public static UsuarioLoguin recuperar(String nomeUsuario) throws Exception {
	        Conexao c = new Conexao();
	        String sql = "SELECT * FROM TBUSUARIOLOGUIN WHERE MATRICULA=?";
	        PreparedStatement ps = c.getConexao().prepareStatement(sql);
	        ps.setString(1, nomeUsuario);
	        ResultSet rs = ps.executeQuery();

	        UsuarioLoguin loguin = new UsuarioLoguin(null, null,0);
	        if (rs.next()) {
	            loguin.setNome(rs.getString("Nome"));
	            loguin.setSenha(rs.getString("Senha"));
	            loguin.setMatricula(rs.getInt(0));
	            
	        }

	        return loguin;
	    }

		@Override
		public UsuarioLoguin recuperar(int codigo) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	}



