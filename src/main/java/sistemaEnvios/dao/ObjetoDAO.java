/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.dao;

import java.util.ArrayList;
import java.util.List;
import sistemaEnvios.model.Objeto;

/**
 *
 * @author mayara
 */
public class ObjetoDAO {
    
    private static final List<Objeto> objetos = new ArrayList<>();
    
    public void salvarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }
    
        
    //mostrar
    //salvar
    //alterar
    //excluir
    //buscar
    
}
