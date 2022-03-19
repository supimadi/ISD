package ac.tellu;

import java.util.*;

public class Main {

    public static void printItem(LinkedList<Song> songList) {
        ListIterator<Song> iterator = songList.listIterator();

        System.out.println("print dari awal");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("print dari akhir");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println();
    }

    public static void deleteItem(LinkedList<Song> songList, String songName) {

        if (songName.equals("0")) {
            songList.removeLast();
            return;
        }

        Scanner sc = new Scanner(System.in);
        ArrayList<Song> buffer = new ArrayList<>();

        for (int i = 0; i < songList.size(); i++) {
            String song = songList.get(i).getName();
            if (song.toLowerCase().equals(songName.toLowerCase())) {
                buffer.add(songList.get(i));
                System.out.println(i + ". " + songList.get(i));
            }
        }

        if (buffer.size() < 1) {
            System.out.println("Lagu tidak ditemukan.");
            return;
        }

        System.out.println("Silahkan pilih lagu yg akan di hapus (input 'y' untuk pilih semua)");
        String input = sc.nextLine().toLowerCase();

        if (input.equals("y")) {
            for (Song song : buffer) {
                songList.remove(song);
            }
        } else {
            for (String index: input.split("[\\ ]")) {
                songList.remove(buffer.get(Integer.parseInt(index) - 1));
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Song> songList = new LinkedList<>();

        songList.add(new Song("Lukman", "LILI"));
        songList.add(new Song("Hakim", "LALA"));
        songList.add(new Song("Hakim", "LILI"));

        boolean isRunning = true;
        while (isRunning) {

            System.out.println(
                    "Silahkan Pilih:\n" +
                    "1. Tambah Lagu\n" +
                    "2. Putar Lagu\n" +
                    "3. Hapus Lagu\n" +
                    "4. Keluar Aplikasi"
            );
            int choices = sc.nextInt();
            sc.nextLine(); // Catch enter button

            switch (choices) {
                case 1:
                    System.out.println("Masukan judul dan artis lagu");
                    songList.addLast(new Song(sc.nextLine(), sc.nextLine()));
                    System.out.println("Berhasil menambahkan lagu");
                    break;
                case 2:
                    printItem(songList);
                    break;
                case 3:
                    System.out.println("Masukan judul lagu (masukan 0 untuk menghapus lagu terakhir):");
                    deleteItem(songList, sc.nextLine());
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID");
            }
        }

    }
}