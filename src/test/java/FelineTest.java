import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getSeveralKittensTest() {
        int expected = 10;
        assertEquals(expected, feline.getKittens(10));
    }

    @Test
    public void getOneKittenTest() {
        int expected = 1;
        when(feline.getKittens(1)).thenReturn(expected);
        assertEquals(expected, feline.getKittens(1));
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expected);
        assertEquals(expected, feline.eatMeat());
    }

}