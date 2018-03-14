
public class DoublyLinkList {
	
	Node startNode;
	Node lastNode;
	
	void addElement(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(startNode == null){
			startNode = newNode;
		}
		else{
			newNode.previous = lastNode;
			lastNode.next = newNode;
		}
		lastNode = newNode;
	}
	
	void addElement(int data,int position){
		Node start = startNode;
		int i;
		for(i = 1; (i < position-1)&&(start != null) ; i++){
			start = start.next;
		}
		if((start != null) && (i <= position)){
			Node newNode = new Node();
			newNode.data = data;
			if(position == 1){
				newNode.previous = null;
				newNode.next = start;
				start.previous = newNode;
				startNode = newNode;
				
			}
			else{
				if(start != lastNode){
					start.next.previous = newNode;
					newNode.next = start.next;	
				}
				else{
					lastNode = newNode;
					newNode.next = null;
				}
				start.next = newNode;
				newNode.previous = start;
			}
			
		}
		else{
			throw new ArrayIndexOutOfBoundsException(i);
		}
	}
	
	void removeByData(int data){
		Node start = startNode;
		while(start!=null){
			if(start.data == data){
				break;
			}
			start = start.next;
		}
		
		start.previous.next = start.next;
		start.next.previous = start.previous;
	}
	
	void removeByIndex(int position){
		Node start = startNode;
		int i;
		for(i = 1; (i < position)&&(start != null) ; i++){
			start = start.next;
		}
		if((start != null) && (i <= position)){
			start.previous.next = start.next;
			start.next.previous = start.previous;
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int dataByIndex(int position){
		Node start = startNode;
		int i;
		for(i = 1; (i < position)&&(start != null) ; i++){
			start = start.next;
		}
		if((start != null) && (i <= position)){
			return start.data;
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void reverseLinkList(){
		int size = getSize();
		Node start = startNode;
		Node last = lastNode;
		int temp;
		for(int i=0;i<(size/2);i++){
			temp = start.data;
			start.data  = last.data;
			last.data = temp;
			start = start.next;
			last = last.previous;
		}
	}
	
	private int getSize(){
		int i= 0 ;
		Node start = startNode;
		while(start != null){
			i++;
			start = start.next;
		}
		return i;
	}
	
	public void sortLinkList(){
		int size = getSize();
		Node start = startNode.next;
		for (int i=1; i < size; ++i)
        {
            int key = start.data;
            Node j = start.previous;
            while (j != null && j.data > key)
            {
                j.next.data = j.data;
                j = j.previous;
            }
            j.next.data = key;
            start = start.next;
        }
	}
	
	void show(){
		Node start = startNode;
		while(start != null){
			System.out.println(start.data);
			start = start.next;
		}
	}
	
}
