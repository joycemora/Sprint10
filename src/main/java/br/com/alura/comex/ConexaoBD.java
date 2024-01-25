package br.com.alura.comex;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public static void main(String...x) throws SQLException {

        DriverManager.getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=root");
    }
}
