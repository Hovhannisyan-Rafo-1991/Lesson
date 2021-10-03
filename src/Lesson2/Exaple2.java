package Lesson2;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSInputSource;

public class Exaple2 {

    public static void main(String args[]) {

         int x, y;

        x = 10;
        y = 20;

         if (x < y) {
             System.out.println("x փոքր է y-ից");
         }

          x = x * 2;
         if (x == y) {
             System.out.println("x հավասար է y-ի");
         }
         x = x * 2;
         if (x > y) {
             System.out.println("x մեծ է y-ից");
         }

//        int x;
//        for (x = 0; x < 10; x = x + 1) {
//            System.out.println("значение x:" + x);
//        }

    }
}





