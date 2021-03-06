package cn.lmsite.lmfavor.vo.user;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户请求
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Setter
@Getter
public class UserRequest {
    /** id */
    private Integer id;
    /** 用户名 */
    private String  userName;
    /** 密码 */
    private String  password;
    /** 用户昵称 */
    private String  nickName;
    /** 真实姓名 */
    private String  realName;
    /** 年龄 */
    private Integer age;
    /** 性别: 0-男,1-女 */
    private Integer gender;
    /** 电话号码 */
    private Long    phone;
    /** 电子邮件 */
    private String  eMail;
    /** 微信号 */
    private String  wechat;
    /** 地址 */
    private String  address;
    /** 头像 */
    private String  avatar;

    @Override
    public String toString() {
        return "UserRequest{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", realName='" + realName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", eMail='" + eMail + '\'' +
                ", wechat='" + wechat + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
