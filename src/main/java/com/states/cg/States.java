package com.states.cg;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class States{
    public static void main(String[] args) {
        Map<String,List<String>> westbengal= new HashMap<String,List<String>>();

        List<String> wb = new ArrayList<>();
        wb.add("Kolkata");
        wb.add("North 24 Parganas");
        wb.add("South 24 Parganas");
        wb.add("Howrah");
        wb.add("Bankura");

        westbengal.put("West Bengal", wb); //adding in the map

        List<String> mh = new ArrayList<>();
        mh.add("Pune");
        mh.add("Mumbai");
        mh.add("Nashik");
        mh.add("Nagpur");
        mh.add("Solapur");
        Map<String,List<String>> maharastra= new HashMap<String,List<String>>();
        maharastra.put("Maharashtra", mh);//adding in the map

        Map<String,List<String>> gujrat= new HashMap<String,List<String>>();
        List<String> gj = new ArrayList<>();
        gj.add("Surat");
        gj.add("Ahmedabad");
        gj.add("Vadodara");
        gj.add("Rajkot");
        gj.add("Jamnagar");

        gujrat.put("Gujarat", gj);//adding in the map

        try (Scanner sc = new Scanner(System.in)) {
            lp : while(true){
                System.out.println("Enter the name of state :");

                String key = sc.nextLine();
                String ch = key.toLowerCase();

                switch(ch){
                    case "west bengal":

                    {
                        for (Map.Entry<String, List<String>> e : westbengal.entrySet())
                            System.out.println("Key: " + e.getKey()
                                    + " Value: " + e.getValue());

                    }
                    break;
                    case "maharastra" :
                    {
                        for (Map.Entry<String, List<String>> e : maharastra.entrySet())
                            System.out.println("Key: " + e.getKey()
                                    + " Value: " + e.getValue());
                    }
                    break;
                    case "gujrat" : {
                        for (Map.Entry<String, List<String>> e : gujrat.entrySet())
                            System.out.println("Key: " + e.getKey()
                                    + " Value: " + e.getValue());
                    }
                    break;

                    case "exit" :
                        System.out.println("\n\n Okay, thanks for using the system!! See you soon :) ");
                        break lp;

                    default :
                        System.out.println("Opps!! I couldn't find the state name");

                        System.out.println("Do you want to continue? (Y/N)");
                        String opt = sc.nextLine();
                        if(opt.equals("Y") || opt.equals("y")){
                            break;
                        }
                        else if(opt.equals("N") || opt.equals("n")){
                            System.out.println("\n\n Okay, thanks for using the system!! See you soon :) ");
                            break lp;
                        }
                        else{
                            System.out.println("Please enter a valid expression!!!!");
                        }

                }

            }
        }
    }
}