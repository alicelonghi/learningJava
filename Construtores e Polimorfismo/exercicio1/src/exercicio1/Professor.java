/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author 122534710
 */
public class Professor {
    private int numero;
    private String nome;

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Professor(int num, String n ){
        this.numero = num;
        this.nome = n; 
    }
    
    public String mostraProfessor(){
        return "\nNúmero: " + numero +
                "\nNome: " + nome;
    };
}


