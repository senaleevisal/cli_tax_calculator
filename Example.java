import java.util.*;

class Example{
	public static void withholding_tax(){
		Scanner input = new Scanner(System.in);

		System.out.println("[01] Rent Tax\n");
		System.out.println("[02] Bank intrrest Tax\n");
		System.out.println("[04] Exit \n");
		System.out.println("Enter an option to continue ");
		int a = input.nextInt();
		switch (a){
			case 01:
					l1:do{
						System.out.println("+-------------------------------------------------------------------------------------------------+");
						System.out.println("|                                           RENT TAX                                              |");
						System.out.println("+-------------------------------------------------------------------------------------------------+");
						System.out.println("\n\n\n");
						System.out.print("Enter your rnet :   ");
						int b= input.nextInt();
						if (b>100000){
							System.out.println("your have to pay  rent Tax: "+((b-100000)*10/100));
						}else if(b<=100000){
							System.out.println("You dont have to pay rent Tax");
						}else{
							System.out.println("invalid input");
						}
						System.out.print("Do you want to calculate another Rent Tax [y/n] : ");
						String c = input.next();
						if (c.equalsIgnoreCase("y")){
						continue l1; 
						}else{
							return;
						}

					}while(true);
		
		
			case 02:
					l2:do {
						System.out.println("+-------------------------------------------------------------------------------------------------+");
						System.out.println("|                                      BANK INTEREST TAX                                          |");
						System.out.println("+-------------------------------------------------------------------------------------------------+");

						System.out.print("Enter your bank interest per year             :  ");
						double d = input.nextDouble();
						System.out.print("you have to pay Tax per year                  :  "+(d/100*5));
						
						System.out.print("Do you want to calculate another Bank Interst Tax [y/n] : ");
						String c = input.next();
						if (c.equalsIgnoreCase("y")){
						continue l2; 
						}else{
							return;
						}

					} while (true);
			case 03:
					l3:do {
						System.out.println("+-------------------------------------------------------------------------------------------------+");
						System.out.println("|                                         DIVINDED TAX                                            |");
						System.out.println("+-------------------------------------------------------------------------------------------------+");

						System.out.print("Enter your total dividend per year          :  ");
						double d = input.nextDouble();
						if (d>100000){
							System.out.print("you have to pay Devidend Tax per year                  :  "+((d-100000)*14/100));
						}else if (d<=100000){
							System.out.println("You don’t have to pay Dividend Tax....");
						}else{
							System.out.println("Invalid input");
						}

						System.out.print("Do you want to calculate another Bank Interst Tax [y/n] : ");
						String c = input.next();
						if (c.equalsIgnoreCase("y")){
							continue l3; 
						}else{
							return;
						}
						
					} while (true);
		}
	}
	public static void payable_tax(){
		Scanner input =new Scanner(System.in);

		l4:do {
			System.out.println("+-------------------------------------------------------------------------------------------------+");
			System.out.println("|                                          PAYABLE TAX                                            |");
			System.out.println("+-------------------------------------------------------------------------------------------------+");

			System.out.print("Enter your employee pyment for month      : ");
			double a = input.nextDouble();

			if (a<=100000){
				System.out.println("you don't have to pay payable Tax...");
			}else if ((a>100000)&&(a<=141667)){
				System.out.print("you have to pay payable Tax per month : ");
				System.out.println((a-100000)*6/100);
			}else if ((a>141667)&&(a<=183333)){
				System.out.print("you have to pay payable Tax per month : ");
				System.out.println((a-141667)*12/100+(2500));
			}else if ((a>183333)&&(a<=225000)){
				System.out.print("you have to pay payable Tax per month : ");
				System.out.println((a-183333)*18/100+(10000));
			}else if ((a>225000)&&(a<=266667)){
				System.out.print("you have to pay payable Tax per month : ");
				System.out.println((a-225000)*24/100+(25000));
			}else if ((a>266667)&&(a<=308333)){
				System.out.print("you have to pay payable Tax per month : ");
				System.out.println((a-266667)*30/100+(50000));
			}else {
				System.out.print("you have to pay payable Tax per month : ");
				System.out.println((a-308333)*36/100+(87500));
			}

			System.out.print("Do you want to calculate another Bank Interst Tax [y/n] : ");
			String c = input.next();
			if (c.equalsIgnoreCase("y")){
				continue l4; 
			}else{
				return;
			}
			
		} while (true);
	}


