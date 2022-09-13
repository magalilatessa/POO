public class Libro {
	private String titulo;
	private String autor;
	private int ISBN;
	private int NumeroEjemplaresActuales;
	private int NumeroPaginas;
	private int EjemplaresTotales;
	
	
	
	public Libro(String titulo, String autor, int iSBN, int numeroPaginas, int ejemplaresTotales) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		NumeroEjemplaresActuales = ejemplaresTotales;
		NumeroPaginas = numeroPaginas;
		EjemplaresTotales = ejemplaresTotales;
	}


	public Libro(String titulo, String autor, int numeroPaginas, int ejemplaresTotales) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		NumeroEjemplaresActuales =ejemplaresTotales;
		NumeroPaginas = numeroPaginas;
		EjemplaresTotales = ejemplaresTotales;
	}



	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	private void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getNumeroEjemplaresActuales() {
		return NumeroEjemplaresActuales;
	}

	private void setNumeroEjemplaresActuales(int numeroEjemplaresActuales) {
		NumeroEjemplaresActuales = numeroEjemplaresActuales;
	}

	public int getNumeroPaginas() {
		return NumeroPaginas;
	}

	private void setNumeroPaginas(int numeroPaginas) {
		NumeroPaginas = numeroPaginas;
	}

	public int getEjemplaresTotales() {
		return EjemplaresTotales;
	}

	private void setEjemplaresTotales(int ejemplaresTotales) {
		EjemplaresTotales = ejemplaresTotales;
	}

	
	public boolean prestamo () {
		if (this.NumeroEjemplaresActuales>0){
			this.NumeroEjemplaresActuales--;
			return true;
		}else return false; 
	}
	
	public boolean devolverPrestamo () {
		if (this.EjemplaresTotales==this.NumeroEjemplaresActuales) {
			return false;
		}else {
			this.NumeroEjemplaresActuales++;
			return (true);
		}
	}
	
	public String Descripcion() {
		String ss;
		ss="El libro "+this.titulo+" creado por el autor "+this.autor+" tiene "+ String.valueOf(this.NumeroPaginas)+
			" páginas, quedan "+ this.NumeroEjemplaresActuales+ " totales y se prestaron " + String.valueOf(
					Integer.valueOf(this.EjemplaresTotales) - Integer.valueOf(this.NumeroEjemplaresActuales));
		return (ss);
	}
	
}
