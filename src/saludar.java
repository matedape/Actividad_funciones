import java.util.Scanner;

public class saludar {

    public saludar(String Nombre)
    {
        System.out.println("Hola "+Nombre);
    }
    public static  void main (String[] args)
    {
        String Nombre = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un Nombre :");
        Nombre = scanner.nextLine();
        new saludar(Nombre);
    }
}
