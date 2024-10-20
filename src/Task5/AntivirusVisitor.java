package Task5;

import java.util.Arrays;
import java.util.List;

/**
 * AntivirusVisitor performs file scanning.
 */
public class AntivirusVisitor implements Visitor {

    private static final List<String> PROHIBITED_WORDS = Arrays.asList("virus", "malware", "trojan");

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file: " + textFile.getName());
        String content = textFile.getContent().toLowerCase();
        for (String word : PROHIBITED_WORDS) {
            if (content.contains(word)) {
                System.out.println("Threat detected in " + textFile.getName() + ": Prohibited word \"" + word + "\" found.");
            }
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file: " + executableFile.getName());
        // Simple simulation of malicious code detection
        byte[] code = executableFile.getCode();
        if (code.length > 1 && code[0] == (byte) 0xDE && code[1] == (byte) 0xAD) {
            System.out.println("Threat detected in " + executableFile.getName() + ": Malicious code signature found.");
        }
    }
}

