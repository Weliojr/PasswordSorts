import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.Writer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


import java.security.cert.CertPath;
import java.util.Arrays;
import java.util.StringTokenizer;
public class LerCsv {
    
    public static void main(String[] args) throws IOException{
        int[] indice = new int [669880];
        String senha[] = new String [669880];
        int tamanhosenha[] = new int[669880];
        long tempoinicial;
        long tempofinal;
        long tempodecsv;
        String data[] = new String[669880];
        String arquivocsv = "passwords.csv";
        String path = "teste.csv";
        String insertionmedio = "passwords_length_insertionSort_medioCaso.csv";
        String insertionpior = "passwords_length_insertionSort_piorCaso.csv";
        String insertionmelhor = "passwords_length_insertionSort_melhorCaso.csv";
        String selectionmedio = "passwords_length_selectionSort_medioCaso.csv";
        String selectionpior = "passwords_length_selectionSort_piorCaso.csv";
        String selectionmelhor = "passwords_length_selectionSort_melhorCaso.csv";
        String mergemedio = "passwords_length_mergeSort_medioCaso.csv";
        String mergepior = "passwords_length_mergeSort_piorCaso.csv";
        String mergemelhor = "passwords_length_mergeSort_melhorCaso.csv";
        String quickmedio = "passwords_length_quickSort_medioCaso.csv";
        String quickpior = "passwords_length_quickSort_piorCaso.csv";
        String quickmelhor = "passwords_length_quickSort_melhorCaso.csv";
        String quick3medio = "passwords_length_quick3Sort_medioCaso.csv";
        String quick3pior = "passwords_length_quick3Sort_piorCaso.csv";
        String quick3melhor = "passwords_length_quick3Sort_melhorCaso.csv";
        String heapmedio = "passwords_length_heapSort_medioCaso.csv";
        String heappior = "passwords_length_heapSort_piorCaso.csv";
        String heapmelhor = "passwords_length_heapSort_melhorCaso.csv";
        String coutingmedio = "passwords_length_coutingSort_medioCaso.csv";
        String coutingpior = "passwords_length_coutingSort_piorCaso.csv";
        String coutingmelhor = "passwords_length_coutingSort_melhorCaso.csv";
        String[][] superarray = new String[669880][4];
        String[][] superarray2 = new String[669880][4];
        BufferedReader conteudocsv= null;
        int contador=0;
        String linha = "";
        String separador = ",";

        try{
            conteudocsv = new BufferedReader(new FileReader(arquivocsv));
            
            while ((linha = conteudocsv.readLine()) != null) {
                String[] dadossenhas = linha.split(separador);
                for(int i=0;i<4;i++){
                    superarray[contador][i]=dadossenhas[i];
                }
                contador++;

                
                
            }
            
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado: \n" + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice não encontrado: \n" + e.getMessage());
        }catch( IOException e){
            System.out.println("IO Erro: \n" + e.getMessage());
        }finally {
            if(conteudocsv != null){
                try{
                    conteudocsv.close();
                    
                }catch(IOException e){
                    System.out.println("IO Erro: \n" + e.getMessage());
                }
            }
            
        }
       int contador2 =0;
      
