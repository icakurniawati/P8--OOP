public class CetakSiswa2{

    public static void main (String [] args){
         Siswa data = new Siswa();          //deklarasi objek class siswa dg nama objek 
         data.infoSiswa();                  //memanggil method infosiswa pada class Siswa

         data.no_absen = 1;                 //variabel no abs objek class siswa diberi nilai 1
         System.out.println("No. Absen\t\t\t: "+data.no_absen);

         data.setNis("160001");             //pemanggilan nama method objek class siswa dengan nilai parameternya diberi nilai 160001
         System.out.println("NIS\t\t\t: "+data.nis); // untuk mengeluarkan perintah dari setNis

         data.setNama("Zidna Aisya Karima");
         System.out.println("Nama Siswa\t\t\t: "+data.nama_siswa);

         data.setTtl("Pekalongan", "14-08-1997");
         System.out.println("Tempat, Tanggal Lahir\t\t\t : "+data.tmp_lahir +", "+data.tgl_lahir);

         data.setNilai(75.5, 80.75);        // pemanggilan nama method objek class siswa dengan nilai parameternya diberi dua nilai yaitu 75.5 dan 80.75
         System.out.println("Nilai Ipa\t\t\t : "+data.nilai_ipa);
         System.out.println("Nilai Ips\t\t\t : "+data.nilai_ips);
         
    }
}