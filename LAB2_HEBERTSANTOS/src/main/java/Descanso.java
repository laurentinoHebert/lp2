
public class Descanso {
	String status;
	int horasDescanso;
	int numeroSemanas;
	
	public void defineHorasDescanso(int valor) {
		horasDescanso = valor;
	}
	
	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor;
	}
	
	public String getStatusGeral() {
		if (horasDescanso == 0) {
			return "cansado";
			
		} else if ((horasDescanso / numeroSemanas) < 26) {
			status = "cansado";
			
		} else if ((horasDescanso / numeroSemanas) >= 26) {
			status = "descansado";
		}
		
		return status;
	}
}
