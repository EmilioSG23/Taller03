/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.DIP.BuenPrincipio;

/**
 *
 * @author EmilioSG23
 */
public class Repositorio {
    public static BaseDeDatos getBase(){
        BaseDeDatos bd=(BaseDeDatos) BaseDeDatos.getMongo();
        return bd;
    }
}
