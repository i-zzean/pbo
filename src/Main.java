public class Main {
    public static void main(String[] args) {
        AplikasiPerpus perpustakaan = new AplikasiPerpus();

        GenreBuku genre1 = new GenreBuku("T01", "Technology");
        GenreBuku genre2 = new GenreBuku("H02", "Horror");

        Buku buku1 = new Buku("B001", "Dasar Java", "Medhanita", 2020, genre1);
        Buku buku2 = new Buku("B002", "Nightmare", "Stephen King", 2015, genre2);
        Member member = new Member("I001", "Ihsan", "akuihsan@apps.ipb.ac.id");

        perpustakaan.tambahGenre(genre1);
        perpustakaan.tambahGenre(genre2);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahMember(member);

        System.out.println("=== DATA PERPUSTAKAAN ===");
        perpustakaan.tampilkanData();

        System.out.println("\n=== PINJAM BUKU ===");
        member.pinjamBuku(buku1);
        member.tampilkanPinjaman();

        System.out.println("\n=== KEMBALIKAN BUKU ===");
        member.kembalikanBuku(buku1);
        member.tampilkanPinjaman();
    }
}
