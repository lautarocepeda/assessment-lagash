
package lagash;


public class TestParquimetro 
{

    public static void main(String[] args) 
    {
        
        Parquimetro parquimetro = new Parquimetro(10);
        
        
        // el sensor detecta un vehiculo estacionado con su nro de patente.
        parquimetro.autoDetectado("AA123BC");
        
        // el control de tiempo, agrega 1 minuto
        parquimetro.avanzarMinuto();
        
        // el vehiculo se retira y deja libre el estacionamiento
        // se le envie el mail con el importe correspondiente al tiempo estacionado.
        parquimetro.estacionamientoFinalizado();
        
    }
    
}
