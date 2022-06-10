/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionB.Metodos;

import tallersolid.SeccionB.Clases.Notificacion;
import tallersolid.SeccionB.Clases.Pago;

/**
 *
 * @author EmilioSG23
 */
public class NotificacionAccion {
    public void realizarNotificacion(Notificacion notificacion, Pago pago){
        notificacion.notificar(pago);
    }
}
