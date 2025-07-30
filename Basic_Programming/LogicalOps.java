public class LogicalOps {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean hasUmbrella = false;
        boolean isCold = true;

        System.out.println("isRaining && hasUmbrella: " + (isRaining && hasUmbrella));
        System.out.println("isRaining || hasUmbrella: " + (isRaining || hasUmbrella));
        System.out.println("!isRaining: " + (!isRaining));
        System.out.println("isRaining && (hasUmbrella || isCold): " + (isRaining && (hasUmbrella || isCold)));
    }
}
