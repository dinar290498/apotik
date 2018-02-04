/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtObat;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmTableObat extends AbstractTableModel{

    private String[] kolom={"KODE OBAT","NAMA OBAT","STOK","H. BELI", "H. JUAL UMUM","H. JUAL LANGGAN","H. JUAL RESEP","SATUAN"};
    public static Vector<dtObat> fieldObat=new Vector<dtObat>();

    public int getRowCount() {
        return fieldObat.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    DecimalFormat dfo = new DecimalFormat("#,##0");
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldObat.get(rowIndex).getKodeObat();
            case 1: return fieldObat.get(rowIndex).getNamaObat();
            case 2: return fieldObat.get(rowIndex).getStok();
            case 3: return "Rp. "+dfo.format(fieldObat.get(rowIndex).gethBeli());
            case 4: return "Rp. "+dfo.format(fieldObat.get(rowIndex).gethUmum());
            case 5: return "Rp. "+dfo.format(fieldObat.get(rowIndex).gethPelanggan());
            case 6: return "Rp. "+dfo.format(fieldObat.get(rowIndex).gethResep());
            case 7: return fieldObat.get(rowIndex).getSatuan();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtObat dt){
        fieldObat.add(dt);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void update(int index, dtObat dt){
        fieldObat.set(index, dt);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index){
        fieldObat.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void RemoveAll(){
        fieldObat.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

    public int search(String id){
        int n=0;
        int ketemu=-1;
        while(n<fieldObat.size() && ketemu==-1){
            if(id.equals(fieldObat.get(n).getKodeObat()))
                ketemu=n;
            n++;
        }
        return ketemu;
    }

    public int persediaan(String id,int p){
        int n=0;
        int ketemu=-1;
        while(n<fieldObat.size() && ketemu==-1){
            if(id.equals(fieldObat.get(n).getKodeObat())){
                if(p>fieldObat.get(n).getStok())
                    ketemu=1;
            }
            n++;
        }
        return ketemu;

    }

  public void updateStok(int index, int bny, boolean ket) {
    int z = ((dtObat)fieldObat.get(index)).getStok();
    if (ket)
      ((dtObat)fieldObat.get(index)).setStok(z - bny);
    else
      ((dtObat)fieldObat.get(index)).setStok(z + bny);
    fireTableRowsUpdated(index, index);
  }

  public String criNama(String id) {
    int n = 0;
    String namaObat = "";
    while (n < fieldObat.size()) {
      if (id.equals(((dtObat)fieldObat.get(n)).getKodeObat()))
        namaObat = ((dtObat)fieldObat.get(n)).getNamaObat();
      n++;
    }
    return namaObat;
  }

}
