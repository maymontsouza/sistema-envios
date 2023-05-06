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
    private static int codigo; 
//colocado o static porque será criado um codigo cada vez que for estanciado uma nova pessoa
    private String nome;
    private String email;
    private int telefone;
    private String cpf;
    private String senha;

    public Pessoa(String nome, String email, int telefone, String cpf, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
    }

    private void gerarCodigo(){
        this.codigo = codigo +1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", senha=" + senha + '}';
    }
}
    
   