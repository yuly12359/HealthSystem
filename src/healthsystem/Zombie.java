
package healthsystem;

public class Zombie {

    //Atributos
    private String nombre;
    private int vida = 50;
    private int danioRasguño ;
    
    //Constructor
    public Zombie(String nom, int daRasguño ){
    this.nombre = nom;
    this.danioRasguño = daRasguño;
  }
    //Metodos
    public int ataque(){
       return (danioRasguño); 
    }
    
    public void recibirDanio(int danio){
         
      this.vida = 0;
      if(danio > vida){
      System.out.println("la vida del Zombie a llegado a cero, GAME OVER.");
    }else{
        vida = vida-danio;
     }
    }
    //get y set
    public int getVida(){ return vida;}
    public void setVida(int vida){ this.vida = vida;}
    
}
