import java.util.ArrayList;
import java.util.Scanner;

public class ListaMedicos {

	ArrayList <Medicos> arrayMedicos;
	static int idMedicos;
	
	public void eliminarMedicoAPartirDeCodigo(ArrayList <Medicos> arrayMedicos){
		int codigoMedico;
		String respuesta="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el codigo del Medico que quieres eliminar");
		codigoMedico =sc.nextInt();
		sc.nextLine();
		System.out.println("El medico con codigo "+codigoMedico+" va a ser eliminado. Estas seguro?");
		respuesta=sc.nextLine();
		if(respuesta.equalsIgnoreCase("si")){
			
		for (int i=0;i<arrayMedicos.size();i++){
			if(codigoMedico==arrayMedicos.get(i).getCodigo()){
				arrayMedicos.remove(i);
				System.out.println("Se ha eliminado correctamente");
			}else{
				System.out.println("El codigo de medico no existe");
			}
		}
		}else{
			System.out.println("Vale, no se elminará");
		}
	}
	public ListaMedicos(){
		arrayMedicos = new ArrayList <Medicos>();
		idMedicos=0;
	}
	
	public void anyadeMedico(){
		Medicos i=new Medicos(this.idMedicos++);
		arrayMedicos.add(i);
	}
}
