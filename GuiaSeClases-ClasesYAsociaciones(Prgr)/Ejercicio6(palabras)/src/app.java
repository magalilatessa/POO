import java.util.Scanner;

public class app {
	private static Juego juegoPalabras;
	
	public static void main(String[] args) {
		juegoPalabras=new Juego();
		Menu();
	}
	
	private  static void Menu() {
		System.out.println("JUEGO DE PALABRAS");
		System.out.println("MENÚ");
		System.out.println("------------------------------------");
		System.out.println("1. Ingresar un nuevo jugador");
		System.out.println("2. Ingresar una nueva palabra al diccionario");
		System.out.println("3. Mostrar diccionario");
		System.out.println("4. Empezar juego");
		System.out.println("10. Salir");
		Scanner  teclado= new Scanner (System.in);
		int opcion=teclado.nextInt();
		
        switch (opcion){
        	case 1:{
        		IngresarJugador();
                break;}
        	case 2:{
        		IngresarNuevaPalabra();
                break;}
        	case 3:{
        		MostrarDiccionario();
                break;}
        	case 4:{
        		Empezar();
                break;}
        	
        }
	}

	private  static void MenuEmpezar() {
		System.out.println("1. Jugar");
		System.out.println("2. Mostrar puntajes");
		System.out.println("3. Terminar juego");
		System.out.println("10. Salir");
		Scanner  teclado= new Scanner (System.in);
		int opcion=teclado.nextInt();
		
        switch (opcion){
        	case 1:{
        		Empezar();
                break;}
        	case 2:{
        		MostrarPuntajes();
                break;}
        	case 3:{
        		Terminar();
                break;}
        	case 4:{
        		Empezar();
                break;}
        	
        }
	}
	private  static void Terminar() {
		System.out.println("Usted desea terminar el juego? (s/n)");
		Scanner teclado= new Scanner (System.in);	
		String opcion=teclado.next();
		if (opcion =="s"){
			System.out.println("El ganador es: "+juegoPalabras.getGanador());
		}
	}

	private  static void MostrarPuntajes() {
		int opcion=1;
		while (opcion==1){
			System.out.println("TABLA DE PUNTAJE");
			System.out.println(juegoPalabras.getPuntajes());
			System.out.println("--------------------------------");
			System.out.println("Apriete cualquier tecla para volver al menú");
			Scanner teclado= new Scanner (System.in);
			opcion=teclado.nextInt();		
		}MenuEmpezar();
		
	}

	private  static void Empezar() {
		juegoPalabras.ValidarEmpezar();
		Jugador JugadorActual;
		int opcion=1;
		while (opcion==1){
			JugadorActual=juegoPalabras.getTurnoActual();
			System.out.println("Es el turno de "+JugadorActual.getNombre());
			System.out.println("Ingrese la palabra");
			Scanner  teclado= new Scanner (System.in);
			Palabra palabra=new Palabra(teclado.next());
			if (juegoPalabras.ingresarPalabraTurno(palabra)) {
				System.out.println("La palabra fue agregada con exito, sumaste "+ palabra.getPuntaje()+ " puntos");
			}else {
				System.out.println("PALABRA INVALIDA");
				System.out.println("Pierde el turno");}
			juegoPalabras.cambiarTurno();
			System.out.println("Apriete cualquier tecla para volver al menú");
			teclado= new Scanner (System.in);
			opcion=teclado.nextInt();		
		}MenuEmpezar();
		
	}

	private  static void MostrarDiccionario() {
		System.out.println(juegoPalabras.verDiccionario());
		System.out.println("10. Volver al menu principal");
		Scanner  teclado= new Scanner (System.in);
		int opcion=teclado.nextInt();
		if (opcion ==10){Menu();}
	}

	private static void IngresarNuevaPalabra() {
		int opcion=1;
		
		while (opcion==1){
			System.out.println("Ingrese la palabra");
			Scanner  teclado= new Scanner (System.in);
			Palabra palabra=new Palabra(teclado.next());
			juegoPalabras.ingresarPalabra(palabra);
			System.out.println("La palabra fue agregada al diccionario");
			System.out.println("Ingrese 1 si quiere agregar otra");		
			System.out.println("Apriete cualquier otra tecla para volver al menú principal");
			teclado= new Scanner (System.in);
			opcion=teclado.nextInt();
		}
		Menu();
	}

	private  static void IngresarJugador() {
		int opcion=1;
		while (opcion==1){
			System.out.println("Ingrese el nombre del jugador");
			Scanner  teclado= new Scanner (System.in);
			juegoPalabras.AgregarJugadores(teclado.next());
			System.out.println("La jugador fue agregado con exito");
			System.out.println("Ingrese 1 si quiere agregar otro");		
			System.out.println("Apriete cualquier otra tecla para volver al menú principal");
			teclado= new Scanner (System.in);
			opcion=teclado.nextInt();
		}
		Menu();
	}

}
