import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
	//juego   diccionario, listaArray jugadores,  ingresarPalabra(palabra,jugador):boolean <---valida si esta o no en el dicc y la agrega al jugador
	//GetGanador():string;
	private Diccionario diccionario;
	private ArrayList<Jugador>jugadores = new ArrayList();
	private int turnoActual;
	
	
	public void AgregarJugadores(String nombre) {
		Jugador nuevo=new Jugador(nombre);
		jugadores.add(nuevo);
	}
	
	public boolean ValidarEmpezar() {
		if (jugadores.size()>=2){
			return true;
		}else {return false;}
	}
	
	public void ingresarPalabra (Palabra palabraNew) {
		this.diccionario.agregarPalabra(palabraNew.getNombrePalabra());
	}
	
	public boolean ingresarPalabraTurno(Palabra palabraNew) {
		if (this.diccionario.validarPalabra(palabraNew.getNombrePalabra())) {
			this.jugadores.get(this.turnoActual).AgregarPalabra(palabraNew);
			return true;
		}else {return false;}
	}
	
	public Jugador getGanador() {
		Jugador ganador;
		ganador=this.jugadores.get(0);
		for (Jugador j:jugadores){
			if (ganador.getPuntaje()<j.getPuntaje()){
				ganador=j;
			}
		}
		return ganador;
	}
	
	public String verDiccionario() {
		return this.diccionario.ToString();
	}
	
	public void cambiarTurno() {
		if (this.turnoActual == this.jugadores.size() - 1) {
			this.turnoActual = 0;
		} else {
			this.turnoActual++;
		}
	}
	
	public Jugador getTurnoActual() {
		return this.jugadores.get(this.turnoActual);
	}

	public String getPuntajes() {
		String ss="";
		for (Jugador j: jugadores){
			ss=j.getNombre()+"   "+j.getPuntaje()+'\n';
		}return ss;
		
	}
	
}
