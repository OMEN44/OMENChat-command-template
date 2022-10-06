import com.github.OMEN44.OmenChatPlugin;

public class Main implements OmenChatPlugin {
    @Override
    public void onLoad() {
        setCommandExecutor("testCommand", new TestCommand());
    }

    @Override
    public void onDisable() {

    }
}
