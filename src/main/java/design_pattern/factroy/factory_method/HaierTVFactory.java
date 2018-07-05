package design_pattern.factroy.factory_method;

public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}
