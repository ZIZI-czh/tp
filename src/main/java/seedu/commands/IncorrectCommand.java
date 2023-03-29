package seedu.commands;


public class IncorrectCommand extends Command {

    @Override
    public String execute() {
        return ("Please enter the command again!");
    }

}
