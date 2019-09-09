package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ZhGoods implements Serializable {
    //
    private Integer id;
    //
    private Double price;
    //
    private String brand;
    //
    private String model;
    //
    private String condition;
    //
    private String origin;
    //
    private String year;
    //
    private String standards;
    //
    private Integer num;
    //
    private String address;
    //
    private String location;
    //
    private String pic;
    //
    private String video;
    //
    private Date createtime;
    //
    private Integer collection;
    //
    private Integer browse;
    //
    private Integer totalBrowse;
    //
    private Integer totalCollection;
    //
    private String lable;
    //
    private Integer status;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setPrice (Double  price){
        this.price=price;
    }
    public  Double getPrice(){
        return this.price;
    }
    public void setBrand (String  brand){
        this.brand=brand;
    }
    public  String getBrand(){
        return this.brand;
    }
    public void setModel (String  model){
        this.model=model;
    }
    public  String getModel(){
        return this.model;
    }
    public void setCondition (String  condition){
        this.condition=condition;
    }
    public  String getCondition(){
        return this.condition;
    }
    public void setOrigin (String  origin){
        this.origin=origin;
    }
    public  String getOrigin(){
        return this.origin;
    }
    public void setYear (String  year){
        this.year=year;
    }
    public  String getYear(){
        return this.year;
    }
    public void setStandards (String  standards){
        this.standards=standards;
    }
    public  String getStandards(){
        return this.standards;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setLocation (String  location){
        this.location=location;
    }
    public  String getLocation(){
        return this.location;
    }
    public void setPic (String  pic){
        this.pic=pic;
    }
    public  String getPic(){
        return this.pic;
    }
    public void setVideo (String  video){
        this.video=video;
    }
    public  String getVideo(){
        return this.video;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
    public void setCollection (Integer  collection){
        this.collection=collection;
    }
    public  Integer getCollection(){
        return this.collection;
    }
    public void setBrowse (Integer  browse){
        this.browse=browse;
    }
    public  Integer getBrowse(){
        return this.browse;
    }
    public void setTotalBrowse (Integer  totalBrowse){
        this.totalBrowse=totalBrowse;
    }
    public  Integer getTotalBrowse(){
        return this.totalBrowse;
    }
    public void setTotalCollection (Integer  totalCollection){
        this.totalCollection=totalCollection;
    }
    public  Integer getTotalCollection(){
        return this.totalCollection;
    }
    public void setLable (String  lable){
        this.lable=lable;
    }
    public  String getLable(){
        return this.lable;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
