
/**
 * Representa o registro do tempo online de uma disciplina, onde temos o nome da disciplina, o 
 * tempo online acumulado e o tempo online esperado.
 * 
 * @author Hebert Laurentino dos Santos - 122110606
 */
public class RegistroTempoOnline {
	/**
	 * Nome da disciplina referente ao registro do tempo online.
	 */
	private String nomeDisciplina;
	
	/**
	 * Quantidade de horas dedicadas pelo aluno na disciplina.
	 */
	private int horasDedicadas;
	
	/**
	 * Quantidade de horas esperadas para a disciplina.
	 */
	private int horasEsperadas;
	
	/**  
	 * Cria um registro de tempo online para uma disiciplina, com 120 horas de tempo online 
	 * esperado ( padrão determinado para disciplinas sem uma quantidade de tempo online
	 * esperada especificada ).
	 * 
	 * @param nomeDisciplina O nome da disciplina.
	 */
	public RegistroTempoOnline (String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		horasEsperadas = 120;
	}
	
	/**  
	 * Cria um registro de tempo online para uma disiciplina, com uma quantidade determinada
	 * de horas de tempo online esperado.
	 * 
	 * @param nomeDisciplina O nome da disciplina.
	 * @param tempoOnlineEsperado Quantidade de tempo online esperado.
	 */
	public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		horasEsperadas = tempoOnlineEsperado;
	}
	
	/**
	 * Adiciona uma quantidade de horas às horas dedicadas na disciplina.
	 * 
	 * @param tempo Quantidade de horas a serem adicionadas.
	 */
	public void adicionaTempoOnline(int tempo) {
		horasDedicadas += tempo;
	}

	/** 
	 * Verifica se a quantidade de horas dedicadas é menor, maior ou igual à quantidade de
	 * horas esperadas.
	 * 
	 * @return true se a quantidade de horas dedicadas for igual ou superior à quantidade de
	 * horas esperadas.
	 */
	public boolean atingiuMetaTempoOnline() {
		if (horasDedicadas >= horasEsperadas) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String saida = nomeDisciplina + " " + horasDedicadas + "/" + horasEsperadas;
		return saida;
	}
}