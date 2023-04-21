package com.example.zadanie_7;

import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;

import static java.lang.Thread.sleep;

public class TCPClient extends Thread implements Runnable
{
    String detagram;
    TextArea output;
    TCPClient(TextArea output)
    {
        this.detagram="";
        this.output=output;
    }

     public void  send(String detagram,TextArea output) {
        String serverName = "localhost";
        int port = 6666;
        try
        {
            Socket client = new Socket(serverName, port);

            OutputStream out = client.getOutputStream();
            DataOutputStream dataOut = new DataOutputStream(out);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            dataOut.writeUTF( detagram);

            InputStream input = client.getInputStream();
            DataInputStream dataInput = new DataInputStream(input);
            if(output!=null ) {
                output.clear();
                output.appendText(dataInput.readUTF());
            }
            //System.out.println("Odpowiedź serwera: " + dataInput.readUTF());
            client.close();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
     }

    @Override
    public void run() {
        while(true) {
            send("", output);
            try {
                this.wait(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}