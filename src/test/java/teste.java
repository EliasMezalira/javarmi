import br.parts.Controler.PartRMIInterface;
import br.parts.Model.Part;
import br.parts.Model.PartInterface;
import br.parts.Model.Subcomponent;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        String host = "127.0.0.1";  // Para pegar o endereço IP passado na chamada do programa
        Scanner keyboard = new Scanner(System.in);
        try {
            PartRMIInterface myServerObject = (PartRMIInterface) Naming.lookup("rmi://"+ host + "/RMIImpl"); // para conseguir encontrar o IP do RMI
            String value = "";
           do {
               System.out.println("Digite:\n" +
                       "\"cadastrar\" para cadastrar uma peca\n" +
                       "\"visualizar\" para visualizar todas as pecas\n" +
                       "\"buscar \" para buscar uma peca" +
                       "\"sair\" para sair");
                value = keyboard.nextLine();

                switch (value){
                    case "cadastrar":
                        myServerObject.insertPart(cadastarPeca(keyboard));
                        break;
                    case "visualizar":
                        myServerObject.selectParts().forEach(x -> System.out.println(x.toString()));
                        break;
                    case "buscar":
                        System.out.println("Digite o id da peca que deseja buscar");
                        long k = keyboard.nextLong();
                        if(k > 0){
                            System.out.println(myServerObject.selectPart(k).toString());
                        }
                        break;
                }
            }while(value != "sair");
            System.out.println("No servidor tem agora estes elementos" + myServerObject.selectParts().size());
        }
        catch(Exception e) {
            System.out.println("Exception occured: " + e);
            System.exit(0);
        }
        System.out.println("Conexão RMI realizada com sucesso");
    }

    private static PartInterface cadastarPeca(Scanner keyboard) {
        Part part = new Part();
        System.out.println("Digite o nome da peça: ");
        part.setName(keyboard.nextLine());

        System.out.println("Digite descricao da peça: ");
        part.setDesc(keyboard.nextLine());

        System.out.println("digite 1 para adicionar uma subpeca");
        List<Subcomponent> subcomponents = new ArrayList<Subcomponent>();
        while("1" == keyboard.nextLine()){
            Subcomponent subcomponent= new Subcomponent();
            subcomponent.setSubPart(cadastarPeca(keyboard));
            System.out.println("digite a quantidade de pecas");
            subcomponent.setQtd(keyboard.nextInt());
            subcomponents.add(subcomponent);
            System.out.println("digite 1 para adicionar uma subpeca");
        }

        return part;

    }
}
