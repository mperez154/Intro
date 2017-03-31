//Created by Marco Perez
//Student ID: 2348837

package perez5;

//Displaying Sine,Cosine and Tangent for angles 0-9 (Nested loops)
public class AssignmentTwo {

	public static void main(String[] args) 
	{
		//outputting headers to console
		System.out.println("Angle\tSine\t\tCosine\t\tTangent");
		System.out.println("-----\t-----\t\t-----\t\t-----");
		
		/* Here is the nested loop that outputs data for each 
		 * angle within the inner loops then increments the outer
		 * loop and repeats until the outer loop reaches 90 degrees)
		 */
		for (int angle = 0; angle < 95; angle += 5)
		{
			//Converting angle to Radians before calculating below
			double angleRadians = Math.toRadians(angle);
			System.out.print(angle + "\t");
			for(int i = 0; i < 1; i++)
			{
				System.out.printf("%5.5f\t\t", Math.sin(angleRadians));
				System.out.printf("%5.5f\t\t", Math.cos(angleRadians));
				System.out.printf("%5.5f\n",Math.tan(angleRadians));
			}
		}
	}
}

