abstract class Shape {
    private String name;

    protected String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }
    
    protected abstract double getCircumference();
}
