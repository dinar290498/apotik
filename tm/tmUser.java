/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtUser;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sad
 */
public class tmUser extends AbstractTableModel {
 private String[] kolom = { "Username", "Akses" };
  public static Vector<dtUser> fieldUser = new Vector();

  public int getRowCount() {
    return fieldUser.size();
  }

  public int getColumnCount() {
    return this.kolom.length;
  }

  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) { case 0:
      return ((dtUser)fieldUser.get(rowIndex)).getUserName();
    case 1:
      if (((dtUser)fieldUser.get(rowIndex)).getAkses() == 0) {
        return "Semua Akses Halaman";
      }
      return "Form Penjualan Akses"; }
    return null;
  }

  public String getColumnName(int column)
  {
    return this.kolom[column];
  }

  public void insert(dtUser dtu) {
    fieldUser.add(dtu);
    fireTableRowsInserted(getRowCount(), getRowCount());
  }

  public void update(dtUser dtu, int index) {
    fieldUser.set(index, dtu);
    fireTableRowsUpdated(index, index);
  }

  public void delete(int index) {
    fieldUser.remove(index);
    fireTableRowsDeleted(index - 1, index - 1);
  }

}
