/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3exercicio2;

/**
 *
 * @author 122306810
 */
public class Salario {
    
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0 ){
            salario = 0;
        } else {
            this.salario = salario;
        }
    }
    
    public String aumentaSalario(double percentual) {
        if (percentual < 0 ) {
            return "Percentual não pode ser negativo!";
        } else {
            double resultado = salario + (salario/100) * percentual;
            return "Novo Salário : " + resultado;
        }    
    }
}