        while(superarray[contador2][0] != null){
            indice[contador2] = Integer.parseInt(superarray[contador2][0]);
            if(indice[contador2]==527){
                senha[contador2] = "2,863E+019";
                tamanhosenha[contador2] = 10;
                data[contador2] = "2017-05-24 14:10:01";
            }else if(indice[contador2]==98830){
                senha[contador2] = "1,13E+033";
                tamanhosenha[contador2] = 9;
                data[contador2] = "2016-03-09 15:06:06";
            }else if(indice[contador2]==140885){
                senha[contador2] = "0";
                tamanhosenha[contador2] = 1;
                data[contador2] = "2015-02-04 13:43:40";
            }else if(indice[contador2]==217372){
                senha[contador2] = "9,1952205E+079";
                tamanhosenha[contador2] = 14;
                data[contador2] = "2017-06-10 01:53:27";
            }else if(indice[contador2]==218820){
                senha[contador2] = "1,2449E+091";
                tamanhosenha[contador2] = 11;
                data[contador2] = "2017-08-09 06:37:45";
            }else if(indice[contador2]==224345){
                senha[contador2] = "0";
                tamanhosenha[contador2] = 1;
                data[contador2] = "2015-12-01 08:45:39";
            }else if(indice[contador2]==283350){
                senha[contador2] = "1,2818E+063";
                tamanhosenha[contador2] = 11;
                data[contador2] = "2017-03-03 04:11:46";
            }else if(indice[contador2]==337013){
                senha[contador2] = "4,44E+068";
                tamanhosenha[contador2] = 9;
                data[contador2] = "2015-11-12 20:55:05";
            }else if(indice[contador2]==367718){
                senha[contador2] = "0";
                tamanhosenha[contador2] = 1;
                data[contador2] = "2015-07-08 21:20:56";
            }else if(indice[contador2]==397531){
                senha[contador2] = "7,8211E+026";
                tamanhosenha[contador2] = 11;
                data[contador2] = "2016-04-26 03:56:15";
            }else if(indice[contador2]==401891){
                senha[contador2] = "9,1532E+026";
                tamanhosenha[contador2] = 11;
                data[contador2] = "2015-07-06 20:42:28";
            }else if(indice[contador2]==514123){
                senha[contador2] = "3,87861E+037";
                tamanhosenha[contador2] = 12;
                data[contador2] = "2017-08-25 20:22:34";
            }else if(indice[contador2]==539916){
                senha[contador2] = "1,1E+226";
                tamanhosenha[contador2] = 8;
                data[contador2] = "2015-12-03 00:47:06";
            }else if(indice[contador2]==587311){
                senha[contador2] = "7,90531E+101";
                tamanhosenha[contador2] = 12;
                data[contador2] = "2017-12-31 04:52:52";
            }else if(indice[contador2]==622591){
                senha[contador2] = "1,9201E+127";
                tamanhosenha[contador2] = 11;
                data[contador2] = "2016-04-12 18:43:23";
            }else if(indice[contador2]==637382){
                senha[contador2] = "1,1E+114";
                tamanhosenha[contador2] = 8;
                data[contador2] = "2016-05-09 18:11:19";
            }else{
                senha[contador2] = superarray[contador2][1];
                tamanhosenha[contador2] = Integer.parseInt(superarray[contador2][2]);
                data[contador2] = superarray[contador2][3];

            }
            contador2++;
        }
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice,senha,tamanhosenha,data);// okay
        criararray(indice, senha, tamanhosenha, data, mergemedio);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (merge -medio caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        mergeSort(indice,senha,tamanhosenha,data);
        criararray(indice, senha, tamanhosenha, data, mergepior);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (merge -pior caso):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice,senha,tamanhosenha,data);
        criararray(indice, senha, tamanhosenha, data, mergemelhor);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (merge -melhor caso):" + tempofinal );
        

         tempoinicial = System.currentTimeMillis();
        quickmediana3(indice,senha,tamanhosenha, 0, (tamanhosenha.length-1),data);//okay
        criararray(indice, senha, tamanhosenha, data, quick3medio);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (quick3 -medio caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        quickmediana3(indice, senha, tamanhosenha, 0, (tamanhosenha.length-1), data);
        criararray(indice, senha, tamanhosenha, data, quick3pior);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (quick3 -pior caso):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        quickmediana3(indice, senha, tamanhosenha, 0, (tamanhosenha.length-1), data);
         criararray(indice, senha, tamanhosenha, data, quick3melhor);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (quick3 -melhor caso):" + tempofinal );


         tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        countingSort(indice,senha, tamanhosenha,data);//okay
        criararray(indice, senha, tamanhosenha, data, coutingmedio);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (counting -medio caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        mergeSortinvert(indice, senha, tamanhosenha, data);
        countingSort(indice,senha, tamanhosenha,data);
        criararray(indice, senha, tamanhosenha, data, coutingpior);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (counting -pior caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        countingSort(indice,senha, tamanhosenha,data);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        criararray(indice, senha, tamanhosenha, data, coutingmelhor);
        System.out.println("Tempo  da ordenação (counting -melhor caso):" + tempofinal );
        
        
        
    tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        insertionSort(indice,senha ,tamanhosenha,data);// okAY
        criararray(indice, senha, tamanhosenha, data, insertionmedio);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (insertion -medio caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        mergeSort(indice, senha, tamanhosenha, data);
        insertionSort(indice,senha ,tamanhosenha,data);// okAY
        criararray(indice, senha, tamanhosenha, data, insertionpior);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (insertion -pior caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        insertionSort(indice,senha ,tamanhosenha,data);// okAY
        criararray(indice, senha, tamanhosenha, data, insertionmelhor);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (insertion -melhor caso e ja com o csv feito):" + tempofinal );
    

       /* tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        insertionSort(indice,senha ,tamanhosenha,data);// okAY
        criararray(indice, senha, tamanhosenha, data, insertionmedio);
        tempofinal = System.currentTimeMillis()-tempoinicial;
       // System.out.println("Tempo  da ordenação (insertion -medio caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        mergeSort(indice, senha, tamanhosenha, data);
        insertionSort(indice,senha ,tamanhosenha,data);// okAY
        criararray(indice, senha, tamanhosenha, data, insertionpior);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        //System.out.println("Tempo  da ordenação (insertion -pior caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        insertionSort(indice,senha ,tamanhosenha,data);// okAY
        criararray(indice, senha, tamanhosenha, data, insertionmelhor);
        tempofinal = System.currentTimeMillis()-tempoinicial;
       // System.out.println("Tempo  da ordenação (insertion -melhor caso e ja com o csv feito):" + tempofinal );
    */


       // System.out.println(tamanhosenha);
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        selectionSort(indice,senha,tamanhosenha, data);//okay
        criararray(indice, senha, tamanhosenha, data, selectionmedio);
        tempofinal = System.currentTimeMillis() - tempoinicial;
        System.out.println("Tempo  da ordenação (selection -medio caso e ja com o csv feito): "+ tempofinal);
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        mergeSort(indice, senha, tamanhosenha, data);
        selectionSort(indice,senha,tamanhosenha, data);//okay
        criararray(indice, senha, tamanhosenha, data, selectionpior);
        tempofinal = System.currentTimeMillis() - tempoinicial;
        System.out.println("Tempo  da ordenação (selection -pior caso e ja com o csv feito): "+ tempofinal);
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        selectionSort(indice,senha,tamanhosenha, data);//okay
        criararray(indice, senha, tamanhosenha, data, selectionmelhor);
        tempofinal = System.currentTimeMillis() - tempoinicial;
        System.out.println("Tempo  da ordenação (selection -merlhor caso e ja com o csv feito): "+ tempofinal);


        /*tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        selectionSort(indice,senha,tamanhosenha, data);//okay
        criararray(indice, senha, tamanhosenha, data, selectionmedio);
        tempofinal = System.currentTimeMillis() - tempoinicial;
        //System.out.println("Tempo  da ordenação (selection -medio caso e ja com o csv feito): "+ tempofinal);
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        mergeSort(indice, senha, tamanhosenha, data);
        selectionSort(indice,senha,tamanhosenha, data);//okay
        criararray(indice, senha, tamanhosenha, data, selectionpior);
        tempofinal = System.currentTimeMillis() - tempoinicial;
       // System.out.println("Tempo  da ordenação (selection -pior caso e ja com o csv feito): "+ tempofinal);
        tempoinicial = System.currentTimeMillis();
        mergeSort(indice, senha, tamanhosenha, data);
        selectionSort(indice,senha,tamanhosenha, data);//okay
        criararray(indice, senha, tamanhosenha, data, selectionmelhor);
        tempofinal = System.currentTimeMillis() - tempoinicial;
       // System.out.println("Tempo  da ordenação (selection -merlhor caso e ja com o csv feito): "+ tempofinal);*/
      
      
      
        tempoinicial = System.currentTimeMillis();
        quickSort(indice,senha,tamanhosenha, 0, (tamanhosenha.length-1),data);//okay
        criararray(indice, senha, tamanhosenha, data, quickmedio);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (quick -medio caso e ja com o csv feito):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        mergeSortinvert(indice, senha, tamanhosenha, data);
        quickSort(indice, senha, tamanhosenha, 0, (tamanhosenha.length-1), data);
        criararray(indice, senha, tamanhosenha, data, quickpior);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (quick -pior caso):" + tempofinal );
        tempoinicial = System.currentTimeMillis();
        quickSort(indice, senha, tamanhosenha, 0, (tamanhosenha.length-1), data);
        criararray(indice, senha, tamanhosenha, data, quickmelhor);
        tempofinal = System.currentTimeMillis()-tempoinicial;
        System.out.println("Tempo  da ordenação (quick -melhor caso):" + tempofinal );
        
        //contador2=0;
       //while(indice[contador2]!=669878){
      //   System.out.println(senha[contador2]);
       //     contador2++;
      //  }
      
    tempoinicial = System.currentTimeMillis();
    mergeSortinvert(indice, senha, tamanhosenha, data);
    for(int i = tamanhosenha.length / 2 - 1; i >= 0; i--){
        Heap(indice,senha,tamanhosenha, tamanhosenha.length, i, data);//okay
        
    }
    for(int j = tamanhosenha.length-1; j > 0; j--){
        int aux = tamanhosenha[0];
        tamanhosenha[0] = tamanhosenha[j];
        tamanhosenha[j] = aux;
        
        Heap(indice,senha,tamanhosenha, j, 0, data);
    } 
    criararray(indice, senha, tamanhosenha, data, heapmedio);
    tempofinal = System.currentTimeMillis()-tempoinicial;
    System.out.println("Tempo  da ordenação (Heap -medio caso e ja com o csv feito):" + tempofinal );
    tempoinicial = System.currentTimeMillis();  
    mergeSort(indice, senha, tamanhosenha, data);
    mergeSortinvert(indice, senha, tamanhosenha, data);
    for(int i = tamanhosenha.length / 2 - 1; i >= 0; i--){
        Heap(indice,senha,tamanhosenha, tamanhosenha.length, i, data);//okay
        
    }
    for(int j = tamanhosenha.length-1; j > 0; j--){
        int aux = tamanhosenha[0];
        tamanhosenha[0] = tamanhosenha[j];
        tamanhosenha[j] = aux;
        
        Heap(indice,senha,tamanhosenha, j, 0, data);
    } 
    criararray(indice, senha, tamanhosenha, data, heappior);
    tempofinal = System.currentTimeMillis()-tempoinicial;
    System.out.println("Tempo  da ordenação (Heap -pior caso e ja com o csv feito):" + tempofinal );
    tempoinicial = System.currentTimeMillis();
    mergeSortinvert(indice, senha, tamanhosenha, data);
    for(int i = tamanhosenha.length / 2 - 1; i >= 0; i--){
        Heap(indice,senha,tamanhosenha, tamanhosenha.length, i, data);//okay
        
    }
    for(int j = tamanhosenha.length-1; j > 0; j--){
        int aux = tamanhosenha[0];
        tamanhosenha[0] = tamanhosenha[j];
        tamanhosenha[j] = aux;
        
        Heap(indice,senha,tamanhosenha, j, 0, data);
    } 
    criararray(indice, senha, tamanhosenha, data, heapmelhor);
    tempofinal = System.currentTimeMillis()-tempoinicial;
    System.out.println("Tempo  da ordenação (Heap -melhor caso e ja com o csv feito):" + tempofinal );
        
        //criararray(indice, senha, tamanhosenha, data, haepmelhor);
        //tempodecsv = System.currentTimeMillis() - tempoinicial;
      //  System.out.println("tempo até criar o arquivo(quicksort mediana de 3): "+tempodecsv);
    contador2=0;
    }
    //ALGORITMO MERGE SORT
    public static void mergeSort(int[]vetor0,String[] vetor2, int[] vetor, String[] vetor3) {
		//int arraycopiamerge[][] = vetor.clone();
		int tamanhoarray = vetor.length;
        int dividirarray = tamanhoarray / 2;
        int arraydaesquerdaindice[] = new int[dividirarray];
        int arraydadireitaindice[] = new int[tamanhoarray - dividirarray];
        String arraydaesquerdasenha[] = new String[dividirarray];
        String arraydadireitasenha[] = new String[tamanhoarray - dividirarray];
        int arraydaesquerda[] = new int[dividirarray];
        int arraydadireita[] = new int[tamanhoarray - dividirarray];
        String arraydaesquerdadata[] = new String[dividirarray];
        String arraydadireitadata[] = new String[tamanhoarray - dividirarray];
        if (tamanhoarray < 2) {
            return;
        }
        for (int i = 0; i < dividirarray; i++) {
            arraydaesquerdaindice[i] = vetor0[i];
            arraydaesquerdasenha[i] = vetor2[i];
            arraydaesquerda[i] = vetor[i];
            arraydaesquerdadata[i] = vetor3[i];
        }
        for (int j = dividirarray; j < tamanhoarray; j++) {
            arraydadireitaindice[j-dividirarray] =vetor0[j];
            arraydadireitasenha[j-dividirarray] = vetor2[j];
            arraydadireita[j - dividirarray] = vetor[j];
            arraydadireitadata[j-dividirarray]=vetor3[j];
        }
        mergeSort(arraydaesquerdaindice, arraydaesquerdasenha, arraydaesquerda,arraydaesquerdadata);
        mergeSort(arraydadireitaindice,arraydadireitasenha,arraydadireita,arraydadireitadata);
        juntandomerge(vetor0,arraydaesquerdaindice,arraydadireitaindice,
        vetor2,arraydaesquerdasenha,arraydadireitasenha,
        vetor, arraydaesquerda, arraydadireita,
        vetor3,arraydaesquerdadata,arraydadireitadata);
        
	}
	//algoritmo juntando o merge
	public static void juntandomerge(int[]vetor0,int[] arraydaesquerdaindice,int[]arraydadireitaindice ,
    String[] vetor2,String arraydaesquerdasenha[],String arraydadireitasenha[],
    int entrada[], int arraydaesquerda[], int arraydadireita[], 
    String[] vetor3,String arraydaesquerdadata[],String arraydadireitadata[]) {
        int tamanhoarrayesquerda = arraydaesquerda.length;
        int tamanhoarraydireita = arraydadireita.length;
        int a = 0;
        int b = 0;
        int c = 0;
        while (a < tamanhoarrayesquerda && b < tamanhoarraydireita) {
            if ((arraydaesquerda[a]) >= (arraydadireita[b])) {
                vetor0[c]=arraydaesquerdaindice[a];
                vetor2[c] = arraydaesquerdasenha[a];
                entrada[c] = arraydaesquerda[a];
                vetor3[c] = arraydaesquerdadata[a];
                a = a + 1;
            } else {
                vetor0[c] = arraydadireitaindice[b];
                vetor2[c] = arraydadireitasenha[b];
                entrada[c] = arraydadireita[b];
                vetor3[c] = arraydadireitadata[b];
                b = b + 1;
            }
            c = c + 1;
        }
        while (a < tamanhoarrayesquerda) {
            vetor0[c] = arraydaesquerdaindice[a];
            vetor2[c] = arraydaesquerdasenha[a];
            entrada[c] = arraydaesquerda[a];
            vetor3[c] = arraydaesquerdadata[a];
            a = a + 1;
            c = c + 1;
        }
        while (b < tamanhoarraydireita) {
            vetor0[c] = arraydadireitaindice[b];
            vetor2[c] = arraydadireitasenha[b];
            entrada[c] = arraydadireita[b];
            vetor3[c] = arraydadireitadata[b];
            b = b + 1;
            c = c + 1;
        }

    }
    public static void criararray(int[]vetor0, String[] vetor2, int[] vetor, String[]vetor3,  String path)throws IOException{
        String arrayv0[] = new String[669880];
        String arrayv2[] = new String[669880];
        String arrayv[] = new String[669880];
        String arrayv3[] = new String[669880];
        int contadoraux =0;
        while(contadoraux!=669879){
            arrayv0[contadoraux] =Integer.toString(vetor0[contadoraux]);
            arrayv2[contadoraux] =(vetor2[contadoraux]);
            arrayv[contadoraux] =Integer.toString(vetor[contadoraux]);
            arrayv3[contadoraux] =(vetor3[contadoraux]);
            contadoraux++;
        }
        //System.out.println(Arrays.toString(arrayv2));
        
        //for(int i=0; i<vetor0.length-1; i++){
          //  matrix[i][0] = arrayv0[i];
            //matrix[i][1] = vetor2[i];
            //matrix[i][2] = arrayv[i];
            //matrix[i][3] = vetor3[i];
       // }
        //
        contadoraux=0;
        File product = new File(path);
        FileWriter escritor = new FileWriter(product);
        BufferedWriter bescritor = new BufferedWriter(escritor);
        bescritor.write("Índice,Senha, Tamanho da senha, Data");
        bescritor.newLine();
       // System.out.println(arra.length);
        while(arrayv0[contadoraux]!=null){
            bescritor.write(arrayv0[contadoraux]+","+arrayv2[contadoraux]+","+arrayv[contadoraux]+","+arrayv3[contadoraux]);
        

            //bescritor.write(arrayv[contadoraux]);
           // bescritor.write(",");
            //bescritor.write(arrayv3[contadoraux]);
            bescritor.newLine();
            contadoraux++;
        }
        
        bescritor.close();
        escritor.close();
    }
    public static void criarcsv(String  path,String[] vetor0,String[] vetor2, String[] arra,String[]vetor3) throws IOException{
        int cont=0;
        //String array[][] = {{"welio"},{"é"},{"moral"},{"demais"},{"nessa"},{"porra"}};
        
    }
    public static void countingSort(int[]vetor0,String[] vetor2,int[] vetor,String[]vetor3) {
        
        int arrayLength = vetor.length;
        if (arrayLength == 0) {
            return;
        } 
        int MAX = vetor[0], min = vetor[0];  
        for (int i = 1; i < arrayLength; i++){
            if (vetor[i] > MAX) {
                MAX = vetor[i];          
            }
            if (vetor[i] < min) {
                min = vetor[i]; 
            }
        }
        int range = MAX - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < arrayLength; i++) {
            count[vetor[i] - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (j < count[i]) {
                vetor[j++] = i + min;
        
            }

        }
        
    }
    public static void quickmediana3(int[] vetor0,String[]vetor2,int[] vetor, int esq, int dir, String[] vetor3) {
        int p = particaode3(vetor0,vetor2,vetor, esq, dir,vetor3);
        
        if (esq < dir) {
            quickmediana3(vetor0,vetor2,vetor, esq, p,vetor3);
            quickmediana3(vetor0,vetor2,vetor, p + 1, dir,vetor3);
        }
       
    }
    //Algoritmo para o quicksort
	public static int particaode3(int[]vetor0,String[]vetor2,int[] vector, int esq, int dir, String[] vetor3){
        int centro= (int) (esq + dir) / 2;
        int medi3[] = new int[3];
        medi3[0] = vector[esq];
        medi3[1] = vector[centro];
        medi3[2] = vector[dir];
        Arrays.sort(medi3);
        int aux0=0;
        String aux2, aux3;
        int pivot = medi3[1];
        int i = esq - 1;
        int j = dir + 1;
        while(true){
            do{ i++;
            }while(vector[i] > pivot);
            do{j--;
            }while(vector[j] < pivot);
            if (i >= j){
            return j;
            }
            aux0 = vetor0[i];
            vetor0[i] = vetor0[j];
            vetor0[j] = aux0;
            aux2 = vetor2[i];
            vetor2[i] = vetor2[j];
            vetor2[j] = aux2;
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
            aux3 = vetor3[i];
            vetor3[i] = vetor3[j];
            vetor3[j] = aux3;
        }
    }
    public static void insertionSort(int[] vetor0,String[] vetor2,int[] vetor,String[] vetor3) {
		
        for (int i = 1; i < vetor.length; i++) {
            int pivo = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < pivo) {
               // vetor0[j+1] = vetor0[j];
               // vetor2[j+1] = vetor2[j];
                vetor[j+1] = vetor[j];
               // vetor3[j+1] = vetor3[j];
                j = j - 1;
            }
            vetor[j + 1] = pivo;
        }
       
	}
    public static void selectionSort(int[] vetor0,String[] vetor2,int[] vetor,String[] vetor3) {
		int aux0=0; 
       String aux2;
       String aux3;
        int auxiliar =0;
        

        for (int i = 0; i < vetor.length; i++) {
            int min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[min]) {
                    min = j;
                }
            }
            /*troca no array indice
            aux0 = vetor0[i];
            vetor0[i] = vetor0[min];
            vetor0[min] = aux0;*/
            /*troca no array senha
            aux2 = vetor2[i];
            vetor2[i] = vetor2[min];
            vetor2[min] = aux2;*/
            //troca no array tamanho
            auxiliar = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = auxiliar;
            /*troca no array data
            aux3 = vetor3[i];
            vetor3[i] = vetor3[min];
            vetor3[min] = aux3;*/
        }
        
	}
    private static void Heap(int[] vetor0, String[] vetor2,int[] vetor, int n, int i, String[]vetor3){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;
        
        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }
        
        if (raiz != i){
            
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            
            Heap(vetor0, vetor2,vetor, n, raiz, vetor3);
        }
    }
    //ALGORITMO QUICKSORT
    public static void quickSort(int[] vetor0,String[]vetor2,int[] vetor, int esq, int dir, String[] vetor3) {
        int p = particao(vetor0,vetor2,vetor, esq, dir,vetor3);
        
        if (esq < dir) {
            quickSort(vetor0,vetor2,vetor, esq, p,vetor3);
            quickSort(vetor0,vetor2,vetor, p + 1, dir,vetor3);
        }
       
    }
    //Algoritmo para o quicksort
	public static int particao(int[]vetor0,String[]vetor2,int[] vector, int esq, int dir, String[] vetor3){
        int centro= (int) (esq + dir) / 2;
        int pivot = vector[centro];
        int i = esq - 1;
        int j = dir + 1;
        int aux0=0;
        String aux2, aux3;
        
        while(true){
            do{ i++;
            }while(vector[i] > pivot);
            do{j--;
            }while(vector[j] < pivot);
            if (i >= j){
            return j;
            }
            aux0 = vetor0[i];
            vetor0[i] = vetor0[j];
            vetor0[j] = aux0;
            aux2 = vetor2[i];
            vetor2[i] = vetor2[j];
            vetor2[j] = aux2;
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
            aux3 = vetor3[i];
            vetor3[i] = vetor3[j];
            vetor3[j] = aux3;
        }
    }
    //ALGORITMO QUICKSORT
  //ALGORITMO MERGE SORT
  public static void mergeSortinvert(int[]vetor0,String[] vetor2, int[] vetor, String[] vetor3) {
    //int arraycopiamerge[][] = vetor.clone();
    int tamanhoarray = vetor.length;
    int dividirarray = tamanhoarray / 2;
    int arraydaesquerdaindice[] = new int[dividirarray];
    int arraydadireitaindice[] = new int[tamanhoarray - dividirarray];
    String arraydaesquerdasenha[] = new String[dividirarray];
    String arraydadireitasenha[] = new String[tamanhoarray - dividirarray];
    int arraydaesquerda[] = new int[dividirarray];
    int arraydadireita[] = new int[tamanhoarray - dividirarray];
    String arraydaesquerdadata[] = new String[dividirarray];
    String arraydadireitadata[] = new String[tamanhoarray - dividirarray];
    if (tamanhoarray < 2) {
        return;
    }
    for (int i = 0; i < dividirarray; i++) {
        arraydaesquerdaindice[i] = vetor0[i];
        arraydaesquerdasenha[i] = vetor2[i];
        arraydaesquerda[i] = vetor[i];
        arraydaesquerdadata[i] = vetor3[i];
    }
    for (int j = dividirarray; j < tamanhoarray; j++) {
        arraydadireitaindice[j-dividirarray] =vetor0[j];
        arraydadireitasenha[j-dividirarray] = vetor2[j];
        arraydadireita[j - dividirarray] = vetor[j];
        arraydadireitadata[j-dividirarray]=vetor3[j];
    }
    mergeSortinvert(arraydaesquerdaindice, arraydaesquerdasenha, arraydaesquerda,arraydaesquerdadata);
    mergeSortinvert(arraydadireitaindice,arraydadireitasenha,arraydadireita,arraydadireitadata);
    juntandomergeinvert(vetor0,arraydaesquerdaindice,arraydadireitaindice,
    vetor2,arraydaesquerdasenha,arraydadireitasenha,
    vetor, arraydaesquerda, arraydadireita,
    vetor3,arraydaesquerdadata,arraydadireitadata);
    
}
//algoritmo juntando o merge
public static void juntandomergeinvert(int[]vetor0,int[] arraydaesquerdaindice,int[]arraydadireitaindice ,
String[] vetor2,String arraydaesquerdasenha[],String arraydadireitasenha[],
int entrada[], int arraydaesquerda[], int arraydadireita[], 
String[] vetor3,String arraydaesquerdadata[],String arraydadireitadata[]) {
    int tamanhoarrayesquerda = arraydaesquerda.length;
    int tamanhoarraydireita = arraydadireita.length;
    int a = 0;
    int b = 0;
    int c = 0;
    while (a < tamanhoarrayesquerda && b < tamanhoarraydireita) {
        if ((arraydaesquerda[a]) <= (arraydadireita[b])) {
            vetor0[c]=arraydaesquerdaindice[a];
            vetor2[c] = arraydaesquerdasenha[a];
            entrada[c] = arraydaesquerda[a];
            vetor3[c] = arraydaesquerdadata[a];
            a = a + 1;
        } else {
            vetor0[c] = arraydadireitaindice[b];
            vetor2[c] = arraydadireitasenha[b];
            entrada[c] = arraydadireita[b];
            vetor3[c] = arraydadireitadata[b];
            b = b + 1;
        }
        c = c + 1;
    }
    while (a < tamanhoarrayesquerda) {
        vetor0[c] = arraydaesquerdaindice[a];
        vetor2[c] = arraydaesquerdasenha[a];
        entrada[c] = arraydaesquerda[a];
        vetor3[c] = arraydaesquerdadata[a];
        a = a + 1;
        c = c + 1;
    }
    while (b < tamanhoarraydireita) {
        vetor0[c] = arraydadireitaindice[b];
        vetor2[c] = arraydadireitasenha[b];
        entrada[c] = arraydadireita[b];
        vetor3[c] = arraydadireitadata[b];
        b = b + 1;
        c = c + 1;
    }

}
}
