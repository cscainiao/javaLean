package cainiao_lean.对象和类;

public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }
    //构造方法， 同python的__init__方法，创建实例的时候调用
    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }
        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}
