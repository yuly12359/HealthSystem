
package healthsystem;

public class Zombie {

    //Atributos
    private String nombre;
    private int vida = 50;
    private int danioRasguño ;
    
    //Constructor
    public Zombie(String nom, int daRasguño ){
    nombre = nom;
    danioRasguño = daRasguño;
  }
    //Metodos
    public int ataque(int daRasguño){
       danioRasguño = daRasguño;
       return (daRasguño); 
    }
    
    public void recibirDanio(int danio){
        vida = vida-danio;
    }
    //get y set
    public int getVida(){ return vida;}
    public void setVida(int vida){ this.vida = vida;}
    
}
