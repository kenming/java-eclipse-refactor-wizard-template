package kata.refactor.ChangeMethodSignature;

public class 變更方法簽章 {
    public void DisplayName(String firstName, String lastName)
    {
        ChangeName(lastName, firstName);
    }

    private void ChangeName(String lastName, String firstName)
    {
    	System.out.println("FirstName :" + firstName);
    	System.out.println("LastName :" + lastName);
    }
}
