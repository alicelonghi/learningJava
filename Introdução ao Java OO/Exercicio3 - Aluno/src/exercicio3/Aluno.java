/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author alice
 */
public class Aluno {
    
    private String nome;
    private String numeroMatricula;
    private Endereco enderecoComercial;
    private Endereco enderecoResidencial;

    public Endereco getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(Endereco enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    
     public String mostraAluno(){
        return "Aluno(a): " + nome + "\nMatrícula: " + numeroMatricula +
                "\nEndereço Comercial: " + enderecoComercial.mostraEndereco() +
                "\nEndereço Residencial: " + enderecoResidencial.mostraEndereco();
    }
     


    
}
