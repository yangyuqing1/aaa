package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ZhNews implements Serializable {
    //
    private Integer newsId;
    //
    private String content;
    //
    private Integer newsType;
    //
    private Date newsTime;
    //
    private String pic;
    //get set 方法
    public void setNewsId (Integer  newsId){
        this.newsId=newsId;
    }
    public  Integer getNewsId(){
        return this.newsId;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setNewsType (Integer  newsType){
        this.newsType=newsType;
    }
    public  Integer getNewsType(){
        return this.newsType;
    }
    public void setNewsTime (Date  newsTime){
        this.newsTime=newsTime;
    }
    public  Date getNewsTime(){
        return this.newsTime;
    }
    public void setPic (String  pic){
        this.pic=pic;
    }
    public  String getPic(){
        return this.pic;
    }
}
