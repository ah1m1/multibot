package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class HSCommand {
    public static void hsCommand(GuildMessageReceivedEvent event){
        event.getChannel().sendMessage("TEST").queue();
    }
}