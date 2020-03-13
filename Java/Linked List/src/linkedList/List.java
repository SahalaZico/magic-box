package linkedList;

/**
 *
 * @author SaZi
 */
public interface List<T> {
    //mengembalikan true jika list kosong dan false
    //jika sebaliknya
    public boolean isEmpty();
    //mengosongkan list

    public void makeEmpty();
    //menambahkan elemen e di awal list

    public void insertFirst(ListNode<T> e);
    //menambahkan elemen e di akhir list

    public void insertLast(ListNode<T> e);
    //mengembalikan true jika berhasil menghapus 
    //elemen pertama list dan false jika list kosong

    public boolean deletetFirst();
    //mengembalikan true jika berhasil menghapus 
    //elemen terakhir list dan false jika list kosong

    public boolean deleteLast();
    public boolean contains(ListNode<T> e);
    public int contain(ListNode<T> e);
}
