package br.com.alura.comex.modelo;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    private Endereco endereco;

    public Cliente(String cpf, String email, String telefone, String nome, String profissao, Endereco endereco) {
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.profissao = profissao;
        this.endereco = endereco;



    }

    public Cliente(String cpf, String email, String nome){
        this.cpf = cpf;
        this.email = email;
        this.nome= nome;


    }



    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", profissao='" + profissao + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }


    public void setNome(String joyce) {
    }

    public void setendereco(Endereco endereco) {
    }

    public void setProfissao(String programador) {
    }

    public void setCpf(String s) {
    }

    public void setTelefone(String s) {
    }

    public void setEmail(String mail) {
    }

    public void setEndereco(Endereco endereco) {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}




