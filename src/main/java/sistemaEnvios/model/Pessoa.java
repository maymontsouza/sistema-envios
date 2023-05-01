/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

/**
 *
 * @author mayara
 */
public class Pessoa {
    
    private int Codigo;
    private String Nome;
    private String Email;
    private String Telefone;
    private String Logradouro;
    private String CEP;
    private String Cidade;
    private String Bairro;
    private String Estado;
    private String Numero;

    public Pessoa(String Nome, String Email, String Telefone, String Logradouro, String CEP, String Cidade, String Bairro, String Estado, String Numero) {
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Logradouro = Logradouro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Estado = Estado;
        this.Numero = Numero;
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Codigo=" + Codigo + ", Nome=" + Nome + ", Email=" + Email + ", Telefone=" + Telefone + ", Logradouro=" + Logradouro + ", CEP=" + CEP + ", Cidade=" + Cidade + ", Bairro=" + Bairro + ", Estado=" + Estado + ", Numero=" + Numero + '}';
    }
    
    
    
    
    
    
}
