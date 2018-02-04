/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtPenjualan;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmPenjualan extends AbstractTableModel{
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    
    private String[] kolom={"NO. NOTA","TGL TRANSAKSI"};
    public static Vector<dtPenjualan> fieldPenjualan=new Vector<dtPenjualan>();
    public int getRowCount() {
        return fieldPenjualan.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldPenjualan.get(rowIndex).getNoNota();
            case 1: return sdf.format(fieldPenjualan.get(rowIndex).getTglTransaksi());
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtPenjualan dtp){
        fieldPenjualan.add(0, dtp);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(dtPenjualan dtp, int index){
        fieldPenjualan.set(index, dtp);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldPenjualan.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAllData(){
        fieldPenjualan.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

      public int criIndex(String id) {
        int n = 0;
        int z = -1;
        while (n < fieldPenjualan.size()) {
          if (id.equals(((dtPenjualan)fieldPenjualan.get(n)).getNoNota())) {
            z = n;
          }
          n++;
        }
        return z;
      }

      public void editStatus(String id, int x) {
        int n = 0;
        while (n < fieldPenjualan.size()) {
          if (id.equals(fieldPenjualan.get(n).getNoNota())) {
            fieldPenjualan.get(n).setKet(x);
          }
          n++;
        }
      }
}
