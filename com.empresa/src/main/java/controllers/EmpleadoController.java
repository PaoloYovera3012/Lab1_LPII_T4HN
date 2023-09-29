package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	public String createEmpleado(String apellidos, String nombres, int edad, String sexo, Double salario ) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try 
		{
		   Empleado empleado = new Empleado(apellidos,nombres,edad,sexo,salario);
		   session.beginTransaction();
		   session.save(empleado);
		   session.getTransaction().commit();
		   
		   sessionFactory.close();
		   
		   return "Empleado " + nombres + " " + apellidos + "creado correctamente";
		   
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Error al registrar Empleado";
	}
	
	
   //ELIMINAR EMPLEADO
	public String deleteEmpleado(int IdEmpleado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, IdEmpleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado eliminado correctamente";
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		return "Error al eliminar Empleado"; 	
	}
	
	
	//ACTUALIZAR EMPLEADO
	public String updateEmpleado(int IdEmpleado, String Apellidos) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, IdEmpleado);
			empleado.setApellidos(Apellidos);
			session.update(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado actualizado correctamente";
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		return "Error al actualizar Empleado"; 
		
		
	}
	
	
	
	public String getEmpleado(int IdEmpleado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, IdEmpleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return empleado.toString();
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		return "Empleado no existe"; 
		
		
	}
	
}
