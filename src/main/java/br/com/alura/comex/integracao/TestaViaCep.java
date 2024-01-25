package br.com.alura.comex.integracao;

import ch.qos.logback.core.net.server.Client;

import java.sql.SQLClientInfoException;

public class TestaViaCep {

public  static void main(String[] args){
    ViaCepService viaCepService=new ViaCepService();
    ViaCepResponse response=viaCepService.buscaCep("08412000");
    System.out.println(response);




}

}
