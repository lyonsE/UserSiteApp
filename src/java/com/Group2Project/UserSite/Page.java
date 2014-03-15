/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Group2Project.UserSite;

import java.util.Map;

/**
 * Represents a page of a site
 * @author Éanna
 */
public class Page {
    private final String pageTitle;
    private final String pageType;
    private Map<String,String> contentMap;
    
    public Page(String pageTitle, String pageType, Map<String, String> contentMap){
        this.pageTitle = pageTitle;
        this.pageType = pageType;
        this.contentMap = contentMap;
    }
    public String getPageTitle(){
        return pageTitle;
    }
    public String getPageType(){
        return pageType;
    }
    
    public String outputContentText(String contentId){
        String text = contentMap.get(contentId);
        
        if (text == null || text == ""){
            text= "Enter your text here!";
        }
        
        return text;
    }
}
