


public class App {
    public static void main(String[] args) throws Exception {
       
        
       //establecemos los intervalos en los que se moverá el procentaje
      for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
             Progress.DisplayBar(porcentaje,'=');
         }

    
    }
}
