package com.example.demo;

public class Vendors {
    private int vendor_id;
    private String vendor_name;
    private String vendor_address;
    private String vendor_address2;
    private String vendor_city;
    private String vendor_state;
    private String vendor_zip_code;
    private String vendor_phone;
    private String vendor_last_name;
    private String vendor_first_name;
    private int default_terms_id;
    private int default_account_number;


    public Vendors(int vendor_id, String vendor_name, String vendor_address, String vendor_address2, String vendor_city, String vendor_state, String vendor_zip_code, String vendor_phone, String vendor_last_name, String vendor_first_name, int default_terms_id, int default_account_number) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
        this.vendor_address2 = vendor_address2;
        this.vendor_city = vendor_city;
        this.vendor_state = vendor_state;
        this.vendor_zip_code = vendor_zip_code;
        this.vendor_phone = vendor_phone;
        this.vendor_last_name = vendor_last_name;
        this.vendor_first_name = vendor_first_name;
        this.default_terms_id = default_terms_id;
        this.default_account_number = default_account_number;
    }

    public Vendors(String vendor_name, String vendor_city) {
        this.vendor_name = vendor_name;
        this.vendor_city = vendor_city;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getVendor_address2() {
        return vendor_address2;
    }

    public void setVendor_address2(String vendor_address2) {
        this.vendor_address2 = vendor_address2;
    }

    public String getVendor_city() {
        return vendor_city;
    }

    public void setVendor_city(String vendor_city) {
        this.vendor_city = vendor_city;
    }

    public String getVendor_state() {
        return vendor_state;
    }

    public void setVendor_state(String vendor_state) {
        this.vendor_state = vendor_state;
    }

    public String getVendor_zip_code() {
        return vendor_zip_code;
    }

    public void setVendor_zip_code(String vendor_zip_code) {
        this.vendor_zip_code = vendor_zip_code;
    }

    public String getVendor_phone() {
        return vendor_phone;
    }

    public void setVendor_phone(String vendor_phone) {
        this.vendor_phone = vendor_phone;
    }

    public String getVendor_last_name() {
        return vendor_last_name;
    }

    public void setVendor_last_name(String vendor_last_name) {
        this.vendor_last_name = vendor_last_name;
    }

    public String getVendor_first_name() {
        return vendor_first_name;
    }

    public void setVendor_first_name(String vendor_first_name) {
        this.vendor_first_name = vendor_first_name;
    }

    public int getDefault_terms_id() {
        return default_terms_id;
    }

    public void setDefault_terms_id(int default_terms_id) {
        this.default_terms_id = default_terms_id;
    }

    public int getDefault_account_number() {
        return default_account_number;
    }

    public void setDefault_account_number(int default_account_number) {
        this.default_account_number = default_account_number;
    }
}
