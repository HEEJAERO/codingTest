package skt_test2;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        String[] goods = {"pencil", "cilicon", "contrabase", "picturelist"};
        String[] answer =new String[goods.length];

        for(int i=0;i<goods.length;i++) {
            for(int word = 1;word<goods[i].length();word++) {
                for (int j = 0; j < goods[i].length() - word; j++) {
                    String temp = goods[i].substring(j, j + word);
                    boolean find = false;
                    for (int k = 0; k < goods.length; k++) {
                        if(i==k) continue;
                        if (goods[k].contains(temp)) find = true;
                    }
                    if (find == false) {
                        if (answer[i] == null)
                            answer[i] = temp;

                        else if(!answer[i].contains(temp))
                            answer[i] =  temp+" " + answer[i];
                    }
                }
                if(answer[i]!=null) break;
            }
            if(answer[i]==null) answer[i]="None";
        }



        for(String a:answer)
        System.out.println(a);
        }
    }

