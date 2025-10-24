public class Cavallo extends Thread{

    private final String name;
    private int lentezza;
    private String  primo;
    public Cavallo(String name, int lentezza) {
        super();
        this.name = name;
        this.lentezza = lentezza;
    }
    public Cavallo(String name){
        super();
        this.name = name;
    }
    /**override del metodo run */
    @Override
    public void run(){
        System.out.println("Cavallo " +
                name + " comincia il suo galoppo");
        for (int i = 1; i <= 10 && !Thread.currentThread().isInterrupted(); i++) {
            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name +" cavalca - passo: " + i);
        }
        if(Main.getPrimo().equals("") && !Thread.currentThread().isInterrupted()){
            Main.setPrimo(this.name);
        }
    }
    /**getter per il parametro di lentezza */
    protected int getLentezza(){
        return lentezza;
    }
    /**setter per il parametro di lentezza */
    protected void setLentezza(int lentezza){
        this.lentezza=lentezza;
    }

    public String getNomeCavallo() {
        return name;
    }
}