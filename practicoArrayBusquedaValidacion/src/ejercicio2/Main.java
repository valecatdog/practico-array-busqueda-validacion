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
        boolean seguir;
        String strSeguir;

     
        do{
            repetido = false;
            System.out.print("Ingrese el nombre: ");
            nombre = scan.nextLine();
            System.out.print("Ingrese el apellido: ");
            apellido = scan.nextLine(); 
            System.out.print("Ingrese la edad: ");
            edad = scan.nextInt();
            scan.nextLine();//porque si no no me sigue leyendo club
            System.out.print("Ingrese el club: ");
            club = scan.nextLine();
            
            
            for (Estudiante est : estudiantes){
                if (est.getNombre().equals(nombre) && (est.getApellido().equals(apellido))){
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
            
              System.out.print("Desea continuar ingresando estudiantes? (s/n): ");
              strSeguir = scan.nextLine
        ();
              seguir = strSeguir.equals("s");

        }while(seguir);
        
    }
    //todo mal endentado help
    
}
