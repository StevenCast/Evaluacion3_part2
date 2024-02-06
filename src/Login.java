import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel panel1;
    private JTextField nombreUsu;
    private JTextField passUsu;
    private JButton ingresarButton;

    public Login() {
        super("Login");
        setContentPane(panel1);
        setResizable(false);
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String nombre = nombreUsu.getText();
                    String pass = passUsu.getText();
                    if (nombre.equals("Martin") && pass.equals("123")){
                        Menu_Navegacion menu1 = new Menu_Navegacion();
                        menu1.iniciar();
                        setVisible(false);
                    }else {
                        JOptionPane.showMessageDialog(null, "Intentar otra vez");
                        nombreUsu.setText("");
                        passUsu.setText("");
                    }
                }catch (ArithmeticException error){
                    JOptionPane.showMessageDialog(null,"Ingrese valores validos");
                }

            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
