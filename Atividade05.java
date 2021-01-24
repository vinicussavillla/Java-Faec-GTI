
package atividade05;

import java.util.Scanner;

/**
 * @author Vinicius Avilla <vinistaoo@gmail.com>
 * @date 31/05/2020
 */
/*
ATIVIDADE 05:
Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.
*/

public class Atividade05 {
    
    public static void main(String[] args) {
        new Atividade05().ExecutarAlgoritmo();
    }
      private void ExecutarAlgoritmo() {
        imprimirCabecalho();
        float valorHora = lerValorHora();
        int horasTrabalhadas = lerTotalDeHoras();
        float salario = calcularSalario(horasTrabalhadas,valorHora);
        imprimirFolhaDePagamento(horasTrabalhadas, salario, valorHora);
    }
    
    private float lerValorHora(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o valor da Hora: ");
        float valorHora = read.nextFloat();
        return valorHora;
    }

    private int lerTotalDeHoras() {
       Scanner read = new Scanner(System.in);
       System.out.println("Digite o total de horas trabalhadas no mês: ");
       int horas = read.nextInt();
       return horas;
    }

    private float calcularSalario(int horasTrabalhadas, float valorHora) {
        float salario = horasTrabalhadas * valorHora;
        return salario;
    }
    private void imprimirFolhaDePagamento(int horasTrabalhadas, float salario, float valorHora){
          
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.format( "|%-3s|%-20s|%-10s|%-13s|","Cod","Descrição","Referência","");
        System.out.println("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.format( "|%-3s|%-20s|%-10s|R$ %-10.2f|\n","001","Salário Hora",horasTrabalhadas,salario);
        System.out.format( "|Salário Base:R$%-34.2f/hora|\n",valorHora);
        System.out.println("---------------------------------------------------");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    private void imprimirCabecalho() {
        System.out.println("________________________________");
        System.out.println("|         ~~Bem vindo~~        |");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }
    
}

