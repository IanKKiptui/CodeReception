/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception;

/**
 *
 * @author Kiptui Ian Kipchumba - 091292
 */

import java.util.*;
import java.awt.PopupMenu;
import javax.swing.JFrame;//library
import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;



public class AddUsers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myframe;// frame
        myframe=new JFrame("New User");//frame name titlebar
        
        JPanel mypanel=new JPanel();
        JLabel surnamelabel=new JLabel("Surname:");
        JTextField surname=new JTextField();
        surname.setColumns(30);
        
        JLabel firstnamelabel=new JLabel("First Name:");
        JTextField firstname=new JTextField();
        firstname.setColumns(30);
       
        JLabel DOBlabel=new JLabel("DOB:");
        JTextField DOB=new JTextField();
        DOB.setColumns(30);
        
        JLabel genderLabel=new JLabel("Gender:");
        JRadioButton gender=new JRadioButton();
        gender.setSelected(false);
        JRadioButton femalebutton=new JRadioButton("Female");
        JRadioButton female=new JRadioButton();
        JRadioButton malebutton=new JRadioButton("Male");
        JRadioButton male=new JRadioButton();
        
        
        JLabel Tellabel=new JLabel("Telephone Number:");
        JTextField Tel=new JTextField();
        Tel.setColumns(30);
        
        
        JButton saveuser=new JButton("Save User");
        JButton delete=new JButton("Delete");
        mypanel.add(surnamelabel);
        mypanel.add(surname);
        mypanel.add(firstnamelabel);
        mypanel.add(firstname);
        mypanel.add(DOBlabel);
        mypanel.add(DOB);
        mypanel.add(genderLabel);
        mypanel.add(gender);
        mypanel.add(femalebutton);
        mypanel.add(female);
        mypanel.add(malebutton);
        mypanel.add(male);
        
        myframe.add(mypanel);
        myframe.setSize(1200,1200);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//action closed
        myframe.setVisible(true);//visible
        
        
        

        
    }
    
}
    

