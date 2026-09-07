import java.util.ArrayList;
import java.util.List;

public class Member {
    private String idMember;
    private String nama;
    private String email;
    private List<Buku> bukuPinjaman;

    public Member(String idMember, String nama, String email) {
        this.idMember = idMember;
        this.nama = nama;
        this.email = email;
        this.bukuPinjaman = new ArrayList<Buku>();
    }



    public void pinjamBuku(Buku buku) {
        if (buku != null) {
            bukuPinjaman.add(buku);
            System.out.println("Buku " + buku.getJudulBuku() + " berhasil dipinjam");
        }
    }

    public void kembalikanBuku(Buku buku) {
        bukuPinjaman.remove(buku);
        System.out.println("Buku " + buku.getJudulBuku() + " berhasil dikembalikan");
    }

    public void tampilkanPinjaman() {
        System.out.println("=== Buku Dipinjam oleh " + nama + " ===");
        if (bukuPinjaman.isEmpty()) {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
        } else {
            for (Buku buku : bukuPinjaman) {
                System.out.println(buku.getInfo());
            }
        }
    }

    public String getInfo() {
    return "ID Member : " + idMember + " | Nama : " + nama + " | Email : " + email;
};
}

