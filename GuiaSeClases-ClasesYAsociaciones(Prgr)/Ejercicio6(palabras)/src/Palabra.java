public class Palabra {
	
	private String NombrePalabra;
	private int puntaje;
	private letrasEspeciales LetrasE;
	
	private void setPuntaje() {
		this.puntaje=0;
		for (int i=1 ; i<=this.NombrePalabra.length();i++){
			this.puntaje++;
			if (LetrasE.K.equals((this.NombrePalabra.charAt(i)))
				|| (LetrasE.Q.equals((this.NombrePalabra.charAt(i))))
				|| (LetrasE.W.equals((this.NombrePalabra.charAt(i))))	
				|| (LetrasE.X.equals((this.NombrePalabra.charAt(i))))
				|| (LetrasE.Y.equals((this.NombrePalabra.charAt(i))))
				|| (LetrasE.Z.equals((this.NombrePalabra.charAt(i))))
				) {this.puntaje++;}
		}
	}
	
	public Palabra(String nombrePalabra) {
		super();
		this.setNombrePalabra(nombrePalabra);
		this.setPuntaje();
	}

	public String getNombrePalabra() {
		return NombrePalabra;
	}

	private void setNombrePalabra(String nombrePalabra) {
		NombrePalabra = nombrePalabra;
	}

	public int getPuntaje() {
		return puntaje;
	}


	
	
	
	
	
}
