import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class absoluteTest {

    @Test
    @DisplayName("case 1")
    void testFind() {
        int number=0;
        int expected=0;
        int result= absolute.find(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 2")
    void testFind2(){
        int number =1;
        int expected=1;
        int result= absolute.find(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 3")
    void testFind3(){
        int number =-1;
        int expected= 1;
        int result = absolute.find(number);
        assertEquals(expected,result);
    }
}