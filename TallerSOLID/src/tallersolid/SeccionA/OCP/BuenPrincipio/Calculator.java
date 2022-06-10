/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.OCP.BuenPrincipio;

import java.security.InvalidParameterException;
import tallersolid.SeccionA.OCP.BuenPrincipio.*;

/**
 *
 * @author EmilioSG23
 */
public class Calculator {
    public void calculate(CalculatorInterface operation){
        if(operation==null){
            throw new InvalidParameterException("No es posible realizar esta operación");
        }
        operation.operacion();
    }
}
