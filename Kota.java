public class Kota<E> {
    private E element;

    public Kota(E kota){
        element = kota;
    }
    public E getElement(){
        return element;
    }
    public static void main(string[] args) {
        kota<Integer> jumlahKota = new Kota<Integer>(9);
        kota<string> namaKota = new Kota<string>("Malang");
        system.out.printIn("Jumlah kota di Jawa Timur :"+ namaKota.getElement()+ "kota");
        system.out.printIn("Salah Satu Kota di Jawa Timur : Kota"+ namaKota.getElement());
        
    }
}
