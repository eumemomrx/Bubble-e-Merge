package view;

import controller.BubbleSort;
import controller.MergeSort;

public class Principal {
		
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		MergeSort ms = new MergeSort();
		int[] vet = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		int tam = vet.length -1;
		//bs.BubbleSort(vet, tam);
		int[] vetMS = ms.MergeSort(vet, 0, tam);
		for (int i = 0; i<=tam; i++) {
			System.out.print(vetMS[i] + "a ");
		}
	}
}
