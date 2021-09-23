class konsumen
{
    String namaKonsumen ;
    String jenisPeliharaan ;
    String noTelpKonsumen ;

    void setKonsumen(String newNamaKonsumen, String newJenisPeliharaan, String newNoTelpKonsumen){
        this.namaKonsumen = newNamaKonsumen ;
        this.jenisPeliharaan = newJenisPeliharaan ;
        this.noTelpKonsumen = newNoTelpKonsumen ;
    }
    
    String getNama(){
        return namaKonsumen ;
    }
    String getJenis(){
        return jenisPeliharaan;
    }
    String getTelp(){
        return noTelpKonsumen;
    }
    void Transaksi (String NamaTransaksi){
        System.out.println(this.namaKonsumen+" memilih pelayanan "+NamaTransaksi);
    }

}


class layanan
{
    String namaPelayanan;
    int jenisHewan;
    int harga;
    void setLayanan(String newPelayanan, int newJenisHewan, int newHarga ){
        this.namaPelayanan=newPelayanan;
        this.jenisHewan=newJenisHewan;
        this.harga=newHarga;
    }
    
    String getPelayanan(){
        return namaPelayanan;
    }
    int getJenisP(){
        return jenisHewan;
    }
    int getHargaa(){
        return harga;
    }
    void total (int Total){
        this.harga = Total*jenisHewan ;
    }
}
public class Vet{
    public static void main(String[] args){
        layanan layanan1 = new layanan();
        layanan1.setLayanan("Grooming", 40000, 2);

        konsumen konsumen1 = new konsumen();
        konsumen1.setKonsumen("Astri Auliya", "Anjing", "081234567890");

        System.out.println("Data pelayanan ke-1 : ");
        System.out.println(layanan1.getPelayanan());
        System.out.println(layanan1.getJenisP());
        System.out.println("Harga: "+layanan1.getHargaa());
        System.out.println("Konsumen ke-1 : ");
        System.out.println(konsumen1.getNama());
        System.out.println(konsumen1.getJenis());
        System.out.println(konsumen1.getTelp());

        konsumen1.Transaksi(layanan1.getPelayanan());
        layanan1.total(1);

        System.out.println("Total harga: "+layanan1.getHargaa());}
}
