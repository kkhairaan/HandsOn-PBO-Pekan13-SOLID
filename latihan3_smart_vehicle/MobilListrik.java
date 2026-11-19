public class MobilListrik implements Vehicle, EnginePowered, ElectricPowered {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan motor listrik...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }

    @Override
    public void move() {
        System.out.println("Mobil listrik melaju tanpa emisi.");
    }
}
