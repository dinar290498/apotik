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
public class tmPelangganSearch extends AbstractTableModel{

    private String[] kolom={"KODE PELANGGAN","NAMA", "ALAMAT"};

    public int getRowCount() {
        return tmPelanggan.fieldPelanggan.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return tmPelanggan.fieldPelanggan.get(rowIndex).getKodePelanggan();
            case 1: return tmPelanggan.fieldPelanggan.get(rowIndex).getNamaPelanggan();
            case 2: return tmPelanggan.fieldPelanggan.get(rowIndex).getAlamat();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }



}
