import java.util.Arrays;
import java.util.Scanner;

/**
 * Questão 1: Mediana
 * Objetivo: Dado uma lista de n inteiros ímpares, calcular a mediana
 */
public class Mediana {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, mediana; 
        
        //solicitar a quantidade de elementos que serão incluídos no array
        System.out.println("Informe a quantidade de números para criar a lista.\nO número informado deve ser ímpar e maior que 2");
        
        //a solicitação será repetida enquanto o valor informado não atender aos requisitos
        while (true) {
            n = sc.nextInt();
            if (n > 2 && n % 2 != 0) break;
            else System.out.println("Valor inválido! Por favor, \nInforme um valor ímpar e maior que dois!");            
        }        
        
        //declaração no array
        int[] arr = new int[n];

        //calcular a posição do elemento que corresponde à mediana
        mediana = (arr.length - 1) / 2;
        
        //incluir os elementos no array 
        System.out.println("Informe " + n + " números inteiros");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
            //System.out.println(i + 1 + ". número da lista");                      
        }

        //ordenar os elementos no array
        Arrays.sort(arr);
        
        //array ordenado 
        System.out.print("A lista de números para cálculo da mediana é: ");       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        //imprimir a mediana 
        System.out.print("\nA mediana da lista informada é: ");               
         for (int i = 0; i < arr.length; i++) {
             if (i == mediana) {
                 System.out.print(arr[i]);
             }            
         }
         

       sc.close();


    }

}