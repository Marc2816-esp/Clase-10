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
public class Colaborador extends Persona{
private String puesto;
private String departamento;
private int salario;

public Colaborador(){
}

    public Colaborador(String puesto, String departamento, int salario, String nombre, int edad, char genero) {
        super(nombre, edad, genero);//atributos heredados
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null,"El nombre es: "+getNombre()+"\n La edad es: "+getEdad()+"\n El genero es: "+getGenero()+"\n El puesto es: "+puesto+"\n El departamneto es: "+departamento+"\n El salario es: "+salario);

}
}
