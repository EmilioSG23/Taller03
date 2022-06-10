/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.SRP.MalPrincipio;

import java.util.ArrayList;
import tallersolid.SeccionA.SRP.MalPrincipio.Usuario;

/**
 *
 * @author EmilioSG23
 */
public class Sistema {
    private static Sistema sistema=null;
    
    public static Sistema getSistema(){
        if(sistema==null)
            sistema=new Sistema();
        return sistema;
    }
    
    private ArrayList usuarios;
    
    public Sistema(){
        usuarios=new ArrayList<Usuario>();
    }
    public ArrayList getUsuarios(){
        return usuarios;
    }
}
