package com.example.fingerprint;

import java.util.ArrayList;
public class Model {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList < data > data;
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getPer_page() {
        return per_page;
    }
    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal_pages() {
        return total_pages;
    }
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
    public ArrayList < Model.data > getData() {
        return data;
    }
    public void setData(ArrayList < Model.data > data) {
        this.data = data;
    }
    public class data {
        public int id;
        public String email;
        public String first_name;
        public String last_name;
        public String avatar;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getFirst_name() {
            return first_name;
        }
        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }
        public String getLast_name() {
            return last_name;
        }
        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
        public String getAvatar() {
            return avatar;
        }
        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
