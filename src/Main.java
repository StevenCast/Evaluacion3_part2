import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            Login log = new Login();
            log.iniciar();
        });
    }
}