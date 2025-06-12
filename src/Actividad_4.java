import java.util.Scanner;

public class Actividad_4 {
public String conversionmayus(String texto)
{
return texto.toUpperCase();
}
public static void main (String[]args)
    {
Scanner scanner = new Scanner(System.in);
String texto = "";
String textoconvertirmayus = "";
System.out.println("Ingresar un Texto :");
texto = scanner.nextLine();
Actividad_4 objeto = new Actividad_4();
        textoconvertirmayus = objeto.conversionmayus(texto);
System.out.println("A continuacion podra observar el texto que ingreso pero en mayusculas. \n Texto en mayusculas:"+textoconvertirmayus);
    }
}
