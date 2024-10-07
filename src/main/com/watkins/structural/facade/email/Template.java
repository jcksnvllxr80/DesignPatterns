package main.com.watkins.structural.facade.email;

public abstract class Template {

    public enum TemplateType {Email, NewsLetter};

    public abstract String format(Object object);
}
