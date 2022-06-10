/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.ISP.MalPrincipio;

/**
 *
 * @author EmilioSG23
 */
public class AtletaNadador extends Atleta implements AtletaAccion{
    public void competir(){
        System.out.println("Compite");
    }
    public void nadar(){
        System.out.println("Nada!");
    }
    public void saltoAlto(){}
    public void saltoLargo(){}
}
