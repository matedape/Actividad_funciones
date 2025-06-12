public class Actividad_14
{
    public static int [] invertir (int [] Numeros)
    {
int[] inverso = new int [Numeros.length];
int cont = 0;
cont = Numeros.length -1 ;
for (int i = 0; i < Numeros.length; i++)
{
    inverso [i] = Numeros[cont];
    cont--;
}
return  inverso ;
    }
    public static void main (String[] args)
    {
        int [] Numeros = {1,2,3};
        int [] inverso = invertir(Numeros);

        System.out.println("Los valores sin invertir son : "+ java.util.Arrays.toString(Numeros) );
        System.out.println("Los valores invertidos son : "+ java.util.Arrays.toString(inverso) );

    }
}
