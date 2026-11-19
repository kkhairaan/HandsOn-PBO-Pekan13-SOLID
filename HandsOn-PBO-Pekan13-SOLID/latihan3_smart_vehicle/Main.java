public class Main {
    public static void main(String[] args) {
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();
        mobilListrik.move();

        System.out.println();

        MobilBensin mobilBensin = new MobilBensin();
        mobilBensin.startEngine();
        mobilBensin.isiBahanBakar();
        mobilBensin.move();

        System.out.println();

        Sepeda sepeda = new Sepeda();
        sepeda.move();

        System.out.println();

        MobilHybrid mobilHybrid = new MobilHybrid();
        mobilHybrid.startEngine();
        mobilHybrid.isiBahanBakar();
        mobilHybrid.isiBaterai();
        mobilHybrid.move();
    }
}
