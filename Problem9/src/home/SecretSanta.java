package home;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SecretSanta {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("names.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		List<Employee> persons = new ArrayList<>();

		// Read File Line By Line
		System.out.println("List of Names: ");

		while ((strLine = br.readLine()) != null) {

			String[] nume = strLine.split(" ");
			String firstName = nume[0];
			String familyName = nume[1];

			Employee employee = new Employee();
			employee.setFirstName(firstName);
			employee.setFamilyName(familyName);

			persons.add(employee);

		}
		for (Employee p : persons) {
			System.out.print(p.getFirstName() + " " + p.getFamilyName() + "\n");
		}
		System.out.println("\n");

		for (Employee giver : persons) {
			for (Employee receiver : persons) {
				if (!giver.getFamilyName().equals(receiver.getFamilyName())) {

					if (giver.getGaveFlag() == 0 && receiver.getReceivedFlag() == 0) {
							giver.setGaveFlag(1);
							receiver.setReceivedFlag(1);
							System.out.println(giver.getFirstName() + " " + giver.getFamilyName() + " --> "
								+ receiver.getFirstName() + " " + receiver.familyName);
					}
				}
			}
		}
		br.close();
	}
}
