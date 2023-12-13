package application.chapter1.sesi4;

import java.util.ArrayList;
import java.util.List;

public class PraktekKelas2 {
   static List<Integer>  dataCollection = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(  cetakArray(0,1));
        System.out.println(  cetakArray(1,1));
        System.out.println(  cetakArray(1,0));
        System.out.println(  cetakArray(0,0));

        System.out.println(Math.pow(2,4)); // pangkat

        //ternary operation
        int nilai1= 10;
        System.out.println(nilai1==10 ?  "sama":
                           (nilai1 ==7 ? "nilai 1"
                                         : "nilai"));
        dataCollection.add(1);
        dataCollection.add(1);
        dataCollection.add(1);
        dataCollection.add(1);

        for(int i =0; i<dataCollection.size(); i++){
            System.out.println("index data="+i  + "isi"+dataCollection.get(i));
        }

    }
    public static String cetakArray(int bariske, int columke){
        String[][] kontak = {
                {"Lili","08111"},
                {"Lala","08122"},
                {"Maya","08133"}
        };
        return kontak[bariske][columke];
    }


}
