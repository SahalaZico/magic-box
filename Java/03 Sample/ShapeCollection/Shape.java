public abstract class Shape implements Relation {

  protected String name;

  //Constructor
  Shape(String newName) {
    name = newName;
  }

  //getter
  protected String getName() {
    return name;
  }

  //setter
  protected void setName(String newName) {
    name = newName;
  }

  // abstract method untuk luas
  protected abstract double getArea();

  // abstract method untuk keliling
  protected abstract double getCircumference();

  //method untuk menampilkan nama dari objek
	public String toString(){
		return "\n"+getName();
	}
}
