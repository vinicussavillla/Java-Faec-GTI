package atividade03;

import java.util.Scanner;

/**
 *
 * @author: Vinicius <viniciusavilla2020@hotmail.com>
 * @date: 12/05/2020
 */

 /*
  ATIVIDADE 03:
  Crie um programa em java que leia o nome e três notas de um aluno.
  Por fim o programa deve imprimir o nome, as notas do aluno e a média aritmética.
 */

public class Atividade03 {
   String aluno = "";
   float nota1 = 0;
   float nota2 = 0;
   float nota3 = 0;
   float media = 0;
  
    public static void main(String[] args) {
        new Atividade03().run();
      
    }
    private void run() {
        aluno = lerNome();
        
        nota1 = lerNotas();
        nota2 = lerNotas();
        nota3 = lerNotas();
        
        media = calcularMedia();
        
        imprimirResultado();
    }
    private String lerNome(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome = read.nextLine();
        return nome;
    }
    
    private float lerNotas(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a nota do aluno(0.0 a 10.0):");
        float nota = read.nextFloat();
        return nota;
    }
    private float calcularMedia(){
        float calculoMedia = (nota1 + nota2 + nota3) / 3;
        return calculoMedia;
    }
    private void imprimirResultado(){
        System.out.println("-----------------------------------------------");
        System.out.println(" Nome do aluno: " + aluno);
        System.out.println("-----------------------------------------------");
        System.out.println("|1ª nota     |2ª nota     |3ª nota     |Média"  );
        System.out.println("|"+ nota1 +" |"+ nota2 +" |"+ nota3 +" |"+ media);
        System.out.println("-----------------------------------------------");
    }
}