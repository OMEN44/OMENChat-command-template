import com.github.OMEN44.Command;

public class TestCommand implements Command {

    @Override
    public boolean execute(String label, String sender, String timeSent, String[] args) {
        System.out.println("Plugin works!");
        return true;
    }
}
