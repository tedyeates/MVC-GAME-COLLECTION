package Menu;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Ted_Y on 11/06/2017.
 */
public class Main extends StateBasedGame {
    public Main(String name) {
        super(name);
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        //add state
        addState(new States());
    }

    public static void main(String[] args) {
        //Initialise game screen
        AppGameContainer agc;

        try {
            //initialise and set name
            agc = new AppGameContainer(new Main("Dank Game Name"));
            //set window size
            agc.setDisplayMode(500,800,false);
            //always update screen
            agc.setAlwaysRender(true);
            //display window
            agc.start();

        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
