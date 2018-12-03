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
public abstract class Quadrilatero{
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double ladoD;
    
    public Quadrilatero(double a, double b, double c, double d){
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
        this.ladoD = d;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }
    
   
    public double calculaPerimetro(){
        double perimetro = getLadoA() + getLadoB() + getLadoC() + getLadoD();
        return perimetro;
    }
    
    
    
}
