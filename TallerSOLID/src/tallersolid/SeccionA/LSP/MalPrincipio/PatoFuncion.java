/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.LSP.MalPrincipio;

import java.security.InvalidParameterException;

/**
 *
 * @author EmilioSG23
 */
public class PatoFuncion {
    public void hacerVolar(Pato pato){
        try{
            pato.volar();
        }catch(InvalidParameterException ex){
            System.out.println("Pato no puede volar");
        }
    }
}
