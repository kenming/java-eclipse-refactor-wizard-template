package kata.refactor.PullUp_PushDown;

//Sub Class
public class Cat extends Animal {

	public void Eat() {
		System.out.println("貓咪在吃飯...。");
	}

	public void Drink(int bowl) {
		System.out.println("貓咪喝了 " + bowl + " 碗水");
	}

	public int Sleep() {
	    int hour = 8;
	    System.out.println("貓咪睡了 " + hour + " 小時");
	    return hour;
	}
}