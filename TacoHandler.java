package appCont;

import JSON.FileReader;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;

/**
 * Created by newuser on 1/25/16.
 */
public class TacoHandler implements AChandler {
    @Override
    public void handleIt(HashMap data)  {

        try {
            FileReader fileReader = new FileReader();
            HashMap d1 = fileReader.readFile();

            System.out.println("Great Choice");
            System.out.println(d1.get("Tacos"));
            HashMap d2 = (HashMap) data;
            int numberAmount = (Integer) d2.get("amount");
            double totalAmount = numberAmount * (Double) d2.get("tacoPrice");

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println("Your total amount is " + formatter.format(totalAmount));

            System.out.println("Tacos are life!");

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
