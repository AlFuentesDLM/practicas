package Class4.Example3;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private String name;
    private List<Guest> guests;
    private List<Explode> fireWorks;

    public Party(String name) {
        this.name = name;
        this.guests = new ArrayList<>();
        this.fireWorks = new ArrayList<>();
    }

    public void eatCake(){
     guests.stream().forEach(guest -> guest.eatCake());
    }

    public void explodeFireWorks(){
        fireWorks.stream().forEach(explode -> explode.explode());
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public void addFirework(Explode explode){
        fireWorks.add(explode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public List<Explode> getFireWorks() {
        return fireWorks;
    }

    public void setFireWorks(List<Explode> fireWorks) {
        this.fireWorks = fireWorks;
    }

    public void apagar(){
        System.out.println("La chiqui esta apagando las velas");
        eatCake();
        explodeFireWorks();
    }
}
