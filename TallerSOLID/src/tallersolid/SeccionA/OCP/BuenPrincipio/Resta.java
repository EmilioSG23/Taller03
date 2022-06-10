/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersolid.SeccionA.OCP.BuenPrincipio;

import tallersolid.SeccionA.OCP.BuenPrincipio.*;

/**
 *
 * @author EmilioSG23
 */
public class Resta implements CalculatorInterface{
    private double izq;
    private double der;
    private double resultado=0;
    
    public Resta(double izq,double der){
        this.izq=izq;
        this.der=der;
    }
    
    public void operacion(){
        resultado=izq-der;
    }
    
    public double getIzq() {
        return izq;
    }

    public void setIzq(double izq) {
        this.izq = izq;
    }

    public double getDer() {
        return der;
    }

    public void setDer(double der) {
        this.der = der;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    

}
