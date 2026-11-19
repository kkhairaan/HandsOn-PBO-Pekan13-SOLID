public class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        GradeReportPrinter printer = new GradeReportPrinter();
        GradeRepository repository = new GradeRepository();

        String nama = "Andi";
        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);

        printer.cetakLaporan(nama, nilai);
        repository.simpanDatabase(nama, nilai);
    }
}
