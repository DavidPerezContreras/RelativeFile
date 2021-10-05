import java.io.File;

public class Main {

	public static void main(String[] args) {
		String slash="/";
		if(System.getProperty("os.name").startsWith("Windows")) {
			slash="\\";
		}
		
		File rutaDatosRelativa= new File("."+slash+"src"+slash+"datos");
		
		if(rutaDatosRelativa.exists()) {
			System.out.println("La ruta indicada existe");
		}

	}

}
