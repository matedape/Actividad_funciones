public class Actividad_9 {


    public static int SumarNumeros(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;


        }
        return suma;
    }


    public static void main(String[] args) {
        int[] Numeros  = {33,6,20};

        System.out.println("Numeros sin sumar : " + java.util.Arrays.toString(Numeros));
        System.out.println("Resultado de la suma es de : " + SumarNumeros(Numeros));
    }
}
