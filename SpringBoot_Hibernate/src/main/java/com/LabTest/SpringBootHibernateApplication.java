package com.LabTest;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.LabTest.entities.Product;
import com.LabTest.repositories.ProductRepository;


@SpringBootApplication
public class SpringBootHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootHibernateApplication.class, args);
		ProductRepository pr = ac.getBean(ProductRepository.class);
		
		char c = 'y';
		
		while (c == 'y') {
			//providing users the option
			System.out.println("Enter data .........................................................................");
			System.out.println("choose option 1st to insert product details ");
			System.out.println("choose option 2nd to update product details ");
			System.out.println("choose option 3rd to delete prouduct details ");
			System.out.println("choose option 4th to retrive product details ");
			System.out.println("choose option 5th to exit");
			//Scanner class
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			//switch case
			switch (i) {
			//case 1 
			case 1: {
				Product p1 = new Product();
				System.out.println("Enter pname to insert...");
				String p_name = sc.next();
				p1.setPname(p_name);
				System.out.println("Enter pbrand to insert...");
				String pbrand = sc.next();
				p1.setPbrand(pbrand);
				System.out.println("Enter price to insert...");
				Double price = sc.nextDouble();
				p1.setPrice(price);

				pr.save(p1);
				System.out.println("Product details inserted successfully...!!");
				break;
			}
			//case 2
			case 2: {
				System.out.println("choose option 1st to update product name(pname) ");
				System.out.println("choose option 2nd to update product brand(pbrand) ");
				System.out.println("choose option 3rd to update product price");

				int i1 = sc.nextInt();

				switch (i1) {
				case 1: {
					System.out.println("Enter product id(pid) for updation");
					int p_id = sc.nextInt();
					Product p21 = pr.findById(p_id);
					System.out.println("Enter new product name(pname) to update...:");
					String new_pname = sc.next();
					p21.setPname(new_pname);
					pr.save(p21);
					System.out.println("Updation of product name is successfully");
					break;
				}
				case 2: {
					System.out.println("Enter product id(pid) for updation");
					int p_id = sc.nextInt();
					Product p22 = pr.findById(p_id);
					System.out.println("Enter new product brand(pbrand) to update:");
					String new_pbrand = sc.next();
					p22.setPbrand(new_pbrand);
					pr.save(p22);
					System.out.println("updation of product brand is sucessfully");

					break;
				}
				case 3: {
					System.out.println("Enter product id(pid) for update");
					int p_id = sc.nextInt();
					Product p23 = pr.findById(p_id);
					System.out.println("Enter new product price(price) to update:");
					Double new_price = sc.nextDouble();
					p23.setPrice(new_price);
					pr.save(p23);
					System.out.println("updation of product price is done");
					break;
				}
				default:
					System.out.println("choose a valid option to update");
				}
				break;

			}
			//case 3
			case 3: {
				System.out.println("Enter the name whose record should be deleted...");
				String rem_name = sc.next();
				int ii = pr.removeByPname(rem_name);
				if (ii == 0) {
					System.out.println("product name not found in the table... ");
				} else {
					System.out.println("deleted by name successfully...");
				}
//				System.out.println(ii);

				break;
			}
			//case 4
			case 4: {
				System.out.println("choose option 1st to find by price");
				System.out.println("choose option 2nd to find by name");
				System.out.println("choose option 3rd to display all table details ");
				int i3 = sc.nextInt();
				switch (i3) {
				case 1: {
					System.out.println("Enter the price to find");
					Double f_price = sc.nextDouble();
					Product p31 = pr.findByPrice(f_price);
					System.out.println(p31);
					System.out.println("find by Price succefully done");
					break;
				}
				case 2: {
					System.out.println("Enter the name to find");
					String f_name = sc.next();
					Product p32 = pr.findByPname(f_name);
					System.out.println(p32);
					System.out.println("find by name successfully done");
					break;
				}
				case 3: {
					System.out.println("displaying all the table records");
					System.out.println(pr.findAll());
				}
				default:
					System.out.println("choose a valid option to update");
				}
				break;
			}
			//case 5
			case 5: {
				System.out.println("Thank you ......Have a nice day");
				c = 'n';
				break;
			}
			//default case
			default: {
				System.out.println("please choose a valid option");
			}
				System.out.println("Do you want to continue y/n...");
				c = sc.next().charAt(0);
			}

		}

	}
}