
package lagash;


public class ServicioExterno 
{

    public static String obtenerEmailPorPatente(String patente)
    {
        // code request api
        return "mail@correo.com";
    }
    
    
    public static void enviarEmail(String asunto, String cuerpo
            , String destinatario)
    {
        // code email
        System.out.println("Email enviado correctamente.");
    }
    
}
