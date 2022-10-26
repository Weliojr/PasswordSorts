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
public class LerCsv {
    
    public static void main(String[] args) {
        int[] indice = new int [698878];
        String senha[] = new String [698878];
        int tamanhosenha[] = new int[698878];
        String data[] = new String[698878];
        String arquivocsv = "/home/welio/Downloads/passwords.csv";
        String path = "teste.csv";
        String[][] superarray = new String[698878][4];
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
                //System.out.println("Indice = " + dadossenhas[0] + ", Senhas = " + dadossenhas[1] + ", Tamanho = "+ dadossenhas[2] + ", Datas = " + dadossenhas[3]);
                
                
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
      //mergeSort(superarray);
       while(superarray[contador2][0] != null){
            //indice[contador2] = Integer.parseInt(superarray[contador2][0]);
            senha[contador2] = superarray[contador2][1];
            //tamanhosenha[contador2] = Integer.parseInt(superarray[contador2][2]);
            data[contador2] = superarray[contador2][3];
            System.out.print(/*indice[contador2]+" "+*/senha[contador2]+" "+/*tamanhosenha[contador2]+" "+*/data[contador2]+" ");
            //System.out.print("\n");
            contador2++;
        }

    }
    //ALGORITMO MERGE SORT
    public static void mergeSort(String[][] vetor) {
		//int arraycopiamerge[][] = vetor.clone();
		int tamanhoarray = vetor.length;
        int dividirarray = tamanhoarray / 2;
        String arraydaesquerda[][] = new String[dividirarray][4];
        String arraydadireita[][] = new String[tamanhoarray - dividirarray][4];
        if (tamanhoarray < 2) {
            return;
        }
        for (int i = 0; i < dividirarray; i++) {
            arraydaesquerda[i][2] = vetor[i][2];
        }
        for (int j = dividirarray; j < tamanhoarray; j++) {
            arraydadireita[j - dividirarray][2] = vetor[j][2];
        }
        mergeSort(arraydaesquerda);
        mergeSort(arraydadireita);
        juntandomerge(vetor, arraydaesquerda, arraydadireita);
        
	}
	//algoritmo juntando o merge
	public static void juntandomerge(String entrada[][], String arraydaesquerda[][], String arraydadireita[][]) {
        int tamanhoarrayesquerda = arraydaesquerda.length;
        int tamanhoarraydireita = arraydadireita.length;
        int a = 0;
        int b = 0;
        int c = 0;
        while (a < tamanhoarrayesquerda && b < tamanhoarraydireita) {
            if (Integer.parseInt(arraydaesquerda[a][2]) <= Integer.parseInt(arraydadireita[b][2])) {
                entrada[c][2] = arraydaesquerda[a][2];
                a = a + 1;
            } else {
                entrada[c][2] = arraydadireita[b][2];
                b = b + 1;
            }
            c = c + 1;
        }
        while (a < tamanhoarrayesquerda) {
            entrada[c][2] = arraydaesquerda[a][2];
            a = a + 1;
            c = c + 1;
        }
        while (b < tamanhoarraydireita) {
            entrada[c][2] = arraydadireita[b][2];
            b = b + 1;
            c = c + 1;
        }

    }
    /*public void criarcsv(String  path, String[][] arra){
        
        String array[][] = {{"welio"},{"é"},{"moral"},{"demais"},{"nessa"},{"porra"}};
        File product = new File(path);
        FileWriter escritor = new FileWriter(product);
        BufferedWriter bescritor = new BufferedWriter(escritor);
        System.out.println(array.length);
        for(int i=0; i<array.length;i++){
            bescritor.write(array[i][0]);
            bescritor.write(",");
            bescritor.newLine();
        }
        bescritor.close();
        escritor.close();
    }*/
}
