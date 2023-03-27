class Employee{

    String name,address;
    int yearOfJoining;

    Employee(String name,int yearOfJoining,String address){

        this.name=name;
        this.yearOfJoining=yearOfJoining;
        
        this.address=address;
    }


    void printDetails(){
    
        System.out.println(name+"\t\t"+yearOfJoining+"\t\t\t\t"+address);
    }



}

class Q5{

    public static void main(String arg[]){

        Employee e1=new Employee("Robert",1994,"64C-WallsStreet");
        Employee e2=new Employee("Sam",2000,"68D-WallsStreet");
        Employee e3=new Employee("John",1999,"26B-WallsStreet");

        

System.out.println("Name           Year of Joining                   Address");
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();


    }
}