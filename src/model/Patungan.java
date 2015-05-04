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
public class Patungan {

    private ArrayList<Menu> listMenu;
    private ArrayList<Orang> listOrang;
    private ArrayList<Place> listPlace;

    public Patungan() {
        listMenu = new ArrayList();
        listOrang = new ArrayList();
        listPlace = new ArrayList();
    }

    public void addOrang(Orang o) {
        listOrang.add(o);
    }

    public Orang getOrang(int idx) {
        return listOrang.get(idx);
    }

    public void delOrang(int idx) {
        listOrang.remove(idx);
    }

    public Object[] getListOrang() {
        ArrayList<String> s = new ArrayList();
        for (Orang o : listOrang) {
            s.add(o.getName());
        }
        return s.toArray();
    }

}
