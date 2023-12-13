package application.chapter1.sesi4;

import java.util.Objects;

public class PraktekKelas {
    public static void main(String[] args) {
        String nama1 = "Aldi";
        String nama2  = "nofrizal";
        String nama3 = "erki";
        int umur = 23;
        String[] dataNama ={"Aldi",nama2,nama3};

        Object[] objekData = {"123",123};
        System.out.println(objekData[0].toString());
        System.out.println(objekData[1]);
        /*
        [0] [1] [2] [3]
        [1] [] [] []
        [2] [] [] []
         */

        for(int i=1; i<=10; i++ ){
            System.out.println("angka-"+i);
        }
        int angkaOperang= 10;
        int angkaOperang2= 10;
        int angkaOperang3= 10;
        int angkaOperang4= 10;
        System.out.println("data ="+(angkaOperang++));  // 10
        System.out.println("data ="+(++angkaOperang2)); // 11
        System.out.println("data ="+(--angkaOperang3)); // 9
        System.out.println("data ="+(angkaOperang4--)); // 10

        int a =1;
        int b =2;
        System.out.println(a==b);// false
        System.out.println(a>b);  // false
        System.out.println(a>=b); // false
        System.out.println(a<=b); // true
        System.out.println(a<b); //  true
        System.out.println(a != b); // true

        String data1 = "1";
        String data2 = "laptop";
        System.out.println(data1==data2); // beda value
        System.out.println(data1.equals(1)); // beda type data
        System.out.println(Objects.equals(data1,1)); // point 2 :beda type data
        System.out.println(data1 == data2);  // beda value
        System.out.println(data1.equals(String.valueOf(a))); //  beda type data : namun di convert ke string
        if(data1 !=null){
            data1.equals(data2);
        }
    }
}
