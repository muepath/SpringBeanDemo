package BeanSimpleUse.Service;
//通过构造函数依赖注入
public class ExampleBean {

    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "years=" + years +
                ", ultimateAnswer='" + ultimateAnswer + '\'' +
                '}';
    }
}