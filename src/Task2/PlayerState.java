package Task2;
/**
 * PlayerState interface defines the behavior of the player in each state.
 */
public interface PlayerState {
    void play(Player player);
    void pause(Player player);
    void stop(Player player);
}