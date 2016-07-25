/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tusharjoshi.textlog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tushar Joshi
 */
public class TextReader {
    
    private BufferedReader bufferedReader = null;

    public List<String> readLines(String string) {
        List<String> lineList = null;
        try {
            FileReader fileReader = new FileReader(string);
            bufferedReader = new BufferedReader(fileReader);
            lineList = readLines();
        } catch(Exception ex) {
            
        } finally {
            ResourceCleaner.close(bufferedReader);
        }
        
        return lineList;
    }

    private List<String> readLines() {
        List<String> lineList = new ArrayList<>();
        
        try {
            String line = null;
            while( (line = bufferedReader.readLine()) != null ) {
                lineList.add(line);
            }
        } catch (Exception ex) {
            
        }
        
        return lineList;
    }
    
}
