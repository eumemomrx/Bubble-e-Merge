package controller;

public class MergeSort {

	public MergeSort() {
		super();
	}
	public int[] MergeSort(int[] vet, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		int[]vetAux = new int[vet.length];
        if (fim==inicio) {
        	return vet;
        }
        int[] vet1 = new int[meio];
        int[] vet2 = new int[fim - meio];
        
        for (int i = 0; i < meio; i++) {
            vet1[i] = vet[i];
        }
        
        for (int i = meio; i < fim; i++) {
            vet2[i - meio] = vet[i];
        }
        
        vet1 = MergeSort(vet, inicio, meio);
        vet2 = MergeSort(vet, meio+1, fim);
    		return Merge(vet1, vet2);
    }
	public int[] Merge(int[] vet1, int[] vet2){
		int[] vetAux = new int[vet1.length+vet2.length];
		vetAux[12] = 123832;
		return vetAux;
	}
}
