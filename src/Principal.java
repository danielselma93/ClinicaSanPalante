import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	ArrayList <Medicos> arrayMedicos;
	static int idMedicos;
	ArrayList <Pacientes> arrayPacientes;
	static int idPacientes;
	ArrayList <Ingresos> arrayIngresos;
	static int idIngresos;
	
	public Principal (){
		arrayMedicos = new ArrayList <Medicos>();
		idMedicos=0;
		arrayPacientes = new ArrayList <Pacientes>();
		idPacientes=0;
		arrayIngresos = new ArrayList <Ingresos>();
		idIngresos=0;
	}
	public static void main(String[] args) {
		Principal p = new Principal();
		

	}
	public void anyadeIngreso(){
		Ingresos i=new Ingresos(this.idIngresos++);
		arrayIngresos.add(i);
	}

}
