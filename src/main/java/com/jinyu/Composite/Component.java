package com.jinyu.Composite;

import java.util.List;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 15:08
 * Version: V0.1
 */
public class Component {

    /**
     * 节点id
     */
    private long id;

    /**
     * 叶子节点标识
     */
    private boolean leafNode = false;

    /**
     * 父节点id
     */
    private long parentId;

    /**
     * 节点内容
     */
    private String content;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isLeafNode() {
        return leafNode;
    }

    public void setLeafNode(boolean leafNode) {
        this.leafNode = leafNode;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    /**
     * 判断当前节点是否是叶子节点
     * @return
     */
    public boolean isLeaf(){
        return this.isLeaf();
    }

    public boolean isRoot() {
        Long parentId = this.getParentId();
        if( parentId == null){
            return true;
        }
        return false;
    }

    /**
     * 获取父节点
     * @return
     */
    public Component getParentComponent(List<Component> allNodes){
        for(Component c : allNodes){
            if(c.getId() == this.parentId){
                return c;
            }
        }
        return null;
    }

    public void doSomething(){
        System.out.println("do something, " + content);
    }

}
