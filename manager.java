public class manager extends pegawai{
    private double tunjangan;


    public void settunjangan(double tunjangan){
        this.tunjangan = tunjangan; 
    }

    public double gettunjangan(){
        return tunjangan;
    }
   

    public manager(String nama){
        super(nama);
    }
    
    public manager(String nama, double gajiPokok){
        super(nama, gajiPokok);
    }

    public manager(String nama, double gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println ("tunjangan : " + gettunjangan());
    }


}

