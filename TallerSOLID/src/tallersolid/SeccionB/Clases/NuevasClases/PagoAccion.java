/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionB.Clases.NuevasClases;

import tallersolid.SeccionB.Clases.Pago;

/**
 *
 * @author EmilioSG23
 */
public class PagoAccion {
    public void realizarPago(Pago pago, double monto){
        pago.realizarCobro(monto);
        FacturaAccion.generarFactura(pago); //se inserta
    }
}
