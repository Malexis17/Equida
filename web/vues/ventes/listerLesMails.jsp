<%-- 
    Document   : listerLesMails
    Created on : 10 sept. 2020, 11:40:29
    Author     : sio2
--%>

<%@page import="modele.Couriel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            table th,td{
                border: 1px solid black;
                padding: 5px;
                    
            }
        </style>
        <h1>LISTE DES MAILS POUR UNE VENTE</h1>
        
         <%
        ArrayList<Couriel> lesMails = (ArrayList)request.getAttribute("pLesMails");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>Date</th>
                    <th>Objet</th>
                 
                   
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    
                        for(int i = 0; i < lesMails.size();i++)
                    {
                      
                      Couriel unCouriel = lesMails.get(i);
                        out.println("<tr><td>");
                        out.println(unCouriel.getId());
                        out.println("</a></td>");
                        
                        
                        out.println("<td>");
                        out.println(unCouriel.getDate());
                        out.println("</td>");
                        
                         
                        out.println("<td>");
                        out.println(unCouriel.getObjet());
                        out.println("</td>");
                        
                        
                        
                        
                               
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    </body>
</html>
