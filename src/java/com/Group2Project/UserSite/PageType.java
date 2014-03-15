/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Group2Project.UserSite;

/**
 * PageType
 * Connects templates to JSP files
 * @author Éanna
 */
public enum PageType {
    HOME(""),
    GALLERY(""),
    LOSTNFOUND(""),
    DONATION("");
    
    private final String path;
    
    
    PageType( String path ){
        this.path = path;
    }
}
