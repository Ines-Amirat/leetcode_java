package mergeTwoSortedLists;

public class List {

	private int value;
	private List next;

	public List(int value, List next) {
		this.value = value;
		this.next = next;
	}

	public List MergeLists(List list1, List list2) {
		 List temp_list = new List(-1,null);
		 List current = temp_list ;
		 
		 
		 while(list1 != null && list2 != null) {
			 if(list1.value <= list2.value) {
				 current.next = list1;
				 list1 = list1.next;
				 
			 }
			 else {
				 current.next = list2;
				 list2 =list2.next;
			 }
			 current = current.next;
		 }
		 if(list1 != null) {
			 current.next = list1;
		 }
		 else {
			 current.next =list2;
		 }
		 return temp_list.next;
	}

	public static void main(String[] args) {
	

	}

}
