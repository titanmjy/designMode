package com.jinyu.Composite;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 15:15
 * Version: V0.1
 */
public class Test {

    public static void main(String[] args) {
//       这个列表是从库里查出的
        List<Component> components = new ArrayList<>();
        Test test = new Test();
        Component root = test.generateCompositeTree(components);
    }


    // 递归查询
    public void display(Branch root){
        for(Component c : root.getChildren()){
            if( c instanceof Leaf){
                c.doSomething();
            }else{
                display((Branch) c);
            }
        }
    }


    /**
     * 生成对象树
     * @return
     */
    public Component generateCompositeTree(List<Component> allConponents){
        Component root = null;
        List<Component> leafList = new ArrayList<>();
//        找到叶子列表
        for(Component c: allConponents){
            if(c.isLeaf()){
                leafList.add(c);
            }
        }

//        构造树
        for(Component current:leafList) {
            root = this.construct(allConponents, current);
        }

        return root;
    }


    /**
     * 递归构造树
     * @param current
     * @return
     */
    public Component construct(List<Component> allConponents,Component current){
        if(current.isRoot()){
            return current;
        }else{
            Branch parent = (Branch) current.getParentComponent(allConponents);
            parent.add(current);
            return construct(allConponents, parent);
        }
    }

}
