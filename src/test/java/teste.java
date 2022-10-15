import br.parts.Controler.PartRMIInterface;
import br.parts.Model.Part;
import br.parts.Model.PartInterface;

import java.rmi.Naming;

public class teste {
    public static void main(String[] args) {
        String host = "127.0.0.1";  // Para pegar o endereço IP passado na chamada do programa
        try {
            PartRMIInterface myServerObject = (PartRMIInterface) Naming.lookup("rmi://"+ host + "/RMIImpl"); // para conseguir encontrar o IP do RMI
            Part part = new Part();
            myServerObject.insertPart(part);
            System.out.println("No servidor tem agora estes elementos" + myServerObject.selectParts().size());
        }
        catch(Exception e) {
            System.out.println("Exception occured: " + e);
            System.exit(0);
        }
        System.out.println("Conexão RMI realizada com sucesso");
    }
}
