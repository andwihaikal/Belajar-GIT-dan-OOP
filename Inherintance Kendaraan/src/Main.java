
public class Main {
    public static void main(String[] args) {

        Mobil mobilSaya = new Mobil("Toyota");
        mobilSaya.infoKendaraan();
        mobilSaya.nyalakanMesin();

        System.out.println();

        // Membuat objek SepedaMotor
        SepedaMotor motorSaya = new SepedaMotor("Honda");
        motorSaya.infoKendaraan();
        motorSaya.nyalakanMesin();
    }
}

class Kendaraan {
    String nama;

    public void infoKendaraan() {
        System.out.println("Ini adalah kendaraan: " + nama);
    }
}

class Mobil extends Kendaraan {

    // Constructor untuk kelas Mobil
    public Mobil(String namaMobil) {
        nama = namaMobil;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + nama + " sedang dinyalakan.");
    }
}

class SepedaMotor extends Kendaraan {

    // Constructor untuk kelas SepedaMotor
    public SepedaMotor(String namaMotor) {
        nama = namaMotor;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin sepeda motor " + nama + " sedang dinyalakan.");
    }
}