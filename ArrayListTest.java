import java.util.*;

public class ArrayListTest{
public static void main(String args[]){
ArrayList<String> al = new ArrayList<String>();

al.add("do");
al.add("do2");
al.add("re");
al.add("meena");
al.add("fa");
System.out.println("print all array:"+al);

for(String a:al){
System.out.println("print all with for(String:"+a);
}
for(int i =0; i < al.size();i++){
System.out.println("ii++=:"+al.get(i)); 
}
System.out.println(al.get(2)); 
}
}
