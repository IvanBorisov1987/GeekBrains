package pillarasset.ru;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PillarTaskManager extends JFrame{
    Map jpMap;
    Font btnFont = new Font("Times new Roman", Font.PLAIN,16);

    public PillarTaskManager() {
        setSize(505,587);
        setResizable(false);
        setLocation(800,200);
        setTitle("Tic-Tac-Toe");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jpMap = new Map();
        jpMap.startNewGame(3);

        add(jpMap, BorderLayout.CENTER);

    }
}