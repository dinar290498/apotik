/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtProduk;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmProduk extends AbstractTableModel{

    private String[] kolom={"NAMA PRODUK OBAT"};
    public static Vector<dtProduk> fieldProduk=new Vector<dtProduk>();

    public int getRowCount() {
        return fieldProduk.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldProduk.get(rowIndex).getNamaProduk();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtProduk jo){
        fieldProduk.add(jo);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(int index, dtProduk jo){
        fieldProduk.set(index, jo);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldProduk.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAll(){
        fieldProduk.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

}
