
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
