package com.jerry.geekdaily.dto;

import com.alibaba.fastjson.annotation.JSONField;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class UpdateArticleDTO implements Serializable {

    @NotNull(message="文章ID不能为空！")
    private Integer article_id;

    private String title;

    private String des;

    private String tag;

    private String img_url;//上传的图片文件

    private String link;//源url

    @NotNull(message="编辑者ID不能为空！")
    private Integer contributor_id;//贡献者id(user_id)

    private String category;//文章分类（Android、iOS、Java等）

    private int child_category;//文章子分类(开源库0、资讯1、资料2等)

    private int rank;//文章适合等级（0所有人、1初学、2进阶）

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public UpdateArticleDTO() {
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getContributor_id() {
        return contributor_id;
    }

    public void setContributor_id(int contributor_id) {
        this.contributor_id = contributor_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getChild_category() {
        return child_category;
    }

    public void setChild_category(int child_category) {
        this.child_category = child_category;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UpdateArticleDTO{" +
                "article_id=" + article_id +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", img_url='" + img_url + '\'' +
                ", link='" + link + '\'' +
                ", contributor_id=" + contributor_id +
                ", category='" + category + '\'' +
                ", rank=" + rank +
                '}';
    }
}
