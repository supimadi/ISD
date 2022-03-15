package ac.tellu;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean stillInput = true;
        while (stillInput) {
            System.out.print(
                    "Pilihan Menu\n" +
                            "1. Input data \n" +
                            "2. Hapus data\n" +
                            "3. Cetak list pegawai\n" +
                            "4. Keluar\n"
            );
            System.out.print("Pilihan: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Catch enter from above

            switch (choice) {
                case 1:
                    System.out.print("NIP: "); String nip = sc.nextLine();
                    System.out.print("Nama: "); String name = sc.nextLine();
                    System.out.print("Divisi pegawai: "); String div = sc.nextLine();

                    System.out.println("Tambahkan data di awal? (y/n)");
                    String isBegining = sc.nextLine();
                    if (isBegining.toLowerCase().equals("y")) {
                        employees.add(0, new Employee(nip, name, div));
                    } else {
                        employees.add(employees.size(), new Employee(nip, name, div));
                    }

                    break;
                case 2:
                    // Check if the empolyess is empty
                    if (employees.size() < 1) {
                        System.out.println("DATA KOSONG!");
                        break;
                    }

                    System.out.println("Hapus data di awal? (y/n)");
                    String isBegining2 = sc.nextLine();

                    if (isBegining2.toLowerCase().equals("y")) {
                        employees.remove(0);
                    } else {
                        employees.remove(employees.size() - 1);
                    }
                    break;
                case 3:
                    System.out.println("====================");
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.printf("%d. %s", i + 1, employees.get(i));
                    }
                    System.out.println("====================");
                    break;
                case 4:
                    stillInput = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again...");
            }
        }

    }
}
