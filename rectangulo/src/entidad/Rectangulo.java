package entidad;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * Contructor con parametros
     * @param base
     * @param altura 
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Contructor vacio
     */
    public Rectangulo() {
    }

    /**
     * GETTER SETTER
     * @return 
     */
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    /**
     * Guardamos los datos que ingresan por el Main
     * @param base
     * @param altura 
     */
    public void pedirDatos(int base, int altura){
        
        this.base=base;
        this.altura=altura;
        
    }
    /**
     * Perímetro =
(
base + altura∗ 2.    
)
     * @return 
     */
    public int calculoPerimetro(){
    int resultado = (base + altura)*2;
        return resultado; //Escribo res + Control + espacio
    }
    
    /**
     * Superficie = base ∗ altura / 2
     * @return 
     */
    public int calculoArea(){
        int resultado = (base * altura) /2;
    return  resultado;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < base ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
