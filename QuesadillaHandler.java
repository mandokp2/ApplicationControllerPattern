package appCont;

import JSON.FileReader;

import java.text.NumberFormat;
import java.util.HashMap;

/**
 * Created by newuser on 2/8/16.
 */
public class QuesadillaHandler implements AChandler {

    public void handleIt(HashMap data)  {
        try {
            FileReader fileReader = new FileReader();
            HashMap d1 = fileReader.readFile();

            System.out.println("Great Choice");
            System.out.println(d1.get("Quesadillas"));
            HashMap d2 = (HashMap) data;
            int numberAmount = (Integer) d2.get("amount");
            double totalAmount = numberAmount * (Double) d2.get("quesadillaPrice");

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println("Your total amount is " + formatter.format(totalAmount));

            System.out.println("Quesadillas are amazing!");

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
