import java.util.ArrayList;
import java.util.List;

public class Member {
    private String idMember;
    private String namaMember;
    private String nomorTelepon;
    private List<Buku> daftarPinjaman;

    public Member(String idMember, String namaMember, String nomorTelepon) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.nomorTelepon = nomorTelepon;
        this.daftarPinjaman = new ArrayList<>();
    }

    // Getter
    public String getIdMember() {
        return idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public List<Buku> getDaftarPinjaman() {
        return daftarPinjaman;
    }

    // Update Profil Member
    public void updateMember(String namaMember, String nomorTelepon) {
        this.namaMember = namaMember;
        this.nomorTelepon = nomorTelepon;
    }

    // Fitur Peminjaman & Pengembalian
    public void pinjamBuku(Buku buku) {
        if (buku != null) {
            daftarPinjaman.add(buku);
        }
    }

    public void kembalikanBuku(Buku buku) {
        daftarPinjaman.remove(buku);
    }

    public String getInfo() {
        return "ID Member : " + idMember + " | Nama : " + namaMember + " | No. Telp : " + nomorTelepon + " | Jumlah Pinjaman : " + daftarPinjaman.size();
    }
}
