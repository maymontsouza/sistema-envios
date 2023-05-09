/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

/**
 *
 * @author mayara
 */
public abstract class Pessoa {
    private final int codigo; 
//colocado o static porque será criado um codigo cada vez que for estanciado uma nova pessoa
    private String nome;
    private String email;
    private int telefone;
    private String cpf;
    private String senha;
    
    private static int contadorPessoa=0;

    public Pessoa(String nome, String email, int telefone, String cpf, String senha) {
        this.codigo = ++contadorPessoa;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", senha=" + senha + '}';
    }
    
}
    
   