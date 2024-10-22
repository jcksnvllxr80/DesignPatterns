package main.com.watkins.structural.flyweight;

import java.time.Duration;

public class UserBannedErrorMessage implements ErrorMessage {

    private String caseId;

    private String remarks;

    private Duration banDuration;

    private String msg;

    public UserBannedErrorMessage(String caseId) {
        this.caseId = caseId;
        remarks = "You violated the terms of use";
        banDuration = Duration.ofDays(2);
        msg = "You are BANNED. Sorry. \nMore information:\n";
        msg += caseId + "\n";
        msg += remarks + "\n";
        msg += "Banned for: " + banDuration.toHours() + " hours";
    }

    @Override
    public String getText(String code) {
        return msg;
    }

    public String getCaseId() {
        return caseId;
    }
}
