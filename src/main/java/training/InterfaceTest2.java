package training;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class InterfaceTest2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        Date now = new Date();
        System.out.println("time to run" + now);
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) {
        ActionListener actionListener = new InterfaceTest2();
        Timer timer = new Timer(1000, actionListener);
//        timer.start();
//        JOptionPane.showMessageDialog(null, "Quit program?");
//        System.exit(0);

        Car car = new CarImpl(12, 2);

        System.out.println(car.drive());
      car.drive2("2");

    }

}
