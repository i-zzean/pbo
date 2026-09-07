public class Buku {
    private String idBuku;
    private String judulBuku;
    private String penulis;
    private int tahunTerbit;
    private GenreBuku genre;

    public Buku(String idBuku, String judulBuku, String penulis, int tahunTerbit, GenreBuku genre){
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
    }

    public String getInfo(){
        return "id : " + idBuku + " judul : " + judulBuku + " penulis : " + penulis + " tahun : " + tahunTerbit + " genre : " + genre;
    };
}
