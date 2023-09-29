package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@Column(name="IdEmpleado")
	private int idEmpleado;
	
	@Column(name="Apellidos")
	private String Apellidos;
	
	@Column(name="Nombres")
	private String Nombres;
	
	@Column(name="Edad")
	private int Edad;
	
	@Column(name="Sexo")
	private String Sexo;
	
	@Column(name="Salario")
	private Double Salario;
	
	//CONSTRUCTOR
	public Empleado(String apellidos, String nombres, int edad, String sexo, Double salario) {
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}
	
	//METODOS GET Y SET
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	
	//METODO PARA IMPRIMIR INFORMACION
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Edad="
				+ Edad + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
	}
	

}