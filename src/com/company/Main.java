package com.company;

public class Main {

    public static void out (String str){
        System.out.println(str);
    }
    public static void out (int i){
        System.out.println("i");
    }
    public static void  out(boolean b){
        System.out.println(b);
    }
    public static void out(Integer ii){
        out((ii.equals("17")));
        System.out.println(ii);
    }

    public static void main(String[] args) {
	// write your code here
        //System.out.println("hej");
        out("hej");
        out(2);
        Integer i1 = Integer.valueOf(17);
        out(i1.hashCode());
        i1++;
        //out(i1.hashCode());
        out(i1);

        Integer iii = 1;
        int n = 0;
        while (n<1000){
            try {
                iii = iii * 1000;
                 int y = iii /0;
            } catch (Exception e){
                out("fejl e=" + e.getMessage());
            }
            out(iii);
            n++;
        }

        for (int i = 97; i< 130; i++){
            out((char)(i) + " har ascii" + i);
        }

        out('a');



    }
}
