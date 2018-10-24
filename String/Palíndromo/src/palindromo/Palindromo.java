/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author alice
 */
public class Palindromo {
    private String frase;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public void verificaPalindromo(){
       String fraseAux = getFrase().replaceAll("\\s", "");
       
       //System.out.println(fraseAux);
        
       String fraseContrario = new StringBuilder(fraseAux).reverse().toString();
       String fraseContrarioAux = new StringBuilder(getFrase()).reverse().toString();
       
       System.out.println("Original: " + fraseContrario + "\n");
       System.out.println("Invertido: " + fraseContrarioAux + "\n");
       
        if (fraseAux.equals(fraseContrario)){
            System.out.println("É um palíndromo!");
        }else{
            System.out.println("Não é um palíndromo. :/ ");
        }
      
       
    }
}
