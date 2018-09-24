/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulatres;

/**
 *
 * @author 122306810
 */
public class AulaTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data hoje = new Data();
        hoje.setDia(15);
        hoje.setMes(8);
        hoje.setAno(2018);
        
        System.out.println(hoje.mostraData());
    }
    
}
