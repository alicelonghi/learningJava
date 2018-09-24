/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author 122306810
 */
public class Principal {
    
    public static void main(String[] args) {
        Professor prof = new Professor(1, "Cadoná");
        Professor profa = new Professor(2, "Vanessa");
        Curso curso = new Curso(1, "ADS", prof);
        Curso curso2 = new Curso(2, "Ciência da Computação", profa);
        Curso curso3 = new Curso(3, "Sistemas para Internet", prof);
        
       
        System.out.println("Curso: \n" + curso.exibeDados());
        System.out.println("-------------------------------");
        System.out.println("Curso2: \n" + curso2.exibeDados());
        System.out.println("-------------------------------");
        System.out.println("Curso: \n" + curso3.exibeDados());
    }
}
