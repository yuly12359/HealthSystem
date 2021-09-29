
package healthsystem;

public class Zombie {

    //Atributos
    private String nombre;
    private int vida = 50;
    private int danioRasguño;
    
    //Metodos
    public Zombie(String nom, int daRasguño ){
    nombre = nom;
    danioRasguño = daRasguño;
  }
    public int ataque(){
       danioRasguño = 20;
       return (danioRasguño); 
    }
    
    public void recibirDaño(int danio){
        vida = vida-danio;
    }
    //get y set
    public int getVida(){ return vida;}
    public void setVida(int vida){ this.vida = vida;}
    
}
