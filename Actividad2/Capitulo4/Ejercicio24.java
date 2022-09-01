import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args){
        int esferaA, esferaB, esferaC;
        Scanner input = new Scanner(System.in); //Ingresamos los pesos por el teclado
        System.out.println("Ingrese el peso de la esfera A: ");
        esferaA = input.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        esferaB = input.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        esferaC = input.nextInt();

        if(esferaA > esferaB && esferaA > esferaC){ //Evaluamos todas las condiciones posibles
            System.out.println("La esfera A es la de mayor peso");
        }else if(esferaB > esferaA && esferaB > esferaC){
            System.out.println("La esfera B es la de mayor peso");
        }else if(esferaC > esferaA && esferaC > esferaB){
            System.out.println("La esfera C es la de mayor peso");
        }else if(esferaA == esferaB && esferaA == esferaC){
            System.out.println("Las 3 esferas tienen el mismo peso");
        }
    }
}
