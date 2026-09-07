public class GenreBuku {

    private String idGenre;
    private String namaGenre;

    public GenreBuku(String id, String namaGenre){
        this.idGenre = id;
        this.namaGenre = namaGenre;
    }


    public String getInfo(){
        return "id : " + idGenre + " Nama : " + namaGenre;
    };




}