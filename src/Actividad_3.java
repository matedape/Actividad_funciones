public class Actividad_3 {

    public static double arearectangulo(double altura, double base)
    {

        return (base*altura);
    }
    public static void main (String[] args)
    {
        double altura = 7 ;
        double base = 10;
        double area = arearectangulo(base,altura);

        System.out.println("El area del rectangulo es "+area);
    }
}
