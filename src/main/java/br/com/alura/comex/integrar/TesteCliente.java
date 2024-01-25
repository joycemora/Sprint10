   package br.com.alura.comex.integrar;

   import java.sql.Connection;

 public class TesteCliente {
    private Connection conn;

    public TesteCliente(Connection connection){
        this.conn = connection;
    }
}


