public class Recap {
    public static void main(String[] args) {
        System.out.println(zwraca(1000));
    }

    public static void nicNieZwraca() {}
    public static int zwraca(int liczba) {
        int wynik = liczba - 1000;
        return wynik;
    }


}
