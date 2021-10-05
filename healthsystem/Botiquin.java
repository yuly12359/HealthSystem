
package healthsystem;

public class Botiquin {

    //Atributos
    private int montoPuntosDeVida;
    private boolean estaUsado;
    
    //constructor
    public  Botiquin (int montoVida, boolean Usado){
       montoPuntosDeVida = montoVida;
       estaUsado = Usado;
    }
     
    //metodos
    public int curarVida(int montoVida){
        montoPuntosDeVida = montoVida;
        return montoVida;  
    }
    //get
     public boolean getMontoVida(){ return (this.estaUsado);}
    
}
    
 
