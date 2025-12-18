package main.com.watkins.behavioral.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
