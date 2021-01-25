import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainAppTest {

    Student student = new Student("m", "Mark", 1234343);

    @Test
    public void testGetterSetterName(){
        //student.setName("Paul2");
       String actual = student.getName();
       assertEquals("Mark", actual);
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
