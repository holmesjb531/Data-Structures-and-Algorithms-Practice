import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class buildingAnArray {

    private Object[] data;
    private int capacity;
    private int length;

    public buildingAnArray(){
        capacity = 1;
        length = 0;
        data = new Object[1];
    }

    public Object get(int index){
        return data[index];
    }

    public void push(Object obj){
        if(capacity == length) {
            data = Arrays.copyOf(data, capacity * 2);
            capacity = capacity * 2;
        }
        data[length] = obj;
        length++;
    }

    public Object pop(){
        Object lastItem = data[length - 1];
        data[length - 1] = null;
        length--;
        return data;
    }

    public Object delete(int index){
        Object deleteItem = data[index];
        shiftItems(index);
        return deleteItem;
    }

    public void shiftItems(int index){
        for(int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[length - 1] = null;
        length--;
    }

    public static void helperMethod(buildingAnArray obj){
        for(int i = 0; i < obj.length; i++){
            System.out.println(obj.get(i));
        }
    }


    public static void main(String[] args){
        buildingAnArray newArray = new buildingAnArray();
        newArray.push("Hello");
        newArray.push("World");
        newArray.push("Jalen");
        newArray.push("Holmes");
        helperMethod(newArray);
        System.out.println("----------------");
        newArray.pop();
        helperMethod(newArray);
        System.out.println("----------------");
        newArray.delete(1);
        helperMethod(newArray);
    }

}
