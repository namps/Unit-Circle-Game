import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//import libraries

public class FirstPage extends JPanel{//class header FirstPage implementing ActionListener

JPanel cards;
Coordinates c;
Angles a;
Radians r;
HomePage h;
CardLayout layout;

public FirstPage() {//constructor

        setLayout(new GridLayout (1,1));
        cards = new JPanel();//CardLayout
    layout = new CardLayout();
        h = new HomePage();
        c = new Coordinates(cards,layout);
        a = new Angles(cards,layout);
        r = new Radians(cards,layout);
    cards.setLayout (layout);
    cards.add(h, "HomePage");
    cards.add(c, "Coordinates");
    cards.add(a, "Angles");
    cards.add(r, "Radians");
    add(cards);//add the cards
        //CardLayout cardslayout = (CardLayout)cards.getLayout();
              // layout.show(cards, "HomePage");
                   }

 public void paintComponent(Graphics g){

 }



class HomePage extends JPanel implements ActionListener, MouseListener{

JButton C;//JButton Coordinates
JButton A;//JButton Angles
JButton R;//JButton Radians
ButtonGroup bg;
//JLabel logo;
Font text;

public HomePage(){
        setLayout(null);//setLayout (new FlowLayout(FlowLayout.CENTER, 500, 30));//FlowLayout
        bg = new ButtonGroup();
        text = new Font("Serif",Font.BOLD,18);
        setFont(text);
        addMouseListener(this);
        //logo = new JLabel ("KNOW YOUR UNIT CIRCLE");
        //logo.setBounds(400,50,200,150);//logo

        C = new JButton ("Given the Angle, Find the Coordinates");//instantiate Coordinates the class
        C.setBounds(400,200,500,100);//C
        A = new JButton ("Given the Radians, Find the Angles");//instantiate Angles the class
        A.setBounds(400,350,500,100);//A
        R = new JButton ("Given the Coordinates, Find the Radians");//instantiate Radians the class
        R.setBounds(400,500,500,100);//R
        C.addActionListener(this);//create an ActionListener
        A.addActionListener(this);
        R.addActionListener(this);
        //create buttons for all the three classes
        bg.add(C);//c for coordinates
        bg.add(A);//a for angles
        bg.add(R);//r for radians
        //add(logo);
        add(C);
        add(A);
        add(R);
}

public void paintComponent(Graphics g){//paintComponent
        Color c = new Color (30,250,200);//130,250,200
        setBackground(c);
        super.paintComponent(g);
        /*Image i = Toolkit.getDefaultToolkit().getImage("IMG_2856.jpg");
        g.drawImage(i,200,10,900,700,this);*/
        Font text = new Font ("DialogInput",Font.BOLD,60);
        setFont(text);
        //g.drawString ("KNOW YOUR UNIT CIRCLE", 300,100);//have an image as the background
        Image i = Toolkit.getDefaultToolkit().getImage("Sin,Cos,Tan.jpg");
        g.drawImage(i,225,25,this);


}

public void actionPerformed(ActionEvent e){//actionPerformed
        CardLayout layout = (CardLayout)(cards.getLayout());
if (e.getSource() ==C)//if e.getSource == c
        layout.show(cards, "Coordinates");//go to the coordinates class using show()
else if (e.getSource()==A)//if e.getSource == a
        layout.show(cards, "Angles");//go to angles class using show()
else if (e.getSource() ==R)//if e.getSource == r
        layout.show(cards, "Radians");//go to the radians class using show()
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


}
