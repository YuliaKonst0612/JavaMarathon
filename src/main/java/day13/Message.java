package day13;

import java.util.Date;

public class Message {
    private User receiver;
    protected User sender;
    protected String text;
    private Date date;

    public Message(User receiver, User sender, String text) {
        this.receiver = receiver;
        this.sender = sender;
        this.text = text;
        this.date = new Date();

    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\nTO: " + receiver +
                "\nON: " + date + "\n" + text + "\n";
    }
}
