package abstracts;

public class Farm {
    public void feed(Animal animal){
        System.out.println(animal.talk());
        animal.setWeight(animal.getWeight()+animal.getWeight()/60);
        //animal.setWeight(animal.getWeight()*61/60);

    }
}
