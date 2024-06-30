package tugas.latihan.pkg6;

/**
 * @author Muhammad Agriyansyah
 */
public class Main {

    public static void main(String[] args) {
        
        //V balok = p x l x t
        hitungvolumebalok balok = new hitungvolumebalok();
      
        balok.SetPanjang(6);
        balok.SetLebar(5);
        balok.SetTinggi(5);
        balok.VolumeBalok();
        balok.TampilHasil();
        
      
    }
    
}
