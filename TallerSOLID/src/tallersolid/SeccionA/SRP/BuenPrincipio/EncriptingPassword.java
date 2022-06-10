/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.SRP.BuenPrincipio;

/**
 *
 * @author EmilioSG23
 */
public class EncriptingPassword {
    public static int encriptar(String password){
        return password.hashCode();
    }
}
