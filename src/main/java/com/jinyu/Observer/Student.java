package com.jinyu.Observer;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 9:23
 * Version: V0.1
 */
public class Student implements Observer {
    private final Subject subject;
    private String name;
    private String gender;

    // 构造方法里注册主题
    public Student(String name, String gender, final Subject subject)
    {
        // 业务相关
        this.name = name;
        this.gender = gender;
        // 发布订阅相关
        this.subject = subject;
        this.subject.registerObserver(this);
    }



    public void moreClothes(){
        System.out.println("add clothes");
    }

    public void lessClothes(){
        System.out.println("less clothes");
    }

    public void easy(){
        System.out.println("easy, nothing happend");
    }

    @Override
    public void update(String temperatureChange)
    {
        if(temperatureChange.equals("hot")){
            this.lessClothes();
        }else if(temperatureChange.equals("cold")){
            this.moreClothes();
        }else{
            this.easy();
        }
    }


}
