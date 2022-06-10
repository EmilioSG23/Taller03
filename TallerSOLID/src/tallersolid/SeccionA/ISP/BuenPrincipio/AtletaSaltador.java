/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.ISP.BuenPrincipio;

import tallersolid.SeccionA.ISP.BuenPrincipio.*;

/**
 *
 * @author EmilioSG23
 */
public class AtletaSaltador extends Atleta implements AtletaAccionSaltar{
    public void competir(){
        System.out.println("Compite");
    }
    public void saltoAlto(){
        System.out.println("Salta alto");
    }
    public void saltoLargo(){
        System.out.println("Salto largo");
    }
}
