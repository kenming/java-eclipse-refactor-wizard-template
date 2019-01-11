package kata.refactor.console;

import kata.refactor.ExtractMethod.*;
import kata.refactor.ChangeMethodSignature.*;
import kata.refactor.Rename.*;
import kata.refactor.ExtractInterface.*;

public class Program {

	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);

		// 提煉方法
        //new 提煉方法().計算圓面積(16);
        
        // 變更方法簽章
		// new 變更方法簽章().DisplayName("Jenny", "Wang");
		
		// 重新命名
		// new 重新命名().CalcRoundArea(16);
		
		// 提煉介面
		// ExtractInterface();
		
		//System.out.println("\nPress Any Key to continue.....");
        //s.nextLine();
	}
	
    private static void ExtractInterface()
    {
        Dog dog = new Dog();
        dog.Eat();
        dog.Drink(2);
        dog.Sleep();
    }
}