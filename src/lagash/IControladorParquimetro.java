
package lagash;


public interface IControladorParquimetro 
{
    
    String getPatente();
    
    
    int getMinutosEstacionados();
   
    
    int getCentavosPorHora();
    void setCentavosPorHora(int centH);
    
    
    void autoDetectado(String patente);
   
    void avanzarMinuto();
    
    void estacionamientoFinalizado();
   
}
