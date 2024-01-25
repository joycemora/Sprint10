package br.com.alura.comex.modelo;

public class Endereco {
   String bairro;
    String cidade ;
   String complemento;
   String estado;
      String rua;
     int numero;
     public Endereco(String rua, int numero, String bairro, String cidade, String estado, String complemento){
         this.rua=rua;
         this.numero=numero;
         this.bairro=bairro;
         this.cidade=cidade;
         this.estado=estado;
         this.complemento=complemento;
     }



        @Override
        public String toString () {
            return "endereco{" +
                    "bairro='" + bairro + '\'' +
                    ", cidade='" + cidade + '\'' +
                    ", complemento='" + complemento + '\'' +
                    ", estado='" + estado + '\'' +
                    ", rua='" + rua + '\'' +
                    ", numero=" + numero +
                    '}';
        }
    }
