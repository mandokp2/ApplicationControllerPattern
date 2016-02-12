package appCont;
import java.util.*;

/**
 * Created by newuser on 1/25/16.
 */
public class ACmain {

    public static void main(String[] args) {

        ACcontroller delegate = new ACcontroller();
        Scanner input = new Scanner(System.in);





            try {


                System.out.println("---Menu---");
                System.out.println("Tacos");
                System.out.println("Burritos");
                System.out.println("Quesadillas");
                System.out.println("Tortas");
                System.out.println("------------");
                System.out.println("What would you like?:");
                String command = input.nextLine();
                System.out.println("How many would you like?:");
                int amount = input.nextInt();


                HashMap data = new HashMap();
                data.put("amount",amount);
                data.put("tacoPrice",1.50);
                data.put("burritoPrice", 5.00);
                data.put("quesadillaPrice", 5.00);
                data.put("tortaPrice", 5.00);


                delegate.handleCommand(command, data);


            } catch (Exception e) {
                System.out.println("Item does not exist in the menu!");
            }







    }
}
