package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            //Creates new file at specified location
            File test = new File("C:\\Users\\aaaa\\Documents\\College Work\\CompScience\\Java\\FilesTest\\example.txt");
            //Checks if file has been made before
            if (test.createNewFile()){
                System.out.println("File created: " + test.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        try{
            FileWriter writer = new FileWriter("C:\\Users\\aaaa\\Documents\\College Work\\CompScience\\Java\\FilesTest\\example.txt");
            System.out.println("Type in content: ");
            writer.write(input.nextLine());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        try {
            File test = new File("C:\\Users\\aaaa\\Documents\\College Work\\CompScience\\Java\\FilesTest\\example.txt");
            Scanner reader = new Scanner(test);
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                if (row.isEmpty()){
                    continue;
                }
                System.out.println(row);
            }
        }catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }


    }
}
