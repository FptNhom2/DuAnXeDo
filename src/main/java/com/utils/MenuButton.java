package com.utils;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MenuButton extends JButton{
    private float animate;
    private int index;
    // getter & setter
    public float getAnimate() {
        return animate;
    }

    public void setAnimate(float animate) {
        this.animate = animate;
        repaint();
    }

    public int getIndex() {
        return index;
    }
    
    public MenuButton(int index) {
        this.index = index;
        setContentAreaFilled(false); // tắt nền xám của menu chức năng
        setForeground(new Color(189,189,189)); // chữ màu trắng
        setCursor(new Cursor(Cursor.HAND_CURSOR)); // hiện bàn tay khi hover vào menu
        setHorizontalAlignment(SwingConstants.LEFT); // canh lề bên trái
        setBackground(new Color(65,65,65));
        setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double width = getWidth();
        double height = getHeight();
        double x = animate * width - width;
        Area area = new Area(new RoundRectangle2D.Double(x, 0, width, height, height, height));
        area.add(new Area(new Rectangle2D.Double(x, 0, height, height)));
        g2.setColor(getBackground());
        g2.fill(area);
        g2.dispose();
        super.paint(grphcs); 
    }
    
}
