/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

//import java.util.Scanner;

/**
 *
 * @author alice
 */
public class Principal {
    public static void main(String[] args) {
// DIGITANDO INFORMAÇÕES
//        Scanner teclado = new Scanner(System.in);
//        
//        Aluno aluno1 = new Aluno();
//        System.out.println("Nome:");
//        aluno1.setNome(teclado.next());
//        System.out.println("Número matrícula:");
//        aluno1.setNumeroMatricula(teclado.next());
//
//        
//        Endereco endc = new Endereco();
//        System.out.println("Endereço Comercial");
//        System.out.println("Rua: ");
//        endc.setRua(teclado.next());
//        System.out.println("Número: ");
//        endc.setNumero(teclado.nextInt());
//        System.out.println("Complemento: ");
//        endc.setComplemento(teclado.next());
//        System.out.println("Bairro: ");
//        endc.setBairro(teclado.next());
//        System.out.println("CEP: ");
//        endc.setCep(teclado.next());    
//        System.out.println("Cidade: ");
//        endc.setCidade(teclado.next());
//        
//        Endereco endr = new Endereco();
//        System.out.println("Endereço Residencial: ");
//        System.out.println("Rua: ");
//        endr.setRua(teclado.next());
//        System.out.println("Número: ");
//        endr.setNumero(teclado.nextInt());
//        System.out.println("Complemento: ");
//        endr.setComplemento(teclado.next());
//        System.out.println("Bairro: ");
//        endr.setBairro(teclado.next());
//        System.out.println("CEP: ");
//        endr.setCep(teclado.next());    
//        System.out.println("Cidade: ");
//        endr.setCidade(teclado.next());
//        
//        aluno1.setEnderecoComercial(endc);
//        aluno1.setEnderecoResidencial(endr);
//        
//        System.out.println(aluno1.mostraAluno());
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Alice Longhi");
        aluno2.setNumeroMatricula("122534710");

        
        Endereco endc2 = new Endereco();
        endc2.setRua("Júlio de Castilhos");
        endc2.setNumero(159);
        endc2.setComplemento("Ao lado do Banco do Brasil");
        endc2.setBairro("Centro");
        endc2.setCep("90020-120");    
        endc2.setCidade("Porto Alegre");
        
        Endereco endr2 = new Endereco();
        endr2.setRua("Av. Assis Brasil");
        endr2.setNumero(4908);
        endr2.setComplemento("Torre 3");
        endr2.setBairro("São Sebastião");
        endr2.setCep("91110-010");    
        endr2.setCidade("Porto Alegre");
        
        aluno2.setEnderecoComercial(endc2);
        aluno2.setEnderecoResidencial(endr2);
        
        
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Patricia Araújo");
        aluno3.setNumeroMatricula("12299999");

        
        Endereco endc3 = new Endereco();
        endc3.setRua("27 de Julho");
        endc3.setNumero(109);
        endc3.setComplemento("Ao lado da praça");
        endc3.setBairro("Centro");
        endc3.setCep("90400-120");    
        endc3.setCidade("Erechim");
        
        Endereco endr3 = new Endereco();
        endr3.setRua("Claro Giboski");
        endr3.setNumero(15);
        endr3.setComplemento("Perto da Rodoviária");
        endr3.setBairro("Centro");
        endr3.setCep("90410-010");    
        endr3.setCidade("Erechim");
        
        aluno3.setEnderecoComercial(endc3);
        aluno3.setEnderecoResidencial(endr3);
        
        
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Oliane Benetti");
        aluno4.setNumeroMatricula("18939999");

        
        Endereco endc4 = new Endereco();
        endc4.setRua("Casimiro Zaffonato");
        endc4.setNumero(145);
        endc4.setComplemento("Em frente a delegacia");
        endc4.setBairro("Centro");
        endc4.setCep("9120-120");    
        endc4.setCidade("Ipê");
        
        Endereco endr4 = new Endereco();
        endr4.setRua("Julio de Castilhos");
        endr4.setNumero(115);
        endr4.setComplemento("Ao lado da funeraria Anzilheiro");
        endr4.setBairro("Centro");
        endr4.setCep("90410-009");    
        endr4.setCidade("Ipê");
        
        aluno4.setEnderecoComercial(endc4);
        aluno4.setEnderecoResidencial(endr4);
        
        
//      System.out.println(aluno1.mostraAluno());
        System.out.println(aluno2.mostraAluno());
        System.out.println("---------------------------------------");
        System.out.println(aluno3.mostraAluno());
        System.out.println("---------------------------------------");
        System.out.println(aluno4.mostraAluno());
        
        
        
        
        
        
    }
    
}
