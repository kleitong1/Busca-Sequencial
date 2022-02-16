
public class Busca {

	
	public static int BuscaSequencial(int vetor[], int tamanhoVetor, int valor) {
		
		int i = 0;
		
		while ((i < tamanhoVetor) && (vetor[i] != valor)) {
			i++;
		}
		if ((tamanhoVetor == 0) || (i >= tamanhoVetor))
			i = -1;

		return i;
	}

	
	public static void main(String[] args) {

		int vetor[] = new int[5];
		int tamanhoVetor = 5;

		vetor[0] = 37;
		vetor[1] = 20;
		vetor[2] = 11;
		vetor[3] = 1;
		vetor[4] = 9;

		
		int posicaoAtual = BuscaSequencial(vetor, tamanhoVetor, 37);
		System.out.println(vetor[2]);
	}

}
