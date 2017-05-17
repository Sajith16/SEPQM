package classPackage;

public class Results {

    public String OutResults(int marks) {
        if (marks > 70)
            return "A Pass";
        else if (marks > 60)
            return "B Pass";
        else if (marks > 45)
            return "C Pass";
        else
            return "Fail";
    }


}