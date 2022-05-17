package singlyLinkedList;

public class Test {    
    public static void main(String[] args){
       BListe bl = new BListe();       
       bl.initialize(23);
       
       bl.addElementLast(6);       
       bl.addElementFront(5);
       bl.printLinkedList();
       
       bl.deleteNode(563);    
       bl.printLinkedList();
       
       bl.addElementLast(67);
       bl.addElementFront(87);
       bl.printLinkedList();
       
       bl.araya_ekle(5, 6); //ilki eklenecek olan ikinci kimden sonra eklenecek olduðu.
       bl.printLinkedList();
    
       
       bl.deleteNode(67);
       bl.printLinkedList();
       
      
    }   
}
