package IntroductionToJava;

//////////////////////Tutorial Notes //////////////////////////////////////

//Single line comment

/** Documentation Comment. Also called a doc comment. */

/** 
Class Names: 

The first letter of the class should be in Uppercase (lowercase is allowed, but discouraged).

ii. If several words are used to form the name of the class, each inner word’s first letter should be in Uppercase. Underscores are allowed, but not recommended. Also allowed are numbers and currency symbols, although the latter are also discouraged because the are used for a special purpose (for inner and anonymous classes).

class MyJavaProgram    // valid syntax
class 1Program         // invalid syntax
class My1Program       // valid syntax
class $Program         // valid syntax, but discouraged
class My$Program       // valid syntax, but discouraged (inner class Program inside the class My)
class myJavaProgram    // valid syntax, but discouraged

Method Names:

i. All the method names should start with a lowercase letter.

ii. If several words are used to form the name of the method, then each first letter of the inner word should be in Uppercase. Underscores are allowed, but not recommended. Also allowed are digits and currency symbols.

public void employeeRecords() // valid syntax
public void EmployeeRecords() // valid syntax, but discouraged

 */


/* Multi line comments

class: The class contains the data and methods to be used in the program. Methods define the behavior of the class. Class GFG has only one method Main in JAVA.

static void Main(): static keyword tells us that this method is accessible without instantiating the class. 

void: keywords tell that this method will not return anything. The main() method is the entry point of our application.

The method main() is the main entry point into a Java program; this is where the processing starts. Also allowed is the signature public static void main(String… args).

*/

public class IntroductionToJava {

	public static void main(String[] args) {
		
		System.out.println("Hello World");

	}

}
