package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }


    void  go(){
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String advice = bufferedReader.readLine();
            System.out.println(advice);
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
