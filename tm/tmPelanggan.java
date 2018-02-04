/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtPelanggan;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmPelanggan extends AbstractTableModel {
    private String kolom[]={"NAMA PELANGGAN"};
    public static Vector<dtPelanggan>fieldPelanggan=new Vector<dtPelanggan>();
    
    public int getRowCount() {
        return fieldPelanggan.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldPelanggan.get(rowIndex).getNamaPelanggan();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtPelanggan dtp){
        fieldPelanggan.add(dtp);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(dtPelanggan dtp, int index){
        fieldPelanggan.set(index, dtp);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldPelanggan.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAll(){
        fieldPelanggan.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

  public int cariIndex(String nm) {
    int z = -1;
    int n = 0;
    while (n < fieldPelanggan.size()) {
      if (((dtPelanggan)fieldPelanggan.get(n)).getNamaPelanggan().equals(nm))
        z = n;
      n++;
    }

    return z;
  }

  public String cariNama(String id) {
    fireTableDataChanged();
    int n = 0;
    String nama = "";
    while (n < fieldPelanggan.size()) {
      if (((dtPelanggan)fieldPelanggan.get(n)).getKodePelanggan().equals(id))
        nama = ((dtPelanggan)fieldPelanggan.get(n)).getNamaPelanggan();
      n++;
    }
    return nama;
  }
}
