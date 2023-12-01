import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class calculatrice {

    static class Fenetre extends JFrame implements ActionListener{

        JButton somme, soustraction;
        JTextField un, deux;

        JLabel equal, resultat;

        Fenetre(String title){

            JTextField un = new JTextField("0",10);
            JTextField deux = new JTextField("0", 10);
            JLabel equal = new JLabel("=");
            JLabel resultat = new JLabel("résultat");
            somme = new JButton("Addition");
            soustraction = new JButton("Soustraction");

            JPanel jPanel = new JPanel();

            jPanel.add(un);
            jPanel.add(deux);
            jPanel.add(somme);
            jPanel.add(soustraction);
            jPanel.add(equal);
            jPanel.add(resultat);

            add(jPanel, "North");

            somme.addActionListener(this);
            soustraction.addActionListener(this);
            un.addActionListener(this);
            deux.addActionListener(this);

        }


        public void actionPerformed(ActionEvent actionEvent) {

            if (actionEvent.getSource().equals(somme))
            {
                //double nbUn = Double.parseDouble(un.getText());
                //double nbDeux = Double.parseDouble(deux.getText());

                //double sommeResult = nbUn + nbDeux;


                resultat.setText("0");

            }

            if (actionEvent.getSource().equals(soustraction))
            {
                double nbUn = Double.parseDouble(un.getText());
                double nbDeux = Double.parseDouble(deux.getText());

                double soustractionResult = nbUn + nbDeux;

                resultat.setText("0");
            }

        }
    }

    public static void main(String[] args) {

        Fenetre f = new Fenetre("Premier Pas Interface Graphique");
        f.setSize(700, 200);
        f.setVisible(true);


    }
}
