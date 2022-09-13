import java.util.Scanner;

public class App {
	private static Biblioteca b;
	
	public static void crearBiblioteca(){
		b=new Biblioteca();
	}
	public static void main(String[] args) {
		System.out.println("BIBLIOTECA");
		System.out.println("MENÚ");
		System.out.println("1. Ingresar un nuevo libro");
		System.out.println("2. Realizar el prestamo de un libro");
		System.out.println("3. Devolver libro prestado");
		System.out.println("4. Ver libros prestados");
		System.out.println("5. Ver informacion de un libro");
		System.out.println("10. Salir");
		Scanner  teclado= new Scanner (System.in);
		
		
		int opcion=0;
		while (opcion!=10){
		opcion=teclado.nextInt();
	        switch (opcion){
	        	case 1:{
	        		IngresarNuevoLibro();
	                break;}
	        	case 2:{
	        		System.out.println("Introduzca el nombre de la tarea");
	        		RealizarUnPrestamo();
	                break;}
	        	case 3:{
	        		Devolverlibro() ;
	                break;}
	        	case 4:{
	        		VerLibrosPrestados() ;
	                break;}
	        	case 5:{
	        		InformacionLibro() ;
	                break;}
	        }
		}
		

	}

	private static void InformacionLibro() {
		System.out.println("Ingrese el nombre del libro");
		Scanner  teclado= new Scanner (System.in);
		String titulo=teclado.next();
		
		System.out.println("Apriete '1' si sabe el autor del libro");
		teclado= new Scanner (System.in);
		String siOno=teclado.next();
		if (siOno=="1"){
			System.out.println("Ingrese el autor del libro");
			teclado= new Scanner (System.in);
			String autor=teclado.next();
			System.out.println(b.MostrarDescripcion(titulo, autor));
		}else {System.out.println(b.MostrarDescripcion(titulo));}	
	}

	private static void VerLibrosPrestados() {
		System.out.println(b.VerLibrosPrestados());
	}

	private static void Devolverlibro() {
		System.out.println("Ingrese el nombre del libro");
		Scanner  teclado= new Scanner (System.in);
		String titulo=teclado.next();
		
		System.out.println("Ingrese el autor del libro");
		teclado= new Scanner (System.in);
		String autor=teclado.next();
		b.RealizarPrestamo(titulo,autor);
	}

	private static void RealizarUnPrestamo() {
		System.out.println("Ingrese el nombre del libro");
		Scanner  teclado= new Scanner (System.in);
		String titulo=teclado.next();
		
		System.out.println("Apriete '1' si sabe el autor del libro");
		teclado= new Scanner (System.in);
		int siOno=teclado.nextInt();
		if (siOno==1){
			System.out.println("Ingrese el autor del libro");
			teclado= new Scanner (System.in);
			String autor=teclado.next();
			b.RealizarPrestamo(titulo,autor);
		}else {b.RealizarPrestamo(titulo);}
		
	}

	private static void IngresarNuevoLibro() {
		System.out.println("Ingrese el nombre del libro");
		Scanner  teclado= new Scanner (System.in);
		String titulo=teclado.next();
		
		System.out.println("Ingrese el autor del libro");
		teclado= new Scanner (System.in);
		String autor=teclado.next();

		System.out.println("Ingrese la cantidad de hojas del libro");
		teclado= new Scanner (System.in);
		int CantidadDeHojas=teclado.nextInt();
		
		System.out.println("Ingrese la cantidad de copias del libro");
		teclado= new Scanner (System.in);
		int CantidadDecopias=teclado.nextInt();
		
		System.out.println("Apriete '1' si sabe el ISBN del libro");
		teclado= new Scanner (System.in);
		String siOno=teclado.next();
		if (siOno=="1"){
			System.out.println("Ingrese el ISBN del libro");
			teclado= new Scanner (System.in);
			int ISBN=teclado.nextInt();
			b.AgregarLibro(titulo, autor,ISBN, CantidadDeHojas, CantidadDecopias);
		}else {b.AgregarLibro(titulo,autor,CantidadDeHojas,CantidadDecopias);}
		
	}

}
