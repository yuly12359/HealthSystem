package healthsystem;
import java.util.Scanner;
public class HealthSystem {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     Jugador Jprincipal = new Jugador("star", 15);
     Zombie zombito = new Zombie("Brain", 500);
     Botiquin boti = new Botiquin(15,false);
      
   
     System.out.println("Sistema de Salud (Healthsystem)\n");

     Jprincipal.recibirDanio(zombito.ataque());
     System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");

     zombito.recibirDanio(Jprincipal.ataque());
     System.out.println(">> El Jugador Principal ataca a zombito y zombito tiene "+zombito.getVida()+" de vida");
   
     Jprincipal.recibirDanio(zombito.ataque());
     System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");
      
     Jprincipal.recibirDanio(zombito.ataque());
     System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");
      
     Jprincipal.recibirDanio(zombito.ataque());
     System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");
      
      Jprincipal.recibirVida(boti.curarVida());
     System.out.println(">>El Jugador principal recupera vida.La vida del Jugador principal es "+Jprincipal.getVida()+" de vida");
     
   
   
   }
}
