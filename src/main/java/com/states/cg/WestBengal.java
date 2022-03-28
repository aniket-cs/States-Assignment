package com.states.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WestBengal {
    Map<String,List<String>> westbengal= new HashMap<String,List<String>>();
    public Map<String, List<String>> westBengal(){


        List<String> wb = new ArrayList<>();
        wb.add("Kolkata");
        wb.add("North 24 Parganas");
        wb.add("South 24 Parganas");
        wb.add("Howrah");
        wb.add("Bankura");

       westbengal.put("West Bengal", wb);

       return westbengal;


    }

    public boolean checkKey(Map<String,List<String>> westbengal){

        WestBengal wbt = new WestBengal();

        String key = "";

        for (Map.Entry<String, List<String>> e : wbt.westBengal().entrySet())
        {
            key = (String)e.getKey();
            List<String> value = e.getValue();

        }

        if(key == "West Bengal"){
            return true;
        }

        else{
            return false;
        }




    }

    public boolean checkValue(Map<String,List<String>> westbengal){

        WestBengal wbt = new WestBengal();

        List<String> dist = new ArrayList<>();

        for (Map.Entry<String, List<String>> e : wbt.westBengal().entrySet())
        {

            dist = e.getValue();

        }
        List<String> com = new ArrayList<>();
        com.add("Kolkata");
        com.add("North 24 Parganas");
        com.add("South 24 Parganas");
        com.add("Howrah");
        com.add("Bankura");


        if(dist == com ){
            return true;
        }

        else
        {
            return false;
        }



    }
}
