import java.util.Scanner;
public class Actividad_7
{
        public static int Cuadrado(int numero) {
            return numero * numero;
        }


        public static void main(String[] args) {
            int numero = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingresar un numero :");
            numero = scanner.nextInt();

            System.out.println("El cuadrado de "+ numero +" es :"+ Cuadrado(numero));
        }
}
