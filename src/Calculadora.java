import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "";
        do {
        System.out.println("CALCULADORA");
        System.out.println();//Estos están a lo largo de mi código y son para dar un espacio.
        System.out.println("Ingrese el primer número: ");
        double numero1 = teclado.nextDouble();
        System.out.println();
        System.out.println("Ingrese el segundo número: ");
        double numero2 = teclado.nextDouble();
        System.out.println();
        System.out.println("Ingrese la operación (+, -, *, /, %): ");
        String operacion = teclado.next(); //lee como texto
        System.out.println();
        double resultado = 0;
        boolean operacionValida = true;


        if("+".equals(operacion) || operacion.equalsIgnoreCase("suma")) {
            resultado = numero1 + numero2;
        }
        else if (operacion.equals("-") || operacion.equalsIgnoreCase("resta")) {
            resultado = numero1 - numero2;
        }
        else if (operacion.equals("*") || operacion.equalsIgnoreCase("multiplicación")) {
            resultado = numero1 * numero2;
        }
        else if (operacion.equals("/") || operacion.equalsIgnoreCase("división")) {
            if (numero2 !=0)
            {
                resultado = numero1 / numero2;
            }
            else {
                System.out.println("No es posible dividir por cero.");
                operacionValida = false;
            }
        }
        else if (operacion.equals("%") || operacion.equalsIgnoreCase("módulo")) {
            resultado = numero1 % numero2;
        }
        else {
            System.out.println("Operación inválida");
            operacionValida = false;
        }

        //Esto mostrará el resultado sólo si es válido
        if (operacionValida){
            System.out.println("El resultado es: " + resultado);
        }
            System.out.println();
            System.out.println("¿Desea realizar otra operación? (si/no): ");
            continuar = teclado.next();
        }
        while(continuar.equalsIgnoreCase("si"));
            System.out.println("Gracias por usar la calculadora :3");
            teclado.close();
    }

}
