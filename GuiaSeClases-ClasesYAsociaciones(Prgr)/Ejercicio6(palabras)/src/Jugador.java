import java.util.ArrayList;

public class Jugador {
	//jugador nombre, listaArray palabrasFormadas, integer puntaje,  AgregarPalabras(palabra)
	
	private String nombre;
	private int puntaje;
	private ArrayList<Palabra>PalabrasFormadas = new ArrayList();
	
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.puntaje=0;
	}
	
	public void AgregarPalabra (Palabra palabraNew) {
		this.PalabrasFormadas.add(palabraNew);
		this.puntaje=this.puntaje+palabraNew.getPuntaje();
	}
	
	public int getPuntaje() {
		return this.puntaje;
	}
	
	public String ToString() {
		return (this.nombre+ " el puntaje es de: "+String.valueOf(this.puntaje));
	}

	public String getNombre() {
		return nombre;
	}
	
}
