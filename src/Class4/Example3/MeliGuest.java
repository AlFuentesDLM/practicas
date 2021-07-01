package Class4.Example3;

public class MeliGuest extends Guest{
    public MeliGuest(String name) {
        super(name,"MELI");
    }

    @Override
    public void eatCake() {
        System.out.println("Viva la Chiqui!!");
    }
}
