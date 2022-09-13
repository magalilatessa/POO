public enum FormatosDeFecha {
	DD_MM_YYYY ("dd-MM-yyyy"),
	MM_DD_YYYY ("MM-dd-yyyy");

	private final String formato;
	
	private FormatosDeFecha(String string) {
		this.formato=string;
	} 
	
	public String getMascara() {
		return this.formato;
	}
}
