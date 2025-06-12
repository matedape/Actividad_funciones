import java.util.Scanner;
public class Actividad_8
{
    public static long factorialcalculo (int numero)
    {
        if (numero==0)
        {
            return 1;
        }
return numero * factorialcalculo(numero-1);
    }
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero:");
        int numero= scanner.nextInt();

        System.out.println("El factorial de "+numero+" es : "+ factorialcalculo(numero));

    }
}
