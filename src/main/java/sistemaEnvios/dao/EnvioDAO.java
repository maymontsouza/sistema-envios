/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.dao;

import java.util.ArrayList;
import java.util.List;
import sistemaEnvios.model.Envio;
import sistemaEnvios.model.Objeto;

/**
 *
 * @author mayara
 */
public class EnvioDAO {
    
     private static final List<Envio> envios = new ArrayList<>();
    
    public void salvarEnvio(Envio envio) {
        envios.add(envio);
    }
    
    
    //mostrar
    //salvar
    //alterar
    //excluir
    //buscar
    
}
