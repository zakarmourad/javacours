package com.company.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null ;
        Socket sc = null ;
        while ( true){
            try {
              server = new ServerSocket(4);
                 sc = server.accept();
                System.out.println("client connecte");

                BufferedReader bfr = new BufferedReader(new InputStreamReader(sc.getInputStream()));

                String n;
                while((n=bfr.readLine()) !=null){
                    System.out.println(n);
                }

                server.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
