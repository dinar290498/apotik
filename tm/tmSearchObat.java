/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmSearchObat extends AbstractTableModel{

    private String[] kolom={"KODE OBAT","NAMA OBAT","STOK","SATUAN"};
    

    public int getRowCount() {
        return tm.tmTableObat.fieldObat.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return tm.tmTableObat.fieldObat.get(rowIndex).getKodeObat();
            case 1: return tm.tmTableObat.fieldObat.get(rowIndex).getNamaObat();
            case 2: return tm.tmTableObat.fieldObat.get(rowIndex).getStok();
            case 3: return tm.tmTableObat.fieldObat.get(rowIndex).getSatuan();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }



}
