package com.jinyu.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 15:09
 * Version: V0.1
 */
public class Branch extends Component {

    /**
     * 子节点列表
     */
    private ArrayList<Component> componentArrayList = new ArrayList<>();


    /** 新增子节点
     * @param component
     */
    public void add(Component component){
        this.componentArrayList.add(component);
    }


    /**
     * 删除子节点
     * @param component
     */
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }


    /**
     * 获取所有子节点
     * @return
     */
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }

}
