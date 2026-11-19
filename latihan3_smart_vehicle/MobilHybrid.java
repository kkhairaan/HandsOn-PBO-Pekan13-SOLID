public class MobilHybrid implements Vehicle, EnginePowered, FuelPowered, ElectricPowered {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin hybrid...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bensin mobil hybrid...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil hybrid...");
    }

    @Override
    public void move() {
        System.out.println("Mobil hybrid melaju dengan mode efisien.");
    }
}
