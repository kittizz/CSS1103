import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class work401 extends JFrame {

    double Sum =0d;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                work401 form = new work401();
                form.setVisible(true);
            }
        });

    }

    public work401() {
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("โปรแกรมหาค่ารวมและค่าเฉลี่ย: กิตติทัต ปทีปกร");
        setSize(600, 500);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("โปรแกรมหาค่ารวมและค่าเฉลี่ย: กิตติทัต ปทีปกร");
        titleLabel.setBounds(140, 20, 310, 60);
        getContentPane().add(titleLabel);

        Map<JTextField, JLabel> Num = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            final JLabel Labelnum = new JLabel("จำนวนที่ "+(i+1));
            Labelnum.setBounds(180, 90+(i*40), 144, 14);
            getContentPane().add(Labelnum);

            final JTextField Fieldnum = new JTextField();
            Fieldnum.setBounds(260, 80+(i*40), 80, 30);
            getContentPane().add(Fieldnum);
            Fieldnum.setColumns(10);

            Num.put(Fieldnum, Labelnum);

        }

        final JLabel LabelSum = new JLabel("ค่ารวม");
        LabelSum.setBounds(190, 380, 144, 14);
        getContentPane().add(LabelSum);


        final JTextField FieldSum = new JTextField();
        FieldSum.setBounds(240, 370, 150, 30);
        getContentPane().add(FieldSum);
        FieldSum.setColumns(10);


        final JLabel Labelaverage = new JLabel("ค่าเฉลี่ย");
        Labelaverage.setBounds(190, 415, 144, 25);
        getContentPane().add(Labelaverage);


        final JTextField Fieldaverage = new JTextField();
        Fieldaverage.setBounds(240, 410, 150, 30);
        getContentPane().add(Fieldaverage);
        Fieldaverage.setColumns(10);



        JButton submit = new JButton("คำนวณ");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sum = 0d;
                Num.forEach((fnum,lnum)->{
                    Sum +=Double.parseDouble(fnum.getText());
                    FieldSum.setText(Double.toString(Sum));
                    double average = Sum/ Num.size();
                    Fieldaverage.setText(Double.toString(average));
                });

            }
        });

        submit.setBounds(230, 300, 100, 40);

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
