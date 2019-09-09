package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ZhEvaluation implements Serializable {
    //
    private Integer id;
    //
    private String goodsName;
    //
    private String goodsBrand;
    //
    private Integer goodsYear;
    //
    private String goodsModel;
    //
    private Integer userId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setGoodsName (String  goodsName){
        this.goodsName=goodsName;
    }
    public  String getGoodsName(){
        return this.goodsName;
    }
    public void setGoodsBrand (String  goodsBrand){
        this.goodsBrand=goodsBrand;
    }
    public  String getGoodsBrand(){
        return this.goodsBrand;
    }
    public void setGoodsYear (Integer  goodsYear){
        this.goodsYear=goodsYear;
    }
    public  Integer getGoodsYear(){
        return this.goodsYear;
    }
    public void setGoodsModel (String  goodsModel){
        this.goodsModel=goodsModel;
    }
    public  String getGoodsModel(){
        return this.goodsModel;
    }
    public void setUserId (Integer  userId){
        this.userId=userId;
    }
    public  Integer getUserId(){
        return this.userId;
    }
}
