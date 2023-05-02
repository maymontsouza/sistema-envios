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
    private float frete;
    private Remetente remetente;
    private Destinatario destinatario;
    private Objeto objeto;
    
        public static List<Envio> envios = new ArrayList();


    public Envio(int codigo, Remetente remetente, Destinatario destinatario, Objeto objeto, float frete) {
        this.codigo = codigo;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.objeto = objeto;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Remetente getRemetente() {
        return remetente;
    }

    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return "Envio{" + "codigo=" + codigo + ", remetente=" + remetente + ", destinatario=" + destinatario + ", objeto=" + objeto + '}';
    }
    
    
    
}
