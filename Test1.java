import static java.lang.System.*;

class Test1
{
	static void helo1(){
		out.println("hello1");	
	}
	public static void main(String[] args ){
		int a =10;
		out.println("Static import test");
		//hello();
	}
	
	void hello(){

		out.println("changed in remote repo");
		out.println('pradeep');
		out.println('changed in local repo');
	}
	
}
