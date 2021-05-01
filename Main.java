import sample.*;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.process(() -> {
                System.out.println("Hello with lambda");
            }
        );

        Item.save(item -> {
                item.id("A10")
                    .name("LX100G")
                    .description("Sample")
                    .price(10000);
        });
    }
}
