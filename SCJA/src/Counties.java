public class Counties {

	public static void main(String[] args) {

		String[][] counties = new String[3][2];
		counties[0][0] = "Kerry";
		counties[0][1] = "Tralee";
		counties[1][0] = "Cork";
		counties[1][1] = "Cork";
		counties[2][0] = "Limerick";
		counties[2][1] = "Limerick";

		for (int i = 0; i < counties.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < counties[i].length; j++) {
				if (j == 0)
					sb.append("The capitol of ");
				else
					sb.append(" is ");
				sb.append(counties[i][j]);
			}
			System.out.println(sb);
		}

	}
}