package Class4.Example3;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new MeliGuest("Alvaro");
        Guest guest2 = new AverageGuest("Alejandro");
        Party chiquiParty = new Party("ChiquiParty");
        chiquiParty.addGuest(guest1);
        chiquiParty.addGuest(guest2);

        FireWork fireWork = new FireWork("Start","Kabummm!!!");
        FireWork fireWork1 = new FireWork("asd","Kabumm2 :O");
        FireWork fireWork2 = new FireWork("dasa","KAbuuuuum!");

        FireWorkPackage fireWorkPackage = new FireWorkPackage();

        fireWorkPackage.addFireWork(fireWork1);
        fireWorkPackage.addFireWork(fireWork2);

        chiquiParty.addFirework(fireWork);
        chiquiParty.addFirework(fireWorkPackage);
        chiquiParty.apagar();
    }
}
