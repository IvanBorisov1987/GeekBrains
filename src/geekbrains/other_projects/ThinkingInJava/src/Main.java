import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Canvas {

    static {
        System.loadLibrary("NativeSideCanvas");
    }

    public native void paint(Graphics g);

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(0, 0, 500, 500);
        Main jsc = new Main();
        frame.add(jsc);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
        frame.show();
    }
}
/* Глава 3. Операторы
1.Использование коротких и длинных команд печати
*
    public static void main(String[] args) {
	print("Привет, сегодня: ");
	print(new Date());
    }
*/