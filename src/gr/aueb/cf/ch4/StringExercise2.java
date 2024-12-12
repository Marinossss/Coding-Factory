package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StringExercise2 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key;
        String a;

        System.out.println("Give the String to encrypt: ");
        a = in.nextLine();
        System.out.println("Give me how many positions you want us to move");
        key = in.nextInt();


        System.out.println("The final encrypt code is: " + caisarEncrypt(a,key));
        System.out.println("The final decryption is: " + caisarDecryption(a));


    }

    public static String caisarEncrypt(String a, int key) {

        StringBuilder caisaras = new StringBuilder();


        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            char c = (char) (b + key);
            caisaras.append(c);

        }
        return caisaras.toString();



    }

    public static String caisarDecryption(String a) {

        StringBuilder caisaras = new StringBuilder();


        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            char c = (char) (b - 3);
            caisaras.append(c);

        }
        return caisaras.toString();



    }

//    public static void caisEncr() {
//
//        System.out.println("insert string: ");
//        String ch = in.nextLine();
//        System.out.println("insert key: ");
//        int key = in.nextInt();
//
//
//        for (int i = 0; i < ch.length(); i++) {
//             char str = ch.charAt(i);
//            System.out.print((char) (str + key));
//        }
//
//
//    }

}
