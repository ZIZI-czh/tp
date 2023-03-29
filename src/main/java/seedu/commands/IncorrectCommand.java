package seedu.commands;


public class IncorrectCommand extends Command {

    public IncorrectCommand() {
    }

    @Override
    public String execute() {
        return ("Please enter the command again!");
    }

}
