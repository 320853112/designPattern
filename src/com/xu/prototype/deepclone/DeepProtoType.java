package com.xu.prototype.deepclone;

import java.io.*;

/**
 * @Author: xuhang
 * @Date: 2020/3/4 14:08
 * @Description:
 **/
public class DeepProtoType implements Serializable,Cloneable {
    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepProtoType() {

    }
    //深拷贝 方式一 clone方法,将成员对象单独处理
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //对基本数据类型的clone
        deep = super.clone();
        //对引用类型进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝 方式二 通过对象的序列化来实现（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//将当前对象以对象流方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois  = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getLocalizedMessage());
            }
        }

    }

}
