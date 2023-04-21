package com.example.zadanie_7;

import javafx.scene.control.TextArea;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class TCPServer extends Thread
{
    private ServerSocket serverSocket;
    String output;
    boolean receiver;
    public TCPServer(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
        this.output="";
        this.receiver=true;
    }


    public void run()
    {
        while(receiver)
        {
            try
            {
                //System.out.println("Oczekiwanie na klienta na porcie " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                DataInputStream in = new DataInputStream(server.getInputStream());
                String read_utf=in.readUTF();
                if(!read_utf.equals(""))
                 output+=read_utf+"\n\n";
                //System.out.println("Klient mówi: " + in.readUTF());

                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                //System.out.print("Odpowiedź serwera: ");
                //String srvAnswer = reader.readLine();
                out.writeUTF(output);
                server.close();
            }
            catch (SocketTimeoutException s)
            {
                System.out.println("Przekroczony limit czasu żądania!");
                break;
            }
            catch (IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }



    public static class Server extends Thread
    {
        int port = 6666;
        TCPServer t;
        Server() {
            try {

                 t = new TCPServer(port);
                t.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        void stop_serwer()
        {
            t.receiver=false;
        }

    }
}
