public class RedBird extends Bird {
     RedBird() {
        super("Red","circular","squawk",50);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " Bird is flying straight");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " Bird makes a " + this.getSound() + "sound");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " Bird hits the target with " + this.getDamage() + " damage points");
    }
}