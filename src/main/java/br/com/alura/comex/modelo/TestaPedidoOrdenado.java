package br.com.alura.comex.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestaPedidoOrdenado {
    public static <Lista> void main(String[] args) {

        // Dados cliente
        Endereco endereco = new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24");
        endereco.bairro = "guaianases";
        endereco.cidade = "São Paulo";
        endereco.rua = "otelo augusto ribeiro";
        endereco.complemento = "bloco 2 apartamento 24";
        endereco.estado = "São Paulo";
        endereco.numero = 1676;

        Cliente cliente1 = new Cliente("545.767.877-90","joyce@gmail.com","23342-65645","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24"));
        cliente1.setNome("joyce");
        cliente1.setEmail("joyce@gmail.com");
        cliente1.setTelefone("(99) 99999-9999");
        cliente1.setCpf("999.999.999-99");
        cliente1.setProfissao("programador");
        cliente1.setEndereco(endereco);

        Cliente cliente2 = new Cliente("545.767.877-90","joyce@gmail.com","23342-65645","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24"));
        cliente2.setNome("joyce");
        cliente2.setEmail("joyce@gmail.com");
        cliente2.setTelefone("(99) 99999-9999");
        cliente2.setCpf("999.999.999-99");
        cliente2.setProfissao("programador");
        cliente2.setEndereco(endereco);

        Cliente cliente3 = new Cliente("545.767.877-90","joyce@gmail.com","23342-65645","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24"));
        cliente3.setNome("joyce");
        cliente3.setEmail("joyce@gmail.com");
        cliente3.setTelefone("(99) 99999-9999");
        cliente3.setCpf("999.999.999-99");
        cliente3.setProfissao("programador");
        cliente3.setEndereco(endereco);

        Cliente cliente4 = new Cliente("545.767.877-90","joyce@gmail.com","23342-65645","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24"));
        cliente4.setNome("joyce");
        cliente4.setEmail("joyce@gmail.com");
        cliente4.setTelefone("(99) 99999-9999");
        cliente4.setCpf("999.999.999-99");
        cliente4.setProfissao("programador");
        cliente4.setEndereco(endereco);


        Cliente cliente5 = new Cliente("545.767.877-90","joyce@gmail.com","23342-65645","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24"));
        cliente5.setNome("joyce");
        cliente5.setEmail("joyce@gmail.com");
        cliente5.setTelefone("(99) 99999-9999");
        cliente5.setCpf("999.999.999-99");
        cliente5.setProfissao("programador");
        cliente5.setEndereco(endereco);


        Pedido pedido1 = new Pedido(3443,5845,new Cliente("485.657.964-97","joyce@gmail.com","43423-6754","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sp","bloco2 apartamento 24")),22233);
        pedido1.setId(1);
        pedido1.setCliente(cliente1);
        pedido1.setPreco(BigDecimal.valueOf(10.00));
        pedido1.setQuantidade(5);
        pedido1.setData(LocalDateTime.now());

        Pedido pedido2 = new Pedido(3443,5845,new Cliente("485.657.964-97","joyce@gmail.com","43423-6754","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sp","bloco2 apartamento 24")),22233);
        pedido2.setId(2);
        pedido2.setCliente(cliente2);
        pedido2.setPreco(BigDecimal.valueOf(35.00));
        pedido2.setQuantidade(2);
        pedido2.setData(LocalDateTime.now());

        Pedido pedido3 = new Pedido(3443,5845,new Cliente("485.657.964-97","joyce@gmail.com","43423-6754","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sp","bloco2 apartamento 24")),22/2/33);
        pedido3.setId(3);
        pedido3.setCliente(cliente3);
        pedido3.setPreco(BigDecimal.valueOf(78.30));
        pedido3.setQuantidade(4);
        pedido3.setData(LocalDateTime.now());

        Pedido pedido4 = new Pedido(3443,5845,new Cliente("485.657.964-97","joyce@gmail.com","43423-6754","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sp","bloco2 apartamento 24")),22/2/33);
        pedido4.setId(4);
        pedido4.setCliente(cliente4);
        pedido4.setPreco(BigDecimal.valueOf(5.30));
        pedido4.setQuantidade(8);
        pedido4.setData(LocalDateTime.now());

        Pedido pedido5 = new Pedido(3443,5845,new Cliente("485.657.964-97","joyce@gmail.com","43423-6754","joyce","programador",new Endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sp","bloco2 apartamento 24")),22233);
        pedido5.setId(5);
        pedido5.setCliente(cliente5);
        pedido5.setPreco(new BigDecimal("98.99"));
        pedido5.setQuantidade(1);
        pedido5.setData(LocalDateTime.now());

        Lista listaPedidos = (Lista) new br.com.alura.comex.modelo.Lista();

        listaPedidos.equals(pedido1);
        listaPedidos.equals(pedido2);
        listaPedidos.equals(pedido3);
        listaPedidos.equals(pedido4);
        listaPedidos.equals(pedido5);

        Lista Lista = null;
        System.out.println(listaPedidos.equals(Lista));

        System.out.println("--------------------- Lista ordenada -----------------"); // Menor valor - maior valor
        System.out.println(listaPedidos.toString());
        System.out.println("--------------- Lista ordenada reversa ----------------"); // Maior valor - menor valor
        System.out.println(listaPedidos.getClass());


    }


}

