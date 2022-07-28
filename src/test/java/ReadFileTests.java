import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/ReadFileTests.txt"));
        br.readLine();
        String line2 = br.readLine();
        br.close();

        assertEquals(line2, "аллоха");
    }
}
