import java.util.Scanner;

/**
 * Questão 3: Texto Encriptado
 * Objetivo: Encriptar um texto de acordo com regra pré-estabelecida
 * 
 */
public class TextoEncriptado {


public static void main(String[] args) {
        
        //pedindo entrada de dados para o usuario        
        Scanner input = new Scanner(System.in);
        System.out.println("Que palavra ou frase você quer que seja encriptada? ");
        String senha = input.nextLine();
       
       //eliminando espaços em branco na mensagem informada
        String senhaSemEspaco = senha.replace(" ", "");

        //calculando tamanho da lista        
        int tamanhoLista = senhaSemEspaco.length();

        //calculando quantidade de linhas e colunas da matriz
        double defineMatriz = Math.sqrt(tamanhoLista);
        
        if (defineMatriz % 1 > 0) defineMatriz = (int) Math.sqrt(tamanhoLista) + 1;        

        int linhasColunas = (int) defineMatriz;

        //criação da matriz 
        char [][] novoArray = new char [linhasColunas][linhasColunas];
            
        int preencheMatriz = 0;
        while (preencheMatriz < linhasColunas * linhasColunas) {
              for (int i = 0; i < linhasColunas; i++) {
                for (int j = 0; j < linhasColunas; j++) { 
                        if (preencheMatriz >= tamanhoLista) novoArray[i][j] = ' ';
                        else novoArray[i][j] = senhaSemEspaco.charAt(preencheMatriz);                        
                        
                        preencheMatriz++;                           
                        //System.out.print(novoArray[i][j]);
                }
                System.out.println();
                }  
        }

        //matriz encriptada e resultado
        for (int i = 0; i < linhasColunas; i++) {
                for (int j = 0; j < linhasColunas; j++) { 
                        System.out.print(novoArray[j][i]);
                }
                System.out.print(" ");
        }
        input.close();
        

    }    
}
