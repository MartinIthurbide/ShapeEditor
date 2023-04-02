package xshape.command;

import java.util.ArrayList;

/*
 * Invoker class for the command pattern
 * Includes a singleton instance
*/

public class Invoker implements Command {
    private ArrayList<Command> _cmds;
    private int _curr;

    private static Invoker _singleton = null;

    private Invoker() {
        _cmds = new ArrayList<>();
        _curr = -1;
    }

    public static Invoker instance() {
        if (_singleton == null)
            _singleton = new Invoker();
        return _singleton;
    }

    public void addCommand(Command c) {
        _cmds.add(c);
    }

    public void removeCommand(Command c) {
        _cmds.remove(c);
    }

    @Override
    public void apply() {
        if (_curr < _cmds.size() - 1)
            _cmds.get(++_curr).apply();
    }

    @Override
    public void undo() {
        if (_curr >= 0)
            _cmds.get(--_curr).undo();
    }
}
