import java.util.ArrayList;

public class Diccionario {
	private ArrayList<String>PalabrasValidas = new ArrayList();
	
	public void agregarPalabra(String Palabra) {
		PalabrasValidas.add(Palabra);
	}
	
	public boolean validarPalabra (String Palabra) {
		for (String p:PalabrasValidas){
			if (p==Palabra){
				return true;
			}
		}
		return false;
	}

	public String ToString() {
		String ss="";
		for (String p:PalabrasValidas){
			ss=ss+p+", ";
		}
		return ss;
	}



	
}
