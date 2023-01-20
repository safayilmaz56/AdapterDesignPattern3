public class DatabaseLogger implements ILogger{
    @Override
    public void logAt(String loglanacakVeri) {
        System.out.println(loglanacakVeri + " verisi database logger tarafından loglandı");
    }
}
