package company;

public class Main {
    public static void main(String[] args) {
        //Code in here
        System.out.println("----------------Hewan Karnivora---------------");
        Carnivor animalCarnivor = new Carnivor();
        animalCarnivor.food();
        animalCarnivor.teeth();
        animalCarnivor.identify_myself();
        System.out.println();

        System.out.println("----------------Hewan Herbivora---------------");
        Herbivor animalHerbivora = new Herbivor();
        animalHerbivora.food();
        animalHerbivora.teeth();
        animalHerbivora.identify_myself();
        System.out.println();

        System.out.println("----------------Hewan Omnivora---------------");
        Omnivora animalOmnivora = new Omnivora();
        animalOmnivora.food();
        animalOmnivora.teeth();
        animalOmnivora.identify_myself();
        System.out.println();
    }
}