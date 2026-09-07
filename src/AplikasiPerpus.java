import java.util.List;
import  java.util.ArrayList;

public class AplikasiPerpus {
    private List<Member> member;
    private List<Buku> buku;
    private List<GenreBuku> genre;

    public AplikasiPerpus() {
        this.member = new ArrayList<>();
        this.buku = new ArrayList<>();
        this.genre = new ArrayList<>();
    }

    public void tambahMember(Member member) {
        if (! this.member.contains(member)) {
            this.member.add(member);
        }
    }

    public void tambahBuku(Buku buku) {
        if (! this.buku.contains(buku)) {
            this.buku.add(buku);
        }
    }

    public void tambahGenre(GenreBuku genre) {
        if (! this.genre.contains(genre)) {
            this.genre.add(genre);
        }
    }

    public void tampilkanData() {
        System.out.println("Daftar Nama Member Perpustakaan:");
        for (Member member: this.member) {
            System.out.println("- " + member.getInfo());
        }

        System.out.println("Daftar Buku Perpustakaan:");
        for (Buku buku: this.buku) {
            System.out.println("- " + buku.getInfo());
        }
    }
}
