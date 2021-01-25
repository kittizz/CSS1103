import javax.swing.*;
import java.awt.*;

public class work3 extends JFrame {
    public static void main(String[] args) {

        work3 form = new work3();
        form.setVisible(true);

    }

    public work3(){
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif",Font.PLAIN,16));
        setTitle("โปรแกรมคำนวณค่าผ่อนรถยนต์ - 043 กิตติทัต");
        setSize(500,350);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //กำหนดตัวแปร
        int price =650000;      //ราคารถยนต์
        int down = 300000;    //เงินดาวน์
        int years  = 4;     //จำนวนปีที่จะผ่อน
        double interest_rate = 4.75;     //อัตราดอกเบี้ย

        double total =(price-down)*((interest_rate * 0.01) +1); // จำนวนเงินที่ต้องจ่ายทั้งหมด
        double savings_per_month = total/(12*years); // เงินผ่อนต่อเดือน



        //สร้างLabel
        JLabel lbPname = new JLabel("โปรแกรมคำนวณค่าผ่อนรถยนต์");
        lbPname.setBounds(100, 20, 250, 25);
        Component add = getContentPane().add(lbPname);

        JLabel lbl1 = new JLabel("ราคารถยนต์ : "+price);
        lbl1.setBounds(120,50,200,25);
        getContentPane().add(lbl1);

        JLabel lbw1 = new JLabel("เงินดาวน์ : "+down);
        lbw1.setBounds(120,80,200,25);
        getContentPane().add(lbw1);

        JLabel lbl2 = new JLabel("จำนวนปีที่จะผ่อน : "+years);
        lbl2.setBounds(120,110,200,25);
        getContentPane().add(lbl2);

        JLabel lbw2 = new JLabel("อัตราดอกเบี้ย : "+interest_rate);
        lbw2.setBounds(120,140,200,25);
        getContentPane().add(lbw2);

        JLabel lbArea1 = new JLabel("จำนวนเงินที่ต้องจ่ายทั้งหมด : "+total);
        lbArea1.setBounds(120,200,350,25);
        getContentPane().add(lbArea1);

        JLabel lbArea2 = new JLabel("เงินผ่อนต่อเดือน : "+savings_per_month);
        lbArea2.setBounds(120,220,350,25);
        getContentPane().add(lbArea2);


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
