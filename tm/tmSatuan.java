/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtSatuan;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmSatuan extends AbstractTableModel{

    private String[] kolom={"SATUAN OBAT"};
    public static Vector<dtSatuan> fieldSatuan=new Vector<dtSatuan>();

    public int getRowCount() {
        return fieldSatuan.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldSatuan.get(rowIndex).getNamaSatuan();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtSatuan dts){
        fieldSatuan.add(dts);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(dtSatuan dts, int index){
        fieldSatuan.set(index, dts);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldSatuan.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeALl(){
        fieldSatuan.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

}
