
package holamundo;

import java.util.Scanner;


public class ejercicios_vectores {

    public static void main(String[] args) {
        
        int vector[]=new int [15];
        Scanner teclado= new Scanner (System.in);
        for (int i=0; i<15;i++){
            System.out.println("Ingrese un numero para el vector: ");
             vector[i]=teclado.nextInt();
        }
        
        //recorrer y contar cuantos numeros 3 hay
        
        int cont=0;
        for (int i=0; i<15;i++){
            if (vector[i]==3){
                cont=cont+1;
            }
          
   
        }
        System.out.println("la cantidad de numeros 3 que hay en el vector es "+cont);
        
    }
    
}
