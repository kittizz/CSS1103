import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class work404 extends JFrame {


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                work404 form = new work404();
                form.setVisible(true);
            }
        });

    }

    public work404() {
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("โปรแกรมค่าทัวร์พร้อมแพคเกจเสริม: กิตติทัต ปทีปกร");
        setSize(900, 700);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("โปรแกรมค่าทัวร์พร้อมแพคเกจเสริม: กิตติทัต ปทีปกร");
        titleLabel.setBounds(290, 10, 340, 60);
        getContentPane().add(titleLabel);

        final JLabel txt1 = new JLabel("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน   จำนวน                   คน");
        txt1.setBounds(40, 90, 700, 23);
        getContentPane().add(txt1);

        final JTextField field1 = new JTextField();
        field1.setBounds(450, 80, 50, 30);
        getContentPane().add(field1);
        field1.setColumns(10);

        JCheckBox checkboxCar1 = new JCheckBox("เช่ารถ");
        checkboxCar1.setBounds(540, 85, 80, 30);
        getContentPane().add(checkboxCar1);

        JCheckBox checkboxRoom1 = new JCheckBox("ห้องพักเพิ่มเติม");
        checkboxRoom1.setBounds(620, 85, 180, 30);
        getContentPane().add(checkboxRoom1);



        final JLabel txt2 = new JLabel("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน   จำนวน                   คน");
        txt2.setBounds(40, 130, 700, 23);
        getContentPane().add(txt2);

        final JTextField field2 = new JTextField();
        field2.setBounds(450, 120, 50, 30);
        getContentPane().add(field2);
        field2.setColumns(10);

        JCheckBox checkboxCar2 = new JCheckBox("เช่ารถ");
        checkboxCar2.setBounds(540, 125, 80, 30);
        getContentPane().add(checkboxCar2);

        JCheckBox checkboxRoom2= new JCheckBox("ห้องพักเพิ่มเติม");
        checkboxRoom2.setBounds(620, 125, 180, 30);
        getContentPane().add(checkboxRoom2);




        final JLabel txt3 = new JLabel("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน    จำนวน                   คน");
        txt3.setBounds(40, 170, 700, 23);
        getContentPane().add(txt3);

        final JTextField field3 = new JTextField();
        field3.setBounds(450, 160, 50, 30);
        getContentPane().add(field3);
        field3.setColumns(10);

        JCheckBox checkboxCar3 = new JCheckBox("เช่ารถ");
        checkboxCar3.setBounds(540, 165, 80, 30);
        getContentPane().add(checkboxCar3);

        JCheckBox checkboxRoom3= new JCheckBox("ห้องพักเพิ่มเติม");
        checkboxRoom3.setBounds(620, 165, 180, 30);
        getContentPane().add(checkboxRoom3);




        final JLabel txt4 = new JLabel("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน     จำนวน                   คน");
        txt4.setBounds(40, 210, 700, 23);
        getContentPane().add(txt4);

        final JTextField field4 = new JTextField();
        field4.setBounds(450, 200, 50, 30);
        getContentPane().add(field4);
        field4.setColumns(10);

        JCheckBox checkboxCar4 = new JCheckBox("เช่ารถ");
        checkboxCar4.setBounds(540, 205, 80, 30);
        getContentPane().add(checkboxCar4);

        JCheckBox checkboxRoom4= new JCheckBox("ห้องพักเพิ่มเติม");
        checkboxRoom4.setBounds(620, 205, 180, 30);
        getContentPane().add(checkboxRoom4);




        final JLabel txt5 = new JLabel("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน        จำนวน                   คน");
        txt5.setBounds(40, 250, 700, 23);
        getContentPane().add(txt5);

        final JTextField field5 = new JTextField();
        field5.setBounds(450, 240, 50, 30);
        getContentPane().add(field5);
        field5.setColumns(10);

        JCheckBox checkboxCar5 = new JCheckBox("เช่ารถ");
        checkboxCar5.setBounds(540, 245, 80, 30);
        getContentPane().add(checkboxCar5);

        JCheckBox checkboxRoom5= new JCheckBox("ห้องพักเพิ่มเติม");
        checkboxRoom5.setBounds(620, 245, 180, 30);
        getContentPane().add(checkboxRoom5);




        JButton submit = new JButton("คำนวณค่าทัวร์");

        JLabel rtxt1 = new JLabel();
        rtxt1.setBounds(40, 350, 900, 23);
        getContentPane().add(rtxt1);

        JLabel rtxt2 = new JLabel();
        rtxt2.setBounds(40, 380, 900, 23);
        getContentPane().add(rtxt2);

        JLabel rtxt3 = new JLabel();
        rtxt3.setBounds(40, 410, 900, 23);
        getContentPane().add(rtxt3);

        JLabel rtxt4 = new JLabel();
        rtxt4.setBounds(40, 440, 900, 23);
        getContentPane().add(rtxt4);

        JLabel rtxt5 = new JLabel();
        rtxt5.setBounds(40, 470, 900, 23);
        getContentPane().add(rtxt5);

        JLabel sum = new JLabel();
        sum.setBounds(350, 500, 700, 23);
        getContentPane().add(sum);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int pkg1 = Integer.parseInt(field1.getText())*50000;
                String pkgTxt1 = "1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน   จำนวน "+field1.getText()+" คน = "+ pkg1+" บาท";
                double pkgCar1 = 0;
                if (checkboxCar1.isSelected()){
                    pkgCar1 =  Math.ceil((double) Integer.parseInt(field1.getText())/4)*2000;
                    pkgTxt1 += " เช่ารถ "+pkgCar1+" บาท";
                }
                double pkgRoom1 = 0;
                if (checkboxRoom1.isSelected()){
                    pkgRoom1 = Math.ceil((double) Integer.parseInt(field1.getText())/2)*2000;
                    pkgTxt1 += " ห้องพัก "+pkgRoom1+" บาท";
                }
                rtxt1.setText(pkgTxt1);



                int pkg2 = Integer.parseInt(field1.getText())*49000;
                String pkgTxt2 = "2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน   จำนวน "+field2.getText()+" คน = "+ pkg2+" บาท";
                double pkgCar2 = 0;
                if (checkboxCar2.isSelected()){
                    pkgCar2 =  Math.ceil((double) Integer.parseInt(field2.getText())/4)*2000;
                    pkgTxt2 += " เช่ารถ "+pkgCar2+" บาท";
                }
                double pkgRoom2 = 0;
                if (checkboxRoom2.isSelected()){
                    pkgRoom2 = Math.ceil((double) Integer.parseInt(field2.getText())/2)*1500;
                    pkgTxt2 += " ห้องพัก "+pkgRoom2+" บาท";
                }
                rtxt2.setText(pkgTxt2);



                int pkg3 = Integer.parseInt(field1.getText())*48000;
                String pkgTxt3 = "3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน    จำนวน "+field3.getText()+" คน = "+ pkg3+" บาท";
                double pkgCar3 = 0;
                if (checkboxCar3.isSelected()){
                    pkgCar3 =  Math.ceil((double) Integer.parseInt(field3.getText())/4)*2000;
                    pkgTxt3 += " เช่ารถ "+pkgCar3+" บาท";
                }
                double pkgRoom3 = 0;
                if (checkboxRoom3.isSelected()){
                    pkgRoom3 = Math.ceil((double) Integer.parseInt(field3.getText())/2)*1200;
                    pkgTxt3 += " ห้องพัก "+pkgRoom3+" บาท";
                }
                rtxt3.setText(pkgTxt3);



                int pkg4 = Integer.parseInt(field1.getText())*47000;
                String pkgTxt4 = "4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน    จำนวน "+field4.getText()+" คน = "+ pkg4+" บาท";
                double pkgCar4 = 0;
                if (checkboxCar4.isSelected()){
                    pkgCar4 =  Math.ceil((double) Integer.parseInt(field4.getText())/4)*2000;
                    pkgTxt4 += " เช่ารถ "+pkgCar4+" บาท";
                }
                double pkgRoom4 = 0;
                if (checkboxRoom4.isSelected()){
                    pkgRoom4 = Math.ceil((double) Integer.parseInt(field4.getText())/2)*1600;
                    pkgTxt4 += " ห้องพัก "+pkgRoom4+" บาท";
                }
                rtxt4.setText(pkgTxt4);



                int pkg5 = Integer.parseInt(field1.getText())*46000;
                String pkgTxt5 = "5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน        จำนวน "+field5.getText()+" คน = "+ pkg5+" บาท";
                double pkgCar5 = 0;
                if (checkboxCar5.isSelected()){
                    pkgCar5 =  Math.ceil((double) Integer.parseInt(field5.getText())/4)*2000;
                    pkgTxt5 += " เช่ารถ "+pkgCar5+" บาท";
                }
                double pkgRoom5 = 0;
                if (checkboxRoom5.isSelected()){
                    pkgRoom5 = Math.ceil((double) Integer.parseInt(field5.getText())/2)*2100;
                    pkgTxt5 += " ห้องพัก "+pkgRoom5+" บาท";
                }
                rtxt5.setText(pkgTxt5);
                double allSum =pkg1+pkg2+pkg3+pkg4+pkg5+pkgCar1+pkgRoom1 +pkgCar2+pkgRoom2 +pkgCar3+pkgRoom3 +pkgCar4+pkgRoom4 +pkgCar5+pkgRoom5;
                sum.setText("รวมทั้งสิ้น = "+( allSum )+" บาท");
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
