package no.taco.speakeasy.models;

import no.taco.speakeasy.models.User;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * Created by catoda on 07.11.2016.
 */
public class Message {

    @Id
    public String id;

    private User from;
    private User[] to;
    private String msg;

    public Message(User from, User[] to, String msg) {
        this.id = UUID.randomUUID().toString();
        this.from = from;
        this.to = to;
        this.msg = msg;
    }

    public String getMessageText() {
        return msg;
    }
    public User getSender() {
        return from;
    }

    public User[] getRecipients() {
        return to;
    }

    @Override
    public String toString() {
        return String.format(
                "id: '%s', msg: '%s'"
                , id, msg
        );
    }
}
