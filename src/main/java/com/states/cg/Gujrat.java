package com.states.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gujrat{
    Map<String, List<String>> gujrat = new HashMap<>();

    public Map<String,List<String>> gujrat(){
        List<String> gj = new ArrayList<>();
        gj.add("Surat");
        gj.add("Ahmedabad");
        gj.add("Vadodara");
        gj.add("Rajkot");
        gj.add("Jamnagar");

        gujrat.put("Gujrat", gj);//adding in the map

        return gujrat;
    }

    public boolean checkKey(Map<String,List<String>> gujrat){


        Gujrat gjt = new Gujrat();

        String key = "";

        for (Map.Entry<String, List<String>> e : gjt.gujrat().entrySet())
        {
            key = (String)e.getKey();
            List<String> value = e.getValue();

        }

        if(key == "Gujrat"){
            return true;
        }

        else{
            return false;
        }




    }

    public boolean checkValue(Map<String,List<String>> gujrat){

        Gujrat gjt = new Gujrat();

        List<String> dist = new ArrayList<>();

        for (Map.Entry<String, List<String>> e : gjt.gujrat().entrySet())
        {

            dist = e.getValue();

        }
        List<String> com = new ArrayList<>();
        com.add("Surat");
        com.add("Ahmedabad");
        com.add("Vadodara");
        com.add("Rajkot");
        com.add("Jamnagar");


        if(dist == com ){
            return true;
        }

        else
        {
            return false;
        }



    }

}
