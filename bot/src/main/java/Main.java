import listeners.CommandHandler;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.sharding.DefaultShardManager;
import tools.Storage;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        Storage.init();

        DefaultShardManager builder = new DefaultShardManager(Storage.getValue("token"));
        builder.setStatus(OnlineStatus.IDLE);

        builder.addEventListener(new CommandHandler());

        builder.login();
    }

}
