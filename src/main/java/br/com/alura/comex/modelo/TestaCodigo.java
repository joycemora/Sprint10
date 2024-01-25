package br.com.alura.comex.modelo;

public class TestaCodigo {

    public static void main(String[] args) {

        Produto celular = new Produto("samsung a14");
        celular.quantidade=10;
        celular.descricao="celular novo samsung a14";
        celular.precoUnitario=1000.90;

        System.out.println(celular);
        System.out.println("\n");

      Cliente aluno = new Cliente("435.678.987-56",
              "alino06@gmail.com",
              "98765-4555",
              "ana",
              "estudante",
              new Endereco("otelo augusto ribeiro",
                      10,"guaianases",
                      "sao paulo",
                      "sao paulo",
                      "bloco 2 apartamento 24 "));


        System.out.println(aluno);

    }




    }









