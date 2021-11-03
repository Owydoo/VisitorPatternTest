public class CarElementVisitorPrint implements CarElementVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("print visited wheel : " + wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("print visited engine : " + engine.getName());

    }

    @Override
    public void visit(Body body) {
        System.out.println("print visited body : " + body.getName());
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
        for (CarElement carElement: car.getElements()
             ) {
            carElement.accept(this);
        }
        System.out.println("car visited");
    }
}
