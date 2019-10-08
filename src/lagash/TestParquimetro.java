
package lagash;


public class TestParquimetro 
{

    public static void main(String[] args) 
    {
        
        // iniciamos el parquietro con 10 centavos por hora(parametro)
        Parquimetro parquimetro = new Parquimetro(10);
        
        
        // el sensor detecta un vehiculo estacionado con su nro de patente.
        parquimetro.autoDetectado("AA123BC");
        
        // el control de tiempo, agrega 1 minuto
        parquimetro.avanzarMinuto();
        
        // el vehiculo se retira y deja libre el estacionamiento
        // se le envie el mail con el importe correspondiente al tiempo estacionado.
        parquimetro.estacionamientoFinalizado();
        
        
        
        
        
        Parquimetro parquimetroClonado = parquimetro.clonar();
        
        parquimetroClonado.setCentavosPorHora(30);
        
        parquimetroClonado.autoDetectado("AXDXD");
        
        for (int i = 0; i < 61; i++) {
            parquimetroClonado.avanzarMinuto();
        }
        
        
        parquimetroClonado.estacionamientoFinalizado();
        
    }
    
}
