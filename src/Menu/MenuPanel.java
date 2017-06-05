package Menu;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Ted_Y on 05/06/2017.
 */
public class MenuPanel extends JPanel{

    ArrayList<JButton> startGames;
    public MenuPanel(){
        //variable initialisation
        //stores start buttons
        startGames = new ArrayList<>();

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //add start buttons
        startGames.add(new JButton("Snake"));
        startGames.add(new JButton("Frogger"));
        startGames.add(new JButton("Brick Breaker"));

        int x = 0;
        int position = GridBagConstraints.PAGE_START;
        int seqIncrement = 10;
        c.gridx = 0;
        c.weightx = .7;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        for(JButton button : startGames){
            button.setSize(1000,100);

            //anchors elements
            c.anchor = position;
            seqIncrement = -1 * (seqIncrement - 1);
            position += seqIncrement;
            c.gridy = x++;

            add(button,c);
        }

        c.weighty = 15;
        c.gridy = x;
        add(new JPanel(),c);

        //setup panel
        setName("Insert Dank Name Here");

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100,500);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new MenuPanel());
        frame.setSize(300,500);
        frame.setVisible(true);
    }
}
