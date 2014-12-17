/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activosfijos;


import java.awt.Component;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import sun.nio.ch.SelectorProviderImpl;
public class RenderCelda extends DefaultTableCellRenderer 
{
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus, int row, int column) 
    {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(row%2!=0 )
        {
            cell.setBackground(new Color (229,240,247));
            cell.setForeground(Color.BLACK);          

        }else{
            cell.setBackground(Color.WHITE);
                    cell.setForeground(Color.BLACK);
        }
        return cell;
    }
}
