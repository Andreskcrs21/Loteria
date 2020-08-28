
package juegoloteria;

import java.util.Random;
import java.util.Scanner;


public class JuegoLoteria {
        Random r=new Random();
        int ram=r.nextInt(10)+1;
        int[] num=new int[5];
        int numeros;
        
    public void arreglo(){
        Scanner ent = new Scanner(System.in);
        int cont=0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese un numero");
            num[i] = ent.nextInt();  
            
        }
        
    }
    public void ganador(){
        System.out.println("El numero ganador es: "+ram);   
        for (int i = 0; i < num.length; i++) {
            if (ram==num[i]) {
                System.out.println("El numero "+num[i]+" es correcto. Felicidades Ganaste." );
                break;
                
            }if(ram!=num[i]){
                System.out.println("El numero "+num[i]+" es incorrecto.");
                
                
            }
        }  
        
    }
}