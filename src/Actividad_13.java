
public class Actividad_13
{
        public static void CorchetesArray(int[] numeros) {
            System.out.print("[");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                if (i < numeros.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }


        public static void main(String[] args) {


         int [] numeros = {3,4,7,7};



            System.out.print("Array con corchetes y , : ");
            CorchetesArray(numeros);


        }

    }
