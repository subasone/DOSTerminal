/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.com.dosterminal.command;

/**
 *
 * @author subasone
 */
public class TerminalCommandFactory {

    public static CommandTerminal get(String param) {
        if (param.equalsIgnoreCase("md")) {
            return new MDCommand();
        } else if (param.equalsIgnoreCase("rd")) {
            return new RDCommand();
        } else if (param.equalsIgnoreCase("dwl")){
            return new DownloadCommand();
        } else if(param.equalsIgnoreCase("prs")){
            return new ProcessCommand();
        }
        return null;
    }
}
