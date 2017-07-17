/**
 * Created by vmurakami on 11/07/17.
 * Write a program which converts all lowercase letter in a sentence to uppercase.

 For. Ex:

 1) Consider a sentence "welcome to Programr!"
 its uppercase conversion is "WELCOME TO PROGRAMR!"

 2) If user inputs string like "I am a new user of Programr!"
 it should print "I AM A NEW USER OF PROGRAMR!"
 */
import java.io.*;
import java.util.Scanner;

class touppercase
{
    public static void main(String[] args) throws IOException
    {

        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        str = br.readLine();

    /*
       Your Logic is here
    */
        //String uppercase = new StringBuilder(str).toString().toUpperCase();

        System.out.println("Uppercase conversion:" + str.toUpperCase());

    }
}
