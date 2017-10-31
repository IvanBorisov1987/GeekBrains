package catch_the_drop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class GameWindow extends JFrame{  // А вот это уже наш класс

    private static GameWindow game_window; // окно
    private static long last_frame_time; // движение капли
    private static Image background; // фон
    private static Image game_over; // конец игры
    private static Image drop; // капля
    private static float drop_left = -100; //левые координаты капли -
    private static float drop_top = 10; //верхние координаты капли - капля падает из зоны вне экрана
    private static float drop_v = 120; // скорость капли
    private static int score; // переменная считает очки

    public static void main(String[] args) throws IOException {  // Данный  метод объявляет параметры окна программы
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // дейтвия при нажатии крестика
        game_window.setLocation(200, 100); // координаты окна
        game_window.setSize(906, 478); // размер окна
        game_window.setResizable(false); // запрет на изменение размера окна
        last_frame_time = System.nanoTime();
        GameField game_field = new GameField();
        game_field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) { // метод вызывается при нажатии мяшью
                int x = e.getX();
                int y = e.getY();
                float drop_right = drop_left + drop.getWidth(null); // правая граница капли (левая - ширина капли
                float drop_bottom = drop_top + drop.getHeight(null); // нижняя краница капли (верхняя - высота капли
                boolean is_drop = x >= drop_left && x <= drop_right && y >= drop_top && y <= drop_bottom; // логическая переменная нахождения капли, когда мы попали каплей
                if (is_drop) { // если условие истинно, то появляется новая капля со случайным расположением по высоте
                    drop_left = 10;
                    drop_top = (int) (Math.random() * (game_field.getHeight() - drop.getHeight(null)));
                    drop_v = drop_v + 20;
                    score++; // очки увеличиваются на клик
                    game_window.setTitle("Score: " + score);
                }
            }
        }); // мышка ловит каплю - самая магическая вещь
        game_window.add(game_field);
        game_window.setVisible(true); // окно стало видимым
    }

    private static void onRepaint(Graphics g) { //прописываем в методе игровой цикл
        long current_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time; // время последнего кадра равняется текущему кадру

       drop_left = drop_left + drop_v * delta_time; // направление движения капли по оси x
       g.drawImage(background, 0, 0, null);// Данный метод дает возможность рисования в окне
       g.drawImage(drop, (int) drop_left, (int) drop_top, null);
       if (drop_left > game_window.getWidth())g.drawImage(game_over, 280, 120, null); // когда капля выходит за границы, игра заканчивается
    }

    private static class GameField extends JPanel{ // данный класс описывает графические панели для рисования

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}