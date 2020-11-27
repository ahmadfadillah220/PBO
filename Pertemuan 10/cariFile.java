package com.pboreg;

import java.io.IOException;

public class cariFile {
    public static void findFile()throws IOException{
    throw new IOException("File not found");
}

    public static void main(String[] args) {
        try {
            findFile();
            System.out.println("Rest of code in tyr block");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        }
    }
