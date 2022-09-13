import java.util.ArrayList;
import java.util.Scanner;

public class app {
	private ArrayList<Tarea>listaTareas = new ArrayList();
	
	
	public static void IngresarTarea() {
		Tarea tarea= new Tarea();
		System.out.println("Ingrese el nombre de la tarea");
		Scanner  nombre= new Scanner (System.in);
		tarea.setNombre(nombre.toString());
		System.out.println("Ingrese la fecha de la tarea (DD/MM/AAAA)");
		Scanner  fecha= new Scanner (System.in);
		String[] parts = fecha.toString().split("/");
		Fecha fechaDeTarea= new Fecha();
		int i=Integer.parseInt(parts[1]);  
		fechaDeTarea.setdia(i);
		i=Integer.parseInt(parts[2]);  
		fechaDeTarea.setmes(i);
		i=Integer.parseInt(parts[3]);  
		fechaDeTarea.setanio(i);
		tarea.setNombre(nombre.toString());
		
		tarea.setEstado(Estados.INCOMPLETA); //arranca como incompleto
		listaTareas.add(tarea);
	}
	//Modificar descripcion (descripcionAnterior, descripcion)
	//buscarTarea (descripcionAnterior):pos
	
	public static void CambiarEstado() {
		
	}
	
	public static void MostrarLista () {
        System.out.println("Lista de tareas");
        for (Tarea t: listaTareas) {
            System.out.println(t.getNombre()+ ", " + 
                    t.getFecha() + ", " + 
                    t.getEstado()); 
        }
	}

	public static void main(String[] args) {

		int opcion=0;
		while (opcion!=10){
			
			System.out.println("LISTA DE TAREAS");
			System.out.println("MENÚ");
			System.out.println("1. Ingresar una nueva tarea");
			System.out.println("2. Cambiar el estado de una tarea");
			System.out.println("3. Mostrar Lista");
			System.out.println("10. Salir");
			Scanner  teclado= new Scanner (System.in);
			opcion=teclado.nextInt();
	        switch (opcion){
	        	case 1:{
	        		IngresarTarea();
	                break;}
	        	case 2:{
	        		System.out.println("Introduzca el nombre de la tarea");
	        		CambiarEstado();
	                break;}
	        	case 3:{
	        		MostrarLista() ;
	                break;}
	        }
		}
	}
	

		
}
