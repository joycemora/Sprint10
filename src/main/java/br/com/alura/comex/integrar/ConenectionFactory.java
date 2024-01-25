package br.com.alura.comex.integrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConenectionFactory {


    public Connection getConnection() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost3306/conexao?user=root&password=alura123");
            System.out.println("conectado");
            return conexao;
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

    }
}
