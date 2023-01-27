
package holamundo;

import java.util.Scanner;

public class matrices {

   
    public static void main(String[] args) {
        
        int matriz [][]= new int [3][3];
        
        // recorrido ingresando datos 
        
        Scanner teclado=new Scanner (System.in);
        for (int f=0;f<3;f++){
            for (int c=0;c<3;c++){
                System.out.println("Ingrese un valor de la posicion f: "+f+" c: "+c);
                matriz[f][c]=teclado.nextInt();
            }
        }
        /*
        //asignacion de variables[manual)
        matriz[0][0]=5;
        matriz [0][1]=13;
        matriz[0][2]=96;
        matriz[1][0]=35;
        matriz[1][1]=33;
        matriz[1][2]=71;
        matriz[2][0]=446;
        matriz[2][1]=228;
        matriz[2][2]=24;
        */
        //recorrido
        
        for (int f=0;f<3;f++){
            for (int c=0;c<3;c++){
                System.out.println("el valor de la posicion f: "+f+" c: "+c);
                System.out.println("es de :"+matriz[f][c]);}
            
        }
        
        
    }
    
}
