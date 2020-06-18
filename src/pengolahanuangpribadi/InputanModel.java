/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengolahanuangpribadi;

/**
 *
 * @author shob
 */
public class InputanModel {

    InputanModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nominal
     */
    public String getNominal() {
        return nominal;
    }

    /**
     * @param nominal the nominal to set
     */
    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set.
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    private String nominal, tipe, keterangan;
    public InputanModel(String nominal,String tipe,String keterangan){
        this.nominal = nominal;
        this.tipe = tipe;
        this.keterangan = keterangan;
        
        //dah
    }
    
}
