public class Actividad_12
{
    public static int Buscar (String[] palabras)
    {
String Palabra_clave = "pato";
int veces = 0;
for (int i =0 ; i <palabras.length;i++ )
{
    if (Palabra_clave == palabras[i])
    {
        veces++;
    }

}
return  veces;
    }
    public static void  main (String[] args)
    {
        String [] palabras = {"pato","perro","paloma","pato","pinguino"};
        int veces = Buscar(palabras);
 System.out.println("El animal Pato se repite : "+ veces +" veces");
    }
}
