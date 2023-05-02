/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;
import sistemaEnvios.model.Pessoa;

/**
 *
 * @author mayara
 */
public class Funcionario extends Pessoa{
    private int CPF;
    private String login;
    private int senha;

    public Funcionario(int CPF, String login, int senha) {
        this.CPF = CPF;
        this.login = login;
        this.senha = senha;
    }
    

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    


    

    
}
