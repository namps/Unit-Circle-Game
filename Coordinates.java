import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//import libraries
import javax.swing.event.*;

public class Coordinates extends JPanel implements ActionListener, MouseListener {//class header Coordinates extends JPanel

        //textfield Input
        JButton back;//JButton back
        //ButtonGroup bg;
        JButton enter;//JButton enter
        JButton rootsymbol;
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
        Font header;
        Font degrees;
        JPanel c;
        CardLayout cardslayout;
        String root;
        String degree;
        int correct;
        String [] answers = {"1,0","sqrt3/2,1/2","sqrt2/2,sqrt2/2","1/2,sqrt3/2","0,1","-1/2,sqrt3/2","-sqrt2/2,sqrt2/2","-sqrt3/2,1/2","-1,0","-sqrt3/2,-1/2","-sqrt2/2,-sqrt2/2","-1/2,-sqrt3/2","0,-1","1/2,-sqrt3/2","sqrt2/2,-sqrt2/2","sqrt3/2,-1/2"};
        Boolean done;


public Coordinates(JPanel cards, CardLayout layout){//constructor

setLayout(null);//Gridlayout
addMouseListener(this);
//declare the answer JLabel
//declare the textfield Input
//declare the enter button
        //bg = new ButtonGroup();
        done=false;
        c = cards;
        cardslayout = layout;
        valarray = new JTextField [16];
       val1 = new JTextField("",10);//0
       val1.setBounds(1122,342,50,25);
       valarray[0] = val1;
       val2 = new JTextField("",10);//30
       val2.setBounds(1083,208,50,25);
       valarray[1] = val2;
       val3 = new JTextField("",10);//45
       val3.setBounds(1046,151,50,25);
       valarray[2] = val3;
       val4 = new JTextField("",10);//60
       val4.setBounds(988,100,50,25);
       valarray[3] = val4;
       val5 = new JTextField("",10);//90
       val5.setBounds(826,66,50,25);
       valarray[4] = val5;
       val6 = new JTextField("",10);//120
       val6.setBounds(664,95,50,25);
       valarray[5] = val6;
       val7 = new JTextField("",10);//135
       val7.setBounds(612,137,50,25);
       valarray[6] = val7;
       val8 = new JTextField("",10);//150
       val8.setBounds(564,194,50,25);
       valarray[7] = val8;
       val9 = new JTextField("",10);//180
       val9.setBounds(524,335,50,25);
       valarray[8] = val9;
       val10 = new JTextField("",10);//210
       val10.setBounds(564,460,50,25);
       valarray[9] = val10;
       val11 = new JTextField("",10);//225
       val11.setBounds(607,527,50,25);
       valarray[10] = val11;
       val12 = new JTextField("",10);//240
       val12.setBounds(675,575,50,25);
       valarray[11] = val12;
       val13 = new JTextField("",10);//270
       val13.setBounds(826,615,50,25);
       valarray[12] = val13;
       val14 = new JTextField("",10);//300
       val14.setBounds(974,582,50,25);
       valarray[13] = val14;
       val15 = new JTextField("",10);//315
       val15.setBounds(1039,529,50,25);
       valarray[14] = val15;
       val16 = new JTextField("",10);//330
       val16.setBounds(1081,474,50,25);
       valarray[15] = val16;
        back = new JButton("Back");//declare the back button
        back.setBounds(150,600,150,50);

        enter = new JButton ("Submit Results");
        enter.setBounds(100,300,300,100);
        //rootsymbol = new JButton("Square root");
        //rootsymbol.setBounds(100,238,300,50);
//add answer
//add Input
//add enter button
        back.addActionListener(this);
        //rootsymbol.addActionListener(this);
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
        add(back);//add back button
        //add(rootsymbol);
 //String [] answers = {"1,0",};




}

public void paintComponent(Graphics g){//paintComponent

        Color c = new Color (203,135,211);
        setBackground(c);
        super.paintComponent(g);//super.paintComponent(g)
        Color c1 = new Color (14,236,211);
        header = new Font ("MonoSpace", Font.BOLD,60);
        g.setFont(header);
        g.setColor(Color.BLACK);
        g.drawString("Learn the Coordinates",305,60);
        g.setColor(c1);
        g.drawString("Learn the Coordinates",310,60);
        g.fillOval(600,100,500,500);//draw a circle
        g.setColor(Color.BLACK);
        g.drawOval(600,100,500,500);
        g.drawLine(600,350,1100,350);//g.drawLine()//create 12 lines at the angles
        g.drawLine(850,100,850,600);
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
        degrees = new Font("Serif",Font.PLAIN,18);
        g.setFont(degrees);
        g.drawString("30",986,292);//print 12 angles of the lines
        g.drawString("45",967,251);
        g.drawString("60",934,223);
        g.drawString("90",850,200);
        g.drawString("120",781,205);
        g.drawString("135",735,231);
        g.drawString("150",708,266);
        g.drawString("180",680,345);
        g.drawString("210",695,415);
        g.drawString("225",726,439);
        g.drawString("240",752,460);
        g.drawString("270",823,500);
        g.drawString("300",901,488);
        g.drawString("315",934,463);
        g.drawString("330",955,429);
        g.drawString("360",989,369);
        g.drawString("0",995,344);
        String root = "\u221A";
        g.drawString("With the help of the degrees, enter the coordinates of the",100,100);
        g.drawString("line on the unit circle of the appropriate angle",100,125);
        g.setColor(Color.CYAN);
        g.drawString("To express a "+root+" , use sqrt",100,175);
        g.drawString("For example:",100,200);
        g.drawString("sqrt5/4",150,225);
       if (done){
                        if(correct<16){
                        g.setColor(Color.RED);
                        g.drawString("You got "+correct+ " out of 16!",170,500);
                }
                        if(correct==16){
                                g.setColor(Color.RED);
                        g.drawString("Congrulations!You got "+correct+ " out of 16!",170,500);
                }
        }
}


public void actionPerformed(ActionEvent e){//actionPerformed

if(e.getSource()==enter){

     done = true;
correct=0;
for(int x=0; x<16;x++){//if conditions that contain the right answer
      degree = valarray [x].getText();

      if(degree.compareTo(answers[x]) ==0){
        correct++;//add number of correct
      }
      }
      if(done==true)
      repaint();

  }
//root = "\u221A";

if(e.getSource() == back){//if back button is pressed
        //System.out.println("hi");
               cardslayout.first(c);

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
