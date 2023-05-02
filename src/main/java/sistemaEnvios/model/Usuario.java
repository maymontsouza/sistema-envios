/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

/**
 *
 * @author mayara
 */
public class Usuario {
    private String CPF;
    private String login;
    private String senha;

    public Usuario(String CPF, String login, String senha) {
        this.CPF = CPF;
        this.login = login;
        this.senha = senha;
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
