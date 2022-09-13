public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	


	public boolean comparar (Fecha actual) {
		if (this.anio<actual.anio){
			return false;
		}else if ((this.mes<actual.mes) && (this.anio==actual.anio)) {
			return false;
		}else if ((this.dia<actual.dia) &&(this.mes==actual.mes) && (this.anio==actual.anio)) {
			return false;
		}
		return true; 
	}



	public void setdia(int dia) {
		this.dia=dia;
	}



	public void setmes(int mes) {
		this.mes=mes;
		
	}

	public void setanio(int anio) {
		this.anio=anio;
		
	}



	public String mostrarFecha() {
		String s=Integer.toString(this.dia)+("/")+Integer.toString(this.mes)+("/")+Integer.toString(this.anio);
		return s;
	}
}
