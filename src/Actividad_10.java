public class Actividad_10
{
   public static double promedio (double[] numeros)
   {
      double suma = 0;
      for(int i = 0; i< numeros.length ; i++)
      {
         suma +=  numeros[i];
      }
return suma / numeros.length;
   }
   public static void main(String [] args)
   {
       double[] numeros = {2.9,11,3.9,3.9};
System.out.println("El Promedio de "+ java.util.Arrays.toString(numeros) +" es de : "+ promedio(numeros));
   }
}
