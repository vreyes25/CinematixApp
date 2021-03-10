/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipografia;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Victor Reyes
 */
public class DecoracionTablas extends DefaultTableCellRenderer{
    Color background;
    Color foreground;
    public DecoracionTablas (Color background,Color foreground) {
    super();
    this.background = background;
    this.foreground = foreground;
    }
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
    Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    comp.setBackground(background);
    comp.setForeground(foreground);
    return comp;
    }
}

