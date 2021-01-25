import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainAppTest {

    Student student = new Student();

    @Test
    public void testGetterSetterName(){
        student.setName("Paul2");
       String actual = student.getName();
       assertEquals("Paul2", actual);
    }

    @Test
    public void testGetterSetterGender(){
        student.setGender("f");
        String actual = student.getGender();
        assertEquals("f", actual);
    }

    @Test
    public void testGetterSetterMaNummer(){
        student.setMaNummer(000000);
        int actual = student.getMaNummer();
        assertEquals(000000, actual);
    }

}
