/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Group2Project.UserSite;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Éanna
 */
public class UserSiteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("site", request.getRequestURL().toString());
        //Request.GetURL
        String[] splitURL = request.getRequestURL().toString().split("//");
        String domain = splitURL[1]; //index 0-> protocol index 1-> domain
        String databaseName = "userSite"+ domain.replaceAll("\\.", "_");
        String page = "Home";
        if (splitURL.length>2){
            page = splitURL[2];
        }
        //Site founf
        //Request.GetPage
        //LoadPageContent
        Map<String,String> contentMap = new HashMap<String,String>();
        //Get content from db
        //ContentList content = new ContentList
        //PageTheme theme = new PageTheme
        //CreatePageList
        //PageList - Names, Types
        //Names map to Page IDs
        //Types map to JSP pages
        //Site site = new Site( PageList )
        //request.setAttribute("content")
        //request.setAttribute("Page")
        
        
        //Forward to Appropriate Page
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
