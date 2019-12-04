package com.company.socketbuffer;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Bufferandsocket {

    public static void main(String[] args) {


        int i = 1;

        for (i = 1; i < 65000; i++) {

            try {

                Socket socket = new Socket("localhost", i);
                System.out.println(socket.getPort());

            } catch (Exception e) {


            }
        }

      /*  Socket socket = null ;
        try {
            socket = new Socket("www.este.ucam.ac.ma",80);

String req = "GET / HTTP/1.1\r\n";
req += "Host: www.este.ucam.ac.ma\r\n";
req += "\r\n";



  BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
  bf.write(req);
  bf.flush();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      // StringBuilder sh = new StringBuilder();
       String n;
       while((n=bfr.readLine()) !=null){
           System.out.println(n);
       }

    }catch (IOException e){
    e.printStackTrace();
    }*/


    }
        }




