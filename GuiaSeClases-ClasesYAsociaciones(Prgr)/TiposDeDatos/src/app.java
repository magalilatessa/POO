import java.util.ArrayList;

public class app {

	public static void main(String[] args) {
		ArrayList<String>lista = new ArrayList();
		lista.add("a");
		lista.add("s");
		lista.add("b");
		lista.add("4");
		lista.add("s");
		lista.add("8");
		lista.add("s");
		String Existe="s";
		int encontrados=0;
		for (String i:lista){
			if (i.equals(Existe)) {
				encontrados++;
			}
		}
		System.out.println("Fueron encontrados: "+encontrados+" elementos iguales");
	}

}
