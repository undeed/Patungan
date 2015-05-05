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
public class Member {

    private String name;
    private ArrayList<Menu> listMenu;

    public Member(String name) {
        this.name = name;
        listMenu = new ArrayList();
    }

    /**
     * menghitung total yang harus dibayar berdasarkan menu baik yang sudah
     * dibayar atau belum
     *
     * @return total harus dibayar
     */
    public double getTotalMustPay() {
        double total = 0;
        for (Menu menu : listMenu) {
            total += menu.getPriceTax();
        }
        return total;
    }

    /**
     * mengembalikan total yang belum dibayar atau total yang sudah dibayar
     *
     * @param sudah true = sudah dibayar, false = belum dibayar
     * @return total
     */
    public double getTotalPaid(boolean sudah) {
        double total = 0;
        for (Menu menu : listMenu) {
            if (menu.isPaid() == sudah) {
                total += menu.getPriceTax();
            }
        }
        return total;
    }

    public void addMenu(Menu m) {
        listMenu.add(m);
    }

    public Menu getMenu(int id) {
        return listMenu.get(id);
    }

    public ArrayList<Menu> getListMenu() {
        return listMenu;
    }

    public ArrayList<Menu> getListMenu(boolean paid) {
        ArrayList<Menu> list = new ArrayList();
        for (Menu m : listMenu) {
            if (m.isPaid() == paid) {
                list.add(m);
            }
        }
        return list;
    }

    public void setListMenu(ArrayList<Menu> listMenu) {
        this.listMenu = listMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", listMenu=" + listMenu + '}';
    }

}
