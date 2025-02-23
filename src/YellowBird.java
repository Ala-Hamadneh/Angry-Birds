public class YellowBird extends Bird {
    YellowBird() {
        super("Chuck","triangular","yell",80);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " Bird is flying in a straight line at incredible speed");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " Bird lets out a fierce " + this.getSound() + "!");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " Bird hits the target with a powerful punch, dealing " + this.getDamage() + " damage points");
    }
}