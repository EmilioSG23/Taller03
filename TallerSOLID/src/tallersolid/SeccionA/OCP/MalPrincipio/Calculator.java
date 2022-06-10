/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.OCP.MalPrincipio;

import java.security.InvalidParameterException;

/**
 *
 * @author EmilioSG23
 */
public class Calculator {
    public void calculate(CalculatorInterface operation){
        if(operation==null){
            throw new InvalidParameterException("No es posible realizar esta operación");
        }
        if(operation instanceof Adicion){
            Adicion adicion=(Adicion) operation;
            adicion.setResultado(adicion.getIzq()+adicion.getDer());
        }else if(operation instanceof Resta){
            Resta resta=(Resta) operation;
            resta.setResultado(resta.getIzq()-resta.getDer());
        }
    }
}
