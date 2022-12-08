package soru9;

public class MyList {
	
	private String[] list=new String[5];
	
	private int size=0;
	
	public void add(String s) {
		if(s.startsWith("C")) {
			list[size]=s;
			size++;
			
			if(size==list.length) {
				String[] newList=new String[list.length+7];
				System.arraycopy(list, 0, newList, 0, list.length);
				list=newList;
			}
		}
	}
	
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.println(list[i]);
		}
	}

}
