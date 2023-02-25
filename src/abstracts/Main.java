package abstracts;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Animal animal = new Animal() ;
        Animal dog = new Dog();
        Dog dog2 = (Dog)dog;
        dog2 = null;
        Bulldog dog3 = (Bulldog) dog2;
        //dog2.talk();
        Dog dog4 = (Bulldog)dog2;
        dog.setTitle("Шарик");
        dog.setWeight(20);
        System.out.println(dog.getTitle()+" весит "+dog.getWeight());
        System.out.println(dog.getTitle()+" говорит "+dog.talk());
        Animal cat = new Cat();
        cat.setWeight(3);
        cat.setTitle("Мурка");
        System.out.println(cat.getTitle()+" говорит "+cat.talk());
        Animal horse = new Chicken();
        horse.setWeight(400);
        horse.setTitle("Спирит");
        System.out.println(horse.getTitle()+" говорит "+horse.talk());
        Farm farm = new Farm();
        farm.feed(dog);
        farm.feed(cat);
        farm.feed(horse);
        System.out.println(dog.getTitle()+" весит "+dog.getWeight());
        System.out.println(cat.getTitle()+" весит "+cat.getWeight());
        System.out.println(horse.getTitle()+" весит "+horse.getWeight());
//        Animal chicken = new Chicken();
//        System.out.println(chicken.getTitle()+" весит "+chicken.getWeight());
        Animal chicken = new Chicken();
        chicken.setTitle("Ряба");
        System.out.println(chicken.getTitle()+" говорит "+chicken.talk());
        Animal bulldog = new Bulldog();
        Animal dog1 = new Dog();
        //Animal dog2 = (Animal) new Bulldog();//really is Children
        Animal dog5 = (Animal) new Dog();//really is Children
        Animal dog6 = dog5;
        dog5 = null;
        Bulldog dog7 = (Bulldog) dog5;
        //dog5.setWeight(100);
    }
}