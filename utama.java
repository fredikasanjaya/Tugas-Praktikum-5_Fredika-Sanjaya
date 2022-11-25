public class utama{
    public static void main(String[] args){

    //membuat object
    manager gaklengkap = new manager ("Dayon");
    manager sedang = new manager ("Andi ", 500000);
    manager lengkap = new manager("Fauzi", 6000000, 2000000);

    programmer gaklengkapprogrammer = new programmer ("Fredik");
    programmer sedangprogrammer = new programmer ("Angga", 500000);
    programmer lengkapprogrammer = new programmer("Bilal", 6000000, 500000);

    gaklengkap.cetakInfo();
    sedang.cetakInfo();
    lengkap.cetakInfo();

    gaklengkapprogrammer.cetakInfo();
    sedangprogrammer.cetakInfo();
    lengkapprogrammer.cetakInfo();



    }
}