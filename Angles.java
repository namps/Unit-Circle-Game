import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//import libraries

public class Angles extends JPanel implements ActionListener, MouseListener {//class header Coordinates extends JPanel

//textfield Input
JButton back;//JButton back
JButton enter;//JButton enter
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
        Font degrees;
        Font header;
        JPanel c;
        CardLayout cardslayout;
        String degree;
        int correct;
        String [] answers = {"360","30","45","60","90","120","135","150","180","210","225","240","270","300","315","330"};
        Boolean done;

 public Angles(JPanel cards, CardLayout layout){//constructor

setLayout(null);//Gridlayout
//declare the answer JLabel
//declare the textfield Input
//declare the enter button

       done = false;
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
addMouseListener(this);

}


public void paintComponent(Graphics g){//paintComponent

        Color c = new Color (108,193,224);
        setBackground(c);
        super.paintComponent(g);//super.paintComponent(g);
        Color c1 = new Color (13,240,42);
        header = new Font("MonoSpace",Font.BOLD,60);
        g.setFont(header);
        g.setColor(Color.BLACK);
        g.drawString("Learn the Angles",365,60);
        g.setColor(c1);
        g.drawString("Learn the Angles",370,60);
        g.fillOval(600,100,500,500);//draw a circle
        g.setColor(Color.BLACK);
        g.drawOval(600,100,500,500);//draw a circle
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
        String pi = "\u03C0";
        g.drawString(pi +"/6",986,292);//30//print 12 angles of the lines
        g.drawString(pi+"/4",967,251);//45
        g.drawString(pi+"/3",934,223);//60
        g.drawString(pi+"/2",850,200);//90
        g.drawString("2"+pi+"/3",781,205);//120
        g.drawString("3"+pi+"/4",735,231);//135
        g.drawString("5"+pi+"/6",708,266);//150
        g.drawString(pi,680,345);//180
        g.drawString("7"+pi+"/6",695,415);//210
        g.drawString("5"+pi+"/4",713,441);//225
        g.drawString("4"+pi+"/3",741,469);//240
        g.drawString("3"+pi+"/2",816,500);//270
        g.drawString("5"+pi+"/3",886,488);//300
        g.drawString("7"+pi+"/4",929,468);//315
        g.drawString("11"+pi+"/6",947,434);//330
        g.drawString("2"+pi,989,369);//360
        g.drawString("2"+pi,995,344);//print 12 radians of the lines
        g.drawString("With the help of the radians, enter the degree of the angle created",100,100);
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
    //String [] input = new String [16];

 if(e.getSource()==enter){

     done = true;
correct=0;
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
