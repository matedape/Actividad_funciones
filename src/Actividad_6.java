import java.util.Scanner;
public class Actividad_6
{
public static boolean espar (int numero)
{
return numero%2 == 0;
}
public  static void  main (String [] args)
{
    int numero = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingresar un numero para poder calcular si es par o impar:");
    numero= scanner.nextInt();

if (espar(numero))
{
    System.out.println("El numero es par");
}
else
{
    System.out.println("El numero es impar");
}
}

}
