package com.utils.scroll;

import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;

public class ScrollBarCustom extends JScrollBar{
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(63, 109, 217, 100));
        setOpaque(false);
    }
}
