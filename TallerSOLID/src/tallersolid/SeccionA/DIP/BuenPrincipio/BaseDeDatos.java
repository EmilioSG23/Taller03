/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.DIP.BuenPrincipio;

/**
 *
 * @author EmilioSG23
 */
public class BaseDeDatos {
    public static MongoDB getMongo(){
        return new MongoDB();
    }
    public static SQL getSQL(){
        return new SQL();
    }
}
