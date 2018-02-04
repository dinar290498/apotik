/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;


import data.dtPenjualanDet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmPembelianDetTemp extends AbstractTableModel{
     private String[] kolom = { "KODE OBAT", "NAMA OBAT", "HARGA", "BNY", "TOTAL", "DISC(%)", "SUB TOTAL" };
     public static Vector<dtPenjualanDet> fieldPembelianDetTemp = new Vector();

    DecimalFormat dfo = new DecimalFormat("#,##0");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public int getRowCount() {
        return fieldPembelianDetTemp.size();
    }

    public int getColumnCount() {
        return this.kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) { case 0:
              return ((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getKodeObat();
            case 1:
              return ((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getNamaObat();
            case 2:
              return "Rp. " + this.dfo.format(((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getHarga());
            case 3:
              return Integer.valueOf(((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getBny());
            case 4:
              return "Rp. " + this.dfo.format(((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getTotal());
            case 5:
              return Integer.valueOf(((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getDisc());
            case 6:
              return "Rp. " + this.dfo.format(((dtPenjualanDet)fieldPembelianDetTemp.get(rowIndex)).getSubTotal()); }
            return null;
    }

    @Override
    public String getColumnName(int column) {
        return this.kolom[column];
    }

      public void insert(dtPenjualanDet dtp) {
        fieldPembelianDetTemp.add(dtp);
        fireTableRowsInserted(getRowCount(), getRowCount());
      }

      public void delete(int index){
        fieldPembelianDetTemp.remove(index);
        fireTableRowsDeleted(index - 1, index - 1);
      }

      public void removeAllData(){
        fieldPembelianDetTemp.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
      }
}