	public static void income_tax(){
		Scanner input =new Scanner(System.in);
		l5:do {
			System.out.println("+-------------------------------------------------------------------------------------------------+");
			System.out.println("|                                          INCOME TAX                                            |");
			System.out.println("+-------------------------------------------------------------------------------------------------+");

			System.out.print("Enter your total income per year        : ");
			double a = input.nextDouble();

			if (a<=1200000){
				System.out.println("you don't have to pay income Tax...");
			}else if ((a>1200000)&&(a<=1700000)){
				System.out.print("you have to pay income Tax per year : ");
				System.out.println((a-1200000)*6/100);
			}else if ((a>1700000)&&(a<=2200000)){
				System.out.print("you have to pay income Tax per year : ");
				System.out.println((a-1700000)*12/100+(30000));
			}else if ((a>2200000)&&(a<=2700000)){
				System.out.print("you have to pay income Tax per year : ");
				System.out.println((a-2200000)*18/100+(90000));
			}else if ((a>2700000)&&(a<=3200000)){
				System.out.print("you have to pay income Tax per year : ");
				System.out.println((a-2700000)*24/100+(180000));
			}else if ((a>3200000)&&(a<=3700000)){
				System.out.print("you have to pay income Tax per year : ");
				System.out.println((a-3200000)*30/100+(300000));
			}else {
				System.out.print("you have to pay income Tax per year : ");
				System.out.println((a-3700000)*36/100+(450000));
			}

			System.out.print("Do you want to calculate another Bank Income Tax [y/n] : ");
			String c = input.next();
			if (c.equalsIgnoreCase("y")){
				continue l5; 
			}else{
				return;
			}
			
		} while (true);
	}

	public static void sscl_tax(){
		Scanner input = new Scanner (System.in);
		
		l6:do {
			System.out.println("+-------------------------------------------------------------------------------------------------+");
			System.out.println("|                         SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                            |");
			System.out.println("+-------------------------------------------------------------------------------------------------+");

			System.out.print("Enter value of good or service        :  ");
			double a = input.nextDouble();

			double vg= 0;
			double s = a * 2.5/100;
             	   vg += s;
            double vat = vg * 15/100;
            double ssclTax = s + vat;
			
			System.out.print("You have to pay SSCL Tax              :  "+ssclTax);

			System.out.print("Do you want to calculate another SSCL Tax [y/n] : ");
			String c = input.next();
			if (c.equalsIgnoreCase("y")){
				continue l6; 
			}else{
				return;
			}


		} while (true);
	}

