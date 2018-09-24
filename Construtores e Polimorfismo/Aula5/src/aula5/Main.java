/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author 122534710
 */
public class Main {
    
    public static void main(String[] args) {
        Carro carro = new Carro("Vermelho", 1.6);
        
        carro.aumentarVelocidade(160);
        System.out.println("Teste: " + carro.getVelocidade());
        
        carro.diminuirVelocidade(60);
        System.out.println("Teste: " + carro.getVelocidade());
    }
}
