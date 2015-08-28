/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1.service;

import com.evaluasi1.domain.Penjualan;
import com.evaluasi1.domain.User;
import com.evaluasi1.domain.barang;
import java.util.List;

/**
 *
 * @author yuni fitriana
 */
public class MysqlPenjualan implements PenjualanInterface {

    public void save(Penjualan p) {
        System.out.println("save mysql");
    }

    public void update(Penjualan p) {
        System.out.println("update mysql");
    }

    public void delete(Penjualan p) {
        System.out.println("delete");
    }

    public List<Penjualan> selectPenjualan() {
        System.out.println("select ");
        return null;

    }

    public void save(User u) {
        System.out.println("save User");
    }

    public void update(User u) {
        System.out.println("update User");
    }

    public void delete(User u) {
        System.out.println("delete User");
    }

    public void save(barang b) {
        System.out.println("save barang");
    }

    public void update(barang b) {
        System.out.println("update barang");
    }

    public void delete(barang b) {
        System.out.println("delete barang");
    }

    public List<User> selectUser() {
        System.out.println("selectUser");
        return null;
    }

    public List<Penjualan> SelectPenjualan() {
        System.out.println("selectPenjualan");
        return null;
    }

    public List<barang> selectBarang() {
        System.out.println("selectBarang");
        return null;
    }

   
}
