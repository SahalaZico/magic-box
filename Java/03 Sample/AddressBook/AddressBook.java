public class AddressBook {

    private final int MAX_ITEM = 5;
    private Person[] itemCollection;
    private int nbItem;

    public AddressBook() {
        nbItem = 0;
        itemCollection = new Person[MAX_ITEM];
    }

    public Person getItemCollection(int indeks) {
        if (indeks < 0 || indeks > nbItem) {
            return itemCollection[indeks];
        } else {
            return null;
        }
    }

    public boolean setItemCollection(Person newItemCollection) {
        if (nbItem < itemCollection.length) {
            itemCollection[nbItem] = newItemCollection;
            setNbItem();
            System.out.println("Objek berhasil ditambahkan\n");
            return true;

        } else {
            System.out.println("Objek tidak berhasil ditambahkan\n");
            return false;
        }
    }

    public int getNbItem() {
        return nbItem;
    }

    public void setNbItem() {
        nbItem += 1;
    }

    @Override
    public String toString() {
        String newString = "";
        for (int i = 0; i < nbItem; i++) {
            newString += "Item " + (i + 1) + "\n" + getItemCollection(i) + "\n";
        }
        return "Daftar alamat di dalam AddressBook: \n" + newString;
    }

}
