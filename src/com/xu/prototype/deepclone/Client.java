package com.xu.prototype.deepclone;

/**
 * @Author: xuhang
 * @Date: 2020/3/4 14:24
 * @Description:
 **/
public class Client {
    public static void main(String[] args) {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("1","2"));
        try {
            //方式一
            DeepProtoType clone = (DeepProtoType)deepProtoType.clone();
            System.out.println(deepProtoType.getDeepCloneableTarget().hashCode()+deepProtoType.getDeepCloneableTarget().toString());
            System.out.println(clone.getDeepCloneableTarget().hashCode()+deepProtoType.getDeepCloneableTarget().toString());
            //方式二
            DeepProtoType p = (DeepProtoType)deepProtoType.deepClone();
            System.out.println(deepProtoType.getDeepCloneableTarget().hashCode()+deepProtoType.getDeepCloneableTarget().toString());
            System.out.println(p.getDeepCloneableTarget().hashCode()+deepProtoType.getDeepCloneableTarget().toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
