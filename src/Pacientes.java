
public class Pacientes {
private int codigoPaciente;
private String nombrePaciente;
private String apellidosPaciente;
private String direccionPaciente;
private String poblacionPaciente;
private String provinciaPaciente;
private String codigoPostalPaciente;
private String telefonoPaciente;
private String fechaDeNacimientoPaciente;

public Pacientes (int codigoPaciente, String nombrePaciente, String direccionPaciente, String poblacionPaciente, String provinciaPaciente, 
		String codigoPostalPaciente,  String telefonoPaciente, String fechaDeNacimientoPaciente){
	this.codigoPaciente=codigoPaciente;
	this.nombrePaciente=nombrePaciente;
	this.apellidosPaciente=apellidosPaciente;
	this.direccionPaciente=direccionPaciente;
	this.poblacionPaciente=poblacionPaciente;
	this.provinciaPaciente=provinciaPaciente;
	this.codigoPostalPaciente=codigoPostalPaciente;
	this.telefonoPaciente=telefonoPaciente;
	this.fechaDeNacimientoPaciente=fechaDeNacimientoPaciente;
}

public int getCodigoPaciente() {
	return codigoPaciente;
}
public void setCodigoPaciente(int codigoPaciente) {
	this.codigoPaciente = codigoPaciente;
}
public String getNombrePaciente() {
	return nombrePaciente;
}
public void setNombrePaciente(String nombrePaciente) {
	this.nombrePaciente = nombrePaciente;
}
public String getApellidosPaciente() {
	return apellidosPaciente;
}
public void setApellidosPaciente(String apellidosPaciente) {
	this.apellidosPaciente = apellidosPaciente;
}
public String getDireccionPaciente() {
	return direccionPaciente;
}
public void setDireccionPaciente(String direccionPaciente) {
	this.direccionPaciente = direccionPaciente;
}
public String getPoblacionPaciente() {
	return poblacionPaciente;
}
public void setPoblacionPaciente(String poblacionPaciente) {
	this.poblacionPaciente = poblacionPaciente;
}
public String getProvinciaPaciente() {
	return provinciaPaciente;
}
public void setProvinciaPaciente(String provinciaPaciente) {
	this.provinciaPaciente = provinciaPaciente;
}
public String getCodigoPostalPaciente() {
	return codigoPostalPaciente;
}
public void setCodigoPostalPaciente(String codigoPostalPaciente) {
	this.codigoPostalPaciente = codigoPostalPaciente;
}
public String getTelefonoPaciente() {
	return telefonoPaciente;
}
public void setTelefonoPaciente(String telefonoPaciente) {
	this.telefonoPaciente = telefonoPaciente;
}
public String getFechaDeNacimientoPaciente() {
	return fechaDeNacimientoPaciente;
}
public void setFechaDeNacimientoPaciente(String fechaDeNacimientoPaciente) {
	this.fechaDeNacimientoPaciente = fechaDeNacimientoPaciente;
}
}
