package br.com.alura.comex.integrar;

import br.com.alura.comex.modelo.Cliente;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection conexao;
    ClienteDAO(Connection connection){
        this.conexao = connection;
    }
    public void salvar (Cliente cliente){

        Cliente joyce = new Cliente(cliente.getCpf(), cliente.getEmail(), cliente.getNome());
        String sql = "insert into conta(saldo,cliente_nome,cliente_cpf,cliente_email) values (?,?,?,?,?)";

        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setBigDecimal(1, BigDecimal.ZERO);
            ps.setString(2, joyce.getNome());
            ps.setString(3, joyce.getCpf());
            ps.setString(4, joyce.getEmail());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
