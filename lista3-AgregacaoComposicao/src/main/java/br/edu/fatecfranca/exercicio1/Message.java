package br.edu.fatecfranca.exercicio1;

public class Message {
    private String msg;
    private int id;
    Person pessoa;

    public Message() {
        this.msg = "";
    }

    public Message(int id, String msg, Person pessoa) {
        this.id = id;
        this.msg = msg;
        this.pessoa = pessoa;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPessoa() {
        return pessoa;
    }

    public void setPessoa(Person pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", id=" + id +
                ", pessoa=" + pessoa +
                '}';
    }
}
