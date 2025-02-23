public class BlueBird extends Bird {
    BlueBird(){
        super("Blues","small and round", "chirp chirp",30);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " Bird is flying straight and fast!");    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Bird hits the target with " + getDamage() + " damage points and splits into three!");    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " Bird hits the target with a powerful punch, dealing " + this.getDamage() + " damage points");
    }
}
