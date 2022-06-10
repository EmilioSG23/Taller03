/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionB.Clases;

import tallersolid.SeccionB.Metodos.ActivateAcount;

/**
 *
 * @author EmilioSG23
 */
public class PagoPayPal extends Pago implements ActivateAcount{
    private boolean loggedIn; //conexión a cuenta PayPal
    
    public void realizarCobro(double monto){
        if(!loggedIn){
            LogIn();
        }
        //cargar el monto de compra al medio de pago
    }
}
