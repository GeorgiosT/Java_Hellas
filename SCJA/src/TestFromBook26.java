import java.util.ArrayList;


public class TestFromBook26 {

	
	public static void main(String[] args) {
		String[] fisingList = {"rods","reels","bait","lunch"};
		
		
		for(int i=0;i<fisingList.length;i++)
			System.out.println(fisingList[i]);
	}
}

		/*or
		for(String item:fisingList){
			System.out.println((item +" "));
		}
		
		or
		
		ArrayList<String> fisingList = new ArrayList<String>();
		fisingList.add("rods");
		fisingList.add("reels");
		fisingList.add("bait");
		fisingList.add("lunch");

		for(String item:fisingList)
		system.out.println(item)
		 */
