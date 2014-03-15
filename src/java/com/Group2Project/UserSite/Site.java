/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Group2Project.UserSite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a UserSite
 * @author Éanna
 */
public class Site {
    private ArrayList<Page> pageList;
    
    public Site(){
        pageList = new ArrayList<Page>();
    }
    
    public void addPage( Page page ){
        pageList.add(page);
    }
    
    public Iterator<Page> getPages(){
        return pageList.iterator();
    }
    
    public String[][] getPageNames(){
        String[][] names = new String[pageList.size()][2];
        for (int i=0; i<pageList.size(); i++){
            String[] arr =  new String[2];
            arr[0]=pageList.get(i).getPageTitle();
            arr[1]=pageList.get(i).getPageType();
            names[i]=arr;
        }
        return names;
    }
}
