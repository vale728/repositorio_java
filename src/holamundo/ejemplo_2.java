
package holamundo;

public class ejemplo_2 {

   
    public static void main(String[] args) {
        //tener un vector que guarde una serie de 8 nombres 
        String vector[]= new String [9];
        vector [1]="alejandra";
        vector [2]="lusmila";
        vector [3]="paola";
        vector [4]="gabriel";
        vector [5]="loky";
        vector [6]="daniel";
        vector [7]="samir";
        vector [8]="juan";
       
        //recorrido
        
        for (int i=1;i<vector.length;i++){
            System.out.println("en la posicion "+i+" esta el nombre: "+vector[i]);
            
        }
    }
    
}
