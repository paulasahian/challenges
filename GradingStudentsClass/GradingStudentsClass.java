package challenges.GradingStudentsClass;
/**
 * @since 0.0.1
 * @author paulaSahian
 * @version 0.0.1
 * Grading Students
 * 
 * HackerLand University has the following grading policy:
 *Every student receives a grade in the inclusive range from  to .
 *Any  less than 40 is a failing grade.
 *Sam is a professor at the university and likes to round each student's grade according to these rules:
 *If the difference between the grade and the next multiple of 5 is less than 3 , round grade up to the next multiple of 5.
 *If the value of grade is less than 38 , no rounding occurs as the result will still be a failing grade.
 *Examples
 *grade = 84 round to 85  (85 - 84 is less than 3)
 **grade = 29 do not round (result is less than 40)
 **grade = 57 do not round (60 - 57 is 3 or higher)

 *Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.

 *Function Description
 *Complete the function gradingStudents in the editor below.
 *gradingStudents has the following parameter(s):
 *int grades[n]: the grades before rounding
 *Returns
 *int[n]: the grades after rounding as appropriate
 *Input Format
 *The first line contains a single integer n ,the number of students.
 *Each line i  of the  subsequent lines contains a single integer,grades [i] .

Sample Input 0
4
73
67
38
33
Sample Output 0
75
67
40
33

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Main Class for the Grading Students
 */
public class GradingStudentsClass {

    public static void main(final String[] args) {
        List<Integer> grades = Arrays.asList( 73 , 67, 38 , 33);         // Output: 75, 67, 40, 33
        
		List<Integer> adjustedGrades = gradingStudents(grades);

        for (int grade : adjustedGrades) {
            System.out.println(grade);
        }
	}
    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();
       
           for (int grade : grades){
               if (grade < 38){
                   result.add(grade);
               }
               else {
                  int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                  
                  if (nextMultipleOf5 - grade < 3){
                     result.add(nextMultipleOf5);
                  } else {
                       result.add(grade);
                   }
                }
            }
            return result;
        }
    
    }

