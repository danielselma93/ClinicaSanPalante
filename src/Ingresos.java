import java.util.Scanner;

public class Ingresos {
private int codigoIngreso;
private int numHabitacion;
private int cama;
private String fechaDeIngreso;
private String medicoQueAtendioAlPaciente;

public Ingresos (int codigoIngreso, int numHabitacion, int cama, String fechaDeIngreso, String medicoQueAtendioAlPaciente){
	this.codigoIngreso=codigoIngreso;
	this.numHabitacion=numHabitacion;
	this.cama=cama;
	this.fechaDeIngreso=fechaDeIngreso;
	this.medicoQueAtendioAlPaciente=medicoQueAtendioAlPaciente;
	
}
public Ingresos(int idIngress){
	Scanner sc = new Scanner (System.in);
	int numHabitacion;
	int cama;
	String fechaDeIngreso;
	String medicoQueAtendioAlPaciente;
	
	System.out.println("Introduce el numero de habitacion");
	numHabitacion = sc.nextInt();
	sc.nextLine();
	System.out.println("Introduce el numero de cama");
	cama = sc.nextInt();
	sc.nextLine();
	System.out.println("Introduce la fecha de ingreso (aaaa/mm/dd)");
	fechaDeIngreso = sc.nextLine();
	System.out.println("Introduce el nombre del medico que lo atendio");
	medicoQueAtendioAlPaciente = sc.nextLine();
	new Ingresos (idIngress,numHabitacion,cama,fechaDeIngreso,medicoQueAtendioAlPaciente);
}
public int getCodigoIngreso() {
	return codigoIngreso;
}
public void setCodigoIngreso(int codigoIngreso) {
	this.codigoIngreso = codigoIngreso;
}
public int getNumHabitacion() {
	return numHabitacion;
}
public void setNumHabitacion(int numHabitacion) {
	this.numHabitacion = numHabitacion;
}
public int getCama() {
	return cama;
}
public void setCama(int cama) {
	this.cama = cama;
}
public String getFechaDeIngreso() {
	return fechaDeIngreso;
}
public void setFechaDeIngreso(String fechaDeIngreso) {
	this.fechaDeIngreso = fechaDeIngreso;
}
public String getMedicoQueAtendioAlPaciente() {
	return medicoQueAtendioAlPaciente;
}
public void setMedicoQueAtendioAlPaciente(String medicoQueAtendioAlPaciente) {
	this.medicoQueAtendioAlPaciente = medicoQueAtendioAlPaciente;
}
}
