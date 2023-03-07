public class Konsumsi<M, I> {
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKonsumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}

public class Hidangan{
        protected String namaHidangan;

    public String getNamaHidangan(){
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan;
    }

    public String disantap(){
        return "Makanan Dihidangkan";
    }
}

public class Minuman extends Hidangan{
    public String disantap(){
        return this.getNamaHidangan() + "diminum";
    }
}

public class Makanan extends Hidangan{
    public String disantap(){
        return this.getNamaHidangan() + "dimakan";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan,Minuman> konsumsi: listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap);
            System.out.println(minuman.disantap);
        }
    }
}