
//package Persona.java;
import java.util.Scanner;
public class Ejercicio1Persona {

    public static void main(String[] args) {
            
            Scanner leer=new Scanner(System.in);
            System.out.println("ingrse sus datos:");
            System.out.println("nombre:");
            String nombre=leer.next();
            System.out.println("apellido:");
            String apellido=leer.next();
            System.out.println("edad:");
            int edad=leer.nextInt();
            System.out.println("Nro de Documento:");
            int dni=leer.nextInt();
            
            Persona persona1 = new Persona(nombre,apellido,edad,dni);
            
            Perro perro1 = new Perro("hueso", "galgo", 12, 55);
            Perro perro2 = new Perro("ozzy", "caniche", 10, 40);
            Perro perro3 = new Perro("tobi", "mestizo", 14, 58);
            Perro perro4 = new Perro("duke", "mestizo", 9, 45);
            
            persona1.adoptarPerro(perro2);
            persona1.adoptarPerro(perro3);
            persona1.adoptarPerro(perro4);
            persona1.adoptarPerro(perro1);   
            
            System.out.println(persona1.perroMasGrande());
            System.out.println(persona1.toString());
            
    }
    
}
