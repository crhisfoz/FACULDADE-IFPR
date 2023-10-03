import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;


public class Transporter implements ImportFile{ 
    private BufferedReader reader;
    private BufferedWriter writer;
    private float normalShippingPrice;
    private float expressShippingPrice;

    public static void main(String[] args) throws Exception {
         Transporter transp = new Transporter();
         transp.reader = new BufferedReader(new InputStreamReader(System.in));     
        transp.loadFile();

        
    }

    public void loadFile() throws Exception {

        System.out.println("Digite o nome do arquivo: ");
        String inputName = this.reader .readLine();
      
        String inputDefaultName = "arqConfig.csv";
        

        if ((!inputName.equals("arqConfig.csv") || inputName.equals(""))) {
            inputName = inputDefaultName;
        }
        
        BufferedReader fileReader = new BufferedReader(new FileReader(inputName));

        String line = fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");
            if(array[1].equals("EN")){
                normalShippingPrice = Float.parseFloat(array[2]);
            }else{
                expressShippingPrice = Float.parseFloat(array[2]);

            }

             fileReader.close();
        }

    }
        public void importData() throws Exception {
            
        String defaultNameFoz = "encomendas_foz.csv";
         String defaultNameSmi = "encomendas_smi.csv";

        System.out.println("Digite o nome do arquivo: ");
        String inputName = this.reader .readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputName));
        

        String line = fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");

            if(inputName.equals(defaultNameFoz)){
               String order =  array[0];
               Date shipping = array[1];
               float weight = Float.parseFloat(array[2]);

                NormalOrder normal = new NormalOrder(0, null, expressShippingPrice)

                
                
            }else if(inputName.equals(defaultNameSmi)){
                ExpressOrder express = new ExpressOrder(0, null, expressShippingPrice, 0, 0)
            
            }else{
                System.out.println ("Nome do arquivo inválido");
            }
            
        }
        fileReader.close();
    }



}