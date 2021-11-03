public class Engine implements CarElement {
    private String name;

    public Engine() {
        this.name = "default engine name";
    }

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
