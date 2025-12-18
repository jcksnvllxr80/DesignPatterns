package main.com.watkins.behavioral.memento.command;

import main.com.watkins.behavioral.memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand {

    private String name;

    public CreateCommand(WorkflowDesigner designer, String name) {
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.createWorkflow(name);
    }
}
