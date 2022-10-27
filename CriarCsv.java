import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CriarCsv {
    public static void main(String[] args) throws IOException {
        String path = "teste.csv";
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
    }
    /*public static void Escrever(String path, String[] linhas) throws IOException{
        // Inicializa o objeto 'arquivo' como caminho do arquivo desejado
        File arquivo = new File(path);
        // Inicializa o objeto 'fw' para inicializar o contrutor 'bw'
        FileWriter fw = new FileWriter(arquivo);

        // Construtor recebe como argumento o objeto do tipo FileWriter
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < linhas.length; i++){
            //Escreve o conteúdo no arquivo
            bw.write(linhas[i]);
            // Adiciona a quebra de linha no arquivo
            bw.newLine();
            
        }
        // Fecha os recursos
        bw.close();
        fw.close();
    }
    public static void FiltrarCSV(String[][] MatrizString, String archiveName, int[] listaPosicao, int tamanho) throws IOException{
        // Inicializa variavel 'linhas' para formar as linhas do arquivo
        String[] linhas = new String[tamanho];

        for (int i = 0; i < tamanho; i++){
            linhas[i] = ""; // Inicia cada linha com vazio
            for (int j = 0; j < 16; j++){
                // Adiciona a primeira linha do arquivo os nomes das colunas
                if (i == 0) linhas[i] += MatrizString[i][j];
                else {
                    if (j < 15) { // Verifica se é ou não o último elemento
                        // Concatena cada variavel com uma virgula as separando
                        linhas[i] += MatrizString[listaPosicao[i]][j] + ","; 
                    }
                    else linhas[i] += MatrizString[listaPosicao[i]][j]; // Concatena o último elemento da linha 
                }
            }
        }
        // Chama a função para criar o arquivo especificado e caso exista o apaga
       // String transformar = VerificarExistencia(archiveName);
        // Chama a função para escrever no arquivo especificado o que está contido na variavel 'linhas'
        //Escrever(transformar, linhas);
    }*/
}

