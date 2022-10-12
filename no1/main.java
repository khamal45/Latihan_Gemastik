import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String kalimat = a.nextLine();
        ArrayList<String> simpan = new ArrayList<String>();


        String m = "";

        for (int i = 0; i < kalimat.length(); i++) {

            String singkat = kalimat.substring(i, i + 1);
            if (singkat.equalsIgnoreCase(",") || singkat.equalsIgnoreCase(".")
                    || singkat.equalsIgnoreCase("?") || singkat.equalsIgnoreCase("!")) {

            } else {
                if (singkat.equalsIgnoreCase(" ")) {

                    simpan.add(m);
                    m = "";
                } else {
                    m += kalimat.substring(i, i + 1);
                }
            }
        }
        simpan.add(m);

        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int j = 0; j < simpan.size(); j++) {
            int hitung = Collections.frequency(simpan, simpan.get(j));
            index.add(hitung);
        }
        Collections.sort(index, Collections.reverseOrder());
        int angkayangditampilkan = 3;
        for (int i = 0; i < index.size(); i++) {
            int z = index.get(i);
            for (int j = 0; j < simpan.size(); j++) {
                String r = simpan.get(j);
                if (Collections.frequency(simpan, simpan.get(j)) == z) {
                    if (angkayangditampilkan > 0) {
                        System.out.println(r);
                        angkayangditampilkan--;
                    }
                    for (int q = 0; q < simpan.size(); q++) {
                        if (r.equalsIgnoreCase(simpan.get(q))) {
                            simpan.remove(q);
                        }
                    }

                }

            }
        }

    }
}
