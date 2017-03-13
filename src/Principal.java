import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	ListaPacientes lp = new ListaPacientes();	
	ListaMedicos lm = new ListaMedicos();
	ListaIngresos li = new ListaIngresos();
	public Principal (){

	}
	public static void main(String[] args) {
		Principal p = new Principal();
		Pacientes p1 = new Pacientes(456,"poveda","adri","C/hola", "Torrent", "Valencia", "46900", "657366459", "9/04/1998");
		Pacientes p2 = new Pacientes(456,"martinez","hector","C/adios", "Catarroja", "Valencia", "46910", "657366465", "7/08/1925");
		p.lp.arrayPacientes.add(p1);
		p.lp.arrayPacientes.add(p2);
		
		Medicos m1 = new Medicos(678, "dani", "muñoz","123456789","jefe");
		Medicos m2 = new Medicos(568, "jose", "perez","458295738","jefe");
		p.lm.arrayMedicos.add(m1);
		p.lm.arrayMedicos.add(m2);
		
		Ingresos i1 = new Ingresos(765,6,9,"9/06/1678","toni");
		Ingresos i2 = new Ingresos(678,7,2,"7/07/1986","juan");
		p.li.arrayIngresos.add(i1);
		p.li.arrayIngresos.add(i2);
		
		int opcion;
		do{
			opcion = p.menu();
			p.ejecutaOpcion(opcion);
			
		}while (opcion!=4);
	
}
		public int menu(){
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do{
			
		
			System.out.println("--------------- MENU ---------------");
			System.out.println("--------------- 1: PACIENTES ---------------");
			System.out.println("--------------- 2: MEDICOS ---------------");
			System.out.println("--------------- 3: INGRESOS ---------------");
			System.out.println("--------------- 5: Salir ---------------");
		
			opcion = sc.nextInt();

		}while(opcion<1||opcion>4);
		return opcion;
}
	
	public void ejecutaOpcion(int opcion){
		switch(opcion){
		case 1:
			do{
				opcion = menuPacientes();
				ejecutaOpcionPacientes(opcion);
				
			}while (opcion!=4);
				break;
		case 2:
			do{
				opcion = menuMedicos();
				ejecutaOpcionMedicos(opcion);
				
			}while (opcion!=4);
				break;
			
		case 3:
			do{
				opcion = menuIngresos();
				ejecutaOpcionIngresos(opcion);
				
			}while (opcion!=4);
				break;
		case 4:
			System.out.println("Adios");
			break;
		
		}
	}
	
	public int menuPacientes(){
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do{
			
		
			System.out.println("--------------- PACIENTES ---------------");
			System.out.println("--------------- 1: Dar de alta un paciente ---------------");
			System.out.println("--------------- 2: Dar de baja un paciente ---------------");
			System.out.println("--------------- 3: Modificar paciente ---------------");
			System.out.println("--------------- 4: Salir ---------------");
		
			opcion = sc.nextInt();

		}while(opcion<1||opcion>4);
		return opcion;
}
	
	public void ejecutaOpcionPacientes(int opcion){
		switch(opcion){
		case 1:
				lp.anyadePaciente();
				break;
		case 2:
			lp.eliminarPacienteAPartirDeCodigo(lp.arrayPacientes);
			break;
		case 3:
			break;
			
			
		case 4:
			System.out.println("Adios");
			break;
		
		}
	}
	
	public int menuMedicos(){
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do{
			
		
			System.out.println("--------------- MEDICOS ---------------");
			System.out.println("--------------- 1: Dar de alta un medico ---------------");
			System.out.println("--------------- 2: Dar de baja un medico ---------------");
			System.out.println("--------------- 3: Modificar medico ---------------");
			System.out.println("--------------- 4: Salir ---------------");
		
			opcion = sc.nextInt();

		}while(opcion<1||opcion>4);
		return opcion;
}
	
	public void ejecutaOpcionMedicos(int opcion){
		switch(opcion){
		case 1:
				Medicos m=new Medicos(lm.idMedicos++);
				lm.arrayMedicos.add(m);
				break;
		case 2:
			lm.eliminarMedicoAPartirDeCodigo(lm.arrayMedicos);
			break;
		case 3:
			break;
			
			
		case 4:
			System.out.println("Adios");
			break;
		
		}
	}
	
	public int menuIngresos(){
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do{
			
		
			System.out.println("--------------- INGRESOS ---------------");
			System.out.println("--------------- 1: Dar de alta un ingreso ---------------");
			System.out.println("--------------- 2: Dar de baja un ingreso ---------------");
			System.out.println("--------------- 3: Modificar ingreso ---------------");
			System.out.println("--------------- 4: Salir ---------------");
		
			opcion = sc.nextInt();

		}while(opcion<1||opcion>4);
		return opcion;
}
	
	public void ejecutaOpcionIngresos(int opcion){
		switch(opcion){
		case 1:
				Ingresos in=new Ingresos(li.idIngresos++);
				li.arrayIngresos.add(in);
				break;
		case 2:
			li.eliminarIngresoAPartirDeCodigo(li.arrayIngresos);
			break;
		case 3:
			break;
			
			
		case 4:
			System.out.println("Adios");
			break;
		
		}
	}
	

	

}