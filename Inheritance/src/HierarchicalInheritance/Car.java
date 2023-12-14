package HierarchicalInheritance;

public class Car extends Vehicle{
    @Override // this annotation will make sure that this method should be overrided always
    String fuel() {
        return "CNG";
    }
}
