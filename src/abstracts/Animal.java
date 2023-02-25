package abstracts;

public abstract class Animal {
    public Animal(){
        for (int i = 0; i < 3; i++) {
            title = "Некое животное"+title;
        }
    }
    public Animal (String s){
        title = s;
    }
    public Animal(String s, int x){
        title = s+x;
    }
    String title="Некое животное1";//
    double weight;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract String talk();
}

