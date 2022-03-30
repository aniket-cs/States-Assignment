package com.states.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maharastra {
    Map<String, List<String>> maharastra = new HashMap<>();

    public Map<String,List<String>> maharastra(){
        List<String> mh = new ArrayList<>();
        mh.add("Pune");
        mh.add("Mumbai");
        mh.add("Nashik");
        mh.add("Nagpur");
        mh.add("Solapur");

        maharastra.put("Maharastra", mh);//adding in the map
        return maharastra;
    }


    public boolean checkKey(Map<String,List<String>> maharastra){


        Maharastra mht = new Maharastra();

        String key = "";

        for (Map.Entry<String, List<String>> e : mht.maharastra().entrySet())
        {
            key = (String)e.getKey();
            List<String> value = e.getValue();

        }

        if(key == "Maharastra"){
            return true;
        }

        else{
            return false;
        }




    }

    public boolean checkValue(Map<String,List<String>> maharastra){

        Maharastra mht = new Maharastra();

        List<String> dist = new ArrayList<>();

        for (Map.Entry<String, List<String>> e : mht.maharastra().entrySet())
        {

            dist = e.getValue();

        }
        List<String> com = new ArrayList<>();
        com.add("Pune");
        com.add("Mumbai");
        com.add("Nashik");
        com.add("Nagpur");
        com.add("Solapur");


        if(dist == com ){
            return true;
        }

        else
        {
            return false;
        }



    }
}
