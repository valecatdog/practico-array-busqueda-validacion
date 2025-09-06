package ejercicio1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String titulo;
        String autor;
        Boolean repetido;
 
        for(int i = libros.size(); i < 3 ;i++){
            System.out.print("Ingrese el titulo: ");
            titulo = scan.nextLine();
            System.out.print("Ingrese el autor: ");
            autor = scan.nextLine();
            repetido = false;
            
            for (Libro l: libros){
                if(l.getAutor().equals(autor) && l.getTitulo().equals(titulo)){
                    repetido = true;
                    break;
                }
            }
            
            if(repetido){
                System.out.println("El libro ya esta regitrado");
                i--;
            }else{
                System.out.println("El libro ha sido registrado correctamente");
                libros.add(new Libro(titulo, autor));
            }
        }
            
        System.out.println(libros);    
            
    }    
}

