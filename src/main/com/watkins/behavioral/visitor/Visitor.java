package main.com.watkins.behavioral.visitor;

import main.com.watkins.behavioral.chainofresponsibility.Director;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(ProjectLead lead);

    void visit(Manager manager);

    void visit(VicePresident vicePresident);
}
