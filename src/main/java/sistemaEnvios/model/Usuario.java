/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;
import sistemaEnvios.model.Pessoa;
import sistemaEnvios.model.Endereco;

/**
 *
 * @author mayara
 */
public class Usuario extends Pessoa {
    private String CPF;
    private String login;
    private String senha;
    private Endereco endereco;

    public Usuario(String nome, String email, int telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "CPF=" + CPF + ", login=" + login + ", senha=" + senha + '}';
    }
    
    
        
    
    
}
