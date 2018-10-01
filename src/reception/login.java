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
import javax.swing.*;
import java.awt.*;




public class login {
    
public static void main(String[] args) {
        JFrame myframe;//frame
        myframe = new JFrame("Log in");//frame name titlebar
        
        JPanel mypanel=new JPanel();
        JLabel unlabel=new JLabel("User Name");
        JTextField un=new JTextField();
        un.setColumns(30);
        JLabel pwlabel=new JLabel("Password");
        JTextField pw=new JTextField();
        pw.setColumns(30);
        
        JRadioButton fembutton=new JRadioButton("Female");
        JRadioButton fem=new JRadioButton();
        JRadioButton malbutton=new JRadioButton("Male");
        JRadioButton mal=new JRadioButton();
        
        JButton login=new JButton("Login");
        JButton delete=new JButton("Delete");
        
        
        
        mypanel.add(pwlabel);
        mypanel.add(pw);
        mypanel.add(unlabel);
        mypanel.add(un);
        mypanel.add(login);
        mypanel.add(delete);
        myframe.add(mypanel);
        myframe.setSize(300,300);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myframe.setVisible(true);//visible
        
        
    }
    
}