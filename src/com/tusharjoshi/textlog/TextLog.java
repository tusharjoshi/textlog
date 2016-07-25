/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tusharjoshi.textlog;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tushar Joshi
 */
public class TextLog {

    private final List<String> rawLines;
    private List<LineItem> lineItemList;

    public TextLog(List<String> textLineList) {
        this.rawLines = textLineList;
        createLineItems();
    }

    private void createLineItems() {
        lineItemList = new ArrayList<>();
        int index = 0;
        for( String line : rawLines) {
            addLineItem(line, index);
            index++;
        }
    }

    private void addLineItem(String line, int index) {
        LineItem lineItem = new LineItem();
        lineItem.setLineIndex(index);
        lineItem.setOffset(findLineOffset(line));
        lineItemList.add(lineItem);
    }

    private int findLineOffset(String line) {
        if( line.trim().length() == 0 ) {
            return 0;
        }
        
        for( int index = 0 ; index < line.length(); index++ ) {
            char ch = line.charAt(index);
            if( ch != ' ' && ch != '\t' ) {
                return index;
            }
        }
        
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for( LineItem lineItem : lineItemList) {
            builder.append(lineItem.getOffset());
            builder.append(" : ");
            builder.append(rawLines.get(lineItem.getLineIndex()));
            builder.append("\n");
        }
        
        return builder.toString(); 
    }
    
}
