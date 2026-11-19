public class MobilBensin implements Vehicle, EnginePowered, FuelPowered {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar bensin...");
    }

    @Override
    public void move() {
        System.out.println("Mobil bensin melaju di jalan raya.");
    }
}
