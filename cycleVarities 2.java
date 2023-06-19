
import java.util.*;


interface I1
{
    void signup();
}
interface I2
{
    void signup();
}
class Login implements I1,I2
{
	private String name;
    private long phone;
    private String email;
    private String gender;
    private int age;
    public String getName()
    {
        return name;
    }
    public Long getPhone()
    {
        return phone;
    }
    public String getEmail()
    {
        return email;
    }
    public String getGender()
    {
        return gender;
    }
    public int getAge()
    {
    	return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPhone(long phone)
    {
        this.phone = phone;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    Scanner sc=new Scanner(System.in);
	public void signup()
	{
		
	    Scanner sc=new Scanner(System.in);
	    Login LO=new Login();
		System.out.println("Enter Name:  ");
		LO.setName(sc.next());
		System.out.println("Name: "+(LO.getName()));
		System.out.println("==================================================================================");
		System.out.println("Enter 1 to continue");
        System.out.println("Enter 2 to edit");
        int naming=sc.nextInt();
        switch(naming)
        {
            case 1: phone();
                    break;
            case 2: signup();
            break;
            default: System.out.println("Please enter valid input");signup();
            
            break;
        }
	}
	
	public void phone()
	{
        Scanner sc=new Scanner(System.in);
        Login LO=new Login();
        System.out.println("ENTER NUMBER: ");
        LO.setPhone(sc.nextLong());
        System.out.println("PHONE NUMBER: "+(LO.getPhone()));
        System.out.println("============================================================");
        System.out.println("Enter 1 to continue");
        System.out.println("Enter 2 to edit");
        int phone=sc.nextInt();
        switch(phone)
        {
            case 1: email();
                    break;
            case 2: phone();
            break;
            default: System.out.println("Please enter valid input"); phone();
            break;
        }
	}
	
	public void email()
	{
        Scanner sc=new Scanner(System.in);
        Login LO=new Login();
        System.out.println("ENTER EMAIL ID: ");
        LO.setEmail(sc.next());
        System.out.println("EMAIL ID: "+(LO.getEmail()));
        System.out.println("============================================================");
        System.out.println("Enter 1 to continue");
        System.out.println("Enter 2 to edit");
        int email=sc.nextInt();
        switch(email)
        {
            case 1: gender();
                    break;
            case 2: email();
            break;
            default: System.out.println("Please enter valid input"); email();
            break;
        }
	}
	
	public void gender()
	{
        Scanner sc=new Scanner(System.in);
        Login LO=new Login();
        System.out.println("ENTER GENDER: ");
        LO.setGender(sc.next());
        System.out.println("GENDER: "+(LO.getGender()));
        System.out.println("============================================================");
        System.out.println("Enter 1 to continue");
        System.out.println("Enter 2 to edit");
        int gender=sc.nextInt();
        switch(gender)
        {
            case 1: age();
                    break;
            case 2: gender();
            break;
            default: System.out.println("Please enter valid input"); gender();
            break;
        }
	}
	
	public void age()
	{
        Scanner sc=new Scanner(System.in);
        Login LO=new Login();
        System.out.println("ENTER AGE: ");
        LO.setAge(sc.nextInt());
        System.out.println("AGE: "+(LO.getAge()));
        System.out.println("============================================================");
        System.out.println("Enter 1 to continue");
        System.out.println("Enter 2 to edit");
        int age=sc.nextInt();
        switch(age)
        {
            case 1: successful();
                    break;
            case 2: age();
            break;
            default: System.out.println("Please enter valid input"); age();
            break;
        }
	}
	public void successful()
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                        Regestration Successfully                                 ");
		System.out.println("                      =============================                               ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println("");
		
	}
}
//Super class
class Companies
{
	public void companies()
	{
		System.out.println("Companies class");
	}
}



//Sub class
class Hero extends Companies
{
	public void Hero()
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Thank You You Are Selecting Hero Company                        ");
		System.out.println("               ==============================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                            Chose Your Buget                                      ");
		System.out.println("                         ======================                                   ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 For 30000/-");
		System.out.println("Enter 2 for 45000/-");
		System.out.println("Enter 3 for 70000/-");
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		
		switch(h)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Thorn");
		System.out.println("Enter 2 for Voltage");
		System.out.println("Enter 3 for Springdale");
		int b=sc.nextInt();
		switch (b) 
		{
		case 1: Thorn t=new Thorn();
		t.thorn();
		break;
		case 2: Voltage v=new Voltage();
		v.voltage();
		break;
		case 3: Springdale s=new Springdale();
		s.springdale();
		break;
		default: System.out.println("Invalid Input"); Hero();
		}
		break;
		
		
		case 2:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Urban Trail");
		System.out.println("Enter 2 for Trot");
		int d=sc.nextInt();
		switch (d)
		{
		case 1: UrbanTrail u=new UrbanTrail();
		u.urbantrail();
		break;
		case 2: Trot tr=new Trot();
		tr.trot();
		break;
		default: System.out.println("Invalid Input"); Hero();
		}
		break;
		
		
		case 3:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  "); 
		System.out.println("Enter 1 for Attitude");
		System.out.println("Enter 2 for Milano");
		int e=sc.nextInt();
		switch (e)
		{
		case 1: Attitude a=new Attitude();
		a.attitude();
		break;
		case 2:Milano m=new Milano();
		m.milano();
		break;
		default: System.out.println("Invalid Input"); Hero();
		}
		break;
		
		default: System.out.println("Invalid Input"); Hero();
		}

	}
}

