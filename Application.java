
public class Application {

	public static void main(String[] args) {

		 
			Building build = new Building("Gaines House", "123 Main Street | Louisiville Kentucky 40201", 2540, "Residential","R1");
			
			Business busi = new Business("Gaines Business", "123 Bellarmine Street | Louisville, Kentucky 40218 ", 2179, "Business", "G1",19);
			
			Apartment apt = new Apartment("Gaines Apartments", "123 chessnut Street | Louisiville Kentucky 40101", 5000,"Apartments", "H1", 60, 1000, true, 39, 880, true);
			
			SingleFamilyHome single = new SingleFamilyHome("Gaines House", "123 Main Street| Louisiville Kentucky 40201", 2540, "Residential", "R1", 4, 3, true, true);
			
			

			System.out.println("***********Building Details***********\n" + build.displayData()+"\n");

			System.out.println("***********Business Building Details***********\n" + busi.toString()+"\n");

			System.out.println("***********Apartment Details***********\n" + apt.displayData()+"\n");

			System.out.println("***********SingleFamilyHome Details***********\n" + single.displayData());
			}

			}


