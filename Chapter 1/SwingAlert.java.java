import javax.swing.*;
public class SwingAlert {
JFrame f;
SwingAlert(){
f=new JFrame();
   JOptionPane.showMessageDialog(f,"Hello World!");
 
 }
 public static void main(String[] args){
  new SwingAlert();
 
 
 }
}