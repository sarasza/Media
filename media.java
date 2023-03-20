package Atividade;

public class Media {
	public static void main(String[] args) {
		int vetor[] = {4, 2, 2, 6, 6};
		System.out.println("A média é: " + media(vetor, vetor.length));
	}
	
	public static int media(int vetor[], int posicao) {
		if(posicao == 0)
			return 0;
		
		else if(posicao == vetor.length)
			return (vetor[posicao - 1] + media(vetor, posicao - 1)) / vetor.length;
		
		else
			return vetor[posicao - 1] + media(vetor, posicao - 1);
	}

}
