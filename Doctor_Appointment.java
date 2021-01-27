
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Doctor_Appointment {
    //scanner Implementation
    Scanner sc = new Scanner(System.in);
     //**End of scanner Implementation**//
    
    //Varible Implementation
    int id;
    int  vsize;
    int n,i=0,j,x,y,o,time,di,dj,vi=0;
        String name[]=new String[10];
	String Address[]=new String[10];
        int age[]=new int[10];
	double mobile_Number[]=new double[10];
	double aMobile_number[]=new double[10];
	String pw[]=new String[10];
        // Doctor Varible Implementation
        String Dname[]=new String[10];
	String Daddress[]=new String[10];
	double Dmobile_Number[]=new double[10];
        String Dlocation[]=new String[10];
        String Dtime[]=new String[10];
        String Dpw[]=new String[10];
        String aname [] = new String[10];
        String aage [] = new String[10];
      //double mobile_Number;
    
     
    //**End of Varible Implementation**//
    
    //Switch Varible//
    int Menu;
    char submenu;
    char Dsubmenu;
   
    //end of switch varible//
    
    public void MenuDisplay()
{
    
System.out.println("Press 1 for Patient");
System.out.println("Press 2 for Doctor");
System.out.println("Press 3 for Admin");
}
    public void Registration()
    {
                      System.out.println("Please Do Registration");
                      System.out.println("----------------------------------------------------------------");
                      System.out.println("Enter Name");
                      name[i]= sc.next();
                      System.out.println("Enter Address");
                      Address[i] = sc.next();
                      System.out.println("Enter Mobile_Number");
                      mobile_Number[i] = sc.nextDouble();
                      System.out.println("Enter Password");
                      pw[i] = sc.next();
                      System.out.println("Registration done successfully ");
                      i++;
                      int size = i;
                      System.out.println("----------------------------------------------------------------");
                      System.out.println("Details For Login ");
                      System.out.println("----------------------------------------------------------------"); 
                
                     for(i=0;i<size;i++){
                      	System.out.println(" Your id is "+name[i]+" And Password is " +pw[i]);
                     }
                      
                      System.out.println("----------------------------------------------------------------");
    }
    // logn 
    public void Login()
    {
        System.out.println("Please Do Login");
        System.out.println("----------------------------------------------------------------");
       System.out.println("Please Enter Username");
        name[j] = sc.next();
        System.out.println("Please Enter Password");
        pw[j] = sc.next();
        j++;
        if(this.name.equals(name) && this.pw.equals(pw))
		{
			System.out.println(" User Exits");
			Select();

                        
		}
	else
		{
			System.out.println(" User Dose not Exits Please Register ");
		}
    }
    
    public void DoctorLogin()
    {
        System.out.println("Please Do Login");
        System.out.println("----------------------------------------------------------------");
       System.out.println("Please Enter Username");
        name[dj] = sc.next();
        System.out.println("Please Enter Password");
        Dpw[dj] = sc.next();
        dj++;
        if(this.name.equals(name) && this.pw.equals(pw))
		{
			System.out.println(" Doctor Exits");
                        
                        
		}
	else
		{
			System.out.println(" Doctor Dose not Exits Please Register ");
		}
    
        
    }
    public void DoctorRegistration()
    {
         Random r = new Random();
         int upperbound = 9999;
        int int_random = r.nextInt(9999);
        System.out.println((10000+int_random) );
        System.out.println("Enter Doctor Name ") ;
        Dname[i] = sc.next();
        System.out.println("Enter Doctor Address ") ;
        Daddress[i] = sc.next();
        System.out.println("Enter Doctor Mobile_Number ") ;
        Dmobile_Number[i] = sc.nextDouble();
        System.out.println("Enter City") ;
        Dlocation[i] = sc.next();
        System.out.println("Enter Doctor Time Of Avalibility ") ;
        Dtime[i] = sc.next();
        System.out.println("Enter Password ") ;
        Dpw[i] = sc.next();
        System.out.println("Doctor Registration Done Sucessfully");
        i++;
    }

    public void Admin()
    {
    	               System.out.println("----------------------------------------------------------------");
                      System.out.println("Admin menu");
                      System.out.println("----------------------------------------------------------------");
                     System.out.println("Press 1 for user list ");
                     System.out.println("Press 2 for Appoinment list ");
                      System.out.println("----------------------------------------------------------------");
                      n = sc.nextInt();
    

    	switch(n)
    	{
    		case 1:
          Printuserlist();  
          Menu();
          break;

          case 2 :
          ViewApp();
          Menu();
          break;
          
    	}
    }
    //user printlist

    public void Printuserlist()
    {
    	 			  System.out.println("----------------------------------------------------------------");
                      System.out.println("Details Of Users ");
                      System.out.println("----------------------------------------------------------------");
                      System.out.print(" User are "+Arrays.toString(name));
                     
                      System.out.println("----------------------------------------------------------------");
    }
    
    //Select city and doctor
	//Select city and doctor
	public void Select()
	{
	System.out.println(" SELECT THE CITY :  ");
	System.out.println("                          ");
	System.out.println("               1.NAGPUE   ");
	System.out.println("               2.MUMBAI   ");
	System.out.println("               3.PUNE     ");
	System.out.println("               4.AMRAVATI ");
	System.out.println("               5.YAVTMAL  ");
      n = sc.nextInt();
switch(n)
{
 case 1:
	System.out.println("              NAGPUR            ");
        System.out.println("     SELECT DOCTOR FROM NUGPUR            ");
	System.out.println("                                          ");
	System.out.println("                             1.Dr.Mehra   ");
	System.out.println("                             2.Dr.Kapoor  ");
	System.out.println("                             3.Dr.Prerna  ");
	System.out.println("                             4.Dr.Nisha   ");
	System.out.println("                             5.Dr.Agrawal ");
	n=sc.nextInt();
		switch(n)
			{
			case 1:
			System.out.println("        Dr.Mehra         ");
			System.out.println(" MBBS,MS,MCh(CVTS),FIACS ");
			Book();
			break;
		        case 2:
		        System.out.println("        Dr.Kapoor        ");
		        System.out.println(" MBBS,MD(Microbiologist) ");
		        Book();
		        break;
		        case 3:
		        System.out.println("        Dr.Prerna      ");
		        System.out.println(" MBBS,DVD,FCOS(MUMBAI) ");
		        Book();
		        break;
		        case 4:
		        System.out.println("      Dr.Nisha   ");
		        System.out.println("     MBBS,DGO    ");
		        Book();
		        break;
		        case 5:
		        System.out.println("      Dr.Agrawal        ");
		        System.out.println("  MBBS,MD,(Psychiatry)  ");
		        Book();
		        break;
		        default:
		        System.out.println("Invalid Input");									
		        }
			break;
			case 2:
			System.out.println(" MUMBAI ");
			System.out.println("      SELECT DOCTOR FROM MUMBAI            ");
			System.out.println("                                           ");
			System.out.println("                              1.Dr.Chabda  ");
		        System.out.println("                              2.Dr.Rashi   ");
		        System.out.println("                              3.Dr.Nirmal  ");
		        System.out.println("                              4.Dr.Shaik   ");
		        System.out.println("                              5.Dr.Potdukhe");
		        n=sc.nextInt();
			switch(n)
			{
			case 1:
			System.out.println("     Dr.Chabda        ");
			System.out.println(" MBBS,MD(Paediatrics) ");
			Book();
			break;
		        case 2:
		        System.out.println("           Dr.Rashi                 ");
		        System.out.println(" MBBS, DNB Dermatology & Venereology ");
		        Book();
		        break;
		        case 3:
		        System.out.println("   Dr.Nirmal   ");
		        System.out.println("  MBBS, MD - General Medicine, DM - Cardiology  ");
		        Book();
		        break;
		        case 4:
		        System.out.println("   Dr.Shaik    ");
		        System.out.println("   MBBS, M.D. (Psychiatry), DNB - Psychiatry   ");
		        Book();
		        break;
		        case 5:
		        System.out.println("   Dr.Potdukhe ");
		        System.out.println("   MS - General Surgery ");
		        Book();
		        break;
		        default:
		        System.out.println("Invalid Input");									
			}			
			break;
			case 3:
			System.out.println(" 3.PUNE ");
			System.out.println("       SELECT DOCTOR FROM PUNE              ");
			System.out.println("                                            ");
			System.out.println("                                1.Dr.Dube   ");
		        System.out.println("                                2.Dr.Ingole ");
		        System.out.println("                                3.Dr.Umare  ");
		        System.out.println("                                4.Dr.Kiran  ");
		        System.out.println("                                5.Dr.Sana   ");
		        n=sc.nextInt();
			switch(n)
			{
			case 1:
			System.out.println("   Dr.Dube    ");
			System.out.println("  MBBS, MS - MS.Medicine, MS - Paediatrics Surgery ");
			Book();
			break;
		        case 2:
		        System.out.println("   Dr.Ingole   ");
		        System.out.println("  MBBS, DGO ");
		        Book();
		        break;
		       case 3:
		        System.out.println("   Dr.Umare   ");
		        System.out.println("  MBBS, MD - Medicine ");
		        Book();
		        break;
		        case 4:
		        System.out.println("   Dr.Kiran  ");
		        System.out.println("  MBBS, MS - General Surgery ");
		        Book();
		        break;
		        case 5:
		        System.out.println("   Dr.Sana ");
		        System.out.println("  MBBS, MD - General Medicine ");
		        Book();
		        break;
		        default:
		        System.out.println("Invalid Input");	
			}
			break;
			case 4:
			System.out.println(" 4.AMRAVATI ");
			System.out.println("       SELECT DOCTOR FROM AMRAVATI             ");
			System.out.println("                                               ");
			System.out.println("                                 1.Dr.Mukesh   ");
		        System.out.println("                                 2.Dr.Jighnesh ");
		        System.out.println("                                 3.Dr.Priya    ");
		        System.out.println("                                 4.Dr.Kiran Rao");
		        System.out.println("                                 5.Dr.Navinya  ");
		        n=sc.nextInt();
			switch(n)
			{
			case 1:
			System.out.println("   Dr.Mukesh   ");
			System.out.println("  MBBS, MD - Medicine  ");
			Book();
			break;
		        case 2:
		        System.out.println("   Dr.Jighnesh  ");
		        System.out.println("  MBBS, DNB - General Medicine, DNB - Gastroenterology ");
		        Book();
		        break;
		        case 3:
		        System.out.println("   Dr.Priya   ");
		        System.out.println("  MBBS, Diploma in Orthopaedics, DNB - Orthopedics/Orthopedic Surgery ");
		        break;
		        case 4:
		        System.out.println("   Dr.Kiran Rao  ");
		        System.out.println(" MBBS,MS,MCh(CVTS),FIACS   ");
		        Book();
		        break;
		        case 5:
		        System.out.println("  Dr.Navinya  ");
		        System.out.println("  MBBS, DGO ");
		        Book();
		        break;
		        default:
		        System.out.println("Invalid Input");	
			}
			break;		
			case 5:
			System.out.println(" 5.YAVTMAL ");
			System.out.println("       SELECT DOCTOR FROM YAVTMAL                 ");
			System.out.println("                                                  ");
			System.out.println("                                  1.Dr.Marry      ");
		        System.out.println("                                  2.Dr.Harsh      ");
		        System.out.println("                                  3.Dr.Khobragade ");
		        System.out.println("                                  4.Dr.Bani       ");
		        System.out.println("                                  5.Dr.Arpita     ");
		        n=sc.nextInt();
			switch(n)
			{
			case 1:
			System.out.println("   Dr.Marry    ");
			System.out.println("  MBBS,MD(Paediatrics) ");
			Book();
			break;
		        case 2:
		        System.out.println("   Dr.Harsh  ");
		        System.out.println("  MBBS, MD - Medicine ");
		       	Book();
			break;
		     	case 3:
		 	System.out.println("   Dr.Khobragade   ");
		     	System.out.println("  MBBS,DVD,FCOS(MUMBAI) ");
		    	Book();
		         break;
		         case 4:
		        System.out.println("   Dr.Bani   ");
		        System.out.println("  MBBS, MD - General Medicine ");
		        Book();
		        break;
		        case 5:
		        System.out.println("  Dr.Arpita  ");
		       	System.out.println("  MBBS,MD,(Psychiatry) ");
		        Book();
		   	break;
		        default:
		        System.out.println("Invalid Input");	
			}
			break;
			default :
		        System.out.println("     Invalid Input   ");
		        System.out.println("                     ");
		       
		}
        }
              
                    //Appoinment book 
	public void Book()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("            BOOK THE APPOINTMENT         ");
		System.out.println("                                         ");
		System.out.print(" -------Enter The Name   :  ");
		aname[vi]=sc.next();
		System.out.print(" ------- Enter The Age    :  ");
		aage[vi]=sc.next();
		System.out.print(" ------- Enter The Moblie :  ");
		aMobile_number[vi]=sc.nextDouble();
		System.out.println("                                         ");
		System.out.println("        Your Appoinment is Book     ");
		System.out.println("                                         ");
		vi++;
		 vsize = vi;
		Menu();
    }
    			//appominetn view
                public void ViewApp()
    			{
    				  System.out.println("----------------------------------------------------------------");
                      System.out.println("Details Of Appoinment ");
                      System.out.println("----------------------------------------------------------------");
                       for(vi=0;vi<vsize;vi++)
                       {
                      System.out.print(" Name is "+Arrays.toString(aname)+"Age is "+Arrays.toString(aage)+"Moblie Number is "+Arrays.toString(aMobile_number));
                       }
                        System.out.println("----------------------------------------------------------------");
    }
    			

    //switch case //
    
    public void Menu()
    {
        System.out.println("Press 1 for Patient");
        System.out.println("Press 2 for Doctor");
        System.out.println("Press 3 for Admin");    
        Menu = sc.nextInt();
    

        
    switch(Menu)
    {
        case 1:
            System.out.println("Welcome TO Patient Mneu");
            System.out.println("Press a for Login");
            System.out.println("Press b for Registration");
            submenu = sc.next().charAt(0);
             switch (submenu)
             {
                 case 'a':
                     Login();
                     break;
                case 'b':
                     Registration();
                     Menu();
                     break;
             }
           
       
        case 2:
            System.out.println("Welcome TO Doctor Mneu");
            System.out.println("Press a for Login");
            System.out.println("Press b for Registration");
            Dsubmenu = sc.next().charAt(0);
       
        
        switch(Dsubmenu)
        {
            case 'a':
                DoctorLogin();
                Menu();
            case'b':
                DoctorRegistration();
                Menu();
                
        }
         break;
         case 3:
             Admin();
             Printuserlist();
             
             break;
          ///--main switch --//  
    }
  
    
    
    }
    
    
    
    public static void main(String[] args) {
        Doctor_Appointment dc = new Doctor_Appointment();
        //dc.MenuDisplay();
        dc.Menu();
    }
    
    
}
