public class pegawai{
    private String nama;
    private double gajiPokok;

     //set
     public void setNama(String nama){
        this.nama = nama;
    }

    public void setgajiPokok(double gajipokok){
        this.gajiPokok = gajipokok;
    }

     //get
     public String getNama(){
        return this.nama ;
    }
    public double getgajiPokok(){
         return gajiPokok ;
        }
    

    // membuat constractor
    public pegawai(String nama){
        this.nama = nama;
    }
    public pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }



    public void cetakInfo() {
        System.out.println ("Nama   : " + getNama());
        System.out.println ("gajiPokok : " + getgajiPokok());
    }
}