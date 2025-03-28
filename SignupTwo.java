
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    String formno;
    
    JComboBox religion, category, occupation, education,income;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2");
        
       
       
        
        JLabel additionalDetails = new JLabel("Page 2:Additional Details");
        additionalDetails .setFont(new Font("Raleway",Font.BOLD,21));
        additionalDetails .setBounds(360,70,400,30);
        add(additionalDetails );
        
        JLabel yreligion = new JLabel("Religion:");
        yreligion.setFont(new Font("Raleway",Font.BOLD,20));
        yreligion.setBounds(100,140,100,30);
        add(yreligion); 
        
        String ValReligion[] = {"Hindu","Muslim","Sikh","Christian","other"};
        religion = new JComboBox(ValReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
      
        
        JLabel ycategory = new JLabel("Category:");
        ycategory.setFont(new Font("Raleway",Font.BOLD,20));
        ycategory.setBounds(100,190,200,30);
        add(ycategory);
        
        
        
       String ValCategory[] = {"Open","SC","ST","OBC","VJNT","Other"};
        category = new JComboBox(ValCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel yincome = new JLabel("Income:");
        yincome.setFont(new Font("Raleway",Font.BOLD,20));
        yincome.setBounds(100,240,200,30);
        add(yincome); 
      String incomecategory[] = {"Null","<1L","1-3L","3-6L","6L>"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
       
        JLabel yeducation= new JLabel("Education");
        yeducation.setFont(new Font("Raleway",Font.BOLD,20));
        yeducation.setBounds(100,290,200,30);
        add(yeducation);
       
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);       
       
        String educationValues[] = {"Non-Graduation","Graduation","Post-Graduation","Diploma","other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
       
        
        JLabel yoccupation = new JLabel("Occupation:");
        yoccupation.setFont(new Font("Raleway",Font.BOLD,20));
        yoccupation.setBounds(100,390,200,30);
        add(yoccupation);
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        JLabel panno = new JLabel("Pan Number:");
        panno.setFont(new Font("Raleway",Font.BOLD,20));
        panno.setBounds(100,440,200,30);
        add(panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel aadharno = new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("Raleway",Font.BOLD,20));
        aadharno.setBounds(100,490,200,30);
        add(aadharno);
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel seniorCetizen = new JLabel("Senior Cetizen:");
        seniorCetizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorCetizen.setBounds(100,540,200,30);
        add(seniorCetizen);
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        
        ButtonGroup seniorcetizengroup = new ButtonGroup();
        seniorcetizengroup.add(syes);
        seniorcetizengroup.add(sno);
        
        
        JLabel eaccount= new JLabel("Existing Account:");
        eaccount.setFont(new Font("Raleway",Font.BOLD,20));
        eaccount.setBounds(100,590,200,30);
        add(eaccount);
         eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        
        ButtonGroup existingaccountgroup = new ButtonGroup();
        existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(950,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String sreligion = (String)religion.getSelectedItem();
        String scategory =   (String)category.getSelectedItem();
        String sincome =   (String)income.getSelectedItem();
        String seducation =   (String)education.getSelectedItem();
        String soccupation=   (String)occupation.getSelectedItem();
        
        
        String seniorcitizen = null;
        if(syes.isSelected()){
        seniorcitizen = "yes";
        } else if (sno.isSelected()){
         seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if (eyes.isSelected()){
        existingaccount = "yes";
        } else if (eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try{
            
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')"; 
               
                c.s.executeUpdate(query);
                
                setVisible(false);
    new SignupThree(formno).setVisible(true);
            
        }catch(Exception e) {
            System.out.println(e);
        }
        
        
    }
    
 
    
    
    public static void main(String args[])
    {
       new SignupTwo("");
    }

    
    
}

