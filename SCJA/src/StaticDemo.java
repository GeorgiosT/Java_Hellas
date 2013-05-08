public class StaticDemo {

	public static void main(String[] args) {
		SocialMember jb = new SocialMember();
		jb.firstName = "John";
		jb.surname = "Brown";

		SocialMember tw = new SocialMember();
		tw.firstName = "Tom";
		tw.surname = "Whyte";

		ClubMember mt = new ClubMember();
		mt.firstName = "Mary";
		mt.surname = "Turner";

		ClubMember bs = new ClubMember();
		bs.firstName = "Bart";
		bs.surname = "Simpson";

		System.out.println(jb.firstName + " " + jb.surname);
		System.out.println(tw.firstName + " " + tw.surname);
		System.out.println(mt.firstName + " " + mt.surname);
		System.out.println(bs.firstName + " " + bs.surname);

	}

}

class SocialMember {
	String firstName;
	String surname;
}

class ClubMember {
	static String firstName;
	String surname;
}
