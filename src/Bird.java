public abstract class Bird {
    protected String name, shape,sound;
    protected int damage;

    Bird(String name, String shape, String sound, int damage) {
        this.name = name;
        this.shape = shape;
        this.sound = sound;
        this.damage = damage;
    }
    //Getters
    public String getName() {
        return name;
    }
    public String getShape() {
        return shape;
    }
    public String getSound() {
        return sound;
    }
    public int getDamage() {
        return damage;
    }

//    Setters

    public void setName(String name) {
        this.name = name;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    abstract public void fly();

    abstract public void attack();

    abstract public void makeSound();
}
