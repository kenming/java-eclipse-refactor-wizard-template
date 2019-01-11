package kata.refactor.ExtractMethod;

public class 提煉方法 {
    public void 計算圓面積(double radius)
    {
        double Area = Math.PI  * radius * radius;
        
        System.out.println ("半徑：" + radius);
        System.out.println("Round Area : " + String.format("%.2f", Area));
    }
}
