/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.com.dosterminal.command;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author subasone
 */
public class RDCommand extends CommandTerminal {

    @Override
    public void execute(String[] args) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if(args.length> 1){
            new File(args[1]).delete();
        } else {
            System.out.println("Invalid Commnad");
        }
    }
    
}
