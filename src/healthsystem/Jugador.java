
package healthsystem;

public class Jugador {
    
   //Atributos
    private String nombre;
    private int vida = 100;
    private int danioGolpe ;
    
    //Constructor
    public Jugador(String nom, int daGolpe){
    this.nombre = nom;
    this.danioGolpe = daGolpe;
  }
    //Metodos 
    public int ataque(){
       return (danioGolpe);
    }
    
    public void recibirDanio(int danio){
        
        this.vida = 0;
        if(danio > vida){
        System.out.println("la vida del jugador a llegado a cero, GAME OVER.");
    }else{
        vida = vida-danio;
     }
    }
    
    public void recibirVida(int vidaExtra){
        vida = vida + vidaExtra;
    }
     //Get y Set
    public String getnombre(){ return nombre;}
    public int getVida(){ return vida;}
    public void setVida(int vida){ this.vida = vida;}
}
        
