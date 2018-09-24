/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tamagoshi;

/**
 *
 * @author 122534710
 */
public class Tamagoshi {
    private String nome;
    private int idade = 0;
    private double saude = 100;
    private double alimentacao = 100;
    
    public Tamagoshi(String n, int i, double s, double a) {
        nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }

    public double getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(double alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }
    
    public String getHumor(double s, double a) {
        double calculaHumor = s * a / 2;
        String humor = "";
        
        if(calculaHumor == 100) {
            humor = "Saúde no maximo !";
        } else if (calculaHumor < 50 && calculaHumor > 10) {
            humor = "Pode melhorar!";
        }  else {
            humor = "Doente!";
        }     
        
        return humor;
    }
}
