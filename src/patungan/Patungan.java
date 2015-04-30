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
public class Patungan {

    ArrayList<Menu> listMenu;
    ArrayList<Orang> listOrang;

    public Patungan() {
        listMenu = new ArrayList();
        listOrang = new ArrayList();
    }

    public String[] getListOrang() {
        ArrayList<String> s = new ArrayList();
        for (Orang o : listOrang) {
            s.add(o.getName());
        }
        return (String[]) s.toArray();
    }

}
