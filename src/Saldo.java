import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel panel1;
    private JLabel valorSaldo;
    private JButton menuButton;
    private Menu_Navegacion Cantidad;


    public Saldo(Menu_Navegacion Cantidad){
        super("Saldo");
        this.Cantidad = Cantidad;
        setContentPane(panel1);
        setUndecorated(true);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.iniciar();
                setVisible(false);
            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        valorSaldo.setText(Double.toString(Cantidad.getSaldoDisponible()));
        setVisible(true);
    }
}
