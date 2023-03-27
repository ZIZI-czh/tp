package seedu.parser;


import seedu.commands.Command;
import seedu.commands.EndCommand;
import seedu.commands.ExitCommand;
import seedu.commands.HelpCommand;
import seedu.commands.IncorrectCommand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("(?<commandName>\\S+)(?<arguments>" +
            ".*)");

    public Command processCommand(String userInput) {
        Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
        if (!matcher.matches()) {
            return new IncorrectCommand();
        }

        String commandName = matcher.group("commandName");
        String arguments = matcher.group("arguments");

        switch (commandName) {
        case "/start":
            return CheckInput.processStart(arguments);
        case "/add":
            return CheckInput.processAdd(arguments);
        case "/delete":
            return CheckInput.processDelete(arguments);
        case "/list":
            return CheckInput.processList(arguments);
        case "/view":
            return CheckInput.processView(arguments);
        case "/end":
            return new EndCommand();
        case "/exit":
            return new ExitCommand();
        case "/help":
            return new HelpCommand();
        default:
            return new IncorrectCommand();
        }
    }

}

