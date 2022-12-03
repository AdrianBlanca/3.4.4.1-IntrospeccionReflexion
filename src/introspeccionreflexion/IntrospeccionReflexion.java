/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introspeccionreflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class IntrospeccionReflexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clase;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de la clase:");
        clase = sc.nextLine();
        
        System.out.println(clase + " test");
        
        try {
            Class c = Class.forName(clase);
            System.out.println("Caracteristicas de " + c.getName() + ":");
            
            System.out.println("\tConstructores:");
            for(Constructor constructor : c.getConstructors())
                System.out.println("\t\t" + constructor.getName());
            
            System.out.println("\tModifiers:");
            System.out.println("\t\t" + c.getModifiers());
            
            System.out.println("\tFields:");
            for(Field field : c.getFields())
                System.out.println("\t\t" + field.getName());
            
            
            
        } catch(ClassNotFoundException e) {
            System.out.println("El nombre de la clase no es válido");
            
        }
        
    }
    
}
