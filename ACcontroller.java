package appCont;

import java.util.*;
/**
 * Created by newuser on 1/25/16.
 */
public class ACcontroller {

    //make private
    private  HashMap<String,AChandler> hashMapOfCommands = new HashMap<String,AChandler>();


    public ACcontroller(){

        hashMapOfCommands.put("tacos", new TacoHandler());
        hashMapOfCommands.put("Tacos", new TacoHandler());
        hashMapOfCommands.put("Burritos", new BurritoHandler());
        hashMapOfCommands.put("burritos", new BurritoHandler());
        hashMapOfCommands.put("Quesadillas", new QuesadillaHandler());
        hashMapOfCommands.put("quesadillas", new QuesadillaHandler());
        hashMapOfCommands.put("Tortas", new TortaHandler());
        hashMapOfCommands.put("tortas", new TortaHandler());


    }

    public  void handleCommand(String command,HashMap data)  {


        AChandler handler = hashMapOfCommands.get(command);
            handler.handleIt(data);



    }

}
