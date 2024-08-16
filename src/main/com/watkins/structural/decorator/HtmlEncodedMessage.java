package main.com.watkins.structural.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String GetContent() {
        return StringEscapeUtils.escapeHtml4(msg.GetContent());
    }
}

