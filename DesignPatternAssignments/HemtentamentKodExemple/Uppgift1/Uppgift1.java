package Uppgift1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

public class Uppgift1 {
    public static void main(String[] args) throws IOException {
        // Factory
        Calendar calendar = Calendar.getInstance();
        calendar.set(1997, Calendar.NOVEMBER, 10);
        Date date = calendar.getTime();
        System.out.println(date);

        // Observer
        JButton button = new JButton("Tap");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hej Nahid! :D");
            }
        });

        // Strategy
        OutputStream os = new FileOutputStream("Uppgift1/output.txt");
        byte data = 127;
        os.write(data);
        os.close();

        // Decorator
        JComponent component = new JPanel();
        JScrollPane scrollPane = new JScrollPane(component);

        // Singleton
        Runtime runtime = Runtime.getRuntime();
        var processors = runtime.availableProcessors();
        System.out.println(processors);

        // Adapter
        InputStream is = new FileInputStream("Uppgift1/file.txt");
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
    }
}
