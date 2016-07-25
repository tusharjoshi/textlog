/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tusharjoshi.textlog;

import java.util.List;

/**
 *
 * @author Tushar Joshi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filePath = 
                "E:\\MyProjects\\omscripts\\track\\friday-report.txt";
        TextReader textReader = new TextReader();
        List<String> textLineList = 
                textReader.readLines(filePath);
        
        TextLog textLog = new TextLog(textLineList);
        System.out.println(textLog);
    }
    
}
