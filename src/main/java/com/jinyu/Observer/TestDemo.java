package com.jinyu.Observer;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 9:25
 * Version: V0.1
 */
public class TestDemo {
    public static void main(final String[] args)
    {
        final TemperatureCenter sb = new TemperatureCenter((float) 20.00);

        final Observer o = new Student("allen","man",sb);
        sb.setTemperature((float) 21.00);

    }
}
