import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int numSqr = service.numberOfSquares(10, 99);
        System.out.println("Количество квадратов в диапазоне от 10 до 99 равно " + numSqr);
    }
}
