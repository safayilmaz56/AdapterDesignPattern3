public class FileLogger implements ILogger{
    @Override
    public void logAt(String loglanacakVeri) {
        System.out.println(loglanacakVeri + " verisine file logger tarafından loglama islemi gerceklestirildi");
    }
}
