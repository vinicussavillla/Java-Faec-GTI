
package atividade04;

import java.util.Scanner;

/**
 * @author vinicius avilla
 * date 21/05/2020
 */

/**
ATIVIDADE 04:
Crie um programa em java que leia o valor de um produto em dólar
e imprima o total a ser pago em reais considerando a cotação do dolar a $ 5,89
e a taxa de IOF aplicada de 1,1%.
Segue sugestão de formato de algoritmo (novo padrão ensinado em aula hoje). 
*/
public class Atividade04 {

    public static void main(String[] args) {
      new Exemplo04().excutarAlgoritmo();   
    }

    private void excutarAlgoritmo() {
        float valorEmDolar = lerValorEmDolar();
        float valorEmReal = calcularCotacao(valorEmDolar);
        float valorIof = calcularValorIof(valorEmReal);
        float valorTotal = calcularValorTotal(valorEmReal, valorIof);
        imprimirTotais(valorEmDolar, valorEmReal, valorIof, valorTotal);                          
    }

    private float lerValorEmDolar() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        float valorDigitado = read.nextFloat();
        read.close();
        return valorDigitado;
    }

    private float calcularCotacao(float valorEmDolar) {
        float valorTransformado = valorEmDolar * getCotacaoDolar();
        return valorTransformado;
    }

    private float getCotacaoDolar() {
        return 5.89f;
    }

    private float calcularValorIof(float valorEmReal) {
        float valorIof = valorEmReal * getporcentagemIof();
        return valorIof;
    }

    private float getporcentagemIof() {
        return (float) (1.1 / 100);
    }

    private float calcularValorTotal(float valorEmReal, float valorIof) {
        float soma = valorEmReal + valorIof;
        return soma;
    }

    private void imprimirTotais(float valorEmDolar, float valorEmReal, float valorIof, float valorTotal) {
        
        String finalidade ="\n"
                
  +"╔═════════════════════════════════════════════════════════════════════╗\n"
  +"║   Dólar      ║      Real        ║   IOF        ║  TOTAL     ║\n"
  +"║==============║==================║==============║============║\n"
  +"║              ║                  ║              ║            ║\n"
  +"║   R$%.2f     ║    R$.2f         ║    R$.2f     ║  R$.2f     ║\n"
  +"║              ║                  ║              ║            ║\n"
  +"╚═════════════════════════════════════════════════════════════════════╝\n";
           
    System.out.printf(finalidade,ValorDoProdutoEmDolar, ValorDoProdutoEmReal, valordoIofAplicado,valor);

    }
 }
    

  

