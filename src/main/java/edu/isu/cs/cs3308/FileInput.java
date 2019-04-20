package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.impl.GraphAL;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileInput {
    public GraphAl<V, E> ReadFile(String e) {
        String fileName = "/data.txt";
        try {
            URI uri = this.getClass().getResource(fileName).toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri),
                    Charset.defaultCharset());

            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
