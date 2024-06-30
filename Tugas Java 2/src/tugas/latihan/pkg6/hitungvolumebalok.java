package tugas.latihan.pkg6;

/**
 * @author Muhammad Agriyansyah
 */
public class hitungvolumebalok {
    
     double Panjang,Lebar,Tinggi,Volume;
    
    void SetPanjang(double Nilai){
        
        Panjang = Nilai;
        
    }
    
    void SetLebar(double Nilai){
        
        Lebar = Nilai;
        
    }
    
    void SetTinggi(double Nilai){
        
        Tinggi = Nilai;
        
    }
    
    private double GetPanjang(){
        
        return Panjang;
        
    }
    
    private double GetLebar(){
        
        return Lebar;
        
    }
    
    private double GetTinggi(){
        
        return Tinggi;
        
    }
    
    double VolumeBalok(){
        
        double hasil = Volume = Panjang * Lebar * Tinggi;
        
        return Volume;
        
    }
    
    void TampilHasil(){
        
        System.out.println("Hitung Volume Balok");
        System.out.println("===================");
        System.out.println("Nilai Panjang :"+Panjang);
        System.out.println("Nilai Lebar :"+Lebar);
        System.out.println("Nilai Tinggi :"+Tinggi);
        System.out.println("Rumus Volume Balok :");
        System.out.println("Volume = Panjang x Lebar x Tinggi");
        System.out.println(Panjang+"*"+Lebar+"*"+Tinggi);
        System.out.println("Hasil :"+Volume);
        
    }
    
}
