public class OrdenarOCsv {
    public static void selectionSort(int[] vetor) {
		int arraycopiaselection[] = vetor.clone();
        int auxiliar =0;
        for (int i = 0; i < arraycopiaselection.length; i++) {
            int min = i;
            for (int j = i + 1; j < arraycopiaselection.length; j++) {
                if (arraycopiaselection[j] < arraycopiaselection[min]) {
                    min = j;
                }
            }
            auxiliar = arraycopiaselection[i];
            arraycopiaselection[i] = arraycopiaselection[min];
            arraycopiaselection[min] = auxiliar;
        }
        
	}

	
	//ALGORITMO INSERTION SORT
    public static void insertionSort(int[] vetor) {
		int arraycopiainsertion[] = vetor.clone();
        for (int i = 1; i < arraycopiainsertion.length; i++) {
            int pivo = arraycopiainsertion[i];
            int j = i - 1;
            while (j >= 0 && arraycopiainsertion[j] > pivo) {
                arraycopiainsertion[j + 1] = arraycopiainsertion[j];
                j = j - 1;
            }
            arraycopiainsertion[j + 1] = pivo;
        }
       
	}

	
	//ALGORITMO MERGE SORT
    public static void mergeSort(int[] vetor) {
		int arraycopiamerge[] = vetor.clone();
		int tamanhoarray = vetor.length;
        int dividirarray = tamanhoarray / 2;
        int arraydaesquerda[] = new int[dividirarray];
        int arraydadireita[] = new int[tamanhoarray - dividirarray];
        if (tamanhoarray < 2) {
            return;
        }
        for (int i = 0; i < dividirarray; i++) {
            arraydaesquerda[i] = vetor[i];
        }
        for (int j = dividirarray; j < tamanhoarray; j++) {
            arraydadireita[j - dividirarray] = vetor[j];
        }
        mergeSort(arraydaesquerda);
        mergeSort(arraydadireita);
        juntandomerge(arraycopiamerge, arraydaesquerda, arraydadireita);
        
	}
	//algoritmo juntando o merge
	public static void juntandomerge(int entrada[], int arraydaesquerda[], int arraydadireita[]) {
        int tamanhoarrayesquerda = arraydaesquerda.length;
        int tamanhoarraydireita = arraydadireita.length;
        int a = 0;
        int b = 0;
        int c = 0;
        while (a < tamanhoarrayesquerda && b < tamanhoarraydireita) {
            if (arraydaesquerda[a] <= arraydadireita[b]) {
                entrada[c] = arraydaesquerda[a];
                a = a + 1;
            } else {
                entrada[c] = arraydadireita[b];
                b = b + 1;
            }
            c = c + 1;
        }
        while (a < tamanhoarrayesquerda) {
            entrada[c] = arraydaesquerda[a];
            a = a + 1;
            c = c + 1;
        }
        while (b < tamanhoarraydireita) {
            entrada[c] = arraydadireita[b];
            b = b + 1;
            c = c + 1;
        }

    }

	//ALGORITMO QUICKSORT
    public static void quickSort(int[] vetor, int esq, int dir) {
        int arraycopiaquick[] = vetor.clone();
        if (esq < dir) {
            int p = particao(arraycopiaquick, esq, dir);
            quickSort(arraycopiaquick, esq, p);
            quickSort(arraycopiaquick, p + 1, dir);
        }
       
    }
    //Algoritmo para o quicksort
	public static int particao(int[] vector, int esq, int dir){
        int centro= (int) (esq + dir) / 2;
        int pivot = vector[centro];
        int i = esq - 1;
        int j = dir + 1;
        while(true){
            do{ i++;
            }while(vector[i] < pivot);
            do{j--;
            }while(vector[j] > pivot);
            if (i >= j){
            return j;
            }
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
        }
    }

	//ALGORITMO COUNTING SORT
    public static void countingSort(int[] vetor) {
        int arraycopiacounting[] = vetor.clone();
        int arrayLength = vetor.length;
        if (arrayLength == 0) {
            return;
        } 
        int MAX = arraycopiacounting[0], min = arraycopiacounting[0];  
        for (int i = 1; i < arrayLength; i++){
            if (arraycopiacounting[i] > MAX) {
                MAX = arraycopiacounting[i];          
            }
            if (arraycopiacounting[i] < min) {
                min = arraycopiacounting[i]; 
            }
        }
        int range = MAX - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < arrayLength; i++) {
            count[arraycopiacounting[i] - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (j < count[i]) {
                arraycopiacounting[j++] = i + min;

            }

        }
       
        
    }
}
