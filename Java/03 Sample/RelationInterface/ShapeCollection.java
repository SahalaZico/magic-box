public class ShapeCollection{
    private Shape[] arrShape;
    private int MAX_EL = 10;
    private int indeks;

    //Constructor
    public ShapeCollection() {
		arrShape = new Shape[MAX_EL];
		indeks=0;
	}

    //Method untuk mengembalikan sebuah shape dalam array arrShape
    public Shape getShape(int varIndex){
        return arrShape[varIndex];
    }

    //Method untuk menampilkan semua elemen dalam array arrShape
    public void displayAll(){
        for (int i =0;i < arrShape.length;i++ ){
            arrShape[i].toString();
        }
    }

    //Method untuk menambah Shape ke dalam arr shape
    public boolean addShape(Shape anyShape){
        if(indeks < MAX_EL){

            // uncomment kalau butuh
            //fungsi loop ini adalah untuk melakukan pengecekan apakah
            //objek yang sama telah ada di dalam arrShape
            //jika telah ada maka Shape tersebut tidak akan dimasukkan kedalam arrShape

			/*for(int i=0;i<=indeks;i++){
				if(arrShape[i].isEqual(anyShape)){
					return false;
				}
			}*/

            arrShape[indeks] = anyShape;
            indeks++;
            return true;
        }
        else{
            return false;
        }
    }
}