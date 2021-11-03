public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        CarElementVisitor printVisitor = new CarElementVisitorPrint();
        CarElementVisitor doVisitor = new CarElementVisitorDo();

        printVisitor.visit(car);
        doVisitor.visit(car);
    }
}
