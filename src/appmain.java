import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author user
 */
public class appmain extends JFrame {
    private FontUIResource UIFont;
    ArrayList<JLabel> labelsArray = new ArrayList<JLabel>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                appmain form = new appmain();
                form.setVisible(true);
            }
        });

    }

    public appmain() {
        setUIFont(new FontUIResource("Microsoft Sans Serif", Font.PLAIN, 16));
        setTitle("CSS1103 หลักการโปรแกรมคอมพิวเตอร์ 2");
        setSize(600, 500);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);



        // Label
        final JLabel lbl = new JLabel("Result");
        lbl.setBounds(250, 320, 150, 60);
        getContentPane().add(lbl);


        // Button
        JButton btn1 = new JButton("Button 1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Hello : ");
            }
        });
        JButton btn2 = new JButton("Submit");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Submit Button Clicked");
            }
        });
        JButton btn3 = new JButton("Cancel");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Cancel Button Clicked");
            }
        });

        btn1.setBounds(250, 120, 80, 20);
        btn2.setBounds(350, 120, 80, 20);
        btn3.setBounds(450, 120, 80, 20);
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
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