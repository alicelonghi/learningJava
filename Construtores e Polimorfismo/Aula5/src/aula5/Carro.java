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
public class Carro {
    private String cor;
    private double capacidadeMotor;
    private double velocidade;
    

    public Carro(String c, double cM){
        cor = c;
        capacidadeMotor = cM;
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    
    public void aumentarVelocidade(double qnt){
        double total = capacidadeMotor * 110 ;
        if (qnt <= 0) {
            System.out.println("Valor não pode ser negativo!!");
        } else if (qnt > total) {
            System.out.println("Carro não suporta essa velocidade!!");
        } else {
           velocidade += qnt;
        }
    }
    
    public void diminuirVelocidade(double qnt) {
        if (qnt <= 0) {
            System.out.println("Valor não pode ser negativo!!");
        } else if (qnt >= 60 ) {
            System.out.println("O Air-Bag for ativado!!");
            velocidade -= qnt;
            if(velocidade < qnt) {
                System.out.println("Não existe velocidade negativa!!");
                velocidade = 0;
            }   
        } else  {
            velocidade -= qnt;
        }
    }
    
}

