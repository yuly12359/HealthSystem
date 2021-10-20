
package healthsystem;

public class Botiquin {

    //Atributos
    private int montoPuntosDeVida;
    private boolean estaUsado;
    
    //constructor
    public  Botiquin (int montoVida, boolean Usado){
      this. montoPuntosDeVida = montoVida;
      this.estaUsado = Usado;
    }
     
    //metodos
    public int curarVida(){
        return (montoPuntosDeVida);  
    }
    //get
     public boolean getMontoVida(){ return (this.estaUsado);}
    
}
    
 
