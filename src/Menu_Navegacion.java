import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Navegacion extends JFrame{
    private JPanel panel1;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;

    private double saldoDisponible;

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Menu_Navegacion(){
        super("Menu");
        setContentPane(panel1);
        setResizable(false);
        saldoDisponible = 0;

        ButtonGroup grupo_botones = new ButtonGroup();
        grupo_botones.add(verSaldoRadioButton);
        grupo_botones.add(retiroRadioButton);
        grupo_botones.add(depositoRadioButton);
        grupo_botones.add(salirRadioButton);

        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo sal =new Saldo(Menu_Navegacion.this);
                sal.iniciar();
                setVisible(false);
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro ret = new Retiro(Menu_Navegacion.this);
                ret.iniciar();
                setVisible(false);
            }
        });
        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito dep = new Deposito(Menu_Navegacion.this);
                dep.iniciar();
                setVisible(false);
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Muchas Gracias");
                dispose();
                System.exit(0);
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
