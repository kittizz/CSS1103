import javax.swing.*;
import java.awt.*;

public class work1 extends JFrame {
    public static void main(String[] args) {
        work1 form = new work1();
        form.setVisible(true);
    }

    public work1(){
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("โปรแกรมคำนวณหาพื้นที่วงกลม - 043 กิตติทัต");
        setSize(450,300);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


        double radius;
        radius = 20;
        double Area = radius * radius * 3.14159;;


        JLabel lbPname = new JLabel("โปรแกรมคำนวณหาพื้นที่วงกลม");
        lbPname.setBounds(120, 20, 250, 25);
        getContentPane().add(lbPname);

        JLabel lbHigh = new JLabel("รัศมี : "+radius);
        lbHigh.setBounds(180,50,100,25);
        getContentPane().add(lbHigh);

        JLabel lbWidth = new JLabel("พื้นที่ : "+Area);
        lbWidth.setBounds(180,80,100,25);
        getContentPane().add(lbWidth);

    }
    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }

}
