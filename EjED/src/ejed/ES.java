/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejed;
public class ES {

    /**
     * Este método captura todo lo que se introduce por teclado hasta pulsar enter
     * y lo devuelve como una cadena de caracteres (String)
     * @return String
     */
    public static String leeDeTeclado() {
      int tecla;
      String cadena = "";
      boolean fin = false;
      while (!fin) {
         try {
            tecla = System.in.read();
            if (tecla < 0 ||
                (char)tecla == '\n')
               fin = true;
            else
                if (!Character.isISOControl((char)tecla))
                    cadena += (char)tecla;
         } catch(java.io.IOException e) {
               fin = true;
         }
      }
      return cadena;
   }

   /**
    * Escribe un mensaje en pantalla, y queda a la espera de recoger toda la cadena
    * de caracteres que se introduzca desde teclado hasta pulsar enter.
    * @param  mensaje mensaje que se escribe
    * @return la cadena leida
    */

   public static String leeDeTeclado(String mensaje) {
      System.out.println(mensaje);
      return leeDeTeclado();
   }
   /**
       * Lee un número real (double) desde teclado, tras la escritura en pantalla
       * de un mensaje solicitándolo. La introducción del número finaliza al pulsar enter
       * @param mensaje Mensaje que se imprime
       * @return el valor numérico leido (como double)
       * @exception NumberFormatException si se
       * introduce un valor incorrecto
    */

   public static double leeNºR(String mensaje) {
        while(true) {
           System.out.println(mensaje);
           try {
              return Double.parseDouble(leeDeTeclado().trim());
           } catch(NumberFormatException e) {
              System.err.println("NO ES UN NÚMERO REAL VÁLIDO: Vuelve a intentarlo.");
           }
        }
   }
   /**
    * Muestra un mensaje en pantalla para solicitar un número, y
    * espera a que se introduzca un valor desde teclado. La secuencia de caracteres que se
    * introduzcan hasta pulsar enter se intenta convertir en un número entero(int)
    * Si no es posible, se mostrará un mensaje de error. Su es posible, devuelve el
    * valor numérico correspondiente al número tecleado.
    * @param mensaje Mensaje que se muestra en pantalla para pedir el número
    * @return el número leido (como int)
    * @exception NumberFormatException si se
    * introduce un valor incorrecto para el número entero
    */

   public static int leeNº(String mensaje) {
     int numero=0;
     boolean incorrecto=true;
      while(incorrecto) {
         System.out.println(mensaje);
         try {
            numero=Integer.parseInt(leeDeTeclado().trim());
            incorrecto=false;
         } catch(NumberFormatException e) {
            incorrecto=true;
            System.err.println("NO ES UN NÚMERO ENTERO VÁLIDO: Vuelve a intentarlo.");
         }
      }
      return numero;
   }

   /**
    * Lee un entero mayor o igual al mínimo indicado como parámentro. Si se introducen
    * valores menores, indica mediante un mensaje de error que debe introducirse un
    * valor mayor.
    * @param mensaje El mensaje que solicita el número entero.
    * @param minimo Es el menor número entero admitido
    * @return el entero leido
    */
   public static int leeNº(String mensaje,int minimo) {
        int entero;
        do {
                entero = leeNº(mensaje);
                if (entero < minimo)
                       System.err.println(
                       " EL MÍNIMO VALOR PERMITIDO ES: " + minimo);
        } while (entero < minimo);

        return entero;
   }

   /**
    * Lee un entero mayor o igual al mínimo y menor o igual que el máximo indicados
    *  como parámentros. Si se introducen valores menores que el mínimo o mayores que
    * el máximo, indica mediante un mensaje de error que debe introducirse un
    * valor dentro del rango (mayor o menor, según corresponda).
    * @param mensaje El mensaje que solicita el número entero.
    * @param minimo Es el menor número entero admitido
    * @param maximo Es el mayor número entero admitido
    * @return el entero leido
    */

   public static int leeNº(String mensaje,int minimo, int maximo) {
        int entero;
        do {
                entero = leeNº(mensaje);
                if (entero < minimo)
                       System.err.println(
                      " EL MÍNIMO VALOR PERMITIDO ES: " + minimo);
                else if (entero > maximo)
                       System.err.println(
                      " EL MÁXIMO VALOR PERMITIDO ES: " + maximo);
        } while (entero < minimo || entero > maximo);

        return entero;
   }




}