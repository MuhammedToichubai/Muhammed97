package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Praktikalyk tapshyrmaga segiz(8) kod!

    }
    static void pramida_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir butun san beriniz.");
        int san = scanner.nextInt();
        for (int i = san; i >= 1; --i) {
            for (int j = 1; j <= i - 1; ++j) {
                System.out.print(" ");
            }
            if (i == san) {
                System.out.println("@#");
            } else {
                System.out.println("#");
            }
        }
    }

    static void methodArray_2(){
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
            System.out.print(array[i] + " ");
        }
        if(array[0] == array[1]){
            System.out.println("\nBar: "+ array[0]);
        }
        else if(array[1] == array[2]){
            System.out.println("\nBar: "+array[1]);
        }else if(array[2] == array[3]){
            System.out.println("\nBar: "+array[2]);
        }else if(array[3] == array[4]){
            System.out.println("\nBar: "+array[4]);
        }
        else {
            System.out.println("\nJok");
        }

    }
    static void dialog_3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salam atyn kim?");
        String muhammed1 = scanner.nextLine();
        System.out.println(muhammed1+" abdan soonun at eken,kandaisyz? ");
        String muhammed2 = scanner.nextLine();
        System.out.println( "Bugun kaisy kun?");
        String muhammed3 = scanner.nextLine();
        System.out.println( "Chon rahmat iygiliktuu kun kaalaim");
    }

    static int butunSangaAilandyruu_4(double db){
        return (int) Math.round(db);
     }

    static int sandynArtkakaraiTartibi_5(int it) {
        int san = 1;
        for (int i = it; i > san; i--) {
            System.out.print(i+" ");
        }
        return san;
    }

    static int jashynyz_6(int it) {
        int i = 2022;
        return (i - it);
    }

    static int methodKylym_7(int it) {
        return (int) Math.ceil(it / 100d);
    }

    static String method_massiv_8(String str) {
        String[] array = new String[]{"Peaksoft", "Java", "System", "Method", "Array", "String"};
        for (int i = 0; i < array.length; i++) {
            String massiv = array[i];
            if (str == massiv) {
                return "Siz izdegen soz massivde bar";
            }
        }
        return "Siz izdegen soz massivdin ichinde jok.";
    }

}
