/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.com.dosterminal.command;

import java.io.IOException;

/**
 *
 * @author subasone
 */
public class ProcessCommand extends CommandTerminal{

    @Override
    public void execute(String[] args) throws IOException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(args.length > 1){
            new ProcessBuilder(args[1]).start();
        } else {
            System.out.println("Invalid Command");
        }
    }
    
}
