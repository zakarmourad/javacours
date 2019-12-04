package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws UnknownHostException {
	// write your code here

        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println(address1.getHostName());
        String Name =sc.next();
        InetAddress address = InetAddress.getByName(Name);
        System.out.println("Nom "+address.getHostName());
        System.out.println("IP "+address.getHostAddress());
        System.out.println("add"+address.getAddress());

    }
}
