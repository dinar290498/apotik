/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtDistributor;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmDistributor extends AbstractTableModel{
    private String[] kolom={"DISTRIBUTOR OBAT"};
    public static Vector<dtDistributor> fieldDistributor=new Vector<dtDistributor>();

    public int getRowCount() {
        return fieldDistributor.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldDistributor.get(rowIndex).getNamaDistributor();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }


    public void insert(dtDistributor jo){
        fieldDistributor.add(jo);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(int index, dtDistributor jo){
        fieldDistributor.set(index, jo);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldDistributor.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAll(){
        fieldDistributor.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }



}
