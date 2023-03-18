package concrete;

import abstracts.Vehicle;

public class Main {
    public static void displayValue(Vehicle v){
        System.out.println(v.calculateValue());
    }
    public static void main(String[] args) {
        // Liskov substitution principle
        // aplicat pe ierarhii de de mostenire
        // clasele derivate trebuie sa fie complet substituibile pentru clasele lor de baza
        Car car = new Car(1000, new ElectricEngine(1000));
        Truck truck = new Truck(1000, new CombustionEngine(1200));
        // tipul variabilelor car/ truck poate fi oricand inlocui de abstracts.Vehicle iar comportamentul ar fi acelasi
        // mai exact car/truck pot fi folosite oriunde asteptam un obiect abstracts.Vehicle si logica programului sa fie aceeasi
        // utilizarea functiei displayValue demonstreaza exact posibilitatea substituirii abstracts.Vehicle cu concrete.Car/concrete.Truck
        displayValue(car);
        displayValue(truck);

        // Interface segregation principle
        // chiar daca concrete.Bike, concrete.Car, concrete.Truck sunt derivate din clasa vehicle, ele implementeaza interfete diferite, doar pe
        //acelea de care au nevoie.
        Bike bike = new Bike(10);
        bike.ride(); // interfata implementata ride nu ar fi avut sens pentru o masina

        car.openDoors();// nu ar fi avut sens pentru o bicicleta

        //prin urmarea functionalitatile ar trebui separate conceptual in interfete diferite si specializate doar pe o
        //anumita parte a unei masini

        //Dependency Inversion Principle - Clasele Car si Truck detin ambele un Engine ( clasa abstracta )
        // car si truck pot avea asociate tipuri diferite de engine ( electric combustion hidrogen ) ... nefiind necesara
        //modificarea celor 2 clase in cazul aparitiei unui nou motor. Ele depind de notiune abstracta de motor nu de un
        //anume motor concret.
        // cu toate ca avem aceeasi metoda , ea difera prin tipul de motor al celor 2. Inlocuirea cu metoda corecta
        // se petrece la runtime
        car.refil();
        truck.refil();
    }
}
