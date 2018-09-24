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
public class Curso {
    private int numero;
    private String nome;
    private Professor professor; 

    //Não esquecer do get para mostrar no main!!!! =)
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    
    //Método construtor com parametros:
    
    public Curso(int num, String nome, Professor p ) {
    this.numero = num;
    this.nome = nome; 
    this.professor = p;
}
    
    public String exibeDados(){
        return "Numero do curso: " + numero +
                "\nNome : " + nome +
                "\nProfessor responsável:  " + professor.mostraProfessor();
        
    }
}
