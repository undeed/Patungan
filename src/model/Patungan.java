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

    private ArrayList<Member> listMember;
    private ArrayList<Place> listPlace;

    public Patungan() {
        listMember = new ArrayList();
        listPlace = new ArrayList();
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

    public String[] getListMemberName() {
        ArrayList<String> s = new ArrayList();
        for (Member o : listMember) {
            s.add(o.getName());
        }
        return s.toArray(new String[s.size()]);
    }

    public void addPlace(Place p) {
        listPlace.add(p);
    }

    public Place getPlace(int idx) {
        return listPlace.get(idx);
    }

    public void delPlace(int idx) {
        listPlace.remove(idx);
    }

    public String[] getListPlaceName() {
        ArrayList<String> s = new ArrayList();
        for (Place p : listPlace) {
            s.add(p.getName());
        }
        return s.toArray(new String[s.size()]);
    }

    public ArrayList<Member> getListMember() {
        return listMember;
    }

    public void setListMember(ArrayList<Member> listMember) {
        this.listMember = listMember;
    }

    public ArrayList<Place> getListPlace() {
        return listPlace;
    }

    public void setListPlace(ArrayList<Place> listPlace) {
        this.listPlace = listPlace;
    }

}
