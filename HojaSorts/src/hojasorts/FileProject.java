 /*
 * Universidad del Valle de Guatemala
 * 
 */

package hojasorts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Pablo
 */
public class FileProject {
    
    private String[] numerosGenerados=new String[2000];

    public FileProject() {
       
    }
    
    public void CrearArchivo(){
        try {
            
                String[] numeroRandom=null;
                Random aleatorio = new Random();


                File file = new File("src/hojasorts/NumerosAleatorios.txt");

                // if FileCreator doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i=0;i<2000;i++)
                {
                   bw.write(Integer.toString(aleatorio.nextInt(2000)+1)+"\n");
                }

                bw.close();

                System.out.println("Se ha creado el archivo exitosamente");

        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    public void LeerArchivo(){
        
        int contador=0;
         
        BufferedReader br = null;
 
        try {

                String sCurrentLine;
                 File file = new File("src/hojasorts/NumerosAleatorios.txt");
                br = new BufferedReader(new FileReader(file));

               
                while ((sCurrentLine = br.readLine()) != null) {
                    this.numerosGenerados[contador]=sCurrentLine;
                    contador++;
                
                }
                

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
        
    }

    public String[] getNumerosGenerados() {
        return numerosGenerados;
    }

    public void setNumerosGenerados(String[] numerosGenerados) {
        this.numerosGenerados = numerosGenerados;
    }
    
    public void CrearArchivoOrdenad(){
        
         try {
            
           


                File file = new File("src/hojasorts/NumerosOrdenados.txt");

                // if FileCreator doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i=0;i<2000;i++)
                {
                   bw.write(this.numerosGenerados[i]+"\n");
                }

                bw.close();

                System.out.println("Se ha creado el archivo exitosamente");

        } catch (IOException e) {
                e.printStackTrace();
        }
        
        
        
    }
    

}
