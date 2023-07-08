
package video99;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][]= new int [3][3];
        
         System.out.println("Digite la matriz");
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = teclado.nextInt();
        }
    }
       
       System.out.println("\nMatriz original: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
    }
        
    // Transponiendo la matriz
    int aux;
    for(int i=0;i<3;i++){
        for(int j=0;j<i;j++){
            aux = matriz[i][j];
            matriz[i][j] = matriz[j][i];
            matriz[j][i] = aux;
        }
    }
    
    System.out.println("\nLa matriz transpuesta es:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(matriz[i][j]+" ");
        }
        System.out.println("");
    }
    
    }
    
}
