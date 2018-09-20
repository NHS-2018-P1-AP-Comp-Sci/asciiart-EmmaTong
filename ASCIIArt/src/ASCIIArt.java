/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen        
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {
	public static void main(String[] args) {
		Head();
		UpperBody();
		LowerBody();
		System.out.println("\n\n< I am the teddy bear. >");
	}
	public static void Ear() {
	
		System.out.print("(c)");
	}
	public static void DownwardEyes() {
		System.out.print(".-.");
	}
	public static void Eyes() {
		System.out.print("._.");
	}
	public static void Nose() {
		System.out.print("(  Y  )");
	}
	public static void Neck() {
		System.out.print("/'-'\\");
	}
	public static void Stomache() {
		System.out.println("| |  X  | |");
	}
	public static void Leg() {
		System.out.print("` - '");
	}
	public static void Foot() {
		System.out.print(" `-'");
	}
	public static void Head() {
		System.out.print("   _         _\n  ");
		Ear();
		System.out.print("  .-.  ");
		Ear();
		System.out.print("\n   /   ");
		Eyes();
		System.out.print("   \\  \n __\\ ");
		Nose();
		System.out.print(" /__");
	}
	public static void UpperBody() {
		System.out.print("\n(__.- ");
		Neck();
		System.out.println(" -.__)");
		System.out.print("   ");
		Stomache();

	}
	public static void LowerBody() {
		System.out.print(" _.'  ");
		Leg();
		System.out.println("  '._");
		System.out.print("(");
		DownwardEyes();
		System.out.print("/ ");
		Leg();
		System.out.print(" \\");
		DownwardEyes();
		System.out.println(")");
		Foot();
		System.out.print("        ");
		Foot();
	}
}