//sub class
class Thorn extends Companies
{
	public void thorn()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int T=sc.nextInt();
		switch(T)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Thorn");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 30000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                           Choose for Payment                                     ");
		System.out.println("                        ========================                                  ");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit Card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Voltage extends Companies
{
	public void voltage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int V=sc.nextInt();
		switch(V)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Voltage");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 30000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                           Choose for Payment                                     ");
		System.out.println("                        ========================                                  ");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit Card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Springdale extends Companies
{
	public void springdale()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int SG=sc.nextInt();
		switch(SG)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 30000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Springdale");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 30000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit card ");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class UrbanTrail extends Companies
{
	public void urbantrail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int UT=sc.nextInt();
		switch(UT)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: UrbanTrail");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 45000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit Card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Trot extends Companies
{
	public void trot()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int TR=sc.nextInt();
		switch(TR)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 45000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Trot");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 45000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit Card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Attitude extends Companies
{
	public void attitude()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int ATT=sc.nextInt();
		switch(ATT)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Attitude");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 70000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Milano extends Companies
{
	public void milano()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int MI=sc.nextInt();
		switch(MI)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 2:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Milano");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 70000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}





//Sub Class
class Avon extends Companies
{
	public void Avon()
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Thank You You Are Selecting Avon Company                        ");
		System.out.println("               ==============================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                            Chose Your Buget                                      ");
		System.out.println("                         ======================                                   ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 For 70000/-");
		System.out.println("Enter 2 for 80000/-");
		System.out.println("Enter 3 for 90000/-");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Shery");
		System.out.println("Enter 2 for Retro 26T");
		System.out.println("Enter 3 for Octiv");
		int f=sc.nextInt();
		switch (f) 
		{
		case 1: Shery s=new Shery();
		s.shery();
    	break;
		case 2: Retro26T r=new Retro26T();
		r.retro26T();
		break;
		case 3: Octiv o=new Octiv();
		o.octiv();
		break;
		default: System.out.println("Invalid Input"); Avon();
		}
		break;
		
		
		case 2:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Rowdy Plus");
		System.out.println("Enter 2 for Josh");
		int g=sc.nextInt();
		switch (g)
		{
		case 1: Rowdyplus ro=new Rowdyplus();
		ro.rowdyplus();
		break;
		case 2: Josh j=new Josh();
		j.josh();
		break;
		default: System.out.println("Invalid Input"); Avon();
		}
		break;
		
		
		case 3: System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Pilot Delux");
		System.out.println("Enter 2 for Classic");
		int i=sc.nextInt();
		switch (i)
		{
		case 1: Pilotdelux p=new Pilotdelux();
		p.pilotdelux();
		break;
		case 2: Classic c=new Classic();
		c.classic();
		break;
		default: System.out.println("Invalid Input"); Avon();
		}
		break;
		
		default: System.out.println("Invalid Input"); Avon();
		}

	}
}

//sub class
class Shery extends Companies
{
	public void shery()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int SH=sc.nextInt();
		switch(SH)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Shery");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 70000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Retro26T extends Companies
{
	public void retro26T()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int RT=sc.nextInt();
		switch(RT)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Retro 26T");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 70000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.err.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Octiv extends Companies
{
	public void octiv()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int OC=sc.nextInt();
		switch(OC)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 70000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Octiv");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 70000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Rowdyplus extends Companies
{
	public void rowdyplus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int RP=sc.nextInt();
		switch(RP)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Rowdy Plus");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 80000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Josh extends Companies
{
	public void josh()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int JO=sc.nextInt();
		switch(JO)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 80000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Josh");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 80000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Pilotdelux extends Companies
{
	public void pilotdelux()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int PD=sc.nextInt();
		switch(PD)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Pilot Delux");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 90000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI");
		System.out.println("Enter 2 For the Cash");
		System.out.println("Enter 3 for the Debirt card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Classic extends Companies
{
	public void classic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int CL=sc.nextInt();
		switch(CL)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 90000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Classic");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 90000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}



//Sub Class
class Atlas extends Companies
{
	public static void Atlas()
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Thank You You Are Selecting Atlas Company                       ");
		System.out.println("               ==============================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                            Chose Your Buget                                      ");
		System.out.println("                         ======================                                   ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 For 10000/-");
		System.out.println("Enter 2 for 50000/-");
		System.out.println("Enter 3 for 1,00,000/-");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Ultimate City");
		System.out.println("Enter 2 for Crest Dual Suspension");
		System.out.println("Enter 3 for Errika IBC");
		int k=sc.nextInt();
		switch (k) 
		{
		case 1: UltimateCity ul=new UltimateCity();
		ul.ultimateCity();
		break;
		case 2: CrestDualSuspension cr=new CrestDualSuspension();
		cr.crestDualSuspension();
		break;
		case 3: ErrikaIBC er=new ErrikaIBC();
		er.errikaIBC();
		break;
		default: System.out.println("Invalid Input"); Atlas();
		}
		break;
		
		
		case 2:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Wind");
		System.out.println("Enter 2 for Passion");
		int l=sc.nextInt();
		switch (l)
		{
		case 1: Wind w=new Wind();
		w.wind();
		break;
		case 2: Passion pa=new Passion();
		pa.passion();
		break;
		default: System.out.println("Invalid Input");Atlas();
		}
		break;
		
		
		case 3: System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Humpty IBCTT");
		System.out.println("Enter 2 for Couper IBCDS");
		int m=sc.nextInt();
		switch (m)
		{
		case 1: HumptyIBCTT h=new HumptyIBCTT();
		h.humptyIBCTT();
		break;
		case 2: CouperIBCDS co=new CouperIBCDS();
		co.couperIBCDS();
		break;
		default: System.out.println("Invalid Input"); Atlas();
		}
		break;
		
		default: System.out.println("Invalid Input"); Atlas();
		}
	}
}


//sub class
class UltimateCity extends Companies
{
	public void ultimateCity()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int UL=sc.nextInt();
		switch(UL)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Ultimate City");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 10000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class CrestDualSuspension extends Companies
{
	public void crestDualSuspension()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int CDS=sc.nextInt();
		switch(CDS)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Crest Dual Suspension");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 10000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class ErrikaIBC extends Companies
{
	public void errikaIBC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int ER=sc.nextInt();
		switch(ER)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 10000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Errika IBC");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 10000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Wind extends Companies
{
	public void wind()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int WI=sc.nextInt();
		switch(WI)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Wind");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 50000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Passion extends Companies
{
	public void passion()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int PA=sc.nextInt();
		switch(PA)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 50000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Passion");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 50000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class HumptyIBCTT extends Companies
{
	public void humptyIBCTT()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int HU=sc.nextInt();
		switch(HU)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Humpty IBCTT");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class CouperIBCDS extends Companies
{
	public void couperIBCDS()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int CI=sc.nextInt();
		switch(CI)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper IBCDS");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 1,00,000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}


//Sub Class
class Hercules extends Companies
{
	public void Hercules()
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Thank You You Are Selecting Hercules Company                    ");
		System.out.println("               ==================================================                 ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                            Chose Your Buget                                      ");
		System.out.println("                         ======================                                   ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 For 25000/-");
		System.out.println("Enter 2 for 15000/-");
		System.out.println("Enter 3 for 17000/-");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Strom NV");
		System.out.println("Enter 2 for Crest Strom HT");
		System.out.println("Enter 3 for Top Gear S-27");
		int n=sc.nextInt();
		switch (n) 
		{
		case 1: Strom_NV nv=new Strom_NV();
		nv.strom_nv();
		break;
		case 2: Strom_HT ht=new Strom_HT();
		ht.strom_ht();
		break;
		case 3:Top_Gear_S27 s27=new Top_Gear_S27();
		s27.top_Gear_S27();
		break;
		default: System.out.println("Invalid Input"); Hercules();
		}
		break;
		
		
		case 2:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Rocco 20");
		System.out.println("Enter 2 for Stimulus");
		int o=sc.nextInt();
		switch (o)
		{
		case 1: Rocco_20 ro=new Rocco_20();
		ro.rocco_20();
		break;
		case 2: Stimulus st=new Stimulus();
		st.stimulus();
		break;
		default: System.out.println("Invalid Input");Hercules();
		}
		break;
		
		
		case 3: System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Trailblazer IC HT");
		System.out.println("Enter 2 for Defender");
		int p=sc.nextInt();
		switch (p)
		{
		case 1: Trailblazer_IC_HT ic=new Trailblazer_IC_HT();
		ic.trailblazer_IC_HT();
		break;
		case 2: Defender d=new Defender();
		d.defender();
		break;
		default: System.out.println("Invalid Input"); Hercules();
		}
		break;
		
		default: System.out.println("Invalid Input"); Hercules();
		}

	}
}

//Sub Class
class Strom_NV extends Companies
{
	public void strom_nv()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int SN=sc.nextInt();
		switch(SN)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom NV");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 25000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Strom_HT extends Companies
{
	public void strom_ht()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int SH=sc.nextInt();
		switch(SH)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Strom HT");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 25000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Top_Gear_S27 extends Companies
{
	public void top_Gear_S27()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int TG=sc.nextInt();
		switch(TG)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 25000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Top Gear S27");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 25000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Rocco_20 extends Companies
{
	public void rocco_20()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int RO=sc.nextInt();
		switch(RO)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Rocco 20");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 15000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Stimulus extends Companies
{
	public void stimulus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int ST=sc.nextInt();
		switch(ST)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 15000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Stimulus");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 15000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Trailblazer_IC_HT extends Companies
{
	public void trailblazer_IC_HT()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int TIH=sc.nextInt();
		switch(TIH)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Trailblazer IC HT");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 17000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub Class
class Defender extends Companies
{
	public void defender()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int DF=sc.nextInt();
		switch(DF)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 17000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Defender");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 17000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}


//Sub Class
class Firefox extends Companies
{
	public void Firefox()
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Thank You You Are Selecting Firefox Company                     ");
		System.out.println("               ================================================                   ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                            Chose Your Buget                                      ");
		System.out.println("                         ======================                                   ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 For 22000/-");
		System.out.println("Enter 2 for 19000/-");
		System.out.println("Enter 3 for 11000/-");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Gurunge Neo");
		System.out.println("Enter 2 for Harpoon 700C");
		System.out.println("Enter 3 for Ironman BMX");
		int k=sc.nextInt();
		switch (k) 
		{
		case 1: Gurunge_Neo gu=new Gurunge_Neo();
		gu.gurunge_Neo();
		break;
		case 2: Harpoon_700C po=new Harpoon_700C();
		po.harpoon_700C();
		break;
		case 3:Ironman_BMX bm=new Ironman_BMX();
		bm.ironman_BMX();
		break;
		default: System.out.println("Invalid Input"); Firefox();
		}
		break;
		
		
		case 2:System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Voya 700C");
		System.out.println("Enter 2 for Cyclon 27.5");
		int l=sc.nextInt();
		switch (l)
		{
		case 1: Voya_700C vo=new Voya_700C();
		vo.voya_700C();
		break;
		case 2: Cyclon cy=new Cyclon();
		cy.cyclon();
		break;
		default: System.out.println("Invalid Input");Firefox();
		}
		break;
		
		
		case 3: System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                    In this buget we have Following Cycles                        ");
		System.out.println("                  ===========================================                     ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Nexus 27.5");
		System.out.println("Enter 2 for Scrambo 14");
		int m=sc.nextInt();
		switch (m)
		{
		case 1: Nexus nx=new Nexus();
		nx.nexus();
		break;
		case 2: Scrambo sr=new Scrambo();
		sr.scrambo();
		break;
		default: System.out.println("Invalid Input"); Firefox();
		}
		break;
		
		default: System.out.println("Invalid Input"); Firefox();
		}

	}
}

//Sub class
class Gurunge_Neo extends Companies
{
	public void gurunge_Neo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int GN=sc.nextInt();
		switch(GN)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Gurunge Neo");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 22000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Harpoon_700C extends Companies
{
	public void harpoon_700C()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int HR=sc.nextInt();
		switch(HR)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Harpoon 700C");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 22000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//sub class
class Ironman_BMX extends Companies
{
	public void ironman_BMX()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int IB=sc.nextInt();
		switch(IB)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 22000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Ironman BMX");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 22000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Voya_700C extends Companies
{
	public void voya_700C()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int VO=sc.nextInt();
		switch(VO)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Voya 700C");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 19000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Cyclon extends Companies
{
	public void cyclon()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int CY=sc.nextInt();
		switch(CY)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 19000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Cyclon");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 19000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Nexus extends Companies
{
	public void nexus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int NE=sc.nextInt();
		switch(NE)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Couper Nexus");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 11000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Sub class
class Scrambo extends Companies
{
	public void scrambo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("                      Choose Your favourite Colour                                ");
		System.out.println("                   ==================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("Enter 1 for Green");
		System.out.println("Enter 2 for Red");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Grey");
		System.out.println("Enter 5 for Black");
		System.out.println("Enter 6 For Pink");
		System.out.println("Enter 7 for Blue");
		int SC=sc.nextInt();
		switch(SC)
		{
		case 1:	System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Green clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 2: System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Red clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 3:System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Orange clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 4:System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Grey clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 5:System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Black clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 6:System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Pink clour");
		System.out.println("Product Price: 11000/-");
		break;
		case 7:System.out.println("==================================================================================");
		System.out.println("Product Name: Scrambo");
		System.out.println("Product Colour: Blue clour");
		System.out.println("Product Price: 11000/-");
		break;
		}
		
		
		System.out.println("##################################################################################");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for the UPI / Netbanking");
		System.out.println("Enter 2 for the Cash");
		System.out.println("Enter 3 for the Debit card");
		System.out.println("##################################################################################");
		int P=sc1.nextInt();
		switch(P)
		{
		case 1:System.out.println("Your Payment is Successfully Done");
		break;
		case 2:System.out.println("Thank you for your payment");
		break;
		case 3:System.out.println("Thank you Payment is Completed");
		break;
		}
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                      Thank You Visit Again                                       ");
		System.out.println("                   ===========================                                    ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
	}
}

//Driver Class
class cycleVarities 
{
	public static void main(String[] args)
	{
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Welcome To Prathamesh Cycle Mart                                ");
		System.out.println("               ======================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		System.out.println(" ");
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                                                                                  ");
		System.out.println("                   Please Enter The Following Details                             ");
		System.out.println("                =======================================                           ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		Scanner sc=new Scanner(System.in);
		I1 ref=new Login();
		ref.signup();
		System.out.println("##################################################################################");
		System.out.println("                                                                                  ");
		System.out.println("                  Choose Your Favourite Company                                   ");
		System.out.println("               ======================================                             ");
		System.out.println("                                                                                  ");
		System.out.println("##################################################################################");
		
		System.out.println("Enter 1 for Hero");
		
		System.out.println("Enter 2 for Avon");
		
		System.out.println("Enter 3 for Atlas");
		
		System.out.println("Enter 4 for Hercules");
		
		System.out.println("Enter 5 for Firefox");
		
		System.out.println("##################################################################################");
		
		Hero H=new Hero();
		Avon A=new Avon();
		Atlas AT=new Atlas();
		Hercules HR=new Hercules();
		Firefox FF=new Firefox();
		int Details = sc.nextInt();
		switch(Details)
		{
		case 1: H.Hero();
		break;
		case 2: A.Avon();
		break;
		case 3: AT.Atlas();
		break;
		case 4: HR.Hercules();
		break;
		case 5: FF.Firefox();
		break;
		
		}
		
		
	}

}
