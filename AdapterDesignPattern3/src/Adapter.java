public class Adapter implements ILogger{

    private ThirdPartyLogger logger;

    public Adapter() {
        logger = new ThirdPartyLogger();
    }

    @Override
    public void logAt(String loglanacakVeri) {
        logger.loglamaYap(loglanacakVeri);
    }
}
