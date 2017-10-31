package pillarasset.ru;

import java.awt.Graphics;

public class Sprite {
    float x;
    float y;
    float halfWidth;
    float halfHeight;

    public Sprite() {
    }

    float getLeft() {
        return this.x - this.halfWidth;
    }

    void setLeft(float left) {
        this.x = left + this.halfWidth;
    }

    float getRight() {
        return this.x + this.halfWidth;
    }

    void setRight(float right) {
        this.x = right - this.halfWidth;
    }

    float getTop() {
        return this.y - this.halfHeight;
    }

    void setTop(float top) {
        this.y = top + this.halfHeight;
    }

    float getBottom() {
        return this.y + this.halfHeight;
    }

    void setBottom(float bottom) {
        this.y = bottom - this.halfHeight;
    }

    float getWidth() {
        return 2.0F * this.halfWidth;
    }

    float getHeight() {
        return 2.0F * this.halfHeight;
    }

    void update(GameCanvas gameCanvas, float deltaTime) {
    }

    void render(GameCanvas gameCanvas, Graphics g) {
    }
}
