import java.util.List;
import java.util.ArrayList;

public class GenreBuku {
    private static List<GenreBuku> daftarGenre = new ArrayList<GenreBuku>();

    private String idGenre;
    private String namaGenre;

    private static void addGenre(GenreBuku genre){
        daftarGenre.add(genre);
    };

    public GenreBuku(String namaGenre){
        this.idGenre = "" + Math.floor(Math.random()* 101);
        this.namaGenre = namaGenre;
        addGenre(null);
    }


    public String getInfo(){
        return "id : " + idGenre + " Nama : " + namaGenre;
    };




}