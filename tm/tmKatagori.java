/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtKatagori;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmKatagori extends AbstractTableModel{
    private String[] kolom={"KATAGORI OBAT"};
    public static Vector<dtKatagori> fieldKatagoriObat=new Vector<dtKatagori>();

    public int getRowCount() {
        return fieldKatagoriObat.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldKatagoriObat.get(rowIndex).getNamaKatagori();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtKatagori dtk){
        fieldKatagoriObat.add(dtk);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }


    public void update(int index, dtKatagori dtk){
        fieldKatagoriObat.set(index, dtk);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldKatagoriObat.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAll(){
        fieldKatagoriObat.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }



}
