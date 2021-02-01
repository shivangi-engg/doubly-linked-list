import printpackage.*;
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) 
	{
		//create instance of linked list
		Linked_list list = new Linked_list();
		list.insert_end(4);
		list.insert_end(5);
		list.insert_start(3);
		list.insert_start(2);
		list.insert_start(1);
		list.insert_at(6,5);
		list.insert_at(7,6);
		list.insert_at(22,2);
		list.insert_at(9,0);
		list.show();
	}

}