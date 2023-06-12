import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Barbut {
    private JPanel panel;

    private JButton player1;

    private JButton player2;

    private static JLabel lblRezultat;

    private JTextField txtPlayer;



    private static JFormattedTextField txtNume;
    private static JList lstPersoana;
    private  JButton btnAdauga;


    //
    private static void refreshList()
    {
        lstPersoana.setListData(arr.toArray());//intoarce un array
    }
    private static ArrayList<Integer> arr;

    public static void main(String[] args) {
        //
        JFrame frame = new JFrame("New Game");

        Zar zar = new Zar();

        Barbut main = new Barbut();
        main.panel = new JPanel();
        main.panel.setBackground(Color.BLACK);
        main.panel.setSize(100, 100);
        //
        main.player1 = new JButton("Playerul 1 arunca zarul ");
        main.player1.addActionListener(
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        main.player1.setBackground(Color.GREEN);
                        //main.player2.setSize(100,100);

                        int n = (zar.getZarul() + zar.getZarul());
                        JOptionPane.showMessageDialog(null, "Nr total este  " + n);
                        main.lblRezultat.setText("Nr anterior o fost" + n);
                    }
                }
        );
        //
        arr = new ArrayList<Integer>();
        //

        main.player2 = new JButton("playerul 2 arunca zarul");
        main.player2.addActionListener(
            new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    main.player2.setBackground(Color.BLUE);
                    // main.player2.setSize(100,100);
                    int n = (zar.getZarul() + zar.getZarul());
                    JOptionPane.showMessageDialog(null, "Nr total este " + n);
                    main.lblRezultat.setText("Nr anterior o fost " +n);

                    arr.add(n);

                    //frame.dispose();
                }
            }
        );

        // numePlayer nume =new  numePlayer();
        main.txtNume = new JFormattedTextField();
        main.txtNume.setPreferredSize(new Dimension(150,30));
        main.lblRezultat = new JLabel();

        main.panel.add(main.player1);
        main.panel.add(main.player2);

        // main.panel.add(main.txtNume);
        main.panel.add(main.lblRezultat);

        frame.setSize(300, 300); //inaltime latime fereastra
        frame.setContentPane(main.panel);

        // frame.pack();
        frame.setVisible(true);
    }
}
