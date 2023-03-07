import java.util.*;

class Empolye{
    private int eno;
    private String ename;
    private int salary;

    Empolye(int eno,String ename,int salary){
    	this.eno=eno;
    	this.ename=ename;
    	this.salary=salary;
    }
    public int getEno(){
    	return eno;
    }
    public String getName(){
    	return ename;
    }
    public int getSalary(){
    	return salary;
    }
    public String toString(){
    	return eno+" "+ename+" "+salary;
    }
}

public class CURDdemo{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);    // for integer
		Scanner sc1=new Scanner(System.in);   // for char or String
		int num;
		List<Empolye> c=new ArrayList<Empolye>();
		do{
           System.out.println("1. Insert data");
           System.out.println("2. show the data");
           System.out.println("3. Search for data");
           System.out.println("4. Delete the data");
           System.out.println("5. Update the data");
           System.out.print(" Enter your choice sir : ");
           num=sc.nextInt();
           switch(num){
		    case 1:
		    	System.out.print("Enter the employe code :- ");
		    	int eno=sc.nextInt();
		    	System.out.print("Enter the name of a employe :- ");
		    	String ename=sc1.nextLine();
		    	System.out.print("Enter the Salary of the person :- ");
		    	int salary=sc.nextInt();
		    	c.add(new Empolye(eno,ename,salary));
			break;
		case 2:
			System.out.println("----------------------------------------------------------");
			Iterator<Empolye> i=c.iterator();
			while(i.hasNext()){
                 Empolye e=i.next();
                 System.out.println(e);
			}
			System.out.println("----------------------------------------------------------");
			break;
		case 3:
			boolean found=false;
			System.out.print("Enter the employe code : ");
            eno=sc.nextInt();
            System.out.println("----------------------------------------------------------");
			 i=c.iterator();
			while(i.hasNext()){
                 Empolye e=i.next();
                 if(e.getEno()==eno){
                 System.out.println(e);
             found=true;
         }
			}
			if (!found)
				System.out.println("The code was no present");
			System.out.println("----------------------------------------------------------");			
			break;
		case 4:
			found=false;
			System.out.print("Enter the employe code  to delete: ");
            eno=sc.nextInt();
            System.out.println("----------------------------------------------------------");
			 i=c.iterator();
			while(i.hasNext()){
                 Empolye e=i.next();
                 if(e.getEno()==eno){
                 	i.remove();
             found=true;
         }
			}
			if (!found)
				System.out.println("The code was no present");
			else
				System.out.println("Record Sussefully deleted.....!");
			System.out.println("----------------------------------------------------------");
			break;
		case 5:
			found=false;
			System.out.print("Enter the employe code  to Update: ");
            eno=sc.nextInt();
			 ListIterator<Empolye> li=c.listIterator();
			while(li.hasNext()){
                 Empolye e=li.next();
                 if(e.getEno()==eno){
                 	System.out.print("Enter the new name : ");
                 	ename=sc1.nextLine();
                 	System.out.print("Enter the new salary : ");
                 	salary=sc.nextInt();
                 	li.set(new Empolye(eno,ename,salary));
             found=true;
         }
			}
			if (!found)
				System.out.println("The code was not present");
			else
				System.out.println("Record Sussefully updated.....!");
			break;
		}
		}while(num!=0 && num<=5);		
	} 
}

