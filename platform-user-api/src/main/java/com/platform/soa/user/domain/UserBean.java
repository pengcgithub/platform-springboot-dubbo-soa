package com.platform.soa.user.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.domain
 * @since 2018/12/27
 */
@Entity
@Table(name = "T_USER")
public class UserBean implements Serializable {

    @Id
    @GeneratedValue
    private String id;

    @Column(length = 25, name = "user_name")
    private String userName;

    @Column(length = 11, name = "user_phone")
    private long userPhone;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "score", length = 5)
    private Integer score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
