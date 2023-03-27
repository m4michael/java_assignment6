import java.util.Scanner;

class complex{
	
	int real,imag;
	
	complex(int r,int i){
		
		this.real=r;
		this.imag=i;
	}
	
	static complex add(complex num1,complex num2){
		
		return new complex((num1.real+num2.real),(num1.imag+num2.imag));
		
	}
	
	static complex diff(complex num1,complex num2){
		
		return new complex((num1.real-num2.real),(num1.imag-num2.imag));
	}
	
	static complex mul(complex num1,complex num2){
		
		return new complex(((num1.real*num2.real)-(num1.imag*num2.imag)),((num1.real*num2.imag)+(num1.imag*num2.real)));
		
	}
	
	void printComplex(){
		
		if(real==0 && imag!=0){
			System.out.println(imag+"i");
		}
		
		else if(imag==0 && real!=0){
			
			System.out.println(real);
		}
		
		else{
			
			System.out.println(real+"+"+imag+"i");
		}
		
	}
		
		
	
}


class Q4 {
    public static void main(String arg[]) {
		int real1,imag1,real2,imag2;

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter real part of complex1=");
		real1=sc.nextInt();
		System.out.print("Enter imaginary part of complex1=");
		imag1=sc.nextInt();
		System.out.print("Enter real part of complex2=");
		real2=sc.nextInt();
		System.out.print("Enter imaginary part of complex2=");
		imag2=sc.nextInt();
		
		complex num1=new complex(real1,imag1);
		complex num2=new complex(real2,imag2);
		
		complex a=complex.add(num1,num2);
		
		complex b=complex.mul(num1,num2);
		
		complex c=complex.diff(num1,num2);

        System.out.println();
        System.out.println();
		
        System.out.print("Add=");
		a.printComplex();
        System.out.print("Multiplication=");
		b.printComplex();
        System.out.print("Subtraction=");
		c.printComplex();
		
		
		
		
		
		
	}
}
        