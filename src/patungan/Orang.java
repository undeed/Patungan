/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patungan;

import java.util.ArrayList;

/**
 *
 * @author undeed
 */
public class Orang {

    private String name;
    private ArrayList<Menu> listMenu;

    public Orang(String name) {
        this.name = name;
        listMenu = new ArrayList();
    }

    /**
     * menghitung total yang harus dibayar berdasarkan menu baik yang sudah dibayar atau belum
     * @return total harus dibayar
     */
    public double getTotalDibayar() {
        double total = 0;
        for (Menu menu : listMenu) {
            total += menu.getHargaDibayar();
        }
        return total;
    }

    /**
     * mengembalikan total yang belum dibayar atau total yang sudah dibayar
     * @param sudah true = sudah dibayar, false = belum dibayar
     * @return total 
     */
    public double getTotalDibayar(boolean sudah) {
        double total = 0;
        for (Menu menu : listMenu) {
            if (menu.isDibayar() == sudah) {
                total += menu.getHargaDibayar();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
