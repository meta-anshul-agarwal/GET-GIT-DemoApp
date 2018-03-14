import java.util.Arrays;

public class ArrayList {

	int[] arrayList; 
	
	public ArrayList() {
		arrayList = new int[0];
	}
	
	public int[] add(int element) {
		int[] newArray;
		newArray = Arrays.copyOf(arrayList, arrayList.length+1);
		newArray[arrayList.length] = element;
		arrayList = newArray;
		return arrayList;
	}
	
	public int[] add(int element , int position) {
		int[] newArray = new int[arrayList.length+1];
		int i = 0;
		for( ; i < position-1 ; i++) {
			newArray[i] = arrayList[i];
		}
		newArray[i++] = element;
		for( ; i < newArray.length ; i++) {
			newArray[i] = arrayList[i-1];
		}
		arrayList = newArray;
		return arrayList;
	}
	
	public int getElementByIndex(int index) {
		return arrayList[index-1];
	}
	
	public int getIndexByElement(int element) {
		for(int i = 0 ; i < arrayList.length ; i++) {
			if(element == arrayList[i]) {
				return i-1;
			}
		}
		return -1;
	}
	
	public int[] deleteByIndex(int position) {
		int[] newArray = new int[arrayList.length-1];
		int i = 0;
		for( ; i < position-1 ; i++) {
			newArray[i] = arrayList[i];
		}
		for( i = position; i < arrayList.length ; i++) {
			newArray[i-1] = arrayList[i];
		}
		arrayList = newArray;
		return arrayList;
	}
	
	public int[] deleteByElement(int element) {
		int[] newArray = new int[arrayList.length-1];
		int i = 0;
		for( ; i < arrayList.length ; i++) {
			if(arrayList[i] == element) {
				break;
			}
			newArray[i] = arrayList[i];
		}
		i++;
		for( ; i < arrayList.length ; i++) {
			newArray[i-1] = arrayList[i];
		}
		arrayList = newArray;
		return arrayList;
	}
	
	public int[] clearAll() {
		arrayList = new int[0];
		return arrayList;
	}
	
	public int[] reverse() {
		int temp;
		for(int i = 0 ; i < arrayList.length/2 ; i++) {
			temp = arrayList[i];
			arrayList[i] = arrayList[arrayList.length - i - 1];
			arrayList[arrayList.length - i - 1] = temp;
		}
		return arrayList;
	}
	
	public int[] sort() {
		Arrays.sort(arrayList);
		return arrayList;
	}
	
	public int[] merge(ArrayList newArrayList) {
		int[] newArray = new int[arrayList.length+newArrayList.arrayList.length];
		int i = 0;
		for( ; i < arrayList.length ; i++) {
			newArray[i] = arrayList[i];
		}
		for(i = 0 ; i < newArrayList.arrayList.length ; i++) {
			newArray[i + arrayList.length ] = newArrayList.arrayList[ i ];
		}
		arrayList = newArray;
		return arrayList;
	}
	
}
