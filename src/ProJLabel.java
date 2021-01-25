import javax.swing.*;
import java.awt.*;

public class ProJLabel extends JFrame {
    public static void main(String[] args) {
        ProJLabel form = new ProJLabel();
        form.setVisible(true);

    }

    public ProJLabel(){
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("CSS1103 หลักการโปรแกรมคอมพิวเตอร์ 2");
        setSize(450,300);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        int h = 100;
        int b = 200;
        double a = 0.5 * h*b;


        JLabel lbPname = new JLabel("โปรแกรมคำนวณหาพื้นที่สามเหลี่ยม");
        lbPname.setBounds(120,20,250,25);
        getContentPane().add(lbPname);

        JLabel lbHigh = new JLabel("สูง: "+h);
        lbHigh.setBounds(180,50,100,25);
        getContentPane().add(lbHigh);

        JLabel lbWidth = new JLabel("กว้าง: "+b);
        lbWidth.setBounds(180,80,100,25);
        getContentPane().add(lbWidth);

        JLabel lbArea = new JLabel("พื้นที่: "+a);
        lbArea.setBounds(180,110,100,25);
        getContentPane().add(lbArea);
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
