package com.company.test;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        BufferedWriter oos = null;
        ObjectInputStream ois = null;
        try {
            Socket socket = new Socket(InetAddress.getByName("192.168.43.73"),1234);
           oos = new BufferedWriter(new OutputStreamWriter( socket.getOutputStream()));

            oos.write("\n");
            oos.flush();

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
