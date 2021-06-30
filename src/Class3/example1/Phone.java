package Class3.example1;

public class Phone implements Precedable<Phone>{
    private int numero;
    private String titular;

    public Phone(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean precedeA(Phone type) {
        return numero > type.numero;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }
}
