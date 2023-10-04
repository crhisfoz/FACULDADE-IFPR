import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;


public class Transporter implements ImportFile{ 
    private BufferedReader reader;
    private BufferedWriter writer;
    private float normalShippingPrice;
    private float expressShippingPrice;

    public String readName() throws Exception {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        String exitName = "", partialName = "", extention = ".csv";
        String array[];

        System.out.println("Digite o nome do arquivo: ");
        String inputName = reader.readLine();
        
        switch (inputName) {
            case "arqConfig.csv":
                exitName = "arqConfig.csv";            
                break;
            case "encomendas_foz.csv":
                exitName = "encomendas_foz.csv";            
                break;
            case "encomendas_smi.csv":
                exitName = "encomendas_smi.csv";            
                 break; 
            default:
            System.out.println("Nome inválido, verifique e tente novamente");
                break;
        };

        return exitName;
    }

    public void loadFile() throws Exception {

        String inputName = readName();

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

        String inputName =  readName();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputName));
        

        String line = fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");

            if(inputName.equals(defaultNameFoz)){
               String order =  array[0];
               Date shipping = array[1];
               float weight = Float.parseFloat(array[2]);

                NormalOrder normal = new NormalOrder(order, shipping, weight, normalShippingPrice);
                
            }else (inputName.equals(defaultNameSmi)){
                String order =  array[0];
                Date shipping = array[1];
                float weight = Float.parseFloat(array[2]);
                int deadline = Integer.parseInt(array[3]);
                int fone = Integer.parseInt(array[4]);
                ExpressOrder express = new ExpressOrder(order, shipping, weight, expressShippingPrice, deadline, fone );
            
            }
        }
        fileReader.close();
    }

    public static void main(String[] args) throws Exception {
        Transporter transp = new Transporter();
        transp.reader = new BufferedReader(new InputStreamReader(System.in));     
        transp.loadFile();
        transp.importData();

       
   }

   


   

}