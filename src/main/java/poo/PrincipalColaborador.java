/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PrincipalColaborador {

    public static void main(String[] args) {
        Colaborador datos = new Colaborador();
        datos.setNombre(JOptionPane.showInputDialog("Digite nombre del colaborador: "));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del colaborador: ")));
        datos.setGenero(JOptionPane.showInputDialog("Digite el genero del colaborador: ").charAt(0));
        datos.setPuesto(JOptionPane.showInputDialog("Digite el puesto del colaborador: "));
        datos.setDepartamento(JOptionPane.showInputDialog("Digite el departamento del colaborador: "));
        datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite el departamento del colaborador: ")));
        datos.MostrarDatos();
    }

}
