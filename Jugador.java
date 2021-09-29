
package healthsystem;

public class Jugador {
    
   //Atributos
    private String nombre;
    private int vida = 100;
    private int danioGolpe;
    
    //Metodos 
    public Jugador(String nom, int daGolpe){
    nombre = nom;
    danioGolpe = daGolpe;
  }
    public int ataque(){
       return (0);
    }
    
    public void recibirDanio(int danio){
        vida = vida - danio;
    }
    
    public void recibirVida(int vidaExtra){
        vida = vida + vidaExtra;
    }
     //Get y Set
    public String getnombre(){ return nombre;}
    public int getVida(){ return vida;}
    public void setVida(int vida){ this.vida = vida;}
}
        
