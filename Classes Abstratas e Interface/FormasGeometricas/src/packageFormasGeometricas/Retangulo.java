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
public abstract class Retangulo extends Quadrilatero implements FiguraGeometrica{
    
    public Retangulo(double a, double b) {
        super(a, b, a, b);
    }

    @Override
    public double calculaArea(){
        double area = getLadoA() * getLadoB();
        return area;
    };

    /**
     * Calcula o perímetro
     * @return 
     */
    @Override
    public double calculaPerimetro() {
        return super.calculaPerimetro();
    }
    
    
    
    
    
    
    
}
