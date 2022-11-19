package org.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws Exception {
        try {
            InetAddress host = InetAddress.getByName("localhost");
            System.out.println(host.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
