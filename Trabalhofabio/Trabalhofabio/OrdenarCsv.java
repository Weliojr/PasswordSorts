package Trabalhofabio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.cert.CertPath;
public class OrdenarCsv{
    
    public static void main(String[] args) {
        String[][] superarray = new String[4][670000];
        String arquivocsv = "/home/welio/Downloads/passwords.csv";
        
        BufferedReader conteudocsv= null;
        
        String linha = "";
        String separador = ",";
        int contador = 0;
        int contador2=0;

        try{
            conteudocsv = new BufferedReader(new FileReader(arquivocsv));

            while ((linha = conteudocsv.readLine()) != null) {
                if(contador>3){
                    contador=0;
                }
                //ola;
                superarray[contador][contador2] = linha.split(separador);
                contador++;
                contador2++;
                //String[] dadossenhas = linha.split(separador);
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
        
    }
}