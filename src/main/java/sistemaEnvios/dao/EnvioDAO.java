/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.dao;

import java.util.ArrayList;
import java.util.List;
import sistemaEnvios.model.Envio;
import sistemaEnvios.model.Objeto;
import sistemaEnvios.model.Usuario;

/**
 *
 * @author mayara
 */
public class EnvioDAO {
    
     private static final List<Envio> envios = new ArrayList<>();
    
    public void salvarEnvio(Envio envio) {
        envios.add(envio);
    }
    
    public void imprimirListaEnvios() {
        if(envios.isEmpty()) {
            System.out.println("A lista de envios está vazia!");
        }

        for(Envio envio : envios) {
            System.out.println(envio.toString());
        }
    }
    
     public Envio buscarEnvios(Usuario usuario) {
         System.out.println(usuario.getCpf());
        for (Envio envio : envios) {
            System.out.println(envio.getRemetente().getCpf()== usuario.getCpf());
            if(envio.getRemetente().getCpf()== usuario.getCpf()) {
                return envio;
            }
        }
        return null;
     }   
}
