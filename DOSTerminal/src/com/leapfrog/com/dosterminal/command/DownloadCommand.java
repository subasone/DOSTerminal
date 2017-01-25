/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.com.dosterminal.command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author subasone
 */
public class DownloadCommand extends CommandTerminal {

    @Override
    public void execute(String[] args) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(args.length>1){
            URL url = new URL(args[1]);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            String[] tokens = args[1].split("/");
            FileOutputStream os = new FileOutputStream(tokens[tokens.length-1]);
            int i = 0;
            byte[] data = new byte[1024 * 10];
            while((i = is.read(data)) != -1){
                os.write(data, 0, i);
            }
            is.close();
            os.close();
        }
        
    }
    
}
