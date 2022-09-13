public class Tarea {
	private Prioridades prioridad;
	private Estados estado; 
	private String descripcion;
	private Fecha fechaVencimiento;
	
	
	public void setEstado(Estados estadoNuevo) {
		this.estado=estadoNuevo;
	}
	public void setNombre(String nuevoNombre) {
		this.descripcion=nuevoNombre;
	}
	public void setFecha(Fecha NuevaFecha) {
		this.fechaVencimiento=NuevaFecha;
	}
	public String getNombre() {
		return this.descripcion;
	}
	public String getFecha() {
		return this.fechaVencimiento.mostrarFecha();
	}
	public String getEstado() {
		return this.estado.toString();
	}
}
//en el constructor poner nombre,fecha..

//3 constructores, 1 con todo(el original), otro con solo descrip y fecha y el otro solo con la descripcion 
//set prioridad, 