package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private EmpleadoService empleadoService; 
	@Autowired
	private EstudianteService estudianteService; 
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//Instancio los empleados
	Empleado empl = new Empleado();
	empl.setCargo("Chofer");
	empl.setCedula("1727501510");
	empl.setSueldo(new BigDecimal(600));
	
	Empleado empl1 = new Empleado();
	empl1.setCargo("Vendedor");
	empl1.setCedula("1727501511");
	empl1.setSueldo(new BigDecimal(900));
	
	Empleado empl2 = new Empleado();
	empl2.setCargo("Gerente");
	empl2.setCedula("1727501512");
	empl2.setSueldo(new BigDecimal(4450));
	empl2.setApellido("Altamirano");
	
	Empleado empl3 = new Empleado();
	empl3.setCargo("Contador");
	empl3.setCedula("1727501513");
	empl3.setSueldo(new BigDecimal(2200));
	
	Empleado empl4 = new Empleado();
	empl4.setCargo("Chofer");
	empl4.setCedula("1727501514");
	empl4.setSueldo(new BigDecimal(890));
	
	Empleado empl5 = new Empleado();
	empl5.setCargo("Profesor");
	empl5.setCedula("1727501515");
	empl5.setSueldo(new BigDecimal(1400));
	empl5.setEdad("25");

	Empleado empl6 = new Empleado();
	empl6.setCargo("Profesor");
	empl6.setCedula("1727501516");
	empl6.setSueldo(new BigDecimal(1300));
	empl6.setEdad("28");
	
	Empleado empl1aux = new Empleado();
	empl1aux.setCargo("Vendedor");
	empl1aux.setEdad("33");
	
	Estudiante estu = new Estudiante();
	estu.setApellido("Altamirano");
	estu.setNombre("Jhonatan");
	
	Estudiante estu1 = new Estudiante();
	estu1.setApellido("Arias");
	estu1.setNombre("Carmen");
	
	//Creo Empleado
	this.empleadoService.crear(empl);
	this.empleadoService.crear(empl1);
	this.empleadoService.crear(empl2);
	this.empleadoService.crear(empl3);
	this.empleadoService.crear(empl4);
	this.empleadoService.crear(empl5);
	this.empleadoService.crear(empl6);
	this.estudianteService.crear(estu);
	

	//Buscar Empleado
	Empleado emp1Bus= this.empleadoService.buscar(1);
	Empleado emp2Bus= this.empleadoService.buscar(2);
	Empleado emp3Bus= this.empleadoService.buscar(3);
	Empleado emp4Bus= this.empleadoService.buscar(4);
	Empleado emp5Bus= this.empleadoService.buscar(5);

	
	//Modifico empleado
	emp1Bus.setEdad("34");
	emp1Bus.setGenero("F");
	this.empleadoService.actualizar(emp1Bus);
	
	emp2Bus.setEdad("36");
	emp2Bus.setGenero("M");
	this.empleadoService.actualizar(emp2Bus);

	emp3Bus.setEdad("28");
	emp3Bus.setGenero("M");
	this.empleadoService.actualizar(emp3Bus);

	emp4Bus.setEdad("28");
	emp4Bus.setGenero("F");
	this.empleadoService.actualizar(emp4Bus);

	emp5Bus.setEdad("26");
	emp5Bus.setGenero("M");
	this.empleadoService.actualizar(emp5Bus);

	//Busqueda por cedula
	this.empleadoService.buscarPorCedula("1727501510");
	System.out.println("Busqueda por cedula");
	System.out.println(this.empleadoService.buscarPorCedula("1727501510"));
	
		
	//Ejemplo de Query Single Result
	//Busqueda List por edad y cargo
	System.out.println("Busqueda por edad y cargo");
	System.out.println(this.empleadoService.buscarPorEdadCargo("25","Profesor"));
	
	
	//Buqueda con Lista de cargo
	//Ejemplo de Query con Result List
	List<Empleado> empleados = this.empleadoService.buscarPorCargo("Chofer");
	System.out.println("Reporte de empleados busqueda por cargo: Chofer");
	for (Empleado emple : empleados) {
		System.out.println(emple.getCedula()+" "+emple.getCargo()+" "+emple.getSueldo());
	}

	
	// Ejemplo TypedQuery con Single Result
	// Busqueda Typed por sueldo de empleado
	System.out.println("Busqueda por sueldo utilizando Typed");
	System.out.println(this.empleadoService.buscarPorSueldoTyped(new BigDecimal(600)));		
	
	
	//Ejemplo de TypedQuery con Result List
	//Busqueda por genero
	System.out.println("Reporte de Genero");
	
	List<Empleado> repEmpleados = this.empleadoService.buscarPorGeneroTyped("M");
	for (Empleado empleado : repEmpleados) {
		System.out.println("Genero: "+empleado.getGenero()+"  Cedula: "+empleado.getCedula());
	}
	
	
	System.out.println("Buscar por apellido Named");
	//System.out.println(this.empleadoService.buscarPorApellidoNamed("Altamirano"));
	
	System.out.println("Buscar por apellido Native Query");
	System.out.println(this.estudianteService.buscarPorApellidoNamed("Altamirano"));
	
	
	
	}
	

}
