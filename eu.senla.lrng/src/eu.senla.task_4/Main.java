package eu.senla.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String wrd = "FSWCSA";
        String arrayWrd = " ";
        String[][] array = new String[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 3 == 0) {
                    array[i][j] = (String.valueOf(Math.random() * 8 + 1)).substring(0, 6);
                } else {
                    for (int l = 0; l < 6; l++) {
                        int ds = (int) (Math.random() * 3);
                        arrayWrd = arrayWrd + wrd.charAt(ds);
                    }
                    array[i][j] = arrayWrd;
                    arrayWrd = " ";

                }
            }


        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }


        String[] dial = new String[10];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            dial[i] = array[i][j];
            j++;
        }
        System.out.println();
        System.out.println(Arrays.toString((dial)));

        String[] dial2 = new String[10];
        j = 9;
        for (int i = 0; i < array.length; i++) {
            dial2[i] = array[i][j];
            j--;

        }
        System.out.println();
        System.out.println(Arrays.toString((dial2)));

        System.out.println(Arrays.equals(dial,dial2));

        List list = new ArrayList(Arrays.asList(dial));
        list.addAll(Arrays.asList(dial2));
        Object[] mixDial = list.toArray();

        System.out.println(Arrays.toString(mixDial));
        String[] number = new String[8];
        j=0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mixDial.length; i++) {
            try {
                double val = Double.parseDouble((String) mixDial[i]);
                double hz = val - (int) val;

                    if(hz>0.7){
                        int newVal= (int) Math.ceil(val);
                        number[j]=newVal+ "";
                        j++;
                    } else {
                        int newVal=(int) Math.floor(val);
                        number[j]=newVal+ "";
                        j++;
                    }



            }
            catch (NumberFormatException dd){

                mixDial[i]=mixDial[i].toString().substring(1,3);
                sb.append(mixDial[i]+ ",");
            }
        }
        for (j=0; j<7; j++){
            System.out.print(number[j]+ "_");


        }
        System.out.println();
        System.out.println(sb);
    }
    }








