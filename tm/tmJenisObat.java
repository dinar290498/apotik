/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtJenisObat;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmJenisObat extends AbstractTableModel{

    private String[] kolom={"DAFTAR JENIS OBAT"};

    @SuppressWarnings("UseOfObsoleteCollectionType")
    public static Vector<dtJenisObat> fieldJenisObat=new Vector<dtJenisObat>();

    public int getRowCount() {
        return fieldJenisObat.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldJenisObat.get(rowIndex).getNamaJenisObat();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtJenisObat jo){
        fieldJenisObat.add(jo);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(int index, dtJenisObat jo){
        fieldJenisObat.set(index, jo);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldJenisObat.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAll(){
        fieldJenisObat.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }
}
