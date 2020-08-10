package koneksi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ParkForm {

    ParkForm() {

        int i = 0;
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(4, 4, 4, 4));
        JButton[] buttons = new JButton[3];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/park", "root", "");
            String query = "select * from park_spot";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                buttons[i] = new JButton("a" + i);
                if (rs.getBoolean(2) == true) {
                    buttons[i].setBackground(Color.red);
                } else {
                    buttons[i].setBackground(Color.green);
                }
                buttons[i].setPreferredSize(new Dimension(40, 40));
                panel.add(buttons[i]);
                i++;
            }
            frame.setContentPane(panel);
            frame.pack();
            frame.setVisible(true);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new ParkForm();

    }
}
