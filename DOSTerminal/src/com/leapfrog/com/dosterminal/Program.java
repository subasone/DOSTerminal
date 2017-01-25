/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.com.dosterminal;

import com.leapfrog.com.dosterminal.command.CommandTerminal;
import com.leapfrog.com.dosterminal.command.TerminalCommandFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author subasone
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // try {
        //     URL url = new URL("http://www.nagariknews.com/media/cache/nagarik_thumbnail_360_301/uploads/media/mahat.jpg");
        //     URLConnection conn = url.openConnection();

        /*  BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         String line = "";
         Writer writer = new FileWriter("img.jpg");
         while((line = reader.readLine()) != null){
         System.out.println(line);
         writer.write(line);
         }
         writer.close();
         reader.close();*/
       //     InputStream is = conn.getInputStream();
        //     FileOutputStream os = new FileOutputStream("img.jpg");
         //   int i = 0;
        // byte[] data = new byte[1024 * 10];
        //while((i = is.read(data)) != -1){
        //  os.write(data, 0, i);
        // }
        //  is.close();
        //  os.close();
        //} catch (IOException ioe) {
        //   System.out.println(ioe.getMessage());
        // }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        System.out.print(">");
        try {
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                String[] tokens = line.split(" ");
                CommandTerminal cmd = TerminalCommandFactory.get(tokens[0]);
                if(cmd != null){
                    cmd.execute(tokens);
                }
                System.out.print(">");
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}
