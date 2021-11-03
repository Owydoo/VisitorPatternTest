public class Body implements CarElement {
    private String name;

    public Body() {
        this.name = "default body name";
    }

    public Body(String name) {
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
