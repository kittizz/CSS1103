import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class work6 extends  JFrame{

    work6() {
        // สร้าง windows
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));

        setTitle("โปรแกรมสั่งอาหาร: กิตติทัต ปทีปกร");
        setSize(500, 300);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("โปรแกรมสั่งอาหาร: กิตติทัต ปทีปกร");
        titleLabel.setBounds(110, 10, 310, 60);
        getContentPane().add(titleLabel);

        // สร้าง label
        final JLabel label = new JLabel();
        label.setSize(500, 100);
        label.setBounds(80, 50, 340, 60);
        // สร้างปุ่ม
        JButton b = new JButton("สั่ง");
        b.setBounds(250, 150, 80, 30);

        // สร้างข้อมูลรายการเลือกที่ 1 (l1)
        final DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("ข้าวไข่เจียว");
        l1.addElement("ข้าวผัดกระเพรา");
        l1.addElement("ข้าวหมูทอดกระเทียม");
        l1.addElement("ข้าวหน้าเนื้อ");
        l1.addElement("ข้าวผัดรวมิตร");


        // สร้างรายการเลือกชื่อ list1
        final JList<String> list1 = new JList<>(l1);
        list1.setBounds(85, 100, 150, 120);




        //เพิ่มเข้าไปใน Windows
        add(label);
        add(list1);
        add(b);

        setSize(450, 450);
        setLayout(null);
        setVisible(true);

        //ตรวจสอบการกระทำกับ button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (list1.getSelectedIndex() != -1) {
                    data = "คุณลูกค้าได้สั่งอาหารรายการดังนี้ : " + list1.getSelectedValue();
                    label.setText(data);
                }
                label.setText(data);
            }
        });
    }

    public static void main(String args[]) {
        new work6();
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