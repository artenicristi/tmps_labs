package Command;

import java.util.ArrayList;
import java.util.List;

class Invoker {
    private final List<Command> commands;

    public Invoker() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
