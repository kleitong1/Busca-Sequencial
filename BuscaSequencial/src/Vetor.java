
public class Vetor {

	int i = 0;
	
	
	
	public static int BuscaSequencial(int vetor[], int tamanhoVetor, int valor) {
		int i = 0;
		while ((i < tamanhoVetor) && (vetor[i] != valor)) {
			i++;
		} if ((tamanhoVetor == 0) || (i >= tamanhoVetor)) i = -1;
		
		return i;
	}
	
	
	
	
}
