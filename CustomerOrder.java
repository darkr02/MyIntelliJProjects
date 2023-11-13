public class CustomerOrder {
//Single Responsibilty principle
    private final Logger _log = new Logger();
    public static void main(String[] args){
        CustomerOrder co = new CustomerOrder();
        co.create();
    }
    public void create() {
        try
        {
            int j=2/0;
            System.out.println("Hello:"+j);
        }
        catch (Exception ex) {
            //Putting the logging code to Logger Class
            // is enabling me to use this CutomerOrder class to focus on SRP or Single Responsibilty principle
            _log.logErrorEntry(ex.getLocalizedMessage());
        }
    }
}
