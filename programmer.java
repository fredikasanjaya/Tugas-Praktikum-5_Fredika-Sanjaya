public class programmer extends pegawai{
        private double bonus;
    
    
        public void setbonus(double bonus){
            this.bonus = bonus; 
        }
    
        public double getbonus(){
            return bonus;
        }
       
    
        public programmer(String nama){
            super(nama);
        }
        
        public programmer(String nama, double gajiPokok){
            super(nama, gajiPokok);
        }
    
        public programmer(String nama, double gajiPokok, double bonus){
            super(nama, gajiPokok);
            this.bonus = bonus;
        }
    
        public void cetakInfo() {
            super.cetakInfo();
            System.out.println ("bonus : " + getbonus());
        }
    
    
    }
    
    
