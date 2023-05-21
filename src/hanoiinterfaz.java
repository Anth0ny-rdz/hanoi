import javax.swing.*;

public class hanoiinterfaz extends JFrame{
    private JTabbedPane tabbedPane1;
    private JTable Torre1;
    private JTable Torre2;
    private JTable Torre3;
    private JButton aButton;
    private JButton aButton1;
    private JButton cButton1;
    private JButton bButton;
    private JButton cButton;
    private JButton cButton2;
    private JComboBox comboBox1;
    private JButton reiniciarButton;
    private JButton iniciarButton;
    private JButton resolverButton;
    private JPanel mainpanel;

    public hanoiinterfaz(){
        setContentPane(mainpanel);
        setTitle("Juego Hanoi");
        setSize(920,680);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String []args){

hanoiinterfaz myFrame = new hanoiinterfaz();


    }


}
