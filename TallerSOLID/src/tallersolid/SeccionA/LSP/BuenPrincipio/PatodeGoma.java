/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.LSP.BuenPrincipio;

import tallersolid.SeccionA.LSP.BuenPrincipio.*;
import java.security.InvalidParameterException;

/**
 *
 * @author EmilioSG23
 */
public class PatodeGoma extends Pato implements Nadador, Sonido{
    public void nadar(){
        System.out.println("Nada!");
    }
    public void sonido(){
        System.out.println("cuack");
    }
}
