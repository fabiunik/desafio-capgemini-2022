import java.util.Arrays;
import java.util.Scanner;


/**
 * Questão 2: Pares com diferença de x
 * Em um vetor com n elementos, calcular os itens que formam pares em que a diferença entre eles é = x
 */


public class ParesDeInteiros {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        //informar a quantidade de elementos que serão incluídos no array
        System.out.println("Qual a quantidade de elementos para criar a lista? ");
        int tamanhoArray = input.nextInt();
        int x, convert;
        //criação da lista
        int [] n = new int[tamanhoArray];
        System.out.println("Informe os " + tamanhoArray + " elementos da lista");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Item %d:  ", (i + 1));
            convert = input.nextInt();
            n[i] = convert;
        }

        //mostrar o array que foi criado        
        System.out.println("\nLista (n): " + Arrays.toString(n));
              
                
        //informar qual o valor da diferença entre os elementos que será calculada
        System.out.println("Informe o valor da diferença entre os elementos que deve ser calculada ");
        x = input.nextInt();
        System.out.println("Valor da diferença (x) = " + x);

        //verificar quantos pares de elementos da lista tem a diferença igual a x e mostrar pares formados
        int pares = 0;
        System.out.println("Par(es) formado(s): ");
        for (int i = 0; i < tamanhoArray; i++) {
            for (int j = tamanhoArray - 1; j >= 0; j--) {
                if ((n[i] - n[j]) == x){ 
                    pares++;                    
                   System.out.println("[" + n[i] + ", " + n[j] + "]");                     
                }
            }           
        }

        //imprimir o resultado 
        System.out.println("Quantidade de Par(es) Formado(s): " + pares);
         input.close();
    }
}
