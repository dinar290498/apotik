/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tm;

import data.dtPenjualanDet;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SAD
 */
public class tmTemp extends AbstractTableModel{

    DecimalFormat dfo = new DecimalFormat("#,##0");
    private String[] kolom={"KODE BARANG","NAMA BARANG","HARGA","BNY","TOTAL","DISC (%)","SUB TOTAL"};
    public static Vector<dtPenjualanDet> fieldTemp=new Vector<dtPenjualanDet>();

    public int getRowCount() {
        return fieldTemp.size();
    }

    public int getColumnCount() {
        return kolom.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return fieldTemp.get(rowIndex).getKodeObat();
            case 1: return fieldTemp.get(rowIndex).getNamaObat();
            case 2: return "Rp. "+dfo.format(fieldTemp.get(rowIndex).getHarga());
            case 3: return fieldTemp.get(rowIndex).getBny();
            case 4: return "Rp. "+dfo.format(fieldTemp.get(rowIndex).getTotal());
            case 5: return fieldTemp.get(rowIndex).getDisc();
            case 6: return "Rp. "+dfo.format(fieldTemp.get(rowIndex).getSubTotal());
            default: return null;
        }
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        switch(columnIndex){
            case 3: {
                     int bny=Integer.parseInt(aValue.toString());
                     float harga=fieldTemp.get(rowIndex).getHarga();
                     float total=bny*harga;
                     fieldTemp.get(rowIndex).setBny(bny);
                     fieldTemp.get(rowIndex).setTotal(total);

                     float disc1=fieldTemp.get(rowIndex).getDisc();
                     float subTotal=total-disc1/100*total;
                     fieldTemp.get(rowIndex).setSubTotal(subTotal);
            }break;
            case 5:{
                    float disc1=Integer.parseInt(aValue.toString());
                    int disc2=Integer.parseInt(aValue.toString());
                    //float pot=disc/100;
                    float harga=fieldTemp.get(rowIndex).getHarga();
                    float total=fieldTemp.get(rowIndex).getTotal();
                    float subTotal=total-disc1/100*total;

                    fieldTemp.get(rowIndex).setDisc(disc2);
                    fieldTemp.get(rowIndex).setSubTotal(subTotal);
            }break;
        }

        fireTableRowsUpdated(rowIndex, rowIndex);
    }


    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 3: return true;
            case 5: return true;
            default:return false;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    public void insert(dtPenjualanDet dtpd){
        fieldTemp.add(dtpd);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }

    public void delete(int index){
        fieldTemp.remove(index);
        fireTableRowsDeleted(index-1, index-1);
    }

    public void removeAll(){
        fieldTemp.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }

    public int search(String id){
        int n=0;
        int ketemu=-1;
        while(n<fieldTemp.size() ){
            if(id.equals(fieldTemp.get(n).getKodeObat()))
                ketemu=n;
             n++;
        }
        return ketemu;
    }

    tmTableObat tmtb=new tmTableObat();
     public void updateharga(int pilihan){
         int n=0;
         float harga=0;
         while(n<fieldTemp.size()){
             int index=tmtb.search(fieldTemp.get(n).getKodeObat());
             if(pilihan==0)
                 harga=(float) tmtb.fieldObat.get(index).gethUmum();
             else if(pilihan==1)
                 harga=(float) tmtb.fieldObat.get(index).gethPelanggan();
             else
                 harga=(float) tmtb.fieldObat.get(index).gethResep();

             int bny=fieldTemp.get(n).getBny();
             float total=harga*bny;
             float disc=fieldTemp.get(n).getDisc();
             float subTotal=total-((disc/100)*total);


             fieldTemp.get(n).setHarga(harga);
             fieldTemp.get(n).setTotal(total);
             fieldTemp.get(n).setSubTotal(subTotal);
             fireTableRowsUpdated(n, n);
             n++;
         }

     }

}
