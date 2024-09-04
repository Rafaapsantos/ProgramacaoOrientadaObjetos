package br.edu.fatecfranca.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> messages;

    public Forum() {
        this.name ="";
        this.url ="";
        this.messages= new ArrayList<>();
    }

    public Forum(int id, String name, String url) {
        this.id = id;;
        this.name = name;
        this.url = url;
        this.messages= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", messages=" + messages +
                '}';
    }
}
