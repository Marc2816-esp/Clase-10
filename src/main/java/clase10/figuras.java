/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase10;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class figuras {
    public void cuadrado(){
    int lado,area;
    lado= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado: "));
    area=lado*lado;
    JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area);
}
public void triangulo(){
    double base,altura,area;
    altura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo: "));
    base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo: "));
    area=altura*base/2;
    JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);

}
public void circulo(){
    double  radio,pi=3.14,area;
    radio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
    area=pi*Math.pow(radio, 2);
    JOptionPane.showMessageDialog(null,"El area del circulo es: "+area);

}
}