	public static void leasing_payment(){
		Scanner input =new Scanner(System.in);

		System.out.println("+-------------------------------------------------------------------------------------------------+");
		System.out.println("|                                       LEASING PAYMENT                                           |");
		System.out.println("+-------------------------------------------------------------------------------------------------+");

		System.out.println("[01] Calculate monthly installment");
		System.out.println("[02] Search Leasing category");
		System.out.println("[03] Find Leasing Amount ");
		System.out.println("[04] Exit");
		
		System.out.print("Enter an option to continue  ->  ");
		int a = input.nextInt();

		switch (a){
			case 01:
				l9:do {
					System.out.println("+-------------------------------------------------------------------------------------------------+");
					System.out.println("|                              CALCULATE MONTHLY INSTALLMENT                                      |");
					System.out.println("+-------------------------------------------------------------------------------------------------+");

					System.out.print("Enter lease amount                        :");
					double b= input.nextDouble();
					int c;
					l7:do{
						System.out.print("Enter anual inter rest rate           :");
						c = input.nextInt();
						if (c<0){
							System.out.println("The annual interest rate must be greater than 0%");
							continue l7;
						}
						break l7;
					}while(true);
					int d;
					l8:do{
						System.out.print("Enter number of year                  :");
						d = input.nextInt();
						if (d>5){
							System.out.println("Invalid number of year ... Enter the corect value again..");
							continue l8;
						}else{
							break l8;
						}
					}while(true);
					System.out.print("your monthly installment                  :");
					System.out.println((b*(c/12))/(1-(1 / (1 + c )^(d*12))));

					System.out.print("Do you want to calculate another Monthly Installment [y/n] : ");
					String z = input.next();
					if (z.equalsIgnoreCase("y")){
						continue l9; 
					}else{
						break;
					}
				} while (true);
			break;

			case 02:
				l10:do {
					System.out.println("+-------------------------------------------------------------------------------------------------+");
					System.out.println("|                                 SEARCH LEASING CATOGERY                                         |");
					System.out.println("+-------------------------------------------------------------------------------------------------+");

					System.out.print("Enter lease amount                        :");
					double e= input.nextDouble();
					int f;
					l7:do{
						System.out.print("Enter anual inter rest rate           :");
						f = input.nextInt();
						if (f<0){
							System.out.println("The annual interest rate must be greater than 0%");
							continue l7;
						}
						break l7;
					}while(true);
					System.out.print("your monthly installment 3 year leasing plan -> ");
					System.out.println((e*(f/12))/(1-(1 / (1 + f )^(3*12))));
					System.out.print("your monthly installment 4 year leasing plan -> ");
					System.out.println((e*(f/12))/(1-(1 / (1 + f )^(4*12))));
					System.out.print("your monthly installment 5 year leasing plan -> ");
					System.out.println((e*(f/12))/(1-(1 / (1 + f )^(5*12))));
	
					System.out.print("Do you want to Search an other Leasing Category [y/n] : ");
					String z = input.next();
					if (z.equalsIgnoreCase("y")){
						continue l10; 
					}else{
						break;
					}
				} while (true);
			break;
			case 03:
				l11:do {
					System.out.println("+-------------------------------------------------------------------------------------------------+");
					System.out.println("|                                 FIND THE LEASING AMOUNT                                         |");
					System.out.println("+-------------------------------------------------------------------------------------------------+");

					System.out.print("Enter the monthly lease payment you can affored  : ");
					double m = input.nextDouble();

					int n;
					l7:do{
						System.out.print("Enter anual inter rest rate           :");
						n = input.nextInt();
						if (n<0){
							System.out.println("The annual interest rate must be greater than 0%");
							continue l7;
						}
						break l7;
					}while(true);
					int o;
					l8:do{
						System.out.print("Enter number of year                  :");
						o = input.nextInt();
						if (o>5){
							System.out.println("Invalid number of year ... Enter the corect value again..");
							continue l8;
						}else{
							break l8;
						}
					} while (true);
						System.out.print("you can get lease amount              :");
						System.out.println((m)/((n/12)/(1-(1/(1+(n/12)^(o*12))))));

					System.out.print("Do you want to Find an othether Leasing Amount [y/n] : ");
					String z = input.next();
					if (z.equalsIgnoreCase("y")){
						continue l11; 
					}else{
						break;
					}
					
				} while (true);
			}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=======================================================================================================");
		System.out.println("[01] Withholding Tax\n");
		System.out.println("[02] Payble Tax\n");
		System.out.println("[03] Income Tax\n");
		System.out.println("[04] Social Sequrity Contribiution Levy (SSCL) Tax\n");
		System.out.println("[05] Leasing Paymernt\n");
		System.out.println("[06] Exit \n");

		System.out.print("Enter an option to continue ->");
		int a= input.nextInt();
		switch (a){
			case 01:withholding_tax();break;
			case 02:payable_tax();    break;
			case 03:income_tax();     break;
			case 04:sscl_tax();       break;
			case 05:leasing_payment();break;
			case 06:
		}
	}
}