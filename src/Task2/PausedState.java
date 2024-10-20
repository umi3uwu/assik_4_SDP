package Task2;
/**
 * PausedState represents the state when the player is paused.
 */
public class PausedState implements PlayerState {

    @Override
    public void play(Player player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback from paused state.");
        player.setState(new StoppedState());
    }
}
