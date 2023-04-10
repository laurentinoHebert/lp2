
import java.util.ArrayList;

/**
 * Representa o registro de resumos de estudos de um aluno, limitando a quantidade de resumos
 * possíveis para armazenamento.
 * 
 * @author Hebert Laurentino dos Santos - 122110606
 */
public class RegistroResumos {
	/**
	 * Variável de controle.
	 */
	private int index;
	
	/**
	 * Array do limite de resumos. 
	 */
	private String[] resumosLimite;
	
	/**
	 * ArrayList composto somente por resumos existentes ( diferente de null ).
	 */
	private ArrayList<String> resumosExistentes = new ArrayList<String>();
	
	/**
	 * Inicia um registro com uma quantidade limitada de resumos.
	 * 
	 * @param numeroDeResumos Quantidade limite de resumos
	 */
	public RegistroResumos(int numeroDeResumos) {
		resumosLimite = new String[numeroDeResumos];
	}
	
	/**
	 * Adiciona o resumo ao registro.
	 * 
	 * @param tema Tema do resumo.
	 * @param resumo Resumo.
	 */
	public void adiciona(String tema, String resumo) {
		if (index > 99) {
			index = 0;
		}
		
		resumosLimite[index] = tema + ": " + resumo;
		index += 1;
	}
	
	/**
	 * Retorna um Array de Strings com os resumos cadastrados no registro.
	 * 
	 * @return Um Array de Strings com os resumos cadastrados no registro.
	 */
	public String[] pegaResumos() {
		for (int i = 0; i < resumosLimite.length; i += 1) {
			if (resumosLimite[i] != null) {
				resumosExistentes.add(resumosLimite[i]);
				
			}
		}
		
		return toArray(resumosExistentes.size(), resumosExistentes);
	}
	
	/**
	 * Retorna uma String com a quantidade de resumos existentes no registro e os seus
	 * determinados temas.
	 * 
	 * @return Uma String com a quantidade de resumos existentes no registro e os seus temas.
	 */
	public String imprimeResumos() {
		String retorno = "- " + conta() + " resumo(s) cadastrado(s)" + "\n" + "- ";
		
		for (int i = 0; i < resumosExistentes.size(); i ++) {
			int doisPontos = resumosExistentes.get(i).indexOf(":");
			
			if (i == resumosExistentes.size()-1) {
				retorno += resumosExistentes.get(i).substring(0, doisPontos);
			} else {
				retorno += resumosExistentes.get(i).substring(0, doisPontos) + " | ";
			}
		}

		return retorno;		
	}
	
	/**
	 * Conta a quantidade de resumos existentes.
	 * 
	 * @return Quantidade de resumos exixtentes.
	 */
	public int conta() {
		int cont = 0;
		
		for (int i = 0; i < resumosExistentes.size(); i ++) {
				cont += 1;	
		}
		
		return cont;
	}
	
	/**
	 * Verifica se existe um resumo no registro com o determinado tema.
	 * 
	 * @param tema Tema do resumo.
	 * @return true se existir um resumo com o determinado tema; false, caso contrário.
	 */
	public boolean temResumo(String tema) {
		for (int i = 0; i < resumosExistentes.size(); i++) {
			int doisPontos = resumosExistentes.get(i).indexOf(":");
			
			if (resumosExistentes.get(i).substring(0, doisPontos).equals(tema)) {
				return true;
				
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * Converte um ArrayList de Strings para Array de Strings.
	 * 
	 * @param size Tamanho do ArrayList.
	 * @param arraylist O ArrayList a ser convetido.
	 * @return Um Array de Strings.
	 */
	public String[] toArray(int size, ArrayList<String> arraylist) {
		String[] arr = new String[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = arraylist.get(i);
		}
		
		return arr;
	}
}