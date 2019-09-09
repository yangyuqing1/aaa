package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ZhMessage implements Serializable {
    //
    private Integer id;
    //
    private String content;
    //
    private String name;
    //
    private String phone;
    //
    private Date createtime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
}
