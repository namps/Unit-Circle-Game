import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//import libraries

public class Radians extends JPanel implements ActionListener, MouseListener {//class header Coordinates extends JPanel

//textfield Input
JButton back;//JButton back
JButton enter;//JButton enter
        JButton pisymbol;
//JLabel answer
        JTextField [] valarray;
        JTextField val1;
        JTextField val2;
        JTextField val3;
        JTextField val4;
        JTextField val5;
        JTextField val6;
        JTextField val7;
        JTextField val8;
        JTextField val9;
        JTextField val10;
        JTextField val11;
        JTextField val12;
        JTextField val13;
        JTextField val14;
        JTextField val15;
        JTextField val16;
        JPanel c;
        CardLayout cardslayout;
        Font header;
        Font degrees;
        String degree;
        int correct;
        String [] answers = {"2pi","pi/6","pi/4","pi/3","pi/2","2pi/3","3pi/4","5pi/6","pi","7pi/6","5pi/4","4pi/3","3pi/2","5pi/3","7pi/4","11pi/6"};
        Boolean done;


public Radians(JPanel cards, CardLayout layout){//constructor
addMouseListener(this);
setLayout(null);//Gridlayout
//declare the answer JLabel
//declare the textfield Input
//declare the enter button
        done = false;
        c = cards;
        cardslayout = layout;
        valarray = new JTextField [16];
       val1 = new JTextField("",10);//0
       val1.setBounds(1050,320,37,20);
       valarray[0] = val1;
       val2 = new JTextField("",10);//30
       val2.setBounds(1010,208,37,20);
       valarray[1] = val2;
       val3 = new JTextField("",10);//45
       val3.setBounds(971,163,37,20);
       valarray[2] = val3;
       val4 = new JTextField("",10);//60
       val4.setBounds(915,130,37,20);
       valarray[3] = val4;
       val5 = new JTextField("",10);//90
       val5.setBounds(810,110,37,20);
       valarray[4] = val5;
       val6 = new JTextField("",10);//120
       val6.setBounds(698,160,37,20);
       valarray[5] = val6;
       val7 = new JTextField("",10);//135
       val7.setBounds(656,204,37,20);
       valarray[6] = val7;
       val8 = new JTextField("",10);//150
       val8.setBounds(627,251,37,20);
       valarray[7] = val8;
       val9 = new JTextField("",10);//180
       val9.setBounds(614,359,37,20);
       valarray[8] = val9;
       val10 = new JTextField("",10);//210
       val10.setBounds(651,475,37,20);
       valarray[9] = val10;
       val11 = new JTextField("",10);//225
       val11.setBounds(688,513,37,20);
       valarray[10] = val11;
       val12 = new JTextField("",10);//240
       val12.setBounds(745,547,37,20);
       valarray[11] = val12;
       val13 = new JTextField("",10);//270
       val13.setBounds(858,569,37,20);
       valarray[12] = val13;
       val14 = new JTextField("",10);//300
       val14.setBounds(963,526,37,20);
       valarray[13] = val14;
       val15 = new JTextField("",10);//315
       val15.setBounds(1005,479,37,20);
       valarray[14] = val15;
       val16 = new JTextField("",10);//330
       val16.setBounds(1036,428,37,20);
       valarray[15] = val16;
        back = new JButton("Back");//declare the back button
        back.setBounds(150,600,150,50);
       // pisymbol = new JButton ("Pi");
        //pisymbol.setBounds(100,238,300,50);
        enter = new JButton ("Submit Results");
        enter.setBounds(100,300,300,100);
//add answer
//add Input
//add enter button
        add(val1);
        add(val2);
        add(val3);
        add(val4);
        add(val5);
        add(val6);
        add(val7);
        add(val8);
        add(val9);
        add(val10);
        add(val11);
        add(val12);
        add(val13);
        add(val14);
        add(val15);
        add(val16);
     enter.addActionListener(this);
     add(enter);

back.addActionListener(this);
add(back);//add back button
   //pisymbol.addActionListener(this);
   //add(pisymbol);
}


public void paintComponent(Graphics g){//paintComponent
        Color c = new Color (171,96,249);
        setBackground(c);
        super.paintComponent(g);//super.paintComponent(g)
        Color c1 = new Color (255,255,19);
        header = new Font ("MonoSpace", Font.BOLD,60);
        g.setFont(header);
        g.setColor(Color.BLACK);
        g.drawString("Learn the Radians",355,65);
        g.setColor(c1);
        g.drawString("Learn the Radians",360,65);
        g.fillOval(600,100,500,500);//draw a circle
        g.setColor(Color.BLACK);
        g.drawOval(600,100,500,500);//draw a circle
        g.drawLine(600,350,1100,350);//g.drawLine()//create 12 lines at the angles
        g.drawLine(850,100,850,600);//
        g.drawLine(850,350,1066,225);//30
        g.drawLine(850,350,1027,174);//45
        g.drawLine(850,350,975,133);//60
        g.drawLine(850,350,725,133);//120
        g.drawLine(850,350,673,174);//135
        g.drawLine(850,350,634,225);//150
        g.drawLine(850,350,634,475);//210
        g.drawLine(850,350,673,523);//225
        g.drawLine(850,350,725,566);//240
        g.drawLine(850,350,975,566);//300
        g.drawLine(850,350,1027,523);//315
        g.drawLine(850,350,1066,475);//330
        //print 12 coordinates of the lines
        Font degrees = new Font("Serif",Font.PLAIN,18);
        g.setFont(degrees);
        String root = "\u221A";
        String pi = "\u03C0";
                g.setColor(Color.WHITE);
                g.drawString(root+"3/2,1/2",1085,224);//30//print 12 angles of the lines
        g.drawString(root+"2/2,"+root+"2/2",1048,166);//45
        g.drawString("1/2,"+root+"3/2",988,117);//60
        g.drawString("0,1",834,94);//90
        g.drawString("-1/2,"+root+"3/2",670,108);//120
        g.drawString("-"+root+"2/2,"+root+"2/2",607,164);//135
        g.drawString("-"+root+"3/2,1/2",543,222);//150
        g.drawString("-1,0",542,345);//180
        g.drawString("-"+root+"3/2,-1/2",547,480);//210
        g.drawString("-"+root+"2/2,-"+root+"2/2",587,537);//225
        g.drawString("-1/2,-"+root+"3/2",648,585);//240
        g.drawString("0,-1",823,625);//270
        g.drawString("1/2,"+root+"3/2",978,590);//300
        g.drawString(root+"2/2,-"+root+"2/2",1042,540);//315
        g.drawString(root+"3/2,-1/2",1085,494);//330
        //g.drawString("2"+root,1118,369);//360
        g.drawString("1,0",1118,370);//print 12 radians of the lines
                g.drawString("With the help of the coordinates, enter the radians of the approriate degrees",100,100);
                g.setColor(Color.BLUE);
                g.drawString("To express "+pi+" type in pi",100,175);
                g.drawString("For example:",100,200);
                                g.drawString("7pi/2",150,225);
                if (done){
                        if(correct<16){
                        g.setColor(Color.RED);
                        g.drawString("You got "+correct+ " out of 16!",170,500);
                }
                        if(correct==16){
                                g.setColor(Color.RED);
                        g.drawString("Congratulations!You got "+correct+ " out of 16!",170,500);
                }
        }
        }


public void actionPerformed(ActionEvent e){//actionPerformed

if(e.getSource()==enter){  //if conditions that contain the right answer

     done = true;
	correct = 0;
	for(int x=0; x<16;x++){//if conditions that contain the right answer
      degree = valarray [x].getText();

      if(degree.compareTo(answers[x]) ==0){
        correct++;
      }
      }
      if(done==true)
      repaint();

  }

if(e.getSource() == back){//if back button is pressed
        //System.out.println("hi");
               cardslayout.first(c);//if back button is pressed
        //go to FirstPanel
}
}
public void mousePressed (MouseEvent e){}
        public void mouseReleased (MouseEvent e){}
        public void mouseClicked (MouseEvent e){
                requestFocus();//requestFocus() in mouseclicked

                int x = e.getX();//get location of the mouse clicked
                int y = e.getY();
System.out.println(x+ "," + y);
//count = e.getClickCount();
}

        public void mouseEntered (MouseEvent e){}
        public void mouseExited (MouseEvent e){}//all five mouse events
}
