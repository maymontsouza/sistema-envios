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
public class Funcionario extends Pessoa {

    public Funcionario(int codigo, String nome, String email, int telefone, Endereco endereco) {
        super(codigo, nome, email, telefone, endereco);
    }
}
