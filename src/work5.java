import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class work5 extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                work5 form = new work5();
                form.setVisible(true);
            }
        });

    }

    work5 (){
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("โปรแกรมคำนวณภาษี: กิตติทัต ปทีปกร");
        setSize(500, 300);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("โปรแกรมคำนวณภาษี: กิตติทัต ปทีปกร");
        titleLabel.setBounds(140, 10, 310, 60);
        getContentPane().add(titleLabel);

        JLabel fieldLabel = new JLabel("จำนวนเงินที่จะคำนวนภาษี");
        fieldLabel.setBounds(40,50,170,30);
        getContentPane().add(fieldLabel);

        JTextField texField = new JTextField();
        texField.setBounds(210,50,190,30);
        getContentPane().add(texField);

        JLabel categoryLabel = new JLabel("เลือกประเภทกิจการ");
        categoryLabel.setBounds(40,80,170,30);
        getContentPane().add(categoryLabel);



        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton bankRadio = new JRadioButton("ธนาคาร");
        bankRadio.setActionCommand("0.03");
        bankRadio.setBounds(40,100,170,30);
        buttonGroup.add(bankRadio);
        getContentPane().add(bankRadio);


        JRadioButton LifeinsuranceRadio = new JRadioButton("ประกันชีวิต");
        LifeinsuranceRadio.setActionCommand("0.025");
        LifeinsuranceRadio.setBounds(40,120,170,30);
        buttonGroup.add(LifeinsuranceRadio);
        getContentPane().add(LifeinsuranceRadio);


        JRadioButton stockMarketRadio = new JRadioButton("ตลาดหลักทรัพย์");
        stockMarketRadio.setActionCommand("0.001");
        stockMarketRadio.setBounds(40,140,170,30);
        buttonGroup.add(stockMarketRadio);
        getContentPane().add(stockMarketRadio);


        JRadioButton RealestateRadio = new JRadioButton("อสังหาริมทรัพย์");
        RealestateRadio.setActionCommand("0.01");
        RealestateRadio.setBounds(40,160,170,30);
        buttonGroup.add(RealestateRadio);
        getContentPane().add(RealestateRadio);


        JRadioButton OtherRadio = new JRadioButton("ประเภทอื่นๆ");
        OtherRadio.setActionCommand("0.05");
        OtherRadio.setBounds(40,180,170,30);
        buttonGroup.add(OtherRadio);
        getContentPane().add(OtherRadio);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(40,210,170,30);
        getContentPane().add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        double tex = Double.parseDouble(texField.getText());
                        double rate = Double.parseDouble(button.getActionCommand());
                        String text =  "จำนวนเงินที่จะคำนวณภาษี = "+tex+"\n";
                        text +=  "ประเภทกิจการ = "+button.getText()+"\n";
                        text += "ภาษาร้อยละ "+(rate*100)+" = "+(tex*rate);
                        JOptionPane.showMessageDialog(getContentPane(),text);
                    }
                }
            }
        });
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
