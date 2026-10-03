import java.util.Scanner;

public class Main {

    // Method untuk menampilkan menu
    public static void tampilkanMenu(Menu[] menu) {
        System.out.println("========================================");
        System.out.println("           MENU RESTORAN");
        System.out.println("========================================");

        System.out.println("\nMAKANAN");
        System.out.println("1. " + menu[0].nama + "       Rp " + menu[0].harga);
        System.out.println("2. " + menu[1].nama + "        Rp " + menu[1].harga);
        System.out.println("3. " + menu[2].nama + "        Rp " + menu[2].harga);
        System.out.println("4. " + menu[3].nama + "         Rp " + menu[3].harga);

        System.out.println("\nMINUMAN");
        System.out.println("5. " + menu[4].nama + "            Rp " + menu[4].harga);
        System.out.println("6. " + menu[5].nama + "       Rp " + menu[5].harga);
        System.out.println("7. " + menu[6].nama + "         Rp " + menu[6].harga);
        System.out.println("8. " + menu[7].nama + "             Rp " + menu[7].harga);

        System.out.println("========================================");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array menu restoran
        Menu[] menu = {
            new Menu("Nasi Padang", 25000, "Makanan"),
            new Menu("Mie Goreng", 20000, "Makanan"),
            new Menu("Ayam Bakar", 30000, "Makanan"),
            new Menu("Soto Ayam", 18000, "Makanan"),

            new Menu("Es Teh", 5000, "Minuman"),
            new Menu("Jus Alpukat", 12000, "Minuman"),
            new Menu("Es Jeruk", 8000, "Minuman"),
            new Menu("Kopi", 10000, "Minuman")
        };

        tampilkanMenu(menu);

        System.out.println("\nMasukkan pesanan maksimal 4 menu.");
        System.out.println("Format: nomor menu jumlah");
        System.out.println("Jika tidak ada pesanan, masukkan: 0 0");
        System.out.println("Contoh: 1 2");
        System.out.println();

        // Pesanan 1
        System.out.print("Pesanan 1: ");
        int menu1 = input.nextInt();
        int jumlah1 = input.nextInt();

        // Pesanan 2
        System.out.print("Pesanan 2: ");
        int menu2 = input.nextInt();
        int jumlah2 = input.nextInt();

        // Pesanan 3
        System.out.print("Pesanan 3: ");
        int menu3 = input.nextInt();
        int jumlah3 = input.nextInt();

        // Pesanan 4
        System.out.print("Pesanan 4: ");
        int menu4 = input.nextInt();
        int jumlah4 = input.nextInt();

        // Harga dan total pesanan
        double harga1 = 0;
        double harga2 = 0;
        double harga3 = 0;
        double harga4 = 0;

        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double total4 = 0;

        // Pesanan 1
        if (menu1 >= 1 && menu1 <= 8 && jumlah1 > 0) {
            harga1 = menu[menu1 - 1].harga;
            total1 = harga1 * jumlah1;
        }

        // Pesanan 2
        if (menu2 >= 1 && menu2 <= 8 && jumlah2 > 0) {
            harga2 = menu[menu2 - 1].harga;
            total2 = harga2 * jumlah2;
        }

        // Pesanan 3
        if (menu3 >= 1 && menu3 <= 8 && jumlah3 > 0) {
            harga3 = menu[menu3 - 1].harga;
            total3 = harga3 * jumlah3;
        }

        // Pesanan 4
        if (menu4 >= 1 && menu4 <= 8 && jumlah4 > 0) {
            harga4 = menu[menu4 - 1].harga;
            total4 = harga4 * jumlah4;
        }

        // Total belanja
        double totalBelanja = total1 + total2 + total3 + total4;

        // Diskon 10% jika total belanja lebih dari Rp100.000
        double diskon = 0;

        if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.10;
        }

        double totalSetelahDiskon = totalBelanja - diskon;

        // Pajak 10%
        double pajak = totalSetelahDiskon * 0.10;

        // Biaya pelayanan
        double biayaPelayanan = 20000;

        // Promo beli satu gratis satu minuman
        double gratisMinuman = 0;

        if (totalBelanja > 50000) {

            if (menu1 >= 5 && menu1 <= 8 && jumlah1 >= 2) {
                gratisMinuman = harga1;
            } 
            else if (menu2 >= 5 && menu2 <= 8 && jumlah2 >= 2) {
                gratisMinuman = harga2;
            } 
            else if (menu3 >= 5 && menu3 <= 8 && jumlah3 >= 2) {
                gratisMinuman = harga3;
            } 
            else if (menu4 >= 5 && menu4 <= 8 && jumlah4 >= 2) {
                gratisMinuman = harga4;
            }
        }

        // Total akhir
        double totalAkhir = totalSetelahDiskon
                + pajak
                + biayaPelayanan
                - gratisMinuman;

        // ========================================
        // CETAK STRUK
        // ========================================

        System.out.println("\n\n========================================");
        System.out.println("             STRUK RESTORAN");
        System.out.println("========================================");

        if (menu1 >= 1 && menu1 <= 8 && jumlah1 > 0) {
            System.out.println(menu[menu1 - 1].nama);
            System.out.println(jumlah1 + " x Rp " + harga1
                    + " = Rp " + total1);
        }

        if (menu2 >= 1 && menu2 <= 8 && jumlah2 > 0) {
            System.out.println(menu[menu2 - 1].nama);
            System.out.println(jumlah2 + " x Rp " + harga2
                    + " = Rp " + total2);
        }

        if (menu3 >= 1 && menu3 <= 8 && jumlah3 > 0) {
            System.out.println(menu[menu3 - 1].nama);
            System.out.println(jumlah3 + " x Rp " + harga3
                    + " = Rp " + total3);
        }

        if (menu4 >= 1 && menu4 <= 8 && jumlah4 > 0) {
            System.out.println(menu[menu4 - 1].nama);
            System.out.println(jumlah4 + " x Rp " + harga4
                    + " = Rp " + total4);
        }

        System.out.println("----------------------------------------");
        System.out.println("Total Belanja       : Rp " + totalBelanja);

        if (diskon > 0) {
            System.out.println("Diskon 10%          : Rp " + diskon);
            System.out.println("Setelah Diskon      : Rp " + totalSetelahDiskon);
        } else {
            System.out.println("Diskon               : Rp 0");
        }

        System.out.println("Pajak 10%           : Rp " + pajak);
        System.out.println("Biaya Pelayanan     : Rp " + biayaPelayanan);

        if (gratisMinuman > 0) {
            System.out.println("Promo B1G1 Minuman  : -Rp " + gratisMinuman);
        } else {
            System.out.println("Promo B1G1           : Tidak ada");
        }

        System.out.println("----------------------------------------");
        System.out.println("TOTAL BAYAR         : Rp " + totalAkhir);
        System.out.println("========================================");
        System.out.println("       Terima kasih telah berkunjung");
        System.out.println("========================================");

        input.close();
    }
}
