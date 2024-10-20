package Task5;

/**
 * TextFile represents a text file.
 */
public class TextFile implements File {
    private String name;
    private String content;

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

