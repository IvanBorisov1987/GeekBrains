package pillarasset.ru;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class BackGround extends JFrame {
    static Image background;

    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameCanvas.class.getResourceAsStream("background.png"));
    }
}
