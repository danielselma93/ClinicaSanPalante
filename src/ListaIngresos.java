import java.util.ArrayList;
import java.util.Scanner;

public class ListaIngresos {

	ListaPacientes lp = new ListaPacientes();
	ArrayList<Ingresos> arrayIngresos;
	static int idIngresos;

	public ListaIngresos() {
		arrayIngresos = new ArrayList<Ingresos>();
		idIngresos = 0;
	}

	public void anyadeIngreso() {
		Ingresos i = new Ingresos(this.idIngresos++);
		arrayIngresos.add(i);
	}

	public void eliminarIngresoAPartirDeCodigo(ArrayList<Ingresos> arrayIngresos) {
		String nombre;
		String apellidos;
		String respuesta = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del paciente del ingreso que quieres eliminar");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos del paciente del ingreso que quieres eliminar");
		apellidos = sc.nextLine();
		System.out.println("El ingreso del paciente  " + nombre + " "+apellidos+" va a ser eliminado. Estas seguro?");
		respuesta = sc.nextLine();
		if (respuesta.equalsIgnoreCase("si")) {

			for (int i = 0; i < lp.arrayPacientes.size(); i++) {
				
				if (nombre.equalsIgnoreCase(lp.arrayPacientes.get(i).getNombrePaciente()) && (apellidos.equalsIgnoreCase(lp.arrayPacientes.get(i).getApellidosPaciente()))) {
					arrayIngresos.remove(i);
					System.out.println("Se ha eliminado correctamente");
				} else {
					System.out.println("El nombre y/o apellidos no existen");
				}
			}
		} else {
			System.out.println("Vale, no se elminará");
		}
	}

}
