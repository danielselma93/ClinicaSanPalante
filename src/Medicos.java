import java.util.Scanner;

public class Medicos {
 private int codigo;
 private String nombre;
 private String apellidos;
 private String telefono;
 private String especialidad;

 public Medicos(int codigo, String nombre, String apellidos, String telefono, String especialidad) {
	this.codigo=codigo;
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.telefono=telefono;
	this.especialidad=especialidad;
}
public Medicos (int codigo){
	Scanner sc = new Scanner (System.in);
	String nombre;
	String apellidos;
	String telefono;
	String especialidad;
	
	System.out.println("Introduce el nombre del medico");
	nombre = sc.nextLine();
	System.out.println("Introduce el apellido del medico");
	apellidos = sc.nextLine();
	System.out.println("Introduce el numero de telefono");
	telefono = sc.nextLine();
	System.out.println("Introduce la especialidad del medico");
	especialidad = sc.nextLine();
	new Medicos (codigo,nombre, apellidos, telefono, especialidad);
	
}
 
 
public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
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

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
 
 
 
 
 
}
