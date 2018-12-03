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
public abstract class Circulo implements FiguraGeometrica{
    private double raio;
    
    public Circulo(double r){
        this.raio = r;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculaArea(){
        double area = Math.PI * Math.pow(getRaio(), 2);
        return area;
    };

    @Override
    public double calculaPerimetro(){
        double perimetro = (Math.PI * 2) * getRaio();
        return perimetro;
    };

    
            
            
}
