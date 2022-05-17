package stack;

public class Stack {
StackNode head=null;
    
    void push( Object data){
        StackNode eleman=new StackNode();
        eleman.data=data;
        StackNode temp=head;
        
            head=eleman;
            eleman.next=temp;
        
    }
    void pop(){
       StackNode temp=head;
       head=temp.next;
    }
    void peek(){
        
        System.out.println("peek deðeri : "+head.data);
    }
    void isEmpty(){
        if(head==null){
            System.out.println("stack yapýsý boþtur.");
        }else{
            System.out.println("stack var .");
        }
        
    }
    void clear(){
        
       if(head==null){
           System.out.println("zaten boþ");
       }
       else{
            while(head!=null){
            
            head=head.next;
        }
       }
    }
    
    void println(){
         StackNode temp=head;
         while(temp!=null){
             System.out.print(temp.data+"\n||\n");
             temp=temp.next;
         }
         
    }
}
