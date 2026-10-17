package Collections.List;
import java.util.ArrayList;

public class AddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        System.out.print(arr);

        System.out.println("Uisng the Retrieve get method to find the value which is present at 4th index: "+arr.get(4));

        System.out.println("Using update set(index, value): "+arr.set(2,200));

        System.out.print("Array after update: "+arr);

        System.out.println("Remove element with the help of object: "+arr.remove(Integer.valueOf(60)));
        System.out.print("Array after remove 60: "+arr);

        System.out.println("Remove element with the help of index: "+arr.remove(3));

        System.out.println("Array: "+arr);
    }
}



/*
Operation	        Method	            Example
Add	                add(value)	        arr.add(10)
Insert at index	    add(index, value)	arr.add(1, 15)
Retrieve	        get(index)      	arr.get(0)
Update	            set(index, value)	arr.set(0, 50)
Remove by index	    remove(index)	    arr.remove(0)
Remove by value 	remove(Object)  	arr.remove(Integer.valueOf(30))
Find size       	size()          	arr.size()
Search value    	contains(value)	    arr.contains(20)
Clear all	        clear()	            arr.clear()
Check empty	        isEmpty()	        arr.isEmpty()
 */