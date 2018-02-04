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
public class tmPembelian extends AbstractTableModel{
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    
    private String[] kolom={"NO. NOTA","TGL TRANSAKSI"};
    public static Vector<dtPenjualan> fieldPembelian=new Vector<dtPenjualan>();
    public int getRowCount() {
        return fieldPembelian.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldPembelian.get(rowIndex).getNoNota();
            case 1: return sdf.format(fieldPembelian.get(rowIndex).getTglTransaksi());
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtPenjualan dtp){
        fieldPembelian.add(0, dtp);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(dtPenjualan dtp, int index){
        fieldPembelian.set(index, dtp);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldPembelian.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAllData(){
        fieldPembelian.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

      public void editStatus(String id, int x) {
        int n = 0;
        while (n < fieldPembelian.size()) {
          if (id.equals(fieldPembelian.get(n).getNoNota())) {
            fieldPembelian.get(n).setKet(x);
          }
          n++;
        }
      }

      public int criIndex(String id) {
        int n = 0;
        int z = -1;
        while (n < fieldPembelian.size()) {
          if (id.equals(((dtPenjualan)fieldPembelian.get(n)).getNoNota())) {
            z = n;
          }
          n++;
        }
        return z;
      }

}
