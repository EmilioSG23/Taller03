/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.SRP.MalPrincipio;

import java.util.ArrayList;
import tallersolid.SeccionA.SRP.MalPrincipio.*;

/**
 *
 * @author EmilioSG23
 */
public class UserRegister {
    public void crearUsuario(String email, String password){
        int passHash=password.hashCode(); //Encripta
        Usuario user=new Usuario(email,passHash); //Crea usuario
        guardarUsuario(user);
    }
    public static void guardarUsuario(Usuario user){
        ArrayList usuarios=Sistema.getSistema().getUsuarios();
        usuarios.add(user);
    }
}
