
package lagash;


public class Parquimetro implements IControladorParquimetro
{
    
    private Automovil autoEstacionado;
    private int centavosPorHora;
    private boolean ocupado = false;
    
    
    
    
    public Parquimetro()
    {
        // constructor vacio
    }
    
    public Parquimetro(int centavosPorHora)
    {
        this.centavosPorHora = centavosPorHora;
    }
    
    
    
    // verifica si el parquimetro esta ocupado o no
    public boolean isBusy()
    {
        return this.ocupado;
    }
    
    

    @Override
    public String getPatente() 
    {
        if ( !this.isBusy() ) return null;
        
        return this.autoEstacionado.getNroPatente();
    }

    
    
    @Override
    public int getMinutosEstacionados() 
    {
        if ( !this.isBusy() ) return 0;
        
        return this.autoEstacionado.getTiempoEstacionado();
    }

    
  
    @Override
    public int getCentavosPorHora() 
    {
        return this.centavosPorHora;
    }

    @Override
    public void setCentavosPorHora(int centH) 
    {
        this.centavosPorHora = centH;
    }
    
    
    
    @Override
    public void autoDetectado(String patente) 
    {
        this.ocupado = true;
        this.autoEstacionado = new Automovil(patente);
        
    }

    
    
    @Override
    public void avanzarMinuto() 
    {
        this.autoEstacionado.agregarTiempoEstacionado(1);
    }
    
    
    
    @Override
    public void estacionamientoFinalizado() 
    {         
        
        /* 
        ** importe que debe pagar el duenyo del vehiculo.
        ** Al pagar por hora completa, redondeo para arriba el tiempo estacionado
        ** con Math.ceil
        */
        double importe = ( Math.ceil(
                            this.autoEstacionado.getTiempoEstacionado() / 60.1
                        ) ) * this.centavosPorHora;
        
        
        // envio email para notificar el importe
        ServicioExterno.enviarEmail("Parquimetro - Importe"
                , "Importe a pagar => $" + importe
                , ServicioExterno.obtenerEmailPorPatente(this.getPatente()));
        
        
        // suponiendo que el email se envio corretamente, limpio el obj
        this.autoEstacionado = null;
        this.ocupado = false;

    }

}
