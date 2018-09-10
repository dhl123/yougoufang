package com.youzufang.model.base;

import com.youzufang.model.base.BaseModel;

// 内容类的 Model, 增加了发布者和内容两个字段, 适用于 comment / question / answer 等
public class ContentBaseModel extends BaseModel {

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    //FIXME: 好像做双向外键很麻烦, 这里直接用userId替代了, 业务层处理一下
    private int userId;

    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
