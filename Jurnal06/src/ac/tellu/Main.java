package ac.tellu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        mahasiswas.add(new Mahasiswa("123", "Jajang Nurjaman", "4501"));
        mahasiswas.add(new Mahasiswa("124", "Jijing Nurjimin", "4501"));
        mahasiswas.add(new Mahasiswa("125", "Jejeng Nurjemen", "4501"));

        System.out.println("Yang dicari:" + searchM(mahasiswas, "124"));

    }

    private static Mahasiswa searchM(ArrayList<Mahasiswa> list, String nim) {
        Mahasiswa result;
        Collections.sort(list);
        int index = Collections.binarySearch(list, new Mahasiswa(nim, null, null));
        result = list.get(index);

        return result;
    }

}
