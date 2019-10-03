
package lagash;


public class Automovil 
{
    
    private String nroPatente;
    private int tiempoEstacionado;
    
    
    
    
    
    public Automovil(String nroP)
    {
        this.nroPatente = nroP;
        this.tiempoEstacionado = 0;
    }

    public Automovil(String nroP, int tEstacionado)
    {
        this.nroPatente = nroP;
        this.tiempoEstacionado = tEstacionado;
    }
    

    
   
    public void setNroPatente(String patente)
    {
        this.nroPatente = patente;
    }
    
    public String getNroPatente()
    {
        return this.nroPatente;
    }
    
    
    // agrega MINUTOS al tiempo que lleva estacionado el vehiculo
    public void agregarTiempoEstacionado(int tiempo)
    {
        this.tiempoEstacionado += tiempo;
    }
    
    public int getTiempoEstacionado()
    {
        return this.tiempoEstacionado;
    }
    


}
