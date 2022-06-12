package LeetCode;
import LeetCode.GenericList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        GenericList<String> list = new GenericList<String>();
        list.add("Namjoon");
        list.add("BTS");
        for (String item : list){
            System.out.println(item);
        }

    }
}
