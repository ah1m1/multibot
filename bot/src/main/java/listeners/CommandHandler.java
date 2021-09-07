package listeners;

import commands.GutCommand;
import commands.HSCommand;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import tools.Storage;

public class CommandHandler extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        if(message.startsWith("prefix")) {
            message = message.replaceFirst(Storage.getValue("prefix"), "");

            if(message.startsWith("hi")) {
                event.getChannel().sendMessage("hello world").queue();
            }
            if(message.startsWith("gut")) {
                GutCommand.gut(event, message);
            }


            //HSCOMMAND

            if(message.startsWith("!HS")){
                HSCommand.hsCommand(event);
            }
        }
    }
}
