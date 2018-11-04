package com.example.syanz.restoran.model;

public class MenuModel {
    private String namaMenu,hargaMenu,deskripsiMenu;
    private int fotoMenu;

    public MenuModel(String namaMenu, String hargaMenu, String deskripsiMenu, int fotoMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
        this.deskripsiMenu = deskripsiMenu;
        this.fotoMenu = fotoMenu;
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
