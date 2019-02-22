package server;

public class Greeting {

    private int id;
    private String content;
    private String response;

    public Greeting(int id, String content, String response) {
        this.id = id;
        this.content = content;
        this.response = response;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public String getResponse() { return response; }
}
