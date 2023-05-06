/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.dao;

import java.util.ArrayList;
import java.util.List; //
import sistemaEnvios.model.Funcionario;

/**
 *
 * @author mayara
 */
public class FuncionarioDAO {

    private static List<Funcionario> funcionarios = new ArrayList();
    //static onde quer que estancie os dados vão permanecer sempre, 
    //caso não seja static ele irá resetar os dados sempre que for chamado.

    public void salvarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public List<Funcionario> mostrarFuncionarios() {
          System.out.println(funcionarios);
        return funcionarios;
      
        
        
    }

}
