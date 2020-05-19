package util;

import java.math.BigDecimal;

/**
 * @Author: NanJW
 * @Date: 2020/5/14 10:31
 * @Version 1.0
 */
public class BranchDTO {
    /**
     * INSERT|UPDATE|DELETE
     */
    private String action;
    /**
     * 网点名称
     */
    private String branchName;
    /**
     * 网点编码
     */
    private String branchCode;

    private Address address;
    /**
     * 面积 ㎡
     */
    private BigDecimal area;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人电话
     */
    private String contactMobile;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }
}
