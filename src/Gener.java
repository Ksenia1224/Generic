public class Gener <T, V, K> {
    private T ten;
    private V ven;//56454545
    private K ken;

    public Gener(T ten, V ven, K ken) {
        this.ten = ten;
        this.ven = ven;
        this.ken = ken;
    }

    public T getTen() {
        return ten;
    }

    public void setTen(T ten) {
        this.ten = ten;
    }

    public V getVen() {
        return ven;
    }

    public void setVen(V ven) {
        this.ven = ven;
    }

    public K getKen() {
        return ken;
    }

    public void setKen(K ken) {
        this.ken = ken;
    }

    @Override
    public String toString() {
        return "Дженерик" +
                " первый = " + ten +
                ", второй = " + ven +
                ", третий = " + ken;
    }
}
