public class CarElementVisitorDo implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("do stuff to : " + wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("do stuff to : " + engine.getName());
    }

    @Override
    public void visit(Body body) {
        System.out.println("do stuff to : " + body.getName());
    }

    @Override
    public void visit(Car car) {
        System.out.println("doing stuff on car");
        for (CarElement carElement : car.getElements()
             ) {
            carElement.accept(this);
        }
        System.out.println("car done");
    }
}
