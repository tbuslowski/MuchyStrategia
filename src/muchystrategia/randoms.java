/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchystrategia;

import java.util.Random;

/**
 *
 * @author A5US
 */
public class randoms {
    public static void main(String[] args) {
        //Random r = new Random();
        //jak działa random
        for(int i=0; i<10; i++){
            System.out.println(new Random().nextDouble() * 0.2 - 0.1);
        }
    }
}
