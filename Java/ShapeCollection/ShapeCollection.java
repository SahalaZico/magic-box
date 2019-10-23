public class ShapeCollection{
    private Shape[] arrShape;
    private int MAX_EL = 10;
    private int indeks;
    index = 0;

    public Shape getShape(int index){
        return arrShape[index];
    }

    public void displayAll(){
        for (int i =0;i < arrShape.length;i++ ){
            arrShape[i].toString();
        }
    }

    public boolean addShape(Shape anyShape){
        if(index < MAX_EL){
            arrShape[index] = anyShape;
            index++;
            return true;
        }
        else{
            return false;
        }
    }
}