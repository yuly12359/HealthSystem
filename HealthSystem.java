package healthsystem;
import java.util.Scanner;
public class HealthSystem {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     Jugador Jprincipal = new Jugador("star", 10);
     Zombie zombito = new Zombie("Brain", 20);
     Botiquin botiquin = new Botiquin();
     
     System.out.println("Sistema de Salud (Healthsystem)\n");

    Jprincipal.recibirDanio(10);
    System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");

    Jprincipal.setVida(120);
    System.out.println("vida es: " + Jprincipal.getVida());
    
    zombito.ataque();
    System.out.println(">> El Jugador Principal ataca a zombito y zombito tiene "+zombito.getVida()+" de vida");

    zombito.setVida(100);
    System.out.println("vida es: " + zombito.getVida());
    }
    
   
}
