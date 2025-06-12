public class Actividad_15
{
        public static String MejorAlumno(String[] nombres, int[] notas) {
            int mejornota = notas[0];
            int indiceMejor = 0;
String mejor_alumno = "";

            for (int i = 1; i < notas.length; i++) {
                if (notas[i] > mejornota) {
                    mejornota = notas[i];
                    indiceMejor = i;
                }
            }

mejor_alumno = "El alumno "+nombres[indiceMejor]+ " tiene la mejor nota y es: "+ notas[indiceMejor];
            return mejor_alumno;
        }


        public static void main(String[] args) {


            String[] nombres = {"jonas", "juan", "jeni", "jazmin", "jorge"};
            int[] notas = {8, 7, 3, 4, 10};


            String mejorAlumno = MejorAlumno(nombres, notas);


            System.out.println(mejorAlumno);
        }
}
