import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        int pesoA, pesoB, pesoC, pesoD;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");  //Ingresamos los pesos por teclado
        pesoA = input.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = input.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = input.nextInt();
        System.out.println("Ingrese el peso de la esfera D: ");
        pesoD = input.nextInt();

        if (pesoA == pesoB && pesoA == pesoC)  { // evaluamos todas las condiciones posibles
            if(pesoD > pesoA){
                System.out.println("La esfera D es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        }else if(pesoA == pesoB && pesoA == pesoD){
            if(pesoC > pesoA){
                System.out.println("La esfera C es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera C es la diferente y es de menor peso");
            }
        }else if(pesoA == pesoC && pesoA == pesoD){
            if(pesoB > pesoA){
                System.out.println("La esfera B es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera B es la diferente y es de menor peso");
            }
        }else{
            if(pesoA > pesoB){
                System.out.println("La esfera A es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
        }
    }
}
