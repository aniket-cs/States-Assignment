package com.states.cg;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class States{
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            lp : while(true){
                System.out.println("Enter a state name among 'West Bengal', 'Maharastra' and 'Gujrat' :");


                String key = sc.nextLine();
                String ch = key.toLowerCase();

                switch(ch){
                    case "west bengal":

                    {
                        WestBengal wb = new WestBengal();
                        for (Map.Entry<String, List<String>> e : wb.westBengal().entrySet())
                            System.out.println("The State you entered : " + e.getKey()
                                    + "\nThe renowned districts : " + e.getValue());
                        System.out.println( "For Exiting type 'Exit' or ");
                    }
                    break;
                    case "maharastra" :
                    {
                        Maharastra mh = new Maharastra();
                        for (Map.Entry<String, List<String>> e : mh.maharastra().entrySet())
                            System.out.println("The State you entered : " + e.getKey()
                                    + "\nThe renowned districts : " + e.getValue());
                        System.out.println( "For Exiting type 'Exit' or ");
                    }
                    break;
                    case "gujrat" : {

                        Gujrat gj = new Gujrat();
                        for (Map.Entry<String, List<String>> e : gj.gujrat().entrySet())
                            System.out.println("The State you entered : " + e.getKey()
                                    + "\nThe renowned districts : " + e.getValue());
                        System.out.println( "For Exiting type 'Exit' or ");
                    }
                    break;

                    case "exit" :
                        System.out.println("\n\n Goodbye. ");
                        break lp;

                    default :
                        System.out.println("Couldn't find the state name");

                        System.out.println("Do you want to continue? (Y/N)");
                        String opt = sc.nextLine();
                        if(opt.equals("Y") || opt.equals("y")){
                            break;
                        }
                        else if(opt.equals("N") || opt.equals("n")){
                            System.out.println("\n\nGoodbye ");
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