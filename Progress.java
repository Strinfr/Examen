import java.io.IOException;
public class Progress {

    // Creamos un funcion y le asignmos un caracter
    public static void DisplayBar(int procentaje, char c) throws IOException, InterruptedException
    {
        //establecemos un tamaño para la barra
        int TamBar = 30;
        String sb= new String();
        //calculamos el numero de caracteres
        int nroCaracteres = procentaje * TamBar / 100;  //numero de caracteres
        sb =  "\r [";

        //Imprimimos en pantalla el caracter por medio de un bucle
        for (int k = 0; k <= TamBar; k++){
            sb += String.format("%s", ((nroCaracteres < k) ? " " : c));
        }   
       
        sb += "]";
        
        System.out.write(sb.getBytes());
        //Imprimimos el porcentaje
        System.out.printf(" %d %%", procentaje);
        //Establecemos un tiempo
        Thread.sleep(100);
    }

    


    
}
