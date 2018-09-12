package string.problems;


import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        String pnt = "we are the PNT Selenium group 2018";
        DetermineLargestWord dt = new DetermineLargestWord();
        dt.equals("Human");
        try {
            Assert.assertEquals("Sel",DetermineLargestWord.largestWord(pnt));
        }catch(Exception ex){
            ex.getMessage();

        }


    }
}
