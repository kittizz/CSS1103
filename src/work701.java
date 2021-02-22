import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.ChronoField;

public class work701 {
    public static void main(String args[]) {

        JFrame frame = new JFrame("แบบฝึกหัด JTabbedPane");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1, panel2, panel3;
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();


        tabbedPane.addTab("ชื่อ-นามสกุล", panel1);
        tabbedPane.addTab("วัน เดือน ปี ", panel2);
        tabbedPane.addTab("เวลา", panel3);

        JLabel name = new JLabel("นาย กิตติทัต ปทีปกร 043");
        name.setBounds(100,20,90,23);
        panel1.add(name);

        JLabel labelDate = new JLabel();
        ThaiBuddhistDate date = ThaiBuddhistDate.now();
        String[] thMonths = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน",
                "กรกฎาคม", "สงิหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};
        int d = date.get(ChronoField.DAY_OF_MONTH);
        int m = date.get(ChronoField.MONTH_OF_YEAR);
        int y = date.get(ChronoField.YEAR);
        labelDate.setText(d + " " + thMonths[m-1] + " " + y);
        labelDate.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        panel2.add(labelDate);

        JLabel labelTime = new JLabel();
        labelTime.setFont(labelDate.getFont()); //ก าหนด font
        updateTime(labelTime); //เรียกเมธอด updateTime
        panel3.add(labelTime);

        

        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,350);
        frame.setVisible(true);
    }
    private static void updateTime(JLabel jLabel) {
        LocalTime time = LocalTime.now(); //สร ้างออปเจ็คเวลาปัจจุบัน
        int h = time.getHour(); //อา่ นคา่ ชวั่ โมง
        int m = time.getMinute(); //อ่านค่านาที
        jLabel.setText(h + ":" + m); //เอาไปก าหนดให ้กับ Jlabel
    }
}