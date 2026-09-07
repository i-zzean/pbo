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

    public String getIdBuku() {
        return  idBuku;
    };

    public String getJudulBuku() {
        return  judulBuku;
    };

    public String getPenulis() {
        return  penulis;
    };

    public int getTahunTerbit() {
        return  tahunTerbit;
    };

    public GenreBuku getGenre(){
        return  genre;
    };

    public String getInfo(){
        return "ID : " + idBuku + "| Judul : " + judulBuku + "| Penulis : " + penulis + "| Tahun : " + tahunTerbit + "| Genre : " + genre;
    };
}
