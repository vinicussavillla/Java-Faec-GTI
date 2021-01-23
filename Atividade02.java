
package atividade02;

/**
 *
 * @author vinicius <viniciusavilla2020@hotmail.com>
 * @date 10/05/2020
 */

 /*
 ATIVIDADE 02:
 Crie um programa em java que utilize pelo menos quatro variáveis de tipos diferentes em sua composição.
 Vide documento em anexo.
Caso não receba uma cópia, faça uma cópia do documento via google documentos.
 */

public class Atividade02 {
    
    public static void main(String args[]) {
        String Nome = "Vinicius ";
        String Sobrenome = " De Avilla";
        float altura = 1.83f;
        byte idade = 18;
        String estadoCivil = "S";
        
        System.out.println(" Meu nome é " + Nome + Sobrenome + "\n Idade: " + idade + " anos");
        System.out.println(" Altura: " + altura );
        System.out.printf(" Estado civil : %Solteiro%n", estadoCivil);
       
        }
    }