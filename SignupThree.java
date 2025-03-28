/*
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener
{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
        String formno;
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,25));
        l1.setBounds(280, 20, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 110, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Rleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,160,250,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Rleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,160,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Rleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,200,250,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Rleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,200,250,20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 280, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-5131");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330, 280, 300, 30);
        add(number);
        
         JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100, 310, 200, 15);
        add(carddetail);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 350, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330, 350, 300, 30);
        add(pnumber);
         JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100, 380, 300, 15);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100, 430, 200, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBounds(100, 480, 200, 30);
        add(c1);
        
         c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBounds(350, 480, 200, 30);
        add(c2);
        
         c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBounds(100, 530, 200, 30);
        add(c3);
        
         c4 = new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBounds(350, 530, 200, 30);
        add(c4);
        
         c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBounds(100, 580, 200, 30);
        add(c5);
        
         c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBounds(350, 580, 200, 30);
        add(c6);
        
         c7 = new JCheckBox("I hereby declares  that above entered details are correct to the best of my knowleadge ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100, 630, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250, 665, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420, 665, 100, 30);
        cancel.addActionListener(this);
        add(cancel); 
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
  
        
        setSize(850,900);
        setLocation(350,0);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
        if(r1.isSelected()){
            accountType = "Saving Account";   
        }else if(r2.isSelected()){
            accountType = "Fixed Deposit Account";
        }else if(r3.isSelected()){
            accountType = "Current Account";
        }else if(r4.isSelected()){
            accountType = "Recuuring Deposit Account";
        }
        }
        
        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong()%9000000L)) + 50409360000000L;
         String pinnumber = "" + Math.abs((random.nextLong()%9000L)) + 1000L;
         String facility = "";
            if(c1.isSelected()){
                facility = facility + "Atm Card";
            }else if(c2.isSelected()){
                facility = facility + "Internet Banking";
            }else if(c3.isSelected()){
                facility = facility + "Mobile Banking";       
            }else if(c4.isSelected()){
                facility = facility + "Email & SMS Alerts";
            }else if(c5.isSelected()){
                facility = facility + "Check Box";
            }else if(c6.isSelected()){
                facility = facility + "E-Statement";
            }   
            
            try{
                    if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account type is required");
                    } else{
                        Conn conn = new Conn();
                        //String accountType = null;
                        String  query1 = "insert into signupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                        conn.s.executeUpdate(query1);
                         JOptionPane.showMessageDialog(null,"Card Number:" + cardnumber + "\n Pin: " + pinnumber);

                        }     
                }catch (Exception e) {
                            System.out.println(e);
                            }
                    
      if(ae.getSource() == cancel) {  
        
           // return null;
        
            }

    public static void main(String args[]){
        new SignupThree("");
    }
}
*/
          
    

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno) {
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l1.setBounds(280, 20, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 110, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 160, 250, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 160, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 200, 250, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 200, 250, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 280, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-5131");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 280, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 310, 200, 15);
        add(carddetail);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 350, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 350, 300, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 380, 300, 15);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 430, 200, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(100, 480, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(350, 480, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(100, 530, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(350, 530, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(100, 580, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        c6.setBounds(350, 580, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 630, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 665, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 665, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 900);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000L)) + 504093600L;
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L)) + 1L;
            String facility = "";
            
            if (c1.isSelected()) facility += "ATM Card ";
            if (c2.isSelected()) facility += "Internet Banking ";
            if (c3.isSelected()) facility += "Mobile Banking ";
            if (c4.isSelected()) facility += "Email & SMS Alerts ";
            if (c5.isSelected()) facility += "Check Book ";
            if (c6.isSelected()) facility += "E-Statement ";
            
            try {
                if (accountType == null) {
                    JOptionPane.showMessageDialog(null, "Account type is required");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupThree values('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                   String query2 = "insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                   
                   
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\nPin: " + pinnumber);
               
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
            dispose();  // Close the window
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}
