package util;


/**
 * @Author: NanJW
 * @Date: 2020/5/14 10:35
 * @Version 1.0
 */
public class Address {
    /**
     * 省/直辖市id 国标编码  必填
     */
    private Integer provinceId;

    private String  provinceName;
    /**
     * 市id 国标编码  必填
     */
    private Integer cityId;

    private String cityName;
    /**
     * 区/县id 国标编码 非必填
     */
    private Integer countryId;

    private String countryName;
    /**
     * 乡镇/街道id 国标编码     非必填
     */
    private Integer countrysideId;

    private String countrysideName;
    /**
     * 详细地址  非必填
     */
    private String address;


    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getCountrysideId() {
        return countrysideId;
    }

    public void setCountrysideId(Integer countrysideId) {
        this.countrysideId = countrysideId;
    }

    public String getCountrysideName() {
        return countrysideName;
    }

    public void setCountrysideName(String countrysideName) {
        this.countrysideName = countrysideName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
