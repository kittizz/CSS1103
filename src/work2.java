import javax.swing.*;
import java.awt.*;

public class work2 extends JFrame {
    public static void main(String[] args) {

        work2 form = new work2();
        form.setVisible(true);

    }

    public work2(){
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif",Font.PLAIN,16));
        setTitle("โปรแกรมคำนวณพื้นที่ค่าตัดหญ้า - 043 กิตติทัต");
        setSize(450,350);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //กำหนดตัวแปร
        int l1=100;      //ความยาวของรั่วบ้าน
        int w1 = 200;    //ความกว้างของรั้วบ้าน
        int l2 = 50;     //ความยาวตัวบ้าน
        int w2= 100;     //ความกว้างของตัวบ้าน
        int rate = 150;  //อัตราค่าจ้างค่าตัดหญ้า

        int area1 =l1*w1; // พื้นที่ของรั่วบ้าน
        int area2 =l2*w2; // พื้นที่ของตัวบ้าน
        int area3 =area1-area2; //พื้นที่สนามหญ้า

        int cost =area3*rate;


        //สร้างLabel
        JLabel lbPname = new JLabel("โปรแกรมคำนวณพื้นที่ค่าตัดหญ้า");
        lbPname.setBounds(120, 20, 250, 25);
        Component add = getContentPane().add(lbPname);

        JLabel lbl1 = new JLabel("ความยาวของรั้วบ้าน : "+l1);
        lbl1.setBounds(150,50,200,25);
        getContentPane().add(lbl1);

        JLabel lbw1 = new JLabel("ความกว้างของรั้วบ้าน : "+w1);
        lbw1.setBounds(150,80,200,25);
        getContentPane().add(lbw1);

        JLabel lbl2 = new JLabel("ความยาวของตัวบ้าน : "+l2);
        lbl2.setBounds(150,110,200,25);
        getContentPane().add(lbl2);

        JLabel lbw2 = new JLabel("ความกว้างของตัวบ้าน : "+w2);
        lbw2.setBounds(150,140,200,25);
        getContentPane().add(lbw2);

        JLabel lbArea1 = new JLabel("พื้นที่ของรั้วบ้าน : "+area1);
        lbArea1.setBounds(150,170,200,25);
        getContentPane().add(lbArea1);

        JLabel lbArea2 = new JLabel("พื้นที่ของตัวบ้าน : "+area2);
        lbArea2.setBounds(150,200,200,25);
        getContentPane().add(lbArea2);

        JLabel lbArea3 = new JLabel("พื้นที่ของสนามหญ้า : "+area3);
        lbArea3.setBounds(150,230,200,25);
        getContentPane().add(lbArea3);

        JLabel lbcost = new JLabel("ค่าจ้าง : "+cost);
        lbcost.setBounds(150,260,200,25);
        getContentPane().add(lbcost);
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
