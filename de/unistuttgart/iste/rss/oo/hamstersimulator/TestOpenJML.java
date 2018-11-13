package de.unistuttgart.iste.rss.oo.hamstersimulator;

import java.util.function.Consumer;

import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.HamsterGame;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.ui.javafx.JavaFXUI;

/**
 * Simple test run of the hamster game API exemplifying the use of the objects.
 * @author Steffen Becker
 *
 */
public final class TestOpenJML {

    /**
     * Constant containing the filename of the default territory file.
     */
    private static final String DEFAULT_HAMSTER_TERRITORY = "/territories/example01.ter";

    /**
     * Main method which instantiates, initializes, and starts a hamster game.
     * @param args Default command line parameters, not used.
     */
    public static void main(final String[] args) {
        JavaFXUI.start();

        final HamsterGame game = new HamsterGame();
        game.initialize(DEFAULT_HAMSTER_TERRITORY);
        game.setInputInterface(JavaFXUI.getJavaFXInputInterface());

        game.displayInNewGameWindow();
        game.runGame(new Consumer<Territory>() {

            @Override
            public void accept(Territory territory) {
                TestOpenJML.exampleRun(territory);
            }
        });
    }

    /**
     * Hamster main method, executed by this test.
     * @param territory The territory used during this test.
     */
    public static void exampleRun(final Territory territory) {
        final Hamster paule = territory.getDefaultHamster();
        paule.move();
        paule.move();
        paule.move();
        paule.move();
    }

    /**
     * Default constructor, only the VM should create instances of this.
     */
    private TestOpenJML() { }
}