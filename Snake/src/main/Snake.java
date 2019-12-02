/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Vicky
 */
public class Snake extends JFrame{
    public static int WIDTH = 1600;
    public static int HEIGHT = 1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        new Snake();
    }
    
    public Snake() throws FileNotFoundException {
        super("snake");
        
        setSize(WIDTH, HEIGHT);
        setBackground(Color.BLACK);
        
        congo line = new congo();
        
        getContentPane().add(line);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
}
