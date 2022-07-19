package com.utils.scroll;

import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;

public class ScrollBarCustom extends JScrollBar{
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(192,227,149)); // thanh scroll trượt lên xuống màu xanh lá nhạt
        setOpaque(false);
    }
}
