
/**
 * Representa o cansaço ou não do aluno, em relação à quantidade de horas descansadas
 * pela quantidade de semanas de descanso.
 * 
 * @author Hebert Laurentino dos Santos - 122110606
 */
public class Descanso {
	/**
	 * Status da condiçaõ de descanso do aluno. 
	 */
	private String status;
	
	/**
	 * Quantidade de horas de descanso do aluno.
	 */
	private int horasDescanso;
	
	/**
	 * Quantidade de semanas de descanso do aluno.
	 */
	private int numeroSemanas;
	
	/**
	 * Define a quantidade de horas descansadas.
	 * 
	 * @param valor Quantidade de horas descansadas.
	 */
	public void defineHorasDescanso(int valor) {
		horasDescanso = valor;
	}
	
	/**
	 * Define a quantidade de semanas de descanso.
	 * 
	 * @param valor Quantidade de semanas de descanso.
	 */
	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor;
	}
	
	/**
	 * Retorna o status atual do aluno.
	 * 
	 * @return "descansado" se a divisão da quantidade de horas descansadas pela quantidade de
	 * semanas for maior ou igual à 26; cansado, caso contrário.
	 */
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
