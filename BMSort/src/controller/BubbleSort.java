package controller;

public class BubbleSort {

	public BubbleSort() {
		super();
	}

	public void BubbleSort(int[] vet, int tam) {
		int i;
		int aux;
		for (i = 0; i <= tam; i++) {
			for (int j = 0; j <= tam-1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		for (i = 0; i <= tam; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
