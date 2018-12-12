package com.example.syanz.restoran.model;

public class MenuModel {
    private String ID,namaMenu,hargaMenu,deskripsiMenu;
    private int fotoMenu;

    public MenuModel(String ID,String namaMenu, String hargaMenu, String deskripsiMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
        this.deskripsiMenu = deskripsiMenu;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(String hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    public String getDeskripsiMenu() {
        return deskripsiMenu;
    }

    public void setDeskripsiMenu(String deskripsiMenu) {
        this.deskripsiMenu = deskripsiMenu;
    }

    public int getFotoMenu() {
        return fotoMenu;
    }

    public void setFotoMenu(int fotoMenu) {
        this.fotoMenu = fotoMenu;
    }
}
