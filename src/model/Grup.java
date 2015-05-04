/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author undeed
 */
public class Grup {

    private ArrayList<Orang> listOrang;
    private ArrayList<Menu> listMenu;
    private Penalang penalang;

    public Grup() {
        listMenu = new ArrayList();
        listOrang = new ArrayList();
    }

    public Orang getPenalang() {
        return penalang;
    }

    public void setMenuOrang(Menu m, Orang o) {
        o.addMenu(m);
    }

    public void addMenuPenalang(Menu m) {
        if (penalang != null) {
            penalang.addMenu(m);
        }
    }

    public void addMenu(Menu m) {
        listMenu.add(m);
        addMenuPenalang(m);
    }

    public void addOrang(Orang o) {
        listOrang.add(o);
    }

    public Menu getMenu(int id) {
        return listMenu.get(id);
    }

    public ArrayList<Menu> getMenu() {
        return listMenu;
    }

    public ArrayList<Orang> getOrang() {
        return listOrang;
    }

    public Orang getOrang(int id) {
        return listOrang.get(id);
    }

    public double getTotalMenu() {
        double total = 0;
        for (Menu menu : listMenu) {
            total += menu.getHarga();
        }
        return total;
    }

    public void setPenalang(Orang penalang) {
        this.penalang = new Penalang(penalang.getName());
    }
    
}
