public class GenreBuku {
    private String idGenre;
    private String namaGenre;

    public GenreBuku(String namaGenre){
        this.idGenre = "" + Math.floor(Math.random()* 101);
        this.namaGenre = namaGenre;
    }

    public String getInfo(){
        return "id : " + idGenre + " Nama : " + namaGenre;
    };


}