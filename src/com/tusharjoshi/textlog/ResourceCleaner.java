/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tusharjoshi.textlog;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tushar Joshi
 */
public class ResourceCleaner {

    public static void close(Closeable closeable) {
        if( null != closeable) {
            try {
                closeable.close();
            } catch (IOException ex) {
                Logger.getLogger(ResourceCleaner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
