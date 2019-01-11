package kata.refactor.ExtractInterface;

public class Dog {
    public void Eat()
    {
    	System.out.println("狗狗在吃飯...。");
    }

    public void Drink(int bowl)
    {
    	System.out.println("狗狗喝了 " + bowl + " 碗水");
    }

    public int Sleep()
    {
        int hour = 8;
        System.out.println("狗狗睡了 " + hour + " 小時");
        return hour;
    }
}
