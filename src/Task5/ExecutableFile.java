package Task5;

/**
 * ExecutableFile represents an executable file.
 */
public class ExecutableFile implements File {
    private String name;
    private byte[] code;

    public ExecutableFile(String name, byte[] code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public byte[] getCode() {
        return code;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

