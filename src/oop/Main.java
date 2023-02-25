package oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //объявляю переменную типа int и задаю значение
        int x = 12;
        //объявляю ссылку на объект класса Dinosaur
        //создаю экземпляр класса Dinosaur
        Dinosaur dinosaur = new Dinosaur();
        //объявляю (пустую) ссылку класса Dinosaur
        Dinosaur dinosaur1;
        System.out.println(dinosaur.name+" весит "+ dinosaur.weigth);
        dinosaur.name = "Аллозавр";
        dinosaur.weigth = 4000;
        dinosaur.name = "";
        System.out.println(dinosaur.name+" весит "+ dinosaur.weigth);
        dinosaur1 = null;
        //System.out.println(dinosaur1.name+" весит "+ dinosaur1.weigth);
        Animal animal = new Animal();
        //System.out.println(animal.name+" весит "+animal.weight);//инкапсуляция запрещает непосредственное изменение
        System.out.println(animal.getName()+" весит "+animal.getWeight());
        animal.setName("Утконос");
        animal.setWeight(4);
        System.out.println(animal.getName()+" весит "+animal.getWeight());
        Animal animal1 = new Animal();
        animal1.setName("Утконос32");
        animal1.setWeight(4);
        animal.setName("");
        System.out.println(animal1.getName()+" весит "+animal1.getWeight());
        animal.setName("Иван");
        System.out.println(animal1.getName()+" весит "+animal1.getWeight());
        Cow cow = new Cow();
        cow.setName("Буренка");
        cow.setWeight(300);
        System.out.println(cow.getName()+" весит "+cow.getWeight());
        System.out.println(cow.getName()+" дает молока "+cow.getMilk());
        Goat goat = new Goat();
        goat.setName("Маруся");
        goat.setWeight(40);
        System.out.println(goat.getName()+" дает молока "+goat.getMilk());
        //double weight = getMeat(cow);
        System.out.println("Мясо получено у "+cow.getName()+ " "+getMeat(cow));
        System.out.println("Мясо получено у "+goat.getName()+ " "+getMeat(goat));
        System.out.println("Мясо получено у "+animal1.getName()+ " "+getMeat(animal1));
        //double d = getCheese(cow);
        System.out.println(cow.getName()+" дает сыра "+getCheese(cow));
        System.out.println(goat.getName()+" дает сыра "+getCheese(goat));

    }

    private static double getCheese(Cow cow) {
        return cow.getMilk()/20;//getMilk у каждого свой
    }

    private static double getMeat(Animal cow) {
        return cow.getWeight()*3/4;
    }

}