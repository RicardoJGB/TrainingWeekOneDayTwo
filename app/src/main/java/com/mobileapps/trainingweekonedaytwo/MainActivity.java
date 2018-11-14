package com.mobileapps.trainingweekonedaytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int returnFromMethod = someMethod(32);
        Log.d("TAG", "onCreate: " + returnFromMethod);
    }

    public int someMethod(int i) {


        return i + 6;
    }

    public void findDuplicates(List<String> strings) {
        ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {

            String temp = strings.get(i);
            for (int j = 0; j < strings.size(); j++) {

                if (i != j) {
                    if (temp.equals(strings.get(j))) {
                        results.add(temp);
                    }
                }
            }
        }
        for (String str : results) {
            System.out.println(str);
        }

    class Palindromes {
        public void main(String args[]) {
            Scanner input = new Scanner(System.in);
            String word, reverse = "";
            System.out.println("What word do you want to check?");
            word = input.nextLine();
            int len = word.length();
            for (int counter = len - 1; counter >= 0; counter--) {
                reverse = reverse + word.charAt(counter);

            }
            System.out.println("Your reversed input: " + reverse);
            if (word == reverse)
                System.out.println("This word is a palindrome");
            else
                System.out.println("This word is not a palindrome");
        }

        public void fizzBuzz(String args) {

            String buzz = "buzz", fizz = "fizz";
            for (int counter = 1; counter <= 20; counter++) {
                if (counter % 15 == 0) {
                    System.out.println(buzz + fizz);
                } else if (counter % 3 == 0) {
                    System.out.println(fizz);
                } else if (counter % 5 == 0) {
                    System.out.println(buzz);
                } else {
                    System.out.println(counter);
                }
                Log.d("TAG", "onCreate:");

            }

        }

        }
    }
}


