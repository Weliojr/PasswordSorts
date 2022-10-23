import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.cert.CertPath;
import java.util.Arrays;
public class LerCsv {
    
    public static void main(String[] args) {
        String arquivocsv = "/home/welio/Downloads/passwords.csv";
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
        //for(int i=0;i<698878;i++){
            //for(int j=0;j<4;j++){
                //System.out.print(superarray[i][j]+" ");
           // }
           // System.out.print("\n");
       // }
       int contador2 =0;
       while(superarray[contador2][0] != null){
            System.out.print(superarray[contador2][0]+" "+superarray[contador2][1]+" "+superarray[contador2][2]+" "+superarray[contador2][3]+" ");
            System.out.print("\n");
            contador2++;
        }
        System.out.println("\n O valor do contador2 é: "+contador2);
        //vamos la atualizar 
        //assim que der envio
    }
}
