import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro>listaLibros = new ArrayList();
	private ArrayList<Libro>PrestamosRealizados  = new ArrayList();
	//buscarLibro (titulo):pos
	//buscarLibro(autor):lista
	//MostrarDescripcion(titulo,autor):string
	//prestamo
	//devolver prestamo
	//prestamos realizados

	public String MostrarDescripcion (String titulo,String autor){
		for (Libro l:listaLibros){
			if ((l.getTitulo()==titulo) && (l.getAutor()==autor)){
				return l.Descripcion();
			}
		}
		return ("No existe ese libro");
	}
	
	public String MostrarDescripcion (String titulo){
		for (Libro l:listaLibros){
			if (l.getTitulo()==titulo) {
				return l.Descripcion();
			}
		}
		return ("No existe ese libro");
	}
	
	public boolean AgregarLibro (String titulo, String autor,int NumeroPaginas, int EjemplaresTotales) {
		Libro Nuevolibro= (new Libro(titulo,autor,EjemplaresTotales,NumeroPaginas));
		listaLibros.add(Nuevolibro);
		return true;	
	}
	
	public boolean AgregarLibro (String titulo, String autor,int ISBN,int NumeroPaginas, int EjemplaresTotales) {
		Libro Nuevolibro=new Libro(titulo,autor,ISBN,EjemplaresTotales,NumeroPaginas);
		return true;
	}
	
	public boolean RealizarPrestamo(String titulo,String autor) {
		for (Libro l:listaLibros){
			if ((l.getTitulo()==titulo) &&(l.getAutor()==autor)) { 
				if (l.prestamo()) {
					PrestamosRealizados.add(l);
					return(true);}
			}
		}
		return(false);
	}
	
	public boolean RealizarPrestamo(String titulo) {
		for (Libro l:listaLibros){
			if (l.getTitulo()==titulo) { 
				if (l.prestamo()) {
					PrestamosRealizados.add(l);
					return(true);}
			}
		}
		return(false);
	}
	
	public boolean DevolverPrestamo(String titulo,String autor) {
		for (Libro l:listaLibros){
			if ((l.getTitulo()==titulo) &&(l.getAutor()==autor)) {
				return(l.devolverPrestamo());
			}
		}
		return(false);
	}
	
	public String VerLibrosPrestados() {
		String ss="";
		for (Libro l:PrestamosRealizados){
			ss=ss+ l.getTitulo()+"/n";
		}
		return (ss);
		
	}
	
}
