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
    private Usuario remetente;
    private Usuario destinatario;
    private Objeto objeto;
    private String status;

    public Envio(Usuario remetente, Usuario destinatario, Objeto objeto, String status) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.objeto = objeto;
        this.status = status;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Envio{" + "remetente=" + remetente + ", destinatario=" + destinatario + ", objeto=" + objeto + ", status=" + status + '}';
    }

    
    

    
    
    
}
