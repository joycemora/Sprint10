package br.com.alura.comex.integrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

    public static void main(String[] args) throws SQLException {
        try {
            Connection conexao=DriverManager.getConnection("jdbc:mysql://localhoost","root","alura123");
            System.out.println("Conectado");

        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
