package ac.tellu;

public class Employee {
    private String nip;
    private String name;
    private String division;

    public Employee(String nip, String name, String division) {
        this.nip = nip;
        this.name = name;
        this.division = division;
    }

    @Override
    public String toString() {
        return "Pegawai(NIP: " + this.nip + ", Nama: " + this.name + ", Divisi: " + this.division + ")\n";
    }
}
