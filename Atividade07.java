/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativadade07;

/**
 *
 * @author vinicius
 */
public class Ativadade07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      private void ExecutarAlgoritmo() {
       int numero = perguntarNumerodeSequncias();
       long primeiroNumero = 0;
       long segundoNumero = 1;
       int fibonacci;
       
       System.out.println("0 \n1");
       for (int i = 1; i <= numero; i++) {
            fibonacci = (int) fazerSerieFibonacii(primeiroNumero, segundoNumero);
            primeiroNumero = segundoNumero;
            segundoNumero = fibonacci;
            System.out.println(fibonacci); 
        }
    }
 
    private long fazerSerieFibonacii(long primeiroNumero, long segundoNumero) {
        long numeroSequencia = primeiroNumero + segundoNumero;
        return numeroSequencia;
    } 

    private int perguntarNumerodeSequncias() {
        Scanner read  = new Scanner(System.in);
        System.out.print("Digite o número de sequências: ");
        int numero = read.nextInt();
        return numero;
    }
 }
    
}
