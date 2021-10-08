package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> diceTally = new HashMap<Integer, Integer>();
        System.out.println("How many times do you want to roll a dice");
        int times = scanner.nextInt();
        System.out.println("What is the minimum value?");
        int min = scanner.nextInt();
        System.out.println("What is the maximum value?");
        int max = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.println(randomNumber);
            int count=diceTally.containsKey(randomNumber) ?diceTally.get(randomNumber):0;
            diceTally.put(randomNumber,count+1);
        }
        System.out.println(diceTally);

//        System.out.println("First Random int is "+ random.nextInt(100));
//        System.out.println("First Random double is "+random.nextDouble());
//
//        int min=5;
//        int max=100;
//        int newRandom = random.nextInt((max-min)+1)+min;
//        System.out.println(newRandom);
//        System.out.println(Math.random());
//        int rand=(int)(Math.random()*10);
//        System.out.println(rand);

    }
}
