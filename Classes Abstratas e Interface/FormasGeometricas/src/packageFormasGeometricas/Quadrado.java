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
public abstract class Quadrado extends Quadrilatero implements FiguraGeometrica{
    
    public Quadrado(double a) {
        super(a, a, a, a);
    }

    @Override
    public double calculaArea(){
        double area = Math.pow(getLadoA(), 2);
        return area;
    };

    @Override
    public double calculaPerimetro() {
        return super.calculaPerimetro(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
 

    
    
}
