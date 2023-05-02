/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

/**
 *
 * @author mayara
 */
public class Usuario extends Pessoa{
    private String nome;
    private String email;
    private int telefone;
    private Endereco endereco;

    public Usuario(String nome, String email, int telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
