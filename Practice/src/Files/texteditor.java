package Files;
/* Copyright (c) SEMM NL All rights reserved.
Author : Paul Hamaker. Part of JavaLessons.com
This code is for educational purposes only. Use at own risk.*/

import java.awt.* ; 
import java.applet.* ; 
import java.awt.event.*; 
import java.io.*; 
 
 
public class texteditor 
    extends Applet 
    implements ActionListener 
{ 
  TextArea ta ; 
  Button btns, btnr ; 
 
  public void actionPerformed( ActionEvent ev ) 
  { 
    if ( ev.getSource() == btns ) 
    { 
      PrintWriter pw = null ; 
      try { 
      FileWriter fw = 
        new FileWriter ( "temptest.lns" ) ; 
 
      pw = new PrintWriter ( fw ) ; 
 
      pw.println ( "String saved on disk" ) ; 
      pw.println ( "This 2nd line, too" ) ; 
 
      ta.append ( "Data has been saved on disk\n\n" ) ; 
      ta.append ( "============================\n\n" ) ; 
      } 
      catch ( IOException e ) 
      { 
        ta.append ("== IO Error ===" + e + "\n" ) ; 
      } 
      finally 
      { 
      if ( pw != null ) 
        pw.close (); 
      } 
      return ; 
    } 
    if ( ev.getSource() == btnr ) 
    { 
      BufferedReader br = null ; 
      try { 
      FileReader fr = 
        new FileReader ( "temptest.lns" ) ; 
 
      br = new BufferedReader ( fr ) ; 
 
      ta.append ( "Contents of file temptest.lns :\n\n" ) ; 
 
      String line = br.readLine ( ) ; 
      while ( line != null )     //not EndOfFile 
      { 
          ta.append ( line + "\n" ) ; 
          line = br.readLine ( ) ; 
      } 
      ta.append ( "============================\n\n" ) ; 
      } 
      catch ( IOException e ) 
      { 
        ta.append ("== IO Error ===" + e + "\n") ; 
      } 
      try 
      { 
      if ( br != null ) 
        br.close (); 
      } 
      catch (IOException e) 
      { 
        ta.append ( "Error : can't close "  + e + "\n" ) ; 
      } 
      return ; 
    } 
  } 
 
  public texteditor ( ) 
  { 
    ta = new TextArea ( 12, 40 ) ; 
    btns = new Button ( "Save it" ) ; 
    btnr = new Button ( "Retrieve it" ) ; 
  } 
 
  public void init() 
  { 
    add ( btns ) ; 
    add ( btnr ) ; 
    btns.addActionListener ( this ) ; 
    btnr.addActionListener ( this ) ; 
    add ( ta ) ; 
    setBackground ( Color.orange ) ; 
    validate() ; 
  } 
} 

 