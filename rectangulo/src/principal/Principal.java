/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author joc
 */
public class Principal {

    /**
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
    privado base y un atributo privado altura. La clase incluirá un método para crear el
    rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
    método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes. 

Formulas: 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo rect = new Rectangulo();
        System.out.println("Ingrese base y altura");
        rect.pedirDatos(leer.nextInt(), leer.nextInt());
        
        rect.dibujarRectangulo();
    
        System.out.println("El perimetro es: " + rect.calculoPerimetro());
        System.out.println("El area es: " + rect.calculoArea());
        
    
    }
    
}
