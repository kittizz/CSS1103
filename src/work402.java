import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class work402 extends JFrame {


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                work402 form = new work402();
                form.setVisible(true);
            }
        });

    }

    public work402() {
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("โปรแกรมค่าสินค้า: กิตติทัต ปทีปกร");
        setSize(600, 500);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("โปรแกรมค่าสินค้า: กิตติทัต ปทีปกร");
        titleLabel.setBounds(190, 20, 310, 60);
        getContentPane().add(titleLabel);

        final JLabel Labelprice = new JLabel("ราคาสินค้า");
        Labelprice.setBounds(180, 90, 144, 14);
        getContentPane().add(Labelprice);

        final JTextField Fieldprice = new JTextField();
        Fieldprice.setBounds(260, 80, 160, 30);
        getContentPane().add(Fieldprice);
        Fieldprice.setColumns(10);



        final JLabel Labeldiscount = new JLabel("ส่วนลด");
        Labeldiscount.setBounds(190, 180, 144, 14);
        getContentPane().add(Labeldiscount);


        final JTextField Fielddiscount = new JTextField();
        Fielddiscount.setBounds(240, 170, 150, 30);
        getContentPane().add(Fielddiscount);
        Fielddiscount.setColumns(10);


        final JLabel Labelfinalprice = new JLabel("ราคาสุทธิ");
        Labelfinalprice.setBounds(190, 210, 144, 25);
        getContentPane().add(Labelfinalprice);


        final JTextField Fieldfinalprice = new JTextField();
        Fieldfinalprice.setBounds(240, 220, 150, 30);
        getContentPane().add(Fieldfinalprice);
        Fieldfinalprice.setColumns(10);



        JButton submit = new JButton("คำนวณ");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double price = Double.parseDouble(Fieldprice.getText());
                double discount = 0d;
                if (price <= 10000){
                    discount = price * 0.03;
                }else if (price <= 100000){
                    discount = price * 0.05;
                }else if(price > 100000){
                    discount = price * 0.10;
                }
                Fielddiscount.setText(Double.toString(discount));
                Fieldfinalprice.setText(Double.toString(price-discount));
            }
        });

        submit.setBounds(240, 120, 100, 40);

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
