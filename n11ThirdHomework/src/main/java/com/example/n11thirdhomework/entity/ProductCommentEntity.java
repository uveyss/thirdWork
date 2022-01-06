package com.example.n11thirdhomework.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productComment")

public class ProductCommentEntity {

    @Id
    private String productCommentId;
    private String comment;
    private String commentDate;
    private String userId;
    private String productId;

    public String getProductCommentId() {
        return productCommentId;
    }

    public void setProductCommentId(String productCommentId) {
        this.productCommentId = productCommentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
