/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageFormasGeometricas;

/**
 *
 * @author 122534710
 */
public class Main {
    public static void main(String[] args) {
        
        Retangulo r;
        r = new Retangulo(15, 5) {};
        
        Quadrado q;
        q = new Quadrado(15) {
        };
        
        Circulo c;
        c = new Circulo(25) {
        };
        
        System.out.println(" - Retangulo - ");
        System.out.println("Perímetro: " + r.calculaPerimetro());
        System.out.println("Área: " + r.calculaArea());
        System.out.println(" - Quadrado - ");
        System.out.println("Perímetro: " + q.calculaPerimetro());
        System.out.println("Área: " + q.calculaArea());
        System.out.println(" - Circulo - ");
        System.out.println("Perímetro: " + c.calculaPerimetro());
        System.out.println("Área: " + c.calculaArea());
        
    }
}
