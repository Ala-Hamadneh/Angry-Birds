import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    RedBird red = new RedBird();
    YellowBird yellow = new YellowBird();
    BlueBird blue = new BlueBird();

    List<Bird> birds = new ArrayList<Bird>();
    birds.add(red);
    birds.add(yellow);
    birds.add(blue);

    Game game = new Game(birds);
    game.play();
}
}
