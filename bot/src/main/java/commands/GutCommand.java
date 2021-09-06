package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class GutCommand {
    public static void gut(GuildMessageReceivedEvent event, String message){
        String args = message.replace("gut ","");
        event.getChannel().sendMessage("Toll " + args).queue();

    }
}
