package builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4090")
                .build();

        System.out.println("Basic Computer:");
        basicComputer.showSpecs();

        System.out.println("\nGaming Computer:");
        gamingComputer.showSpecs();
    }
}
