
import java.util.Arrays;

public class Disciplina {
	int horas;
	private double media;
	private double somaDasNotas;
	String disciplina;
	double[] notas = new double[4];
	
	
	public Disciplina(String nomeDisciplina) {
		disciplina = nomeDisciplina;
	}
	
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		notas[nota-1] = valorNota;
	}
	
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
