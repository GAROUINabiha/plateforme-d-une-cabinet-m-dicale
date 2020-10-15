/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author garoui
 */
public class Connexion {
    Connection conn;
    public Connexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.err.println("e"); //pour afficher l'erreur//
        }
        try
        {
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinet","root","");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    
}
    Connection obtenirconnexion()
    {
        return conn;
    }
    
    
}
