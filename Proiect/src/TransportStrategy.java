public class TransportStrategy {
    private Singleton singleton;
    private final Transport transport;
    public TransportStrategy(Transport transport) {
        this.transport = transport;
        this.singleton = Singleton.getInstance();
    }

    public void execute() {
        this.transport.start();

        this.transport.getInfo();

        this.transport.operate();

        System.out.println("Category: " + this.singleton.getCategory());
    }

    public void repair() {
        //this.transport.repair();
        if (this.transport instanceof Car) {
            ((Car) this.transport).repair();
        } else {
            System.out.println("This transport does not support repair");
        }
    }

    public void stop() {
        this.transport.stop();
    }
}
