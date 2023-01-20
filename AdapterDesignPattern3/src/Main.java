public class Main {
    public static void main(String[] args) {
        ILogger log = new DatabaseLogger();
        log.logAt("satış gerçekleştirildi");

        log = new Adapter();
        log.logAt("ürün eklendi");
    }
}