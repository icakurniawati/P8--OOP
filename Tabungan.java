public class Tabungan{ // master data
    int saldo;

    public Tabungan(int initsaldo){     //method construktor (nama method sama dengan nama class)
        saldo = initsaldo;
    }
    public void ambilUang(int jumlah) {
         saldo = saldo - jumlah;
    }
}