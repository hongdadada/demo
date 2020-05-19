package util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-18 15:51
 */
public class Vo {
    private List<BranchDTO> branchList;
    private String providerCode;
    private String pin;

    public List<BranchDTO> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<BranchDTO> branchList) {
        this.branchList = branchList;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public static void main(String[] args) {
        Vo vo=new Vo();
        vo.setPin("1");
        vo.setProviderCode("1");
        List<BranchDTO> list=new ArrayList<>();
        BranchDTO dto=new BranchDTO();
        dto.setAction("1");
        dto.setArea(new BigDecimal(1));
        dto.setBranchCode("1");
        dto.setBranchName("1");
        dto.setContactMobile("1");
        dto.setContactName("1");
        Address address=new Address();
        address.setAddress("1");
        address.setCityId(1);
        address.setCityName("1");
        address.setCountryId(1);
        address.setCountryName("1");
        address.setCountrysideId(1);
        address.setCountrysideName("1");
        address.setProvinceId(1);
        address.setProvinceName("1");
        dto.setAddress(address);
        list.add(dto);
        vo.setBranchList(list);
        System.out.println(FastJsonUtil.toJsonString(vo));
    }
}