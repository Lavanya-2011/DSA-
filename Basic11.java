class Snode{
    int data;
    Snode link;
}

class Basic11{
    Snode head;
    void addFirst(int value){
        Snode newNode = new Snode();
        newNode.data=value;
        if(head==null){
            
        }
    }
    public static void main(String[] args){
        Basic11 ob = new Basic11();
        ob.addFirst(10);
        ob.addFirst(8);

    }
}