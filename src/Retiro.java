import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{
    private JPanel panel1;
    private JTextField valRetiro;
    private JButton menuButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton enterButton;
    private JButton limpiar;

    private Menu_Navegacion Cantidad;

    public Retiro(Menu_Navegacion Cantidad){
        super("Retiro");
        this.Cantidad = Cantidad;
        setContentPane(panel1);
        setUndecorated(true);
        valRetiro.setEditable(false);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.iniciar();
                setVisible(false);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("1");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("2");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("3");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("4");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("5");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("6");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("7");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("8");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("9");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDigito("0");
            }
            public void agregarDigito(String digito) {
                String valorActual = valRetiro.getText();
                valRetiro.setText(valorActual + digito);
            }
        });

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double retiro = Double.parseDouble(valRetiro.getText());
                double saldoActual = Cantidad.getSaldoDisponible();
                double saldoFinal = saldoActual - retiro;
                if (saldoActual < retiro){
                    JOptionPane.showMessageDialog(null, "Usted no tiene fondos disponibles ");
                } else {
                    saldoFinal = saldoActual - retiro;
                    Cantidad.setSaldoDisponible(saldoFinal);
                    valRetiro.setText("");
                }
            }
        });
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valRetiro.setText("");
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
