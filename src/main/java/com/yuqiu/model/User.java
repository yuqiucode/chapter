package com.yuqiu.model;

/**
 * Created by dell on 2017/8/18.
 */
public class User {
    /**
     * ID
     */
    private long ID;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 备注
     */
    private String remark;

    /**
     * 账号
     * @return
     */
    private String account;

    /**
     * 密码
     * @return
     */
    private String password;

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getRemark() {
        return remark;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", remark='" + remark + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

