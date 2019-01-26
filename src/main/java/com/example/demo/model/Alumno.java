package com.example.demo.model;

public class Alumno {

	// variables
	private Integer id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String carrera;
	
	public Alumno() {
		
		
	}
	
	//Constructor
	public Alumno(Integer id, String nombre, String apellidos, int edad, String carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.carrera = carrera;
	}

	
	//getters and setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public void add(Alumno alumno) {


		
		
	}

	
	
}
