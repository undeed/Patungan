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
public class Place {

    private String name;
    private double tax;
    private ArrayList<Menu> listMenu;
    private ArrayList<Member> listMember;

    public Place(String name, double tax) {
        this.name = name;
        this.tax = tax;
        listMenu = new ArrayList();
        listMember = new ArrayList();
    }

    public ArrayList<Menu> getMenuMember(int idx) {
        ArrayList<Menu> list = new ArrayList();
        list = (ArrayList<Menu>) listMenu.clone();
        list.retainAll(listMember.get(idx).getListMenu());
        return list;
    }

    public ArrayList<Menu> getMenuMember(int idx, boolean paid) {
        ArrayList<Menu> list = new ArrayList();
        list = (ArrayList<Menu>) listMenu.clone();
        list.retainAll(listMember.get(idx).getListMenu(paid));
        return list;
    }

    public void addMember(Member o) {
        listMember.add(o);
    }

    public Member getMember(int idx) {
        return listMember.get(idx);
    }

    public void delMember(int idx) {
        listMember.remove(idx);
    }

    public Object[] getLisMemberName() {
        ArrayList<String> s = new ArrayList();
        for (Member o : listMember) {
            s.add(o.getName());
        }
        return s.toArray();
    }

    public void addMenu(Menu m) {
        listMenu.add(m);
    }

    public Menu getMenu(int idx) {
        return listMenu.get(idx);
    }

    public void delMenu(int idx) {
        listMenu.remove(idx);
    }

    public String[] getListMenuName() {
        ArrayList<String> s = new ArrayList();
        for (Menu m : listMenu) {
            s.add(m.getName());
        }
        return s.toArray(new String[s.size()]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Menu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(ArrayList<Menu> listMenu) {
        this.listMenu = listMenu;
    }

    public ArrayList<Member> getListMember() {
        return listMember;
    }

    public void setListMember(ArrayList<Member> listMember) {
        this.listMember = listMember;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Place{" + "name=" + name + ", tax=" + tax + ", listMenu=" + listMenu + ", listMember=" + listMember + '}';
    }

}
