package Class3.example1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alvaro",2);
        Person person2 = new Person("Alvaro2",20);
        Person person3 = new Person("Alvaro3",5);
        Person person4 = new Person("Alvaro3",100);
        Person person5 = new Person("Alvaro3",1);
        Person person6 = new Person("Alvaro3",203);
        Person person7 = new Person("Alvaro3",15);
        Person persons[] = {person1,person2,person3,person4,person5,person6,person7};
        SortUtils.sort(persons);

        Phone phone1 = new Phone(2,"alvaro");
        Phone phone2 = new Phone(199,"alvaro");
        Phone phone3 = new Phone(390,"alvaro");
        Phone phone4 = new Phone(49,"alvaro");
        Phone phone5 = new Phone(5,"alvaro");
        Phone phones[] = {phone1,phone2,phone3,phone4,phone5};
        SortUtils.sort(phones);
    }
}
