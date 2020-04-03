package com.unfbx.tellmewhy.constant;

/**
 * 常量值
 */
public class ConstValue {

    /**
     * 排序方式
     *
     */
    public enum HttpStatus{
        PATH_ERROR(404,"地址错误"),
        SYS_ERROR(500,"系统错误")
        ;
        private String value;
        private int code;
        HttpStatus(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static HttpStatus codeOf(int code){
            for (HttpStatus status : values()) {
                if(status.getCode()==code){
                    return status;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 排序方式
     *
     */
    public enum OrderBy{
        CTIME("0","create_time","创建时间"),
        MTIME("1","modifie_time","修改时间"),
        LIKE("2","like_num","赞"),
        UNLIKE("3","un_like_num","踩"),
        HIT("4","hits","点击"),
        COMMENTS("5","comments_num","评论数")
        ;
        private String value;
        private String code;
        OrderBy(String code,String value,String desc){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public String getCode() {
            return code;
        }

        public static OrderBy codeOf(String code){
            for (OrderBy rderBy : values()) {
                if(rderBy.getCode().equals(code)){
                    return rderBy;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 性别
     * 1-男，2女，0不确定
     */
    public enum Gender{
        UNKNOW(0,"未知"),
        MAN(1,"男"),
        WOMEN(2,"女");
        private String value;
        private int code;
        Gender(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static Gender codeOf(int code){
            for (Gender gender : values()) {
                if(gender.getCode()==code){
                    return gender;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 客户端
     */
    public enum Client{
        WX(0,"WX"),
        QQ(1,"QQ");
        private String value;
        private int code;
        Client(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static Client codeOf(int code){
            for (Client client : values()) {
                if(client.getCode()==code){
                    return client;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 是否置顶
     */
    public enum IsTop{
        NO(0,"不置顶"),
        YES(1,"置顶");
        private String value;
        private int code;
        IsTop(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static IsTop codeOf(int code){
            for (IsTop isTop : values()) {
                if(isTop.getCode()==code){
                    return isTop;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 是否允许评论
     */
    public enum AllowComment{
        NO(0,"不允许"),
        YES(1,"允许");
        private String value;
        private int code;
        AllowComment(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static AllowComment codeOf(int code){
            for (AllowComment allowComment : values()) {
                if(allowComment.getCode()==code){
                    return allowComment;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 状态
     */
    public enum Status{
        NO("0","无效"),
        YES("1","有效");
        private String value;
        private String code;
        Status(String code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public String getCode() {
            return code;
        }

        public static Status codeOf(String code){
            for (Status status : values()) {
                if(status.getCode().equals(code)){
                    return status;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 用户类别
     */
    public enum Role{
        ADMIN(0,"管理员"),
        CUSTOMER(1,"用户");
        private String value;
        private int code;
        Role(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static Role codeOf(int code){
            for (Role role : values()) {
                if(role.getCode()==code){
                    return role;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * 图片类别
     */
    public enum ImageType{
        WIPER(0,"轮播图"),
        ICON(1,"首页图标"),
        NEW(2,"问题头图");
        private String value;
        private int code;
        ImageType(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static ImageType codeOf(int code){
            for (ImageType imageType : values()) {
                if(imageType.getCode()==code){
                    return imageType;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }
}
