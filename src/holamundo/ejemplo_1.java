
package holamundo;

import java.util.Scanner;

public class ejemplo_1 {

  
    public static void main(String[] args) {
         
        //pedir datos a las personas, dni, nombre y edad
        //determinar a que categoria se debe inscribir 
        //informarle a la persona
        //*no sabemos la cantidad de peronas
        
        System.out.println("Ingrese el dni de la persona:");
        Scanner teclado =new Scanner(System.in);
        String dni=teclado.nextLine();
        System.out.println("Ingrese el nombre de la persona");
        String nombre= teclado.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        Scanner teclado2=new Scanner (System.in);
        int edad=teclado2.nextInt();
        
        while (!dni.equals("0") && (!nombre.equalsIgnoreCase("fin"))){
            
            if (edad>=6 && edad<=10){
                System.out.println("la categoria es Menores A");
            }
            else {
                if (edad>=11 && edad<=17 ){
                    System.out.println("la categoria es Menores B");
                    
                }
                else{
                    if (edad>=18 && edad<=30){
                        System.out.println("la categoria es Juveniles");
                    }
                    else{
                        if (edad>=31 && edad<=50){
                            System.out.println("la categoria es Adultos");
                        }
                        else{
                            if (edad>=51){
                                System.out.println("la categoria es Adultos mayores");
                            }
                            else{
                                System.out.println("la persona no cuenta con la edad indicada");
                            }
                        }
                    }
                }
            }
            
            System.out.println("Ingrese el dni de la persona:");
            dni=teclado.nextLine();
            System.out.println("Ingrese el nombre de la persona");
            nombre= teclado.nextLine();
            System.out.println("Ingrese la edad de la persona:");
            edad=teclado2.nextInt();
        }
        
        
        
        
    }
    
}
