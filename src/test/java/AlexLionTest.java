import com.example.AlexLion;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AlexLionTest {

    @Mock
    private Feline feline;

    private AlexLion alexLion;

    @BeforeEach
    public void setUp() throws Exception {
        alexLion = new AlexLion(feline);
    }

    @Test
    public void getFriendsTest() {
        List<String> expected = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expected, alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, alexLion.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        int expected = 0;
        when(feline.getKittens(0)).thenReturn(expected);
        assertEquals(expected, alexLion.getKittens());
    }

}