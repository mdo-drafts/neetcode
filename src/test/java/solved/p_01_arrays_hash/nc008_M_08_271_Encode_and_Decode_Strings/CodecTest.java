package solved.p_01_arrays_hash.nc008_M_08_271_Encode_and_Decode_Strings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CodecTest {

    Codec sut = new Codec();

    @Test
    public void test_1() {
        List<String> input = Arrays.asList("Hello", "World");
        String encoded = sut.encode(input);
        String expectedEncoded = "5#Hello5#World";

        assertEquals(expectedEncoded, encoded);

        List<String> decoded = sut.decode(encoded);

        List<String> expectedDecoded = Arrays.asList("Hello", "World");

        assertEquals(expectedDecoded, decoded);
    }

    @Test
    public void test_2() {
        List<String> input = Arrays.asList("");
        String encoded = sut.encode(input);

        List<String> decoded = sut.decode(encoded);

        List<String> expectedDecoded = Arrays.asList("");

        assertEquals(expectedDecoded, decoded);
    }

    @Test
    public void test_3() {
        List<String> input = Arrays.asList("#");
        String encoded = sut.encode(input);

        List<String> decoded = sut.decode(encoded);

        List<String> expectedDecoded = Arrays.asList("#");

        assertEquals(expectedDecoded, decoded);
    }

}