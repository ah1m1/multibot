import listeners.CommandHandler;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.sharding.DefaultShardManager;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {

        DefaultShardManager builder = new DefaultShardManager("ODg0NDYzOTA3Nzc3OTU3ODg4.YTY3NA.64xsIVDihfe6qthjjCQhUcHFLv0");
        builder.setStatus(OnlineStatus.IDLE);

        builder.addEventListener(new CommandHandler());

        builder.login();
    }

}
