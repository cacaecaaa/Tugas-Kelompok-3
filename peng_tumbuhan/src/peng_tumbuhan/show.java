/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peng_tumbuhan;

/**
 *
 * @author Asus
 */
public class show implements pengelompokan{
    @Override
    public void hias(){
        System.out.println("contoh hias");
        System.out.println("mawar, melati, kamboja");   
    }
    @Override
    public void biji(){
        System.out.println("contoh biji");
        System.out.println("mangga, pepaya, jeruk");
    }
    @Override
    public void umbi (){
        System.out.println("contoh umbi");
        System.out.println("singkong, kentang, kacang");
    }
}
