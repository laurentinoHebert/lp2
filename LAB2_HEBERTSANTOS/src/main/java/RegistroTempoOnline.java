
public class RegistroTempoOnline {
	/** disciplina recebe o nomeDisciplina.
	 * horasDedicadas é a quantidade de horas adicionada pelo usuário.
	 * horasEsperadas é a quantidade de horas determinada pelo main( se
	 * o usuário não determinar a quantidade ) ou pelo usuário.*/
	String disciplina;
	int horasDedicadas;
	int horasEsperadas;
	
	/** Define disciplina para nomeDisciplina e horasEsperadas para 120.*/
	public RegistroTempoOnline (String nomeDisciplina) {
		disciplina = nomeDisciplina;
		horasEsperadas = 120;
	}
	
	/** Define disciplina para nomeDisciplina e horasEsperadas para tempoOnlineEsperado.*/
	public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
		disciplina = nomeDisciplina;
		horasEsperadas = tempoOnlineEsperado;
	}
	
	/** Adiciona o valor de tempo em horasDedicadas.*/
	public void adicionaTempoOnline(int tempo) {
		horasDedicadas += tempo;
	}

	/** Verifica se horasDedicadas é menor, maior ou igual a horasEsperadas.*/
	public boolean atingiuMetaTempoOnline() {
		if (horasDedicadas >= horasEsperadas) {
			return true;
		} else {
			return false;
		}
	}
	
	/** Converte os atributos para uma String modificada, de acordo com o que foi solicitado.*/
	public String toString() {
		String saida = disciplina + " " + horasDedicadas + "/" + horasEsperadas;
		return saida;
	}
}