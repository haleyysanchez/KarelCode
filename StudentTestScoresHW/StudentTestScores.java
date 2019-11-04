
/**
 * Use an initializer list to make a set of parallel arrays. One that is two-
 * dimensional and on that is one-dimensional. The arrays will hold the names
 * of students with the corresponding 4 test scores. The test scores will be
 * printed out and displayed in a list with the corresponding name, as well
 * as that student's test score average. Also, found the lowest,highest, and 
 * average test score from the 4 tests that the sudents took.
 *
 * @author Haley Sanchez
 * @version 12/11/18
 */
public class StudentTestScores
{
    private String[] names = {"Gary", "Susan", "Bob", "Kaley", "Jack", "Tom"};
    private int[][] scores = {{87, 80, 78, 90},
                    {95, 92, 85, 100},
                    {62, 75, 70, 81},
                    {105, 75, 80, 92},
                    {85, 79, 81, 89},
                    {90, 79, 93, 88}};
    //int x = 0;
    private int low = 111;
    private int high;
    private int total;
    //loops through the array and prints out the test scores and name for a certain row
    //includes 3 other methods for finding lowest, highest, and average scores
    public void process()
    {
        for (int i = 0; i <= names.length-1; i++)
        {
            int x = 0;
            System.out.println("");
            System.out.print(names[i] + " had test scores of ");
            for (int j = 0; j <= scores[0].length-1; j++)
            {
                System.out.print(scores[i][j] + ", ");
                
                x += scores[i][j];
              
            }
            System.out.print(" Test average is " + x/4 + ".");
        }
        System.out.println("");
        findL();
        findH();
        findAvg();
    }
    //loops through two-dimensional array and finds the lowest test score
    //also prints out the corresponding name of the person who go the score
    public void findL()
    {
        for(int i = 0; i <= scores.length-1; i++)
        {
            for (int j = 0; j <= scores[0].length-1; j++)
            {
                if(scores[i][j] < low)
                low = scores[i][j];
            }
    }
        for(int i = 0; i <= scores.length-1; i++)
        {
            for (int j = 0; j <= scores[0].length-1; j++)
            {
                if(scores[i][j] == low)
                System.out.println(names[i] + " had the lowest score of " + low);
                break;
                
            }
            
    }
    }
    //loops through two-dimensional array and finds the highest test score
    //also prints out the corresponding name of the person who go the score
    public void findH()
    {
         for(int i = 0; i <= scores.length-1; i++)
        {
            for (int j = 0; j <= scores[0].length-1; j++)
            {
                if(scores[i][j] > high)
                high = scores[i][j];
            }
    }
        for(int i = 0; i <= scores.length-1; i++)
        {
            for (int j = 0; j <= scores[0].length-1; j++)
            {
                if(scores[i][j] == high)
                System.out.println(names[i] + " had the highest score of " + high);
                break;
                
            }
            
    }
    }
    //loops through two-dimensional array and finds the average test score
    //the score includes all the sudents in the class
    public void findAvg()
    {
        for(int i = 0; i <= scores.length-1; i++)
        {
            for (int j = 0; j <= scores[0].length-1; j++)
            {
                total += scores[i][j];
            }
    }
    System.out.println("The class average test score is " + 
    total/24 + ".");
    }
}
