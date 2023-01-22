import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void squaresRange() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(10, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void squaresInRange() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(50,100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void  squaresOutRange() {
        SQRService service = new SQRService();
        int actual = service.calcSQR( 200,300 );
        int expected = 3;
        Assertions.assertEquals(expected, actual);


    }
}








