package solved.p_05_binary_search.nc033_M_06_981_Time_Based_Key_Value_Store;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeMapTest {


    @Test
    public void test_1(){
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        assertEquals("bar2", timeMap.get("foo", 4));
    }

}