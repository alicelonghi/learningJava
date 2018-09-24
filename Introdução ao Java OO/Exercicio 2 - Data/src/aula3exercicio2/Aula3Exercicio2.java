/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3exercicio2;

import java.util.Scanner;

/**
 *
 * @author 122306810
 */
public class Aula3Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Salario funcionario = new Salario();
        System.out.println("Digite o nome do Funcionario");
        String nome =  teclado.next();
        funcionario.setNome(nome);
        System.out.println("Digite o Salário do funcionario");
        double salario = teclado.nextDouble();
        funcionario.setSalario(salario);
        System.out.println("Digite o percentual de aumento do Salário");
        double percentual = teclado.nextDouble();
        
        System.out.println(funcionario.aumentaSalario(percentual));
    }
    
}
