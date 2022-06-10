/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.SRP.BuenPrincipio;

import tallersolid.SeccionA.SRP.BuenPrincipio.*;
import java.util.ArrayList;

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
