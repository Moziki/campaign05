package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.impl.GraphAL;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/*public class FileInput {
    public GraphAL<V, E> ReadFile(String e) {
        LinkedList<String> something;
        String fileName = e;
        try {
            URI uri = this.getClass().getResource(fileName).toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri),
                    Charset.defaultCharset());

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
}
*/