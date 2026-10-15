package com.jpa.jpa;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import java.sql.*;

public class DatabaseInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>
{

    
    @Override 
    public void initialize(ConfigurableApplicationContext c1) 
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "12345678";
            Connection c=DriverManager.getConnection(url,username,password);
            Statement s=c.createStatement();
            s.execute("create database if not exists jpa_db");
            s.close();
            c.close();
        }
        catch(SQLException e)
        {
            System.out.println("chor pakada gaya");
        }
    }
    
    

}
