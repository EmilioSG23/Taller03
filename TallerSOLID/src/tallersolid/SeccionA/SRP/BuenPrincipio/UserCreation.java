/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.SRP.BuenPrincipio;

/**
 *
 * @author EmilioSG23
 */
public class UserCreation {
    public void crearUsuario(String email, String password){
        int passHash=EncriptingPassword.encriptar(password); //Encripta
        Usuario user=new Usuario(email,passHash); //Crea usuario
        UserSaving.guardarUsuario(user);
    }
}
