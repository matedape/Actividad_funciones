import java.util.Scanner;

public class Actividad_2 {

    public Actividad_2(String Nombre)
    {
        System.out.println("Hola "+Nombre);
    }
    public static  void main (String[] args)
    {
        String Nombre = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un Nombre :");
        Nombre = scanner.nextLine();
        new Actividad_2(Nombre);
    }
}
