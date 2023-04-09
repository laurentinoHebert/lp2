
import java.util.ArrayList;

public class RegistroResumos {
	int index;
	String retorno;
	String[] resumosLimite;
	String[] resumos;
	ArrayList<String> resumosExistentes = new ArrayList<String>();
	
	public RegistroResumos(int numeroDeResumos) {
		resumosLimite = new String[numeroDeResumos];
	}
	
	public void adiciona(String tema, String resumo) {
		resumosLimite[index] = tema;
		resumosLimite[index+1] = resumo;
		
		index += 2;
	}
	
	public String[] pegaResumos() {
		for (int i = 0; i < resumosLimite.length; i += 2) {
			if (resumosLimite[i] != null) {
				resumosLimite[i] = resumosLimite[i] + ": " + resumosLimite[i+1];
				resumosExistentes.add(resumosLimite[i]);
				
			}
		}
		
		resumos = toArray(resumosExistentes.size(), resumosExistentes);
		
		return resumos;
	}
	
	public String imprimeResumos() {
		retorno = "- " + conta() + " resumo(s) cadastrado(s)" + "\n" + "- ";
		
		for (int i = 0; i < resumos.length; i ++) {
			int doisPontos = resumos[i].indexOf(":");
			
			if (i == resumos.length-1) {
				retorno += resumos[i].substring(0, doisPontos);
			} else {
				retorno += resumos[i].substring(0, doisPontos) + " | ";
			}
		}

		return retorno;		
	}
		
	public int conta() {
		int cont = 0;
		
		for (int i = 0; i < resumos.length; i ++) {
				cont += 1;	
		}
		
		return cont;
	}
	
	public boolean temResumo(String tema) {
		for (int i = 0; i < resumos.length; i++) {
			int doisPontos = resumos[i].indexOf(":");
			
			if (resumos[i].substring(0, doisPontos).equals(tema)) {
				return true;
				
			}
		}
		
		return false;
	}
	
	public String[] toArray(int size, ArrayList<String> arraylist) {
		String[] arr = new String[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = arraylist.get(i);
		}
		
		return arr;
	}
}