
import java.util.Scanner;
public class DemoAddressBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int menu;
        do {
            System.out.println("masukkan menu \n1.Tambah Address Book \n2.Tampilkan ");
            menu = scanner.nextInt();
            if (menu == 1) {
                System.out.print("Nama: ");
                String nama;                
                scanner.nextLine();
                nama = scanner.nextLine();
                
                System.out.print("Alamat: ");
                String jalan = scanner.nextLine();
                
                System.out.print("Kota: ");
                String kota = scanner.nextLine();
                
                System.out.print("Usia: ");
                int usia = scanner.nextInt();
                
                System.out.print("Gender: ");
                char gender = scanner.next().charAt(0);
                
                System.out.print("No. Kontak: ");
                String telepon;                
                scanner.nextLine();
                telepon = scanner.nextLine();
                
                Person person = new Person(nama, jalan, kota, usia, gender, telepon);
                addressBook.setItemCollection(person);
                
            } else if (menu == 2) {
                System.out.println(addressBook.toString());
            }
        } while (menu != 3);

    }
}
