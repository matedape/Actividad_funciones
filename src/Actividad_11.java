public class Actividad_11
{
        public static boolean Buscar (int[] numeros, int valorbuscado) {
            for (int numero : numeros) {
                if (numero == valorbuscado) {
                    return true;
                }
            }
            return false;
        }


        public static void main(String[] args) {
            int[] numeros = {23,34,56,12};
            int valorbuscado = 56;



            System.out.println("Numero a buscar : " + valorbuscado);
            System.out.println("todos los numeros " + java.util.Arrays.toString(numeros));
            System.out.println("¿El numero se encuentra?");
            if (Buscar(numeros,valorbuscado)== true)
            {
                System.out.println("si");
            }
            if (Buscar(numeros,valorbuscado)== false)
            {
                System.out.println("no");
            }

        }
}
