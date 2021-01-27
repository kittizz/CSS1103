import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class work403 extends JFrame {


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                work403 form = new work403();
                form.setVisible(true);
            }
        });

    }

    public work403() {
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("โปรแกรมค่าทัวร์: กิตติทัต ปทีปกร");
        setSize(800, 700);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("โปรแกรมค่าทัวร์: กิตติทัต ปทีปกร");
        titleLabel.setBounds(290, 10, 310, 60);
        getContentPane().add(titleLabel);

        final JLabel txt1 = new JLabel("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน   จำนวน                   คน");
        txt1.setBounds(40, 90, 700, 23);
        getContentPane().add(txt1);

        final JTextField field1 = new JTextField();
        field1.setBounds(450, 80, 50, 30);
        getContentPane().add(field1);
        field1.setColumns(10);



        final JLabel txt2 = new JLabel("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน   จำนวน                   คน");
        txt2.setBounds(40, 130, 700, 23);
        getContentPane().add(txt2);

        final JTextField field2 = new JTextField();
        field2.setBounds(450, 120, 50, 30);
        getContentPane().add(field2);
        field2.setColumns(10);


        final JLabel txt3 = new JLabel("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน    จำนวน                   คน");
        txt3.setBounds(40, 170, 700, 23);
        getContentPane().add(txt3);

        final JTextField field3 = new JTextField();
        field3.setBounds(450, 160, 50, 30);
        getContentPane().add(field3);
        field3.setColumns(10);


        final JLabel txt4 = new JLabel("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน     จำนวน                   คน");
        txt4.setBounds(40, 210, 700, 23);
        getContentPane().add(txt4);

        final JTextField field4 = new JTextField();
        field4.setBounds(450, 200, 50, 30);
        getContentPane().add(field4);
        field4.setColumns(10);


        final JLabel txt5 = new JLabel("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน        จำนวน                   คน");
        txt5.setBounds(40, 250, 700, 23);
        getContentPane().add(txt5);

        final JTextField field5 = new JTextField();
        field5.setBounds(450, 240, 50, 30);
        getContentPane().add(field5);
        field5.setColumns(10);


        JButton submit = new JButton("คำนวณค่าทัวร์");

        JLabel rtxt1 = new JLabel();
        rtxt1.setBounds(40, 350, 700, 23);
        getContentPane().add(rtxt1);

        JLabel rtxt2 = new JLabel();
        rtxt2.setBounds(40, 380, 700, 23);
        getContentPane().add(rtxt2);

        JLabel rtxt3 = new JLabel();
        rtxt3.setBounds(40, 410, 700, 23);
        getContentPane().add(rtxt3);

        JLabel rtxt4 = new JLabel();
        rtxt4.setBounds(40, 440, 700, 23);
        getContentPane().add(rtxt4);

        JLabel rtxt5 = new JLabel();
        rtxt5.setBounds(40, 470, 700, 23);
        getContentPane().add(rtxt5);

        JLabel sum = new JLabel();
        sum.setBounds(350, 500, 700, 23);
        getContentPane().add(sum);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int pkg1 = Integer.parseInt(field1.getText())*50000;
                rtxt1.setText("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน   จำนวน "+field1.getText()+" คน = "+ pkg1+" บาท");

                int pkg2 = Integer.parseInt(field2.getText())*49000;
                rtxt2.setText("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน   จำนวน "+field2.getText()+" คน = "+ pkg2+" บาท");

                int pkg3 = Integer.parseInt(field3.getText())*48000;
                rtxt3.setText("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน    จำนวน "+field3.getText()+" คน = "+ pkg3+" บาท");

                int pkg4 = Integer.parseInt(field4.getText())*47000;
                rtxt4.setText("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน    จำนวน "+field4.getText()+" คน = "+ pkg4+" บาท");

                int pkg5 = Integer.parseInt(field5.getText())*46000;
                rtxt5.setText("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน        จำนวน "+field5.getText()+" คน = "+ pkg5+" บาท");

                sum.setText("รวมทั้งสิ้น = "+( pkg1+pkg2+pkg3+pkg4+pkg5 )+" บาท");
            }
        });

        submit.setBounds(300, 290, 200, 40);

        getContentPane().add(submit);



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
