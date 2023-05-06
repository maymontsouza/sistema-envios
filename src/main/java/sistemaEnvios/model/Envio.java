/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayara
 */
public class Envio {
    private int codigo;
    private Pessoa remetente;
    private Pessoa destinatario;
    private Objeto objeto;
    
    public static List<Envio> envios = new ArrayList();

    public Envio(int codigo, float frete, Pessoa remetente, Pessoa Destinatario, Objeto objeto) {
        this.codigo = codigo;
        this.remetente = remetente;
        this.destinatario = Destinatario;
        this.objeto = objeto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa Destinatario) {
        this.destinatario = Destinatario;
    }

    

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return "Envio{" + "codigo=" + codigo + ", remetente=" + remetente + ", Destinatario=" + destinatario + ", objeto=" + objeto + '}';
    }

    
    
    
}
