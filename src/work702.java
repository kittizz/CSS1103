import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.ChronoField;

public class work702 {
    public static void main(String args[]) {

        JFrame frame = new JFrame("แบบฝึกหัด JTabbedPane 2");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1, panel2, panel3;
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();


        tabbedPane.addTab("ชื่อ-นามสกุล", panel1);
        tabbedPane.addTab("รายชื่อทีมฟุตบอล", panel2);
        tabbedPane.addTab("ดารา", panel3);

        JLabel name = new JLabel("นาย กิตติทัต ปทีปกร 043");
        name.setBounds(100,20,90,23);
        panel1.add(name);

        JLabel labelTeam1 = new JLabel("เชลซี");
        JLabel labelTeam2 = new JLabel("แมนยู");
        JLabel labelTeam3 = new JLabel("เลสเตอร์ซิตี");


        panel2.add(labelTeam1);
        panel2.add(labelTeam2);
        panel2.add(labelTeam3);



        JLabel labelda1 = new JLabel("ใหม่ ดาวิกา");
        JLabel labelda2 = new JLabel("ญาญ่า อุรัสยา");
        JLabel labelda3 = new JLabel("ณเดชน์ คูกิมิยะ");
        panel3.add(labelda1);
        panel3.add(labelda2);
        panel3.add(labelda3);

        

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