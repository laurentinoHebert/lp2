
import java.util.Arrays;

/**
 * Representa uma disciplina, contendo o nome da disciplina, as notas cadastradas nessa 
 * disciplina e a quantidade de horas de estudos acumuladas.
 * 
 * @author Hebert Laurentino dos Santos - 122110606
 */
public class Disciplina {
	/**
	 * Horas de estudo dedicadas em relação à disciplina.
	 */
	private int horas;
	
	/**
	 * Média aritmética das 4 notas cadastradas.
	 */
	private double media;
	
	/**
	 * Soma das 4 notas cadastradas para cálculo da média.
	 */
	private double somaDasNotas;
	
	/**
	 * Nome da disciplina.
	 */
	private String disciplina;
	
	/**
	 * Array para armazenar as 4 notas cadastradas.
	 */
	private double[] notas = new double[4];
	
	/**
	 * Cria uma nova instância da classe Disciplina com o nome da disciplina.
	 * 
	 * @param nomeDisciplina O nome da disciplina.
	 */
	public Disciplina(String nomeDisciplina) {
		disciplina = nomeDisciplina;
	}
	
	/**
	 * Adiciona a quantidade de horas de estudo dedicados à disciplina.
	 * 
	 * @param horas Quantidade de horas de estudo.
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	
	/**
	 * Cadastra uma das notas do aluno na disciplina.
	 * 
	 * @param nota Nota a ser cadastrada.
	 * @param valorNota Valor da nota a ser cadastrada.
	 */
	public void cadastraNota(int nota, double valorNota) {
		notas[nota-1] = valorNota;
	}
	
	/**
	 * Verifica se o aluno foi aprovado ou não.
	 * 
	 * @return true se o aluno for aprovado; false, caso contrário.
	 */
	public boolean aprovado() {
		somaDasNotas = 0;
		
		for (int i = 0; i < 4; i++) {
			somaDasNotas += notas[i];
			
		}
		
		media = somaDasNotas / 4;
		
		if (media >= 7.0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String saida = disciplina + " " + horas + " " + media + " " + Arrays.toString(notas);
		return saida;
	}
}
