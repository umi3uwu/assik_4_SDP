package Task2;
/**
 * Player class manages the current state and delegates commands to the state.
 */
public class Player {
    private PlayerState state;

    public Player() {
        // Initial state is StoppedState
        state = new StoppedState();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
