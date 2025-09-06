package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad;
        String club;
        boolean repetido;
     
        
        
        
     
        for(int i = 0; i < 7; i++){//se rompe en club
            repetido = false;
        System.out.print("Ingrese el nombre: ");
        nombre = scan.next();
        System.out.print("Ingrese el apellido: ");
        apellido = scan.nextLine(); 
        scan.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = scan.nextInt();
        System.out.print("Ingrese el club: ");
        club = scan.nextLine();
            
            
            for (Estudiante est : estudiantes){
                if (est.getNombre().equals(nombre) && (est.getApellido().equals(apellido))){
                    //no me sale lo de que el apellido sea distinto
                    repetido = true;
                    break;
                }
            }
        
            if(!repetido){
                System.out.println("Estudiante valido");
                estudiantes.add(new Estudiante(nombre, apellido, edad, club));
            }else{
                System.out.println("Estudiante repetido");
            }
        
            System.out.println(estudiantes);
        }
    }
    //todo mal endentado help
    
}
