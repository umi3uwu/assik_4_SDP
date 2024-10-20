package Task5;

import java.util.Arrays;
import java.util.List;

/**
 * Main class to test the Visitor pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        // Create some files
        TextFile textFile1 = new TextFile("document1.txt", "This is a safe document.");
        TextFile textFile2 = new TextFile("document2.txt", "This document contains malware.");
        ExecutableFile exeFile1 = new ExecutableFile("program1.exe", new byte[]{(byte) 0xDE, (byte) 0xAD, (byte) 0xBE, (byte) 0xEF});
        ExecutableFile exeFile2 = new ExecutableFile("program2.exe", new byte[]{(byte) 0x00, (byte) 0x11, (byte) 0x22});

        // Add files to a list
        List<File> files = Arrays.asList(textFile1, textFile2, exeFile1, exeFile2);

        // Create visitors
        Visitor antivirusVisitor = new AntivirusVisitor();
        Visitor reportVisitor = new ReportVisitor();

        // Run antivirus scan
        System.out.println("Starting antivirus scan...");
        for (File file : files) {
            file.accept(antivirusVisitor);
        }

        System.out.println();

        // Generate scan report
        System.out.println("Generating scan report...");
        for (File file : files) {
            file.accept(reportVisitor);
        }
    }
}

