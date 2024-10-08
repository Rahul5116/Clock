package CLOCK.JAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("Clock");
        super.setSize(400,400);
        super.setLocation(300 , 50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
    public void createGUI(){
        //gui coding here
        heading = new JLabel("DIGITAL CLOCK");
        clockLabel= new JLabel("Clock");

        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }
    public void startClock(){

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clockLabel.setText(dateTime);
            }
        });
        timer.start();

    }

}
