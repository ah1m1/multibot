package listeners;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class CommandHandler extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        if(message.startsWith("!hi")) {
            event.getChannel().sendMessage("hello world").queue();
        }
    }
}