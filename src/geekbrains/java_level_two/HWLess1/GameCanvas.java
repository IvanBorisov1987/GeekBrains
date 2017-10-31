package pillarasset.ru;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GameCanvas extends JPanel {
    private final MainWindow mainWindow;
    private long lastFrameTime;

    GameCanvas(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.lastFrameTime = System.nanoTime();
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        long currentTime = System.nanoTime();
        float deltaTime = (float)(currentTime - this.lastFrameTime) * 1.0E-9F;
        this.lastFrameTime = currentTime;
        this.mainWindow.onDrawFrame(this, g, deltaTime);

        try {
            Thread.sleep(17L);
        } catch (InterruptedException var6) {
            var6.printStackTrace();
        }

        this.repaint();
    }

    int getLeft() {
        return 0;
    }

    int getRight() {
        return this.getWidth() - 1;
    }

    int getTop() {
        return 0;
    }

    int getBottom() {
        return this.getHeight() - 1;
    }
}